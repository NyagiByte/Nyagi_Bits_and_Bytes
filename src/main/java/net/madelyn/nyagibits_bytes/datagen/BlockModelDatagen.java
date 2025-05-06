package net.madelyn.nyagibits_bytes.datagen;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.BlockInfo;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.data.DataGenerator;
import net.minecraft.server.packs.PackType;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

//I...cbf to fully document this one too. Look at ItemModelProvider, the logic is near identical.

public class BlockModelDatagen extends BlockModelProvider {

    private Map<String, String> DEV_TEXTURES = new HashMap<>();
    private Map<String, String> MAIN_TEXTURES = new HashMap<>();
    private Map<String, String> MODELS = new HashMap<>();

    private static final String PATH = "../src/main/resources/assets/nyagibits_bytes/";

    public BlockModelDatagen(DataGenerator generator, ExistingFileHelper helper){
        super(generator, NyagiBits_Bytes.MOD_ID, helper);
        DatagenEntry.scanAssets(Path.of(PATH + "textures/block/dev"), DEV_TEXTURES, ".png");
        DatagenEntry.scanAssets(Path.of(PATH + "textures/block/main"), MAIN_TEXTURES, ".png");
        DatagenEntry.scanAssets(Path.of(PATH + "models/block/"), MODELS, ".json");
    }

    @Override
    protected void registerModels() {
        for(Map.Entry<String, String> entry : MODELS.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            if(assetExists("models/block/"+key+".json")){
                NyagiBits_Bytes.LOGGER.error("Model found in root models folder: {} It should function, but won't be adapted.", value);
                continue;
            }
            BlockModelBuilder modelBuilder = withExistingParent("block/"+key, modLoc("block/"+value));
            JsonObject textures = getTextureData(PATH+"models/block/"+value+".json");
            if(textures == null){
                NyagiBits_Bytes.LOGGER.error("Texture data did not exist for {}", value);
                continue;
            }

            for(Map.Entry<String, JsonElement> texture : textures.entrySet()){
                String textureID = texture.getValue().getAsString();
                String namespace = (!textureID.contains(":")) ? "minecraft" : textureID.substring(0, textureID.indexOf(":"));
                textureID = textureID.substring(textureID.lastIndexOf("/")+1);
                if(!namespace.equals("nyagibits_bytes")) try { modelBuilder.texture(texture.getKey(), texture.getValue().getAsString()); } catch (Exception ignored) {}
                else if (MAIN_TEXTURES.containsKey(textureID)) modelBuilder.texture(texture.getKey(), modLoc("block/main/"+MAIN_TEXTURES.get(textureID)));
                else if (DEV_TEXTURES.containsKey(textureID)) modelBuilder.texture(texture.getKey(), modLoc("block/dev/"+DEV_TEXTURES.get(textureID)));
                else{
                    NyagiBits_Bytes.LOGGER.error("Texture {} was not found anywhere", textureID);
                }
            }

        }
        for(BlockInfo block : ModBlocks.BLOCKS_LIST){
            if(assetExists("models/block/"+block.getId()+".json")) continue;
            BlockModelBuilder modelBuilder = withExistingParent("block/"+block.getId(), mcLoc("block/cube_all"));
            if(MAIN_TEXTURES.containsKey(block.getId())) modelBuilder.texture("all", modLoc("block/main/"+MAIN_TEXTURES.get(block.getId())));
            else if (DEV_TEXTURES.containsKey(block.getId())) modelBuilder.texture("all", modLoc("block/dev/"+DEV_TEXTURES.get(block.getId())));
            else{
                NyagiBits_Bytes.LOGGER.error("Texture {} was not found anywhere", block.getId());
            }
            //Handle resourcepack generation for simple items
            if(MAIN_TEXTURES.containsKey(block.getId()) && DEV_TEXTURES.containsKey(block.getId())){
                withExistingParent("nbnb-programmer-art/assets/nyagibits_bytes/models/block/"+block.getId(), mcLoc("block/generated"))
                        .texture("all", modLoc("block/dev/"+DEV_TEXTURES.get(block.getId())));
            }
        }
    }


    @Nullable
    private JsonObject getTextureData(String modelPath){
        JsonObject output = null;
        try{
            JsonObject modelJson = JsonParser.parseReader(Files.newBufferedReader(Path.of(modelPath))).getAsJsonObject();
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
