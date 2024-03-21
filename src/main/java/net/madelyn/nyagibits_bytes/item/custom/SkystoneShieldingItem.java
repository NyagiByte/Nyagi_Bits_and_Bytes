package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SkystoneShieldingItem extends Item {
    public SkystoneShieldingItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("The properties of skystone allow").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("it to serve as lightweight shielding").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("against electrical interference making").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("it ideal for protecting electronics").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
