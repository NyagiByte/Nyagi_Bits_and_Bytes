package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SturdyBoxItem extends Item {
    public SturdyBoxItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Reinforced wooden box perfect").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("for very basic item handling").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("and aggressive processing").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
