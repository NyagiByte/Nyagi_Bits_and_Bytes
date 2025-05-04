package net.madelyn.nyagibits_bytes.datagen;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelDatagen extends ItemModelProvider {

    public ItemModelDatagen(DataGenerator gen, ExistingFileHelper helper){
        super(gen, NyagiBits_Bytes.MOD_ID, helper);
    }

    @Override
    protected void registerModels() {
        //Item model datagen stuff would go here.
        //Just need to figure out a...sane way to do it.
    }
}
