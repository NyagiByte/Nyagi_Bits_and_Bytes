package net.madelyn.nyagibits_bytes.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.protocol.game.ServerboundClientCommandPacket;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//These events ensure the client requests statistics from the server when needed.
//Currently, these are required to make the god heart's death tally work correctly.
@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class ClientEvents {

    //This fires when the client logs in.
    @SubscribeEvent
    public static void onPlayerLogin(ClientPlayerNetworkEvent.LoggingIn e){
        updateStats();
    }

    //This fires right after the player had respawned, with a flag telling us if it was a death..
    @SubscribeEvent
    public static void onRespawn(PlayerEvent.Clone e){
        if(e.isWasDeath()) updateStats();
    }

    //This is how the stats screen does it. Optionally, one can implement StatsUpdateListener, but we don't need that here.
    public static void updateStats(){
        ClientPacketListener net = Minecraft.getInstance().getConnection();
        if(net == null) return;
        net.send(new ServerboundClientCommandPacket(ServerboundClientCommandPacket.Action.REQUEST_STATS));
    }
}
