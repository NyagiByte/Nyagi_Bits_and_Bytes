package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LabNotebookWithCrudeStaticsDataItem extends Item {
    public LabNotebookWithCrudeStaticsDataItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Wool is surprisingly good at").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("making a static charge...").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("Also put another stack of").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("Buckets on the shopping list").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
