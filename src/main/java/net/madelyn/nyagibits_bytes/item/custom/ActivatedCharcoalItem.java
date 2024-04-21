package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ActivatedCharcoalItem extends Item {
    public ActivatedCharcoalItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("By creating tons of microscopic").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("pores within the charcoal it ends").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("up acting as a chemical sponge. Neat!").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
