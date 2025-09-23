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
    private Map<String, String> DEV_TEXTURES = new HashMap<>();
    private Map<String, String> MAIN_TEXTURES = new HashMap<>();
    private Map<String, String> MODELS = new HashMap<>();
    //And yeah, this is already sinful. We are in the /run folder when in datagen.
    private static final String PATH = "../src/main/resources/assets/nyagibits_bytes/";

    public ItemModelDatagen(DataGenerator gen, ExistingFileHelper helper){
        super(gen, NyagiBits_Bytes.MOD_ID, helper);
        //Scan the item textures and item folders and index where each file is.
        DatagenEntry.scanAssets(Path.of(PATH + "textures/item/dev"), DEV_TEXTURES, ".png");
        DatagenEntry.scanAssets(Path.of(PATH + "textures/item/main"), MAIN_TEXTURES, ".png");
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

        //Buckets aren't part of ITEMS_LIST, so we just add them.
        List<ItemInfo> items = new ArrayList<>();
        items.addAll(ModItems.ITEMS_LIST);
        items.addAll(ModFluids.buckets);
        for(ChemicalInfo chem : ModChemicals.CHEM_LIST){
            items.add(chem.getSample());
            if(chem.getCompacted() != null) items.add(chem.getCompacted());
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
                else if (MAIN_TEXTURES.containsKey(textureID)) modelBuilder.texture(texture.getKey(), modLoc("item/main/"+MAIN_TEXTURES.get(textureID)));
                else if (DEV_TEXTURES.containsKey(textureID)) modelBuilder.texture(texture.getKey(), modLoc("item/dev/"+DEV_TEXTURES.get(textureID)));
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
            if(MAIN_TEXTURES.containsKey(item.getId())) modelBuilder.texture("layer0", modLoc("item/main/"+MAIN_TEXTURES.get(item.getId())));
            else if (DEV_TEXTURES.containsKey(item.getId())) modelBuilder.texture("layer0", modLoc("item/dev/"+DEV_TEXTURES.get(item.getId())));
            else{
                NyagiBits_Bytes.LOGGER.error("Texture {} was not found anywhere", item.getId());
                modelBuilder.texture("layer0", modLoc("item/dev/"+DEV_TEXTURES.get("placeholder")));
            }
            //If there's both a main and dev texture, create an entry for the programmer's art resourcepack.
            if(MAIN_TEXTURES.containsKey(item.getId()) && DEV_TEXTURES.containsKey(item.getId())){
                withExistingParent("nbnb-programmer-art/assets/nyagibits_bytes/models/item/"+item.getId(), mcLoc("item/generated"))
                        .texture("layer0", modLoc("item/dev/"+DEV_TEXTURES.get(item.getId())));
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
