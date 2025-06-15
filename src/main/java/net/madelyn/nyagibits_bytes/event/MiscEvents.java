package net.madelyn.nyagibits_bytes.event;

import com.google.common.collect.ImmutableMap;
import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.item.custom.CustomCurioItem;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.block.state.BlockState;
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

    @SubscribeEvent //Apply the aqua affinity curio property
    public static void aquaAffinityFlagCheck(PlayerEvent.BreakSpeed e){
        if(!e.getEntity().isUnderWater()) return; //If the player is not underwater, abort.
        if(EnchantmentHelper.hasAquaAffinity(e.getEntity())) return; //If the player already has aqua affinity, abort.
        //This feels sinful.
        List<SlotResult> curios = CuriosApi.getCuriosHelper().findCurios(e.getEntity(), stack -> stack.getItem() instanceof CustomCurioItem);
        for(SlotResult slot : curios) {
            CustomCurioItem curio = (CustomCurioItem) slot.stack().getItem();
            if(curio.getCurioFlags().contains(CustomCurioItem.CurioFlags.AQUA_AFFINITY)){
                e.setNewSpeed(e.getOriginalSpeed()*5); //The game divides the breaking speed by 5 while underwater unless aqua affinity is present.
                break; //We stop at the first one we find that passes the check.
            }
        }
    }

}
