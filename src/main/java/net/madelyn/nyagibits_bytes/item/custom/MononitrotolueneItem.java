package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MononitrotolueneItem extends Item {
    public MononitrotolueneItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("On your way to making tnt! By itself").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("it can be used in the production of").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("pigments, antioxidants, and has use").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("in agriculture and photography").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
