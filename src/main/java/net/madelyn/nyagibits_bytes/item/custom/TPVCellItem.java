package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TPVCellItem extends Item {
    public TPVCellItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("TPV Cells work similar to PV Cells,").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("but instead of visible light these").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("specialize in absorbing infrared").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("photons, acting as a heat based").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("'solar' panel.").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
