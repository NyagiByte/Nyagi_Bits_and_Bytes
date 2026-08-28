package net.madelyn.nyagibits_bytes.datagen;

import com.google.gson.Gson;
import net.madelyn.nyagibits_bytes.content.item.NBNBItem;
import net.madelyn.nyagibits_bytes.registry.ModRegistries;
import net.madelyn.nyagibits_bytes.registry.helpers.FluidInfo;
import net.madelyn.nyagibits_bytes.registry.helpers.ItemInfo;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import java.io.FileReader;
import java.nio.file.Path;
import java.util.LinkedHashMap;

public class LangDatagen extends LanguageProvider {

    private static LinkedHashMap<String, String> EN_LANG;
    private final static Gson gson = new Gson();

    public LangDatagen(DataGenerator gen, String modid, String locale) {
        super(gen.getPackOutput(), modid, locale);
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


        for(ItemInfo item : ModRegistries.ITEMS_LIST){
            if(!item.getTraits().contains(NBNBItem.ItemTraits.IS_CHEMICAL)) continue;
            String chemLangId = "chemical.nyagibits_bytes."+item.getChemical()+".name";
            if(EN_LANG.containsKey(chemLangId)){
                String chemName = EN_LANG.get(chemLangId);
                switch (item.getChemType()){
                    case SOLID, LIQUID, GAS -> {
                        addLang("item.nyagibits_bytes."+item.getId(), "Sample of "+chemName);
                    }
                    case DUST -> {
                        addLang("item.nyagibits_bytes."+item.getId(), chemName+" Dust");
                    }
                    case INGOT -> {
                        addLang("item.nyagibits_bytes."+item.getId(), chemName+" Ingot");
                    }
                    case PLATE -> {
                        addLang("item.nyagibits_bytes."+item.getId(), chemName+" Plate");
                    }
                    case FLOAT_DUST -> {
                        addLang("item.nyagibits_bytes."+item.getId(), "Float-Separated"+chemName+" Dust");
                    }
                    default -> {
                        continue;
                    }
                }

            }
        }

        //More of the same, but for non-chemical fluids
        for(FluidInfo.Builder fluid : ModRegistries.FLUIDS_LIST){
            String fluidLangId = "fluid.nyagibits_bytes."+fluid.id+".name";
            String chemLangId = "chemical.nyagibits_bytes."+fluid.id+".name";
            String fluidName = "";
            if(EN_LANG.containsKey(fluidLangId)){
                fluidName = EN_LANG.get(fluidLangId);
            } else if(EN_LANG.containsKey(chemLangId)){
                fluidName = EN_LANG.get(chemLangId);
            }

            if(!fluidName.isEmpty()){
                addLang("fluid_type.nyagibits_bytes."+fluid.id+"_fluid", fluidName);
                addLang("block.nyagibits_bytes."+fluid.id+"_block", fluidName);
                addLang("item.nyagibits_bytes.bucket_of_"+fluid.id, fluidName+" Bucket");
            }

        }



    }

    //All lang additions must have a check if they're already present.
    private void addLang(String key, String value){
        if(!EN_LANG.containsKey(key)) {
            EN_LANG.put(key, value); //this is cause since we dropped OPA fluids into ModFluids.
            add(key, value);
        }
    }

}
