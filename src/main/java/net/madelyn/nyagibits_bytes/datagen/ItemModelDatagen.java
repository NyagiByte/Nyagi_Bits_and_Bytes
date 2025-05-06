package net.madelyn.nyagibits_bytes.datagen;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.BlockInfo;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
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

    private Map<String, String> DEV_TEXTURES = new HashMap<>();
    private Map<String, String> MAIN_TEXTURES = new HashMap<>();
    private Map<String, String> MODELS = new HashMap<>();

    private static final String PATH = "../src/main/resources/assets/nyagibits_bytes/";

    public ItemModelDatagen(DataGenerator gen, ExistingFileHelper helper){
        super(gen, NyagiBits_Bytes.MOD_ID, helper);
        //Scan all the existing assets to create maps to find each model or texture down the line.
        DatagenEntry.scanAssets(Path.of(PATH + "textures/item/dev"), DEV_TEXTURES, ".png");
        DatagenEntry.scanAssets(Path.of(PATH + "textures/item/main"), MAIN_TEXTURES, ".png");
        DatagenEntry.scanAssets(Path.of(PATH + "models/item/"), MODELS, ".json");
    }

    @Override
    protected void registerModels(){
        List<ItemInfo> items = new ArrayList<>();
        items.addAll(ModItems.ITEMS_LIST);
        items.addAll(ModFluids.buckets);

        //First generate redirections for all existing models.
        for(Map.Entry<String, String> entry : MODELS.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            //If someone ignores the warning to not put models in the root models folder instead of a subfolder, abort for this item.
            if(assetExists("models/item/"+key+".json")){
                NyagiBits_Bytes.LOGGER.error("Model found in root models folder: {} It should function, but won't be adapted.", value);
                continue;
            }
            ItemModelBuilder modelBuilder = withExistingParent("item/"+key, modLoc("item/"+value));

            JsonObject textures = getTextureData(PATH+"models/item/"+value+".json");
            if(textures == null){
                NyagiBits_Bytes.LOGGER.error("Texture data did not exist for {}", value);
                continue;
            }

            for(Map.Entry<String, JsonElement> texture : textures.entrySet()){
                String textureID = texture.getValue().getAsString();
                String namespace = (!textureID.contains(":")) ? "minecraft" : textureID.substring(0, textureID.indexOf(":"));
                textureID = textureID.substring(textureID.lastIndexOf("/")+1);
                //Damn you, pile of cogs
                if(!namespace.equals("nyagibits_bytes")) try { modelBuilder.texture(texture.getKey(), texture.getValue().getAsString()); } catch (Exception ignored) {}
                else if (MAIN_TEXTURES.containsKey(textureID)) modelBuilder.texture(texture.getKey(), modLoc("item/main/"+MAIN_TEXTURES.get(textureID)));
                else if (DEV_TEXTURES.containsKey(textureID)) modelBuilder.texture(texture.getKey(), modLoc("item/dev/"+DEV_TEXTURES.get(textureID)));
                else{
                    NyagiBits_Bytes.LOGGER.error("Texture {} was not found anywhere", textureID);
                }
            }
        }
        //Now it's time to go over the items and generate models for items that don't have any.
        for(ItemInfo item : items){

            if(!item.getParentModel().isEmpty()){
                if(MODELS.containsKey(item.getParentModel())) withExistingParent("item/"+item.getId(), modLoc("item/"+MODELS.get(item.getParentModel())));
                else withExistingParent("item/"+item.getId(), modLoc("item/"+item.getParentModel()));
                continue;
            }

            if(assetExists("models/item/"+item.getId()+".json")) continue;
            ItemModelBuilder modelBuilder = withExistingParent("item/"+item.getId(), mcLoc("item/generated"));
            if(MAIN_TEXTURES.containsKey(item.getId())) modelBuilder.texture("layer0", modLoc("item/main/"+MAIN_TEXTURES.get(item.getId())));
            else if (DEV_TEXTURES.containsKey(item.getId())) modelBuilder.texture("layer0", modLoc("item/dev/"+DEV_TEXTURES.get(item.getId())));
            else{
                NyagiBits_Bytes.LOGGER.error("Texture {} was not found anywhere", item.getId());
            }
            //Handle resourcepack generation for simple items
            if(MAIN_TEXTURES.containsKey(item.getId()) && DEV_TEXTURES.containsKey(item.getId())){
                withExistingParent("nbnb-programmer-art/assets/nyagibits_bytes/models/item/"+item.getId(), mcLoc("item/generated"))
                        .texture("layer0", modLoc("item/dev/"+DEV_TEXTURES.get(item.getId())));
            }
        }

        for(BlockInfo block : ModBlocks.BLOCKS_LIST){
            //Yes, item model. This is for the block items, not actual blocks.
            if(!assetExists("models/item/"+block.getId()+".json")){
                withExistingParent("item/"+block.getId(), Utils.NBNB("block/"+block.getId()));
            }
        }

    }


    @Nullable
    private JsonObject getTextureData(String modelPath){
        JsonObject output = null;
        try{
            JsonObject modelJson = JsonParser.parseReader(Files.newBufferedReader(Path.of(modelPath))).getAsJsonObject();
            //Damn you, livisite alloy
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
