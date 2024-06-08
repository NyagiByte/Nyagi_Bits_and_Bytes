package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ThreadedCompositeLeatherItem extends Item {
    public ThreadedCompositeLeatherItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("By weaving together leather with").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("plates of duroplast you get an").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("impact and friction resistant").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("material while remaining flexible").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
