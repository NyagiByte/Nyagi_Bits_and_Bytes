package net.madelyn.nyagibits_bytes.datagen;

import com.google.gson.Gson;
import net.madelyn.nyagibits_bytes.chemical.ChemicalInfo;
import net.madelyn.nyagibits_bytes.chemical.ModChemicals;
import net.madelyn.nyagibits_bytes.fluid.FluidInfo;
import net.madelyn.nyagibits_bytes.fluid.ModFluids;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import java.io.FileReader;
import java.nio.file.Path;
import java.util.LinkedHashMap;

public class LangDatagen extends LanguageProvider {

    private static LinkedHashMap<String, String> EN_LANG;
    private final static Gson gson = new Gson();

    public LangDatagen(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    @Override
    protected void addTranslations() {
        try {
            FileReader reader = new FileReader(Path.of("../src/main/resources/assets/nyagibits_bytes/lang/en_us.json").toFile());
            EN_LANG = gson.fromJson(reader, LinkedHashMap.class);
            EN_LANG.forEach(this::add);

        } catch (Exception e){
            e.printStackTrace();
            return;
        }

        for(ChemicalInfo chem : ModChemicals.CHEM_LIST){
            String chemLangId = "chemical.nyagibits_bytes."+chem.getId()+".name";
            if(EN_LANG.containsKey(chemLangId)){
                String chemName = EN_LANG.get(chemLangId);
                addLang("item.nyagibits_bytes."+chem.getSample().getId(), "Sample of "+chemName);
                if(chem.getCompacted() != null && chem.getCompacted() instanceof ItemInfo.Chem dust) addLang("item.nyagibits_bytes."+dust.getId(), chemName+" Dust");
                if(chem.getFluid() != null){
                    addLang("fluid_type.nyagibits_bytes."+chem.getFluid().id+"_fluid", chemName);
                    addLang("block.nyagibits_bytes."+chem.getFluid().id+"_block", chemName);
                    addLang("item.nyagibits_bytes.bucket_of_"+chem.getFluid().id, chemName+" Bucket");
                }
            }
        }

        for(FluidInfo.Builder fluid : ModFluids.FLUIDS_LIST){
            String fluidLangId = "fluid.nyagibits_bytes."+fluid.id+".name";
            if(EN_LANG.containsKey(fluidLangId)){
                String fluidName = EN_LANG.get(fluidLangId);
                addLang("fluid_type.nyagibits_bytes."+fluid.id+"_fluid", fluidName);
                addLang("block.nyagibits_bytes."+fluid.id+"_block", fluidName);
                addLang("item.nyagibits_bytes.bucket_of_"+fluid.id, fluidName+" Bucket");
            }
        }



    }

    //All lang additions must have a check if they're already present.
    private void addLang(String key, String value){
        if(!EN_LANG.containsKey(key)) add(key, value);
    }

}
