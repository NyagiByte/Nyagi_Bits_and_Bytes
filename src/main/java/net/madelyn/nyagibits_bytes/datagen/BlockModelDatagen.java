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

    //For commentary, look at items, it's pretty much a 1:1 with a couple different parameters.
    @Override
    protected void registerModels() {

        for(BlockInfo block : ModBlocks.BLOCKS_LIST){
            String subfolder = determineSubfolder(block);
            if(!assetExists("models/block/"+subfolder+block.getId()+".json")){
                boolean hasMainTex = assetExists("textures/block/main/"+subfolder+block.getId()+".png");
                String texPath = hasMainTex ? "block/main/" : "block/dev/";
                withExistingParent("block/"+block.getId(), mcLoc("block/cube_all"))
                        .texture("all", modLoc(texPath+subfolder+block.getId()));
                if(hasMainTex && assetExists("textures/block/dev/"+subfolder+block.getId()+".png")){
                    withExistingParent("nbnb-programmer-art/assets/nyagibits_bytes/models/block/"+block.getId(), mcLoc("block/cube_all"))
                            .texture("all", modLoc("block/dev/"+subfolder+block.getId()));
                }
            }
        }
    }

    //This will be used as part of the filepath when looking for models and textures.
    private String determineSubfolder(BlockInfo block){
        String output = "";
        if(block.getTab() == Utils.Tab.MINERALS) output = "minerals/";
        return output;
    }

    private boolean assetExists(String path){
        return existingFileHelper.exists(
                Utils.NBNB(path),
                PackType.CLIENT_RESOURCES
        );
    }


}
