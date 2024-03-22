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

public class RawIronBandedIronItem extends Item {
    public RawIronBandedIronItem(Properties properties) {
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
            //Ancient iron from the Precambrian 3.7 billion years ago, surviving all this time to be turned into a spring for your pens
            components.add(Component.literal("Ancient iron from the Precambrian 3.7 billion").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("years ago, surviving all this time to be turned").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("into a spring for your pens ").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal(" ").withStyle(ChatFormatting.GRAY));

            components.add(Component.literal("Press Shift for yield information").withStyle(ChatFormatting.YELLOW));

        }

        super.appendHoverText(stack, level, components, flag);
    }
}
