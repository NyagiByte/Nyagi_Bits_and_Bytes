package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CrudeEntropyTestItem extends Item {
    public CrudeEntropyTestItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("This mixture of unstable").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("compounds should be a decent").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("way to measure change in").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("entropy of a system").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("BURN!").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
