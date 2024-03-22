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

public class RawIronMagnetiteItem extends Item {
    public RawIronMagnetiteItem(Properties properties) {
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
            //Can be naturally magnetic! Crucial for building your first polarizer
            components.add(Component.literal("Can be naturally magnetic! Crucial for").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("building your first polarizer").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal(" ").withStyle(ChatFormatting.GRAY));

            components.add(Component.literal("Press Shift for yield information").withStyle(ChatFormatting.YELLOW));

        }

        super.appendHoverText(stack, level, components, flag);
    }
}
