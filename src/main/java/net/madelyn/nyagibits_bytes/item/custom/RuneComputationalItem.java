package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RuneComputationalItem extends Item {
    public RuneComputationalItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal(":(                          ").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("VAZK-OS-v[1.0.2]- dev branch").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("Your Runestone ran into issue").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("Collecting some error info").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("17%...").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
