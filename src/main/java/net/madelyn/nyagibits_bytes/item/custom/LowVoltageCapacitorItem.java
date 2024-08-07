package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LowVoltageCapacitorItem extends Item {
    public LowVoltageCapacitorItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("This nifty thing is able to improve").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("the power efficiency and provide").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("reliable function to circuits and").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("other industrial components").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
