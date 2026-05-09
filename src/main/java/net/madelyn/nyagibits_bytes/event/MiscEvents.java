package net.madelyn.nyagibits_bytes.event;

import com.google.common.collect.ImmutableMap;
import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.enchant.ModEnchantments;
import net.madelyn.nyagibits_bytes.item.custom.CustomCurioItem;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotResult;

import java.util.List;
import java.util.Map;

//This is just a place to collect non clientsided events.
@Mod.EventBusSubscriber
public class MiscEvents {
    //Note: We use strings here because the blocks might not exist yet when this runs.
    protected static final Map<String, String> STRIPPABLES = (new ImmutableMap.Builder<String, String>())
            .put("glimmering_log", "glimmering_stripped_log")
            .put("glimmering_wood", "glimmering_stripped_wood")
            .build();

    @SubscribeEvent
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void axeStrippingCheck(BlockEvent.BlockToolModificationEvent event){
        if(event.getToolAction() != ToolActions.AXE_STRIP) return;
        ResourceLocation blockRL = ForgeRegistries.BLOCKS.getKey(event.getFinalState().getBlock());
        if(blockRL == null || !blockRL.getNamespace().equals(NyagiBits_Bytes.MOD_ID)) return; //Don't handle stuff outside NB&B
        if(STRIPPABLES.containsKey(blockRL.getPath())){
            //return block != null ? block.defaultBlockState().setValue(RotatedPillarBlock.AXIS, originalState.getValue(RotatedPillarBlock.AXIS)) : null;
            BlockState stripped = Utils.fetchBlock(Utils.NBNB(STRIPPABLES.get(blockRL.getPath()))).withPropertiesOf(event.getFinalState());
            event.setFinalState(stripped);
        }
    }


    @SubscribeEvent
    public static void excavatingAOECheck(BlockEvent.BreakEvent e){
        if(e.getPlayer().isShiftKeyDown()) return; //Crouch to disable the effects
        BlockHitResult target = (BlockHitResult) e.getPlayer().pick(10, 1, false); //This gets the targeted block's face.
        ItemStack tool = e.getPlayer().getMainHandItem();
        /*if(tool.getEnchantmentLevel(ModEnchantments.BLASTING.get()) > 0){
            excavate(e, target.getBlockPos(), target.getDirection(), false, tool);
            e.setCanceled(true); //Excavating will do the actual block breaking.
            return; //The enchants should be mutually exclusive, but better be safe.
        }*/
        if(tool.getEnchantmentLevel(ModEnchantments.EXCAVATING.get()) > 0 && tool.isCorrectToolForDrops(e.getState())){
            excavate(e, target.getBlockPos(), target.getDirection(), true, tool);
            e.setCanceled(true);
        }
    }

    public static void excavate(BlockEvent.BreakEvent e, BlockPos pos, Direction dir, boolean hasDrops, ItemStack tool){
        boolean dropItems = hasDrops && !e.getPlayer().isCreative();
        Level level = e.getPlayer().level();


        //Botania uses this logic. For each pair of directions, two will be true.
        boolean doX = dir.getStepX() == 0;
        boolean doY = dir.getStepY() == 0;
        boolean doZ = dir.getStepZ() == 0;
        for(int i = -1; i<2; i++){
            for(int j = -1;j<2; j++){
                BlockPos target = pos.offset(
                        doX ? i : 0,
                        doY ? j : 0,
                        doZ ? (doX ? j : i) : 0
                );
                BlockState state = level.getBlockState(target);
                BlockEntity blockEntity = level.getBlockEntity(target);

                LootParams.Builder builder = new LootParams.Builder((ServerLevel) level)
                        .withParameter(LootContextParams.ORIGIN, Vec3.atCenterOf(pos))
                        .withParameter(LootContextParams.TOOL, tool)
                        .withParameter(LootContextParams.THIS_ENTITY, e.getPlayer())
                        .withParameter(LootContextParams.BLOCK_STATE, state)
                        .withOptionalParameter(LootContextParams.BLOCK_ENTITY, blockEntity);


                if((tool.isCorrectToolForDrops(state) && !state.is(NyagiBits_Bytes.EXCAVATING_BLACKLIST)) || (i == 0 && j == 0)){
                    level.destroyBlock(target, false, e.getPlayer());
                    if(dropItems){
                        state.getDrops(builder).forEach(stack -> {
                            Block.popResource(level, target, stack);});
                        state.getBlock().popExperience((ServerLevel) level, pos, state.getExpDrop(level, level.random, pos, tool.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE), tool.getEnchantmentLevel(Enchantments.SILK_TOUCH)));

                    }
                    tool.hurtAndBreak(1, e.getPlayer(), p -> p.broadcastBreakEvent(InteractionHand.MAIN_HAND));
                    if(tool.isEmpty()) return; //If it broke, abort.
                }

            }
        }
    }



    @SubscribeEvent
    public static void miningSpeedChecks(PlayerEvent.BreakSpeed e){
        //The checks get split in two functions because they check for different things.
        //No, not really. Well they do, but really, don't want to merge them.
        aquaAffinityFlagCheck(e);
        excavatingSpeedCheck(e);
    }

    public static void excavatingSpeedCheck(PlayerEvent.BreakSpeed e){
        if(e.getEntity().isShiftKeyDown()) return; //Crouch to disable the effects
        ItemStack tool  = e.getEntity().getMainHandItem();
        if(!tool.isCorrectToolForDrops(e.getState())) return; //To avoid weird effects.
        //Excavating should be slower, since it mines a 3x3.
        if(tool.getEnchantmentLevel(ModEnchantments.EXCAVATING.get()) > 0){
            e.setNewSpeed(e.getOriginalSpeed()* 0.5f); //TODO: Make this number and the one below configurable
        }
        //Blasting should be way faster, as it's balanced by voiding drops.
        /*if(tool.getEnchantmentLevel(ModEnchantments.BLASTING.get()) > 0){
            e.setNewSpeed(e.getOriginalSpeed()*3);
        }*/

    }

    //Apply the aqua affinity curio property
    public static void aquaAffinityFlagCheck(PlayerEvent.BreakSpeed e){
        if(!e.getEntity().isUnderWater()) return; //If the player is not underwater, abort.
        if(EnchantmentHelper.hasAquaAffinity(e.getEntity())) return; //If the player already has aqua affinity, abort.
        //This feels sinful.
        //List<SlotResult> curios = CuriosApi.getCuriosHelper().findCurios(e.getEntity(), stack -> stack.getItem() instanceof CustomCurioItem);
        List<ItemStack> curios = CuriosApi.getCuriosInventory(e.getEntity())
                .map(i -> i.findCurios(c -> c.getItem() instanceof CustomCurioItem)).get()
                .stream().map(SlotResult::stack).toList();

        for(ItemStack slot : curios) {
            CustomCurioItem curio = (CustomCurioItem) slot.getItem();
            if(curio.getCurioFlags().contains(CustomCurioItem.CurioFlags.AQUA_AFFINITY)){
                e.setNewSpeed(e.getOriginalSpeed()*5); //The game divides the breaking speed by 5 while underwater unless aqua affinity is present.
                break; //We stop at the first one we find that passes the check.
            }
        }
    }

}
