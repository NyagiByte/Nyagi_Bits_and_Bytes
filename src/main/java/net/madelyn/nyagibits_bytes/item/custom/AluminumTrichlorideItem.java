package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AluminumTrichlorideItem extends Item {
    public AluminumTrichlorideItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Used as catalysts in Friedel-Crafts").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("Alkylation reactions, allowing for").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("carbon groups to be attached to").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("other organic compounds").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
