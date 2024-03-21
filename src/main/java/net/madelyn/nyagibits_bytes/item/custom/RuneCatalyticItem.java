package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RuneCatalyticItem extends Item {
    public RuneCatalyticItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Similar to 'on-carbon' catalysts").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("this rune is able to use mana to").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("swap which materials are expressed").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("on the surface for any given reaction").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
