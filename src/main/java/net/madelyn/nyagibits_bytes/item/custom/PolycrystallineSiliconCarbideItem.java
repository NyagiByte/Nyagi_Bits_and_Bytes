package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PolycrystallineSiliconCarbideItem extends Item {
    public PolycrystallineSiliconCarbideItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("This semi-crude silicon crystal has").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("special electrical properties. With").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("more refinement this could allow for").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("your first solar panels").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
