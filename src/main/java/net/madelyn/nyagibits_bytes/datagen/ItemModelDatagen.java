package net.madelyn.nyagibits_bytes.datagen;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.BlockInfo;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.chemical.ChemicalInfo;
import net.madelyn.nyagibits_bytes.chemical.ModChemicals;
import net.madelyn.nyagibits_bytes.fluid.ModFluids;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.data.DataGenerator;
import net.minecraft.server.packs.PackType;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemModelDatagen extends ItemModelProvider {
    //These three maps hold the data on where each texture or model actually is.
    private Map<String, String> TEXTURES = new HashMap<>();
    private Map<String, String> MODELS = new HashMap<>();
    //And yeah, this is already sinful. We are in the /run folder when in datagen.
    private static final String PATH = "../src/main/resources/assets/nyagibits_bytes/";

    public ItemModelDatagen(DataGenerator gen, ExistingFileHelper helper){
        super(gen, NyagiBits_Bytes.MOD_ID, helper);
        //Scan the item textures and item folders and index where each file is.
        DatagenEntry.scanAssets(Path.of(PATH + "textures/item"), TEXTURES, ".png");
        DatagenEntry.scanAssets(Path.of(PATH + "models/item/"), MODELS, ".json");
    }
    /*
    Notes on some methods used in this
    modLoc("something") means ResourceLocation with the nyagibits_bytes namespace.
    mcLoc("something") means ResourceLocation with the vanilla namespace.
    withExistingParent(location, parent) generates a model at <location> with the parent field set to <parent> and returns an ItemModelBuilder.
    The 3 maps used in this are formatted like this: (Key: <filename>, Value: <file path within its folder>)
    Example: (Key:sintered_argentite, Value:minerals/sintered/sintered_argentite)
     */

    //Oh boy, here we go.
    @Override
    protected void registerModels(){

        List<ItemInfo> items = new ArrayList<>();
        items.addAll(ModItems.ITEMS_LIST);
        List<ItemInfo.Chem> chemicals = new ArrayList<>();
        for(ChemicalInfo chem : ModChemicals.CHEM_LIST){
            chemicals.add(chem.getSample());
            if(chem.getCompacted() != null){
                if(chem.getCompacted() instanceof ItemInfo.Chem dust) chemicals.add(dust);
                else items.add(chem.getCompacted());
            }

        }


        //First, all found item models must be processed with texture redirects.
        for(Map.Entry<String, String> entry : MODELS.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            //If someone ignores the warning to not put models in the root models folder instead of a subfolder, abort for this item.
            //We have to abort because otherwise, the existing model and generated models would clash.
            if(assetExists("models/item/"+key+".json")){
                NyagiBits_Bytes.LOGGER.error("Model found in root models folder: {} It should function, but won't be adapted.", value);
                continue;
            }
            //This creates the item model as a simple redirect to where the original model was found.
            ItemModelBuilder modelBuilder = withExistingParent("item/"+key, modLoc("item/"+value));
            //This gets the textures field of the json. Also quite sinful, look at the method below.
            JsonObject textures = getTextureData(PATH+"models/item/"+value+".json");
            if(textures == null){
                //This can fire naturally for some stuff like livisite alloy. We already made the "link" so it's fine.
                NyagiBits_Bytes.LOGGER.error("Texture data did not exist for {}", value);
                continue;
            }

            //For each texture, remap it based on the map built earlier.
            for(Map.Entry<String, JsonElement> texture : textures.entrySet()){
                String textureID = texture.getValue().getAsString();
                //Vanilla textures have no namespace, apparently.
                //We need to check the namespace anyway because we can only map NB&B textures.
                String namespace = (!textureID.contains(":")) ? "minecraft" : textureID.substring(0, textureID.indexOf(":"));
                //This is just the filename without extension, which can be used as a key for the texture maps.
                textureID = textureID.substring(textureID.lastIndexOf("/")+1);
                //This is some yandere dev type shit. Anyway-
                //It's a priority system.If the namespace if not NB&B, let the original texture through. If a texture exists in the main folder, use that. Otherwise, try to use a dev texture.
                if(!namespace.equals("nyagibits_bytes")) try { modelBuilder.texture(texture.getKey(), texture.getValue().getAsString()); } catch (Exception ignored) {}
                else if (TEXTURES.containsKey(textureID)) modelBuilder.texture(texture.getKey(), modLoc("item/"+TEXTURES.get(textureID)));
                else{
                    //If this shows up, check for typos or rogue item models that aren't supposed to be there.
                    NyagiBits_Bytes.LOGGER.error("Texture {} was not found anywhere", textureID);
                }
            }
        }
        //Now it's time to go over the items and generate models for items that don't have any.
        for(ItemInfo item : items){
            //If an item has the parent model field set, make a redirect to that instead and don't do anything else.
            if(!item.getParentModel().isEmpty()){
                //if(MODELS.containsKey(item.getParentModel())) withExistingParent("item/"+item.getId(), modLoc("item/"+MODELS.get(item.getParentModel())));
                withExistingParent("item/"+item.getId(), modLoc("item/"+item.getParentModel()));
                continue;
            }
            //If the model already exists, either premade or generated, skip to the next item.
            if(assetExists("models/item/"+item.getId()+".json")) continue;
            //Create a simple item model with just one texture.
            ItemModelBuilder modelBuilder = withExistingParent("item/"+item.getId(), mcLoc("item/generated"));
            //Same deal as earlier, just without the namespace check. The item id becomes the key when searching for a texture.
            if(TEXTURES.containsKey(item.getId())) modelBuilder.texture("layer0", modLoc("item/"+TEXTURES.get(item.getId())));
            else{
                NyagiBits_Bytes.LOGGER.error("Texture {} was not found anywhere", item.getId());
                modelBuilder.texture("layer0", modLoc("item/"+TEXTURES.get("placeholder")));
            }
        }

        for(ItemInfo.Bucket bucket : ModFluids.buckets){
            ItemModelBuilder modelBuilder = withExistingParent("item/"+bucket.getId(), mcLoc("item/generated"));
            if(TEXTURES.containsKey(bucket.getId())) modelBuilder.texture("layer0", modLoc("item/"+TEXTURES.get(bucket.getId())));
            else{
                modelBuilder.texture("layer0", modLoc("item/"+TEXTURES.get("dg_bucket_layer0")));
                modelBuilder.texture("layer1", modLoc("item/"+TEXTURES.get("dg_bucket_layer1")));
            }
        }

        for(ItemInfo.Chem chem : chemicals){
            ItemModelBuilder modelBuilder = withExistingParent("item/"+chem.getId(), mcLoc("item/generated"));
            if(TEXTURES.containsKey(chem.getId())) modelBuilder.texture("layer0", modLoc("item/"+TEXTURES.get(chem.getId())));
            else{
                String type = "";
                switch (chem.getChemType()) {
                    case SOLID -> type = "solid";
                    case LIQUID -> type = "liquid";
                    case GAS -> type = "gas";
                    case DUST -> type = "dust";
                }
                    modelBuilder.texture("layer0", modLoc("item/"+TEXTURES.get("dg_blank_layer")));
                    modelBuilder.texture("layer1", modLoc("item/"+TEXTURES.get("dg_"+type+"_layer1")));
                    modelBuilder.texture("layer2", modLoc("item/"+TEXTURES.get("dg_"+type+"_layer2")));
                }
        }


        //Blocks need item models too. They just need to point to the respective block though, so it's not a big deal.
        for(BlockInfo block : ModBlocks.BLOCKS_LIST){
            if(!assetExists("models/item/"+block.getId()+".json")){
                withExistingParent("item/"+block.getId(), Utils.NBNB("block/"+block.getId()));
            }
        }

    }


    @Nullable
    private JsonObject getTextureData(String modelPath){
        JsonObject output = null;
        try{
            //Grab the actual model json file and open it.
            JsonObject modelJson = JsonParser.parseReader(Files.newBufferedReader(Path.of(modelPath))).getAsJsonObject();
            //This should be elsewhere. But we have the model open here so might as well.
            //For SOME reason, livisite alloy, the only item to have different models for gui and in-world, becomes invisible when processed normally.
            //So if there's the loader property, so far exclusive to that, just copy the actual json file over and call it a day. It doesn't need texture remapping anyway.
            if(modelJson.has("loader")){
                Files.copy(Path.of(modelPath), Path.of("../src/generated/resources/assets/nyagibits_bytes/models/item/"+Path.of(modelPath).getFileName()), StandardCopyOption.REPLACE_EXISTING);
                return null;
            }
            output = modelJson.getAsJsonObject("textures");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }

    private boolean assetExists(String path){
        return existingFileHelper.exists(
                Utils.NBNB(path),
                PackType.CLIENT_RESOURCES
        );
    }


}
