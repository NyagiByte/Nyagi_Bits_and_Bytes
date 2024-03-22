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

public class RawIronPyriteItem extends Item {
    public RawIronPyriteItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown()){

            components.add(Component.literal("T0 - Iron").withStyle(ChatFormatting.BLUE));
            components.add(Component.literal("T1 - Sulfur").withStyle(ChatFormatting.BLUE));
        }
        else
        {
            //Don't be a fool this isn't gold. However it does contain quite a decent fraction of sulfur
            components.add(Component.literal("Don't be a fool this isn't gold. However").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("it does contain quite a decent fraction").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("of sulfur").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal(" ").withStyle(ChatFormatting.GRAY));

            components.add(Component.literal("Press Shift for yield information").withStyle(ChatFormatting.YELLOW));

        }

        super.appendHoverText(stack, level, components, flag);
    }
}
