package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RawIronMeteoricIronItem extends Item {
    public RawIronMeteoricIronItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown()){

            components.add(Component.literal("T0 - Iron").withStyle(ChatFormatting.BLUE));
            components.add(Component.literal("T1 - Iron").withStyle(ChatFormatting.BLUE));
        }
        else
        {
            //A chunk fallen from the heavens. Not fantastic for iron ironically enough but contains trace amounts of rare metals. Will probably require more chemical mastery to tap into.
            components.add(Component.literal("A chunk fallen from the heavens. Not fantastic").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("for iron ironically enough but contains trace").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("amounts of rare metals. Will probably require").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("more chemical mastery to tap into").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal(" ").withStyle(ChatFormatting.GRAY));

            components.add(Component.literal("Press Shift for yield information").withStyle(ChatFormatting.YELLOW));

        }

        super.appendHoverText(stack, level, components, flag);
    }
}
