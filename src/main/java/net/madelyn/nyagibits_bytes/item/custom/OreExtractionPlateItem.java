package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OreExtractionPlateItem extends Item {
    public OreExtractionPlateItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("By combining tech and tech that").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("looks like magic we can pull more").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("materials out of ores at rates that").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("feel like violations of conservation").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("of mass").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
