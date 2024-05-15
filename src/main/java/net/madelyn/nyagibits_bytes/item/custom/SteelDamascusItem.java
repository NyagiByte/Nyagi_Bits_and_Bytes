package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SteelDamascusItem extends Item {
    public SteelDamascusItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Made from layering different types").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("of high carbon steel to produce").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("an incredibly tough product after").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("folding a bajillion times").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
