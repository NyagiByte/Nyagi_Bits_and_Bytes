package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FireExtinguisherItem extends Item {
    public FireExtinguisherItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Class B fire extinguisher for your").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("inevitable industrial fire accidents").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("FUNCTIONALITY PLANNED IN FUTURE UPDATE").withStyle(ChatFormatting.YELLOW));
        super.appendHoverText(stack, level, components, flag);
    }
}
