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

public class RawIronSideriteItem extends Item {
    public RawIronSideriteItem(Properties properties) {
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
            //An easy to smelt variant prised by the ancient greeks. Of course with your industrial machinery that just means less sharpening of your milling equipment.
            components.add(Component.literal("An easy to smelt variant prised by the ancient").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("greeks. Of course with your industrial machinery").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("that just means less sharpening of your milling").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("equipment").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal(" ").withStyle(ChatFormatting.GRAY));

            components.add(Component.literal("Press Shift for yield information").withStyle(ChatFormatting.YELLOW));

        }

        super.appendHoverText(stack, level, components, flag);
    }
}
