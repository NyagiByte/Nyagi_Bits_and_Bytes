package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Ae2AssemblyItem extends Item {
    public Ae2AssemblyItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("This pile of parts is used to").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("bulk craft Ae2 components with").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("the addition of a key item and").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("a schematic").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
