package net.madelyn.nyagibits_bytes.item.custom;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.stats.StatsCounter;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*
This class holds everything to make a basic curio. It has a list of attribute modifiers and a list of permanent potion effects.
The soulbound and deathTally flags are intended for the god heart curios but can be used if making other important curios.
NOTE: The curio also needs to be tagged properly. see data/curios/tags/items/ring.json
 */
@Mod.EventBusSubscriber
public class CustomCurioItem extends CustomTooltipItem implements ICurioItem {
    //Utils.Modifier is a helper class to hold all the info needed to build the correct attribute modifiers, since normally you need to be in the context of getAttributeModifiers.
    private List<Utils.Modifier> curioAttributes = new ArrayList<>();
    private List<MobEffectInstance> curioEffects = new ArrayList<>();
    private List<CurioFlags> curioFlags = new ArrayList<>();

    public CustomCurioItem(Properties properties, List<Utils.Modifier> modifiers, List<MobEffectInstance> effects, List<CurioFlags> flags) {
        super(properties);
        this.curioAttributes = modifiers;
        this.curioEffects = effects;
        this.curioFlags = flags;
    }

    //Just some getters, nothing special here.
    public List<Utils.Modifier> getCurioAttributes(){
        return curioAttributes;
    }
    public List<MobEffectInstance> getCurioEffects(){
        return curioEffects;
    }
    public List<CurioFlags> getCurioFlags(){
        return curioFlags;
    }


    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(
            SlotContext slotContext, UUID uuid, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = LinkedHashMultimap.create();
        curioAttributes.forEach(attribute -> {
            modifiers.put(attribute.getAttribute(), new AttributeModifier(uuid, attribute.getSlot(), attribute.getValue(), attribute.getOperation()));
        });
        return modifiers;
    }

    //This can be used to apply effects instead of the datapack function.
    @Override
    public void curioTick(SlotContext ctx, ItemStack stack){
        LivingEntity entity = ctx.entity();
        //DO NOT just apply the effect instance. Things get...weird if you do. Clone it instead.
        for (MobEffectInstance effect : curioEffects){
            entity.addEffect(new MobEffectInstance(effect));
        }
    }

    @NotNull
    @Override //This works in tandem with the packtweaker soulbound tag. This applies to EQUIPPED curios.
    //So if it's equipped, it stays equipped on respawn. If it's in the inventory, it remains in the inventory on respawn.
    public ICurio.DropRule getDropRule(SlotContext slotContext, DamageSource source, int lootingLevel, boolean recentlyHit, ItemStack stack) {
        if(curioFlags.contains(CurioFlags.SOULBOUND)) return ICurio.DropRule.ALWAYS_KEEP;
        else return ICurio.DropRule.DEFAULT;
    }

    @Override //This appends the death tally to the tooltip
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        super.appendHoverText(stack, level, components, flag); //Call this first to show the normal tooltip before the death tally
        if(curioFlags.contains(CurioFlags.DEATH_COUNTER) && level != null && level.isClientSide()){
            components.add(createDeathTally(level.getLevelData().isHardcore()));
        }
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
            //Return a different tooltip for no deaths, one death or more than one death. Expand as needed to accommodate other languages.
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
        //Any of these tooltips can use %s to fill in the number of deaths
        return Component.translatable(tooltip, deaths).withStyle(ChatFormatting.RED);
    }



    //This is a list of flags that can be given to each custom curio.
    public enum CurioFlags{
        SOULBOUND, //Makes the curio not drop on death if equipped
        DEATH_COUNTER, //Adds a death counter to the tooltip
        AQUA_AFFINITY //Grants similar effects as the aqua affinity enchantment
    }


}
