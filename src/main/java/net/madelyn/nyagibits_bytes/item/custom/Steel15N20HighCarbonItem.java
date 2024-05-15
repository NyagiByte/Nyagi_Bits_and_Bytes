package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Steel15N20HighCarbonItem extends Item {
    public Steel15N20HighCarbonItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("An increased amount of nickle").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("within the alloy grants it more").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("toughness at the cost of some hardness").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
