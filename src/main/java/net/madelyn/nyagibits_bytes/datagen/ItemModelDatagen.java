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
            String subfolder = determineSubfolder(item);
            //If a model already exists, it means it's a more complex item and none of this should run.
            if(!assetExists("models/item/"+subfolder+item.getId()+".json")){
                //As of writing, this won't happen. This is relevant to regenerate the models when reworked textures get added.
                boolean hasMainTex = assetExists("textures/item/main/"+subfolder+item.getId()+".png");
                String texPath = hasMainTex ? "item/main/" : "item/dev/";
                //An item can specify to just point to an existing model. This is used by most incomplete sequence items.
                if(!item.getParentModel().isEmpty()){
                    withExistingParent("item/"+item.getId(), modLoc("item/"+item.getParentModel()));
                }
                //Create a simple item model pointing to the texture in the right subfolder (if any)
                else withExistingParent("item/"+item.getId(), mcLoc("item/generated"))
                    .texture("layer0", modLoc(texPath+subfolder+item.getId()));
                //If both a "main" texture and a "dev" texture exist, generate a model for the programmer's art resourcepack.
                //DO NOT DELETE old dev textures.
                if(hasMainTex && assetExists("textures/item/dev/"+subfolder+item.getId()+".png")){
                    //I'm aware the path is weird, but it's to ensure it works with the resourcepack registry.
                    withExistingParent("nbnb-programmer-art/assets/nyagibits_bytes/models/item/"+item.getId(), mcLoc("item/generated"))
                            .texture("layer0", modLoc("item/dev/"+subfolder+item.getId()));
                }

            } else if(!subfolder.isEmpty()){ //All item models must be referenceable in /models/item. If the actual model is sorted elsewhere, generate a "link" to it.
                withExistingParent("item/"+item.getId(), modLoc("item/"+subfolder+item.getId()));
            }
        }

        for(BlockInfo block : ModBlocks.BLOCKS_LIST){
            //Yes, item model. This is for the block items, not actual blocks.
            if(!assetExists("models/item/"+block.getId()+".json")){
                withExistingParent("item/"+block.getId(), Utils.NBNB("block/"+block.getId()));
            }
        }

    }

    //This will be used as part of the filepath when looking for models and textures.
    private String determineSubfolder(ItemInfo item){
        String output = "";
        if(item.getTab() == Utils.Tab.MINERALS) output = "minerals/";
        if(item.getTab() == Utils.Tab.BIOLOGY) output = "biology/";
        if(item.getTab() == Utils.Tab.SCIENCE || item.getTab() == Utils.Tab.SCHEMATICS) output = "science/";
        if(item.getTab() == Utils.Tab.CHEMICALS) output = "chemicals/";
        if(!item.getSubFolder().isEmpty()) output = item.getSubFolder()+"/";
        return output;
    }

    private boolean assetExists(String path){
        return existingFileHelper.exists(
                Utils.NBNB(path),
                PackType.CLIENT_RESOURCES
        );
    }

}
