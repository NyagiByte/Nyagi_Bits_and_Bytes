package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class VBeltItem extends Item {
    public VBeltItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Reinforced rubber belt perfect").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("for connecting segments of engine").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("and translating force. You can").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("also strangle someone with this").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
