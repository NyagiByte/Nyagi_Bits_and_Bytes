package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OrganicPseudoLogicItem extends Item {
    public OrganicPseudoLogicItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("The addition of powdered flower petals").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("stimulates the production of Indole-3-acetic").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("acid present in the grafted sunflower stump.").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("Redstone then allows signals to be read out").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("from the activity of the acid forming a crude").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("organic light detector").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
