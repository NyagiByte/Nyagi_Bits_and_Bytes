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
        //So only one "true" lang file is allowed to exist at any given time. You can't have part of lang in normal assets and another in generated assets.
        //So we need ALL lang entries in generated assets. This step takes the en_us json file and grabs all its entries. 
        //(Note: I18n does not work in this datagen context so we also need it to check for existing lang)
        try {
            FileReader reader = new FileReader(Path.of("../src/main/resources/assets/nyagibits_bytes/lang/en_us.json").toFile());
            EN_LANG = gson.fromJson(reader, LinkedHashMap.class);
            //This adds all the existing entries to the generated lang file, for the reasons outlined above.
            EN_LANG.forEach(this::add);

        } catch (Exception e){
            e.printStackTrace();
            return;
        }

        for(ChemicalInfo chem : ModChemicals.CHEM_LIST){
            //This is a special lang entry used to create the others.
            String chemLangId = "chemical.nyagibits_bytes."+chem.getId()+".name";
            if(EN_LANG.containsKey(chemLangId)){
                String chemName = EN_LANG.get(chemLangId);
                //addLang is a method that checks if the entry already exists, if not, adds it.
                addLang("item.nyagibits_bytes."+chem.getSample().getId(), "Sample of "+chemName);
                //If there's a dust specifically, add its entry
                if(chem.getCompacted() != null && chem.getCompacted() instanceof ItemInfo.Chem dust) addLang("item.nyagibits_bytes."+dust.getId(), chemName+" Dust");
                if(chem.getFluid() != null){
                    //Same thing for the fluids
                        addLang("fluid_type.nyagibits_bytes."+chem.getFluid().id+"_fluid", chemName);
                        addLang("block.nyagibits_bytes."+chem.getFluid().id+"_block", chemName);
                        addLang("item.nyagibits_bytes.bucket_of_"+chem.getFluid().id, chemName+" Bucket");
                }
            }
        }
        //More of the same, but for non-chemical fluids
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
