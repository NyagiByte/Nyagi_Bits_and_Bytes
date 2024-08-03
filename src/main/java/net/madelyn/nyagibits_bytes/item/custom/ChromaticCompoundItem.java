package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ChromaticCompoundItem extends Item {
    public ChromaticCompoundItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("This material seems to be").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("attracted to sources of either").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("intense light or darkness...").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }

}
