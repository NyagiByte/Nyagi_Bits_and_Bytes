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

public class RawIronBogIronItem extends Item {
    public RawIronBogIronItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown()){

            components.add(Component.literal("T0 - Iron").withStyle(ChatFormatting.BLUE));
            components.add(Component.literal("T1 - Clay").withStyle(ChatFormatting.BLUE));
        }
        else
        {
            //Formed by iron bacteria (Thiobacillus Ferrooxidans and Thiobacillus Thiooxidans)
            // eating nutrients from groundwater and surface flows, pooping out oxidized iron over time forming this ore.
            // Tho we aren't near a swamp it's very strange that it ended up here....
            components.add(Component.literal("Formed by iron bacteria").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("(Thiobacillus Ferrooxidans and Thiobacillus Thiooxidans)").withStyle(ChatFormatting.RED));
            components.add(Component.literal("eating nutrients from groundwater and surface flows,").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("pooping out oxidized iron over time forming this ore.").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("Tho we aren't near a swamp it's very strange that ").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal("it ended up here....").withStyle(ChatFormatting.GRAY));
            components.add(Component.literal(" ").withStyle(ChatFormatting.GRAY));

            components.add(Component.literal("Press Shift for yield information").withStyle(ChatFormatting.YELLOW));

        }

        super.appendHoverText(stack, level, components, flag);
    }
}
