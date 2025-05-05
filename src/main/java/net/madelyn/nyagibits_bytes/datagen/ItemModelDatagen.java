package net.madelyn.nyagibits_bytes.datagen;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.BlockInfo;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.fluid.ModFluids;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.data.DataGenerator;
import net.minecraft.server.packs.PackType;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemModelDatagen extends ItemModelProvider {

    public ItemModelDatagen(DataGenerator gen, ExistingFileHelper helper){
        super(gen, NyagiBits_Bytes.MOD_ID, helper);
    }

    @Override
    protected void registerModels() {
        List<ItemInfo> items = new ArrayList<>();
        items.addAll(ModItems.ITEMS_LIST);
        items.addAll(ModFluids.buckets);

        for(ItemInfo item : items){
            if(!assetExists("models/item/"+item.getId()+".json")){
                boolean hasMainTex = assetExists("textures/item/main/"+item.getId()+".png");
                String texPath = hasMainTex ? "item/main/" : "item/dev/";
                withExistingParent("item/"+item.getId(), mcLoc("item/generated"))
                .texture("layer0", modLoc(texPath+item.getId()));
                if(hasMainTex && assetExists("textures/item/dev/"+item.getId()+".png")){
                    withExistingParent("nbnb-programmer-art/assets/nyagibits_bytes/models/item/"+item.getId(), mcLoc("item/generated"))
                            .texture("layer0", modLoc("item/dev/"+item.getId()));
                }
            }
        }

        for(BlockInfo block : ModBlocks.BLOCKS_LIST){
            //Yes, item model. This is for the block items, not actual blocks.
            if(!assetExists("models/item/"+block.getId()+".json")){
                withExistingParent("item/"+block.getId(), Utils.NBNB("block/"+block.getId()));
            }
        }

    }

    private boolean assetExists(String path){
        return existingFileHelper.exists(
                Utils.NBNB(path),
                PackType.CLIENT_RESOURCES
        );
    }

}
