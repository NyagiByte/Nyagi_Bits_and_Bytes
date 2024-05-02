package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OrganicVaporRespiratorItem extends Item {
    public OrganicVaporRespiratorItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Stops your lungs from being the").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("pollution sponge").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("FUNCTIONALITY PLANNED IN FUTURE UPDATE").withStyle(ChatFormatting.YELLOW));
        super.appendHoverText(stack, level, components, flag);
    }
}
