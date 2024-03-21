package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MagneticHematiteItem extends Item {
    public MagneticHematiteItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Hematite isn't usually magnetic but can").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("be found as part of living organisms.").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("Due to it being biocompatible, a magnetic").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("form will allow plants to gain some").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("magnetic properties").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
