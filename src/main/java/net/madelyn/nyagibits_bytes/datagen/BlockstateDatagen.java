package net.madelyn.nyagibits_bytes.datagen;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.BlockInfo;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.chemical.ChemicalInfo;
import net.madelyn.nyagibits_bytes.chemical.ModChemicals;
import net.madelyn.nyagibits_bytes.fluid.FluidInfo;
import net.madelyn.nyagibits_bytes.fluid.ModFluids;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.data.DataGenerator;
import net.minecraft.server.packs.PackType;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockstateDatagen extends BlockStateProvider {

    private ExistingFileHelper existingFileHelper = null;

    public BlockstateDatagen(DataGenerator generator, ExistingFileHelper helper){
        super(generator.getPackOutput(), NyagiBits_Bytes.MOD_ID, helper);
        this.existingFileHelper = helper;
    }
    //For the record, i'm reasonably sure this is not the correct way to do it.
    //But it does what i need it to do, so whatever.
    @Override
    protected void registerStatesAndModels() {
        for(BlockInfo block : ModBlocks.BLOCKS_LIST){
            if(!assetExists("blockstates/"+block.getId()+".json")){
                //don't handle rotatable blocks, for now.
                if(block instanceof BlockInfo.Rotatable rot) continue;

                ModelFile model = models().getExistingFile(modLoc("block/"+block.getId()));
                getVariantBuilder(Utils.fetchBlock(Utils.NBNB(block.getId())))
                        .partialState().modelForState().modelFile(model).addModel();
            }
        }
        ModelFile model = models().getExistingFile(mcLoc("block/water"));
        for(FluidInfo.Builder fluid : ModFluids.FLUIDS_LIST){
            getVariantBuilder(Utils.fetchBlock(Utils.NBNB(fluid.id+"_block")))
                    .partialState().modelForState().modelFile(model).addModel();
        }
        for(ChemicalInfo chem : ModChemicals.CHEM_LIST){
            if(chem.getFluid() == null) continue;
            FluidInfo.Builder fluid = chem.getFluid();
            getVariantBuilder(Utils.fetchBlock(Utils.NBNB(fluid.id+"_block")))
                    .partialState().modelForState().modelFile(model).addModel();
        }


    }

    private boolean assetExists(String path){
        if(existingFileHelper == null) return false;
        return existingFileHelper.exists(
                Utils.NBNB(path),
                PackType.CLIENT_RESOURCES
        );
    }

}
