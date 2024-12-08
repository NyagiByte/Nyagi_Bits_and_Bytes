package net.madelyn.nyagibits_bytes.item.custom;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.stats.StatsCounter;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.List;
import java.util.UUID;

@Mod.EventBusSubscriber
public class CuriosRingItem extends CustomTooltipItem implements ICurioItem {
    public CuriosRingItem(Properties properties) {
        super(properties);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(
            SlotContext slotContext, UUID uuid, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = LinkedHashMultimap.create();
        modifiers.put(Attributes.MOVEMENT_SPEED, new AttributeModifier(uuid, "Ring", 0.4, Operation.MULTIPLY_BASE));
        return modifiers;
    }

    //TODO: Find alternative implementation if adding more "rings" other than the inert god heart
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if(level != null && level.isClientSide()){
            components.add(createDeathTally(level.getLevelData().isHardcore()));
        }
        super.appendHoverText(stack, level, components, flag);
    }

    //Creates the tooltip component with the death tally of the player
    public static Component createDeathTally(boolean hardcore){
        //If in hardcore, show a "friendly" reminder instead of the death tally for...obvious reasons.
        if(hardcore) return Component.translatable("nyagi_bits_bytes.tooltip.god_heart.hardcore").withStyle(ChatFormatting.RED);
        //Init the variables
        String tooltip = "";
        int deaths = 0;
        if(Minecraft.getInstance().player != null){
            //Note: This relies on the events in ClientEvents to work properly.
            StatsCounter stats = Minecraft.getInstance().player.getStats();
            deaths = stats.getValue(Stats.CUSTOM.get(Stats.DEATHS));
            //Return a different tooltip for no deaths, one death or more than one death. Expand as needed to accomodate other languages.
            switch (deaths){
                case 0:
                    tooltip = "nyagi_bits_bytes.tooltip.god_heart.no_deaths";
                    break;
                case 1:
                    tooltip = "nyagi_bits_bytes.tooltip.god_heart.one_death";
                    break;
                default:
                    tooltip = "nyagi_bits_bytes.tooltip.god_heart.more_deaths";
                    break;
            }
        }
        return Component.translatable(tooltip, deaths).withStyle(ChatFormatting.RED);
    }

}
