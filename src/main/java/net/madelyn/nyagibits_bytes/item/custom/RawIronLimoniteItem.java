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

public class RawIronLimoniteItem extends Item {
    public RawIronLimoniteItem(Properties properties) {
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
            //A hydrated iron. By mass has less iron than a pure sample but could potentially be an easy source of hydroxide
            components.add(Component.literal("A hydrated iron. By mass has less").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("iron than a pure sample but could ").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("potentially be an easy source of hydroxide").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal(" ").withStyle(ChatFormatting.GRAY));

            components.add(Component.literal("Press Shift for yield information").withStyle(ChatFormatting.YELLOW));

        }

        super.appendHoverText(stack, level, components, flag);
    }
}
