package net.madelyn.nyagibits_bytes.event;

import net.madelyn.nyagibits_bytes.item.custom.CustomCurioItem;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotResult;

import java.util.List;

//This is just a place to collect non clientsided events.
@Mod.EventBusSubscriber
public class MiscEvents {

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
