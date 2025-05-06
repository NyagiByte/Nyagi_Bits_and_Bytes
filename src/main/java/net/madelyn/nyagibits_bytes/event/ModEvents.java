package net.madelyn.nyagibits_bytes.event;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forgespi.locating.IModFile;
import net.minecraftforge.resource.PathPackResources;

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
        Path resourcePath = modFile.findResource("assets/nyagibits_bytes/models/nbnb-programmer-art");
        event.addRepositorySource((packConsumer, packConstructor) -> {
            packConsumer.accept(Pack.create(
                    Utils.NBNB("nbnb-programmer-art").toString(),
                    false, //<-- This dictates whether it's loaded by default.
                    () -> new PathPackResources("NB&B Programmer's Art", resourcePath), //The pack description is in the pack.mcmeta file
                    packConstructor,
                    Pack.Position.BOTTOM,
                    PackSource.DEFAULT //There's more options here. DEFAULT works fine though, so I'm not messing with the others.
            ));
        });
    }
}
