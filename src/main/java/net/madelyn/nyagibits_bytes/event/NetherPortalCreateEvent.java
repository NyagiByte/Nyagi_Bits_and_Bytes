package net.madelyn.nyagibits_bytes.event;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NyagiBits_Bytes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class NetherPortalCreateEvent {
    @SubscribeEvent
    public static void portalCreated(BlockEvent.PortalSpawnEvent portalSpawnEvent){
        portalSpawnEvent.setCanceled(true);
    }
}
