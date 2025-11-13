package net.madelyn.nyagibits_bytes.event;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.minecraft.network.chat.Component;

import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forgespi.locating.IModFile;

import java.nio.file.Path;

//Events specific to the mod event bus go here.
@Mod.EventBusSubscriber(modid = NyagiBits_Bytes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    //This registers an optional resourcepack with the programmer's art.
    //Also no, you can't put it on the client bus. I think it's because this does datapacks too.
    @SubscribeEvent
    public static void registerResourcePack(AddPackFindersEvent event){
        if(event.getPackType() != PackType.CLIENT_RESOURCES) return;
        IModFile modFile = ModList.get().getModFileById(NyagiBits_Bytes.MOD_ID).getFile();
        Path resPath = modFile.findResource("assets/nyagibits_bytes/models/nbnb-programmer-art");
        PathPackResources pack = new PathPackResources(
                modFile.getFileName()+":"+resPath,
                resPath,
                false
        );
        Pack.ResourcesSupplier supplier = o -> pack;
        String name = "nyagibits_bytes/programmers-art";
            event.addRepositorySource(packConsumer -> {
                ;packConsumer.accept(Pack.create(
                        "nbnb-programmer-art",
                        Component.literal("NB&B Programmer's Art"),
                        false, //<-- This dictates whether it's loaded by default.
                        supplier, //The pack description is in the pack.mcmeta file
                        Pack.readPackInfo(name, supplier),
                        PackType.CLIENT_RESOURCES,
                        Pack.Position.BOTTOM,
                        false,
                        PackSource.DEFAULT //There's more options here. DEFAULT works fine though, so I'm not messing with the others.
                ));
        });
            pack.close();
    }
}
