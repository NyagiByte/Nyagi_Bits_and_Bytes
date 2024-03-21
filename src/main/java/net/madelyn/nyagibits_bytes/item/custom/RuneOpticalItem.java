package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RuneOpticalItem extends Item {
    public RuneOpticalItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("This rune has optically relevant").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("artificial crystals within able").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("to down-convert mana to specific").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("wavelength photons").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
