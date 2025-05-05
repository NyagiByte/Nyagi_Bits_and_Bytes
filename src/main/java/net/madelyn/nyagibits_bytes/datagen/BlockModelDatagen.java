package net.madelyn.nyagibits_bytes.datagen;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.BlockInfo;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.data.DataGenerator;
import net.minecraft.server.packs.PackType;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockModelDatagen extends BlockModelProvider {

    public BlockModelDatagen(DataGenerator generator, ExistingFileHelper helper){
        super(generator, NyagiBits_Bytes.MOD_ID, helper);
    }

    @Override
    protected void registerModels() {

        for(BlockInfo block : ModBlocks.BLOCKS_LIST){
            if(!assetExists("models/block/"+block.getId()+".json")){
                boolean hasMainTex = assetExists("textures/block/main/"+block.getId()+".png");
                String texPath = hasMainTex ? "block/main/" : "block/dev/";
                withExistingParent("block/"+block.getId(), mcLoc("block/cube_all"))
                        .texture("all", modLoc(texPath+block.getId()));
                if(hasMainTex && assetExists("textures/block/dev/"+block.getId()+".png")){
                    withExistingParent("nbnb-programmer-art/assets/nyagibits_bytes/models/block/"+block.getId(), mcLoc("block/cube_all"))
                            .texture("all", modLoc("block/dev/"+block.getId()));
                }
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
