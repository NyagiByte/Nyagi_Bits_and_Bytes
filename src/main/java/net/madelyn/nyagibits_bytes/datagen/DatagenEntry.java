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
    }

    public static Map<String, String> scanAssets(Path dir, Map<String, String> map, String extension){
        try{
            Files.walk(dir)
                    .filter(Files::isRegularFile)
                    .filter(path -> path.getFileName().toString().endsWith(extension))
                    .forEach(path -> {
                        map.put(path.getFileName().toString().replaceFirst(extension, ""),
                                dir.relativize(path).toString().replaceFirst(extension, ""));
                    });


        } catch (IOException e){
            e.printStackTrace();
        }
        return map;
    }


}
