package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SturdyTrayItem extends Item {
    public SturdyTrayItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Specially treated wood is an").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("ideal surface to accidentally").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("set on fire with chemicals").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
