package net.madelyn.nyagibits_bytes.datagen;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

@Mod.EventBusSubscriber(modid = NyagiBits_Bytes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DatagenEntry {

    //This starts the entire datagen process.
    @SubscribeEvent
    public static void doDatagen(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        if(event.includeClient()){
            //NOTE: The block model generator MUST run before the item model one.
            //Otherwise, the item model generator fails since the block models don't exist yet.
            generator.addProvider(true, new BlockModelDatagen(generator, event.getExistingFileHelper()));
            generator.addProvider(true, new BlockstateDatagen(generator, event.getExistingFileHelper()));
            generator.addProvider(true, new ItemModelDatagen(generator, event.getExistingFileHelper()));
        }
        if(event.includeServer()){
            generator.addProvider(true, new LootTableDatagen(generator, event.getExistingFileHelper()));
        }
    }

    //This is to make datagen work for windows plebs. Forwards slashes and backslashes get mixed up on windows.
    public static String fixSlash(String s){
        return s.replaceAll("\\\\", "/");
    }

    //This is sinful. There's probably a far better way to do this.
    public static Map<String, String> scanAssets(Path dir, Map<String, String> map, String extension){
        try{
            //This goes through all the files in the path, going down subfolders as well.
            Files.walk(dir.normalize())
                    //It actually lists all paths, including folders, so we start filtering.
                    .filter(Files::isRegularFile)
                    //We pass an extension, either .json or .png to ensure we don't index unnecesarry stuff like bbmodel or png.mcmeta
                    .filter(path -> path.getFileName().toString().endsWith(extension))
                    .forEach(path -> {
                        //The end result is key:sintered_argentite, value:minerals/sintered/sintered_argentite
                        map.put(path.getFileName().toString().replaceFirst(extension, ""),
                                fixSlash(dir.relativize(path).toString().replaceFirst(extension, "")));
                    });

        //You need this most times you try to do stuff with Files.
        } catch (IOException e){
            e.printStackTrace();
        }
        return map;
    }


}
