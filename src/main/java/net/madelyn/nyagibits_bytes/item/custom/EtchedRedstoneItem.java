package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EtchedRedstoneItem extends Item {
    public EtchedRedstoneItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("A slab of redstone with channels").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("carved within it to allow for").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("a flow of energy").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
