package net.madelyn.nyagibits_bytes.event;

import net.madelyn.nyagibits_bytes.misc.ModTags;
import net.madelyn.nyagibits_bytes.registry.categories.ModEnchantments;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.game.ServerboundClientCommandPacket;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.client.event.RenderHighlightEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//These events ensure the client requests statistics from the server when needed.
//Currently, these are required to make the god heart's death tally work correctly.
@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class ClientEvents {

    //This handles the block highlighting when using Excavating
    @SubscribeEvent
    public static void highlightExcavate(RenderHighlightEvent.Block e) {
        Minecraft mc = Minecraft.getInstance();
        if(mc.player == null || mc.level == null || mc.player.isCrouching()) return;
        ItemStack tool = mc.player.getMainHandItem();

        ClientLevel level = mc.level;
        BlockHitResult aimed = e.getTarget();
        Direction dir = aimed.getDirection();
        BlockPos pos = aimed.getBlockPos();

        if(tool.getEnchantmentLevel(ModEnchantments.EXCAVATING.get()) > 0 &&
                tool.isCorrectToolForDrops(level.getBlockState(pos)) &&
                !level.getBlockState(pos).is(ModTags.Blocks.EXCAVATING_BLACKLIST)){
            e.setCanceled(true);
            boolean doX = dir.getStepX() == 0;
            boolean doY = dir.getStepY() == 0;
            boolean doZ = dir.getStepZ() == 0;
            //This is to ensure proper layering. Corners, then edges, then middle.
            int [][] posOrder = {{1,1},{1,-1},{-1,1},{-1,-1}, {1,0},{0,1},{-1,0},{0,-1},{0,0}};

            for(int[] block : posOrder){
                    BlockPos target = pos.offset(
                            doX ? block[0] : 0,
                            doY ? block[1] : 0,
                            doZ ? (doX ? block[1] : block[0]) : 0
                    );
                    if(level.isEmptyBlock(target)) continue;
                    VoxelShape shape = level.getBlockState(target).getShape(level, target);
                    if(shape.isEmpty()) continue; //Safely aborts in case of a missed edge case.
                    AABB box = shape.bounds().move(
                            target.getX() - e.getCamera().getPosition().x,
                            target.getY() - e.getCamera().getPosition().y,
                            target.getZ() - e.getCamera().getPosition().z
                    );

                    boolean excavate = tool.isCorrectToolForDrops(level.getBlockState(target)) && !level.getBlockState(target).is(ModTags.Blocks.EXCAVATING_BLACKLIST);
                    //boolean middle = block[0] == 0 & block[1] == 0;
                    LevelRenderer.renderLineBox(
                            e.getPoseStack(),
                            e.getMultiBufferSource().getBuffer(RenderType.LINES),
                            box,
                            excavate /*|| middle*/ ? 0.0F: 1F, excavate /*&& !middle*/ ? 1F : 0.0F, 0.0F,
                            /*middle ? 0.4F : */0.5F + (float) Math.sin((level.getGameTime() + e.getPartialTick())* Math.PI / 20F) * 0.1F
                    );
            }
        }
    }

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
