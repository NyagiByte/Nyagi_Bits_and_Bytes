package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LowTemperatureSolderItem extends Item {
    public LowTemperatureSolderItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("This alloy is able to melt at").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("very low temperatures making it").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("ideal for still managing to apply").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("too much to the bread board and").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("absolutely screwing it all up").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
