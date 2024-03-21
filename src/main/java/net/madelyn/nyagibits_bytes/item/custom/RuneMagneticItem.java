package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RuneMagneticItem extends Item {
    public RuneMagneticItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("The electromagnetic coils in").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("this rune seem to function much").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("more efficiently when manasteel").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("is within the structure").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
