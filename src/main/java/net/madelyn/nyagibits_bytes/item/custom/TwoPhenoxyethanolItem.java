package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TwoPhenoxyethanolItem extends Item {
    public TwoPhenoxyethanolItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Germicidal and Germistatic. Useful as").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("Perfume Fixative, Insect Repellent, and").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("sterilization").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
