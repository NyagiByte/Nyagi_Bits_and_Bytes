package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CrudeNaturalArcanaTestItem extends Item {
    public CrudeNaturalArcanaTestItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Got all sorts of mundane and").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("mystical organics in here").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("lets see what happens").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("MAGI- er TECH!").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
