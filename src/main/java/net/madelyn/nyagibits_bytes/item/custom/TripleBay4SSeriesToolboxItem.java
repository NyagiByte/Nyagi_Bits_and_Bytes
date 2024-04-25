package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TripleBay4SSeriesToolboxItem extends Item {
    public TripleBay4SSeriesToolboxItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        /*
        Features and benefits

            MADE IN THE USA. Every 4s series toolbox is manufactured in Jamestown, NY using domestic and global materials
            SUPERIOR CONSTRUCTION. Matco's T-shaped center shelf is fully welded to all sides making it the most durable and secure toolbox on the market
            INTEGRATED POWER. Power drawer includes a holster for tool charging and front convenience power is standard on each toolbox (110V and USB)
            MAKE IT UNIQUE. Choose from 12 paint colors and 6 trim colors to customize your toolbox
            PREMIUM HANDLES. Aluminum overwrap handles are easy to grip and protect drawer top from scratches
            ADDITIONAL STORAGE. Increase storage capacity by adding a top drawer, hutch, half chest, or side locker
            HEAVY LOAD CAPACITY. Drawer slides are rated to hold up to 140 lbs. and each caster is rated up to 900 lbs.
         */
        components.add(Component.literal("Features and benefits").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("MADE IN THE USA. Every 4s series toolbox is manufactured in Jamestown, NY using domestic and global materials").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("SUPERIOR CONSTRUCTION. Matco's T-shaped center shelf is fully welded to all sides making it the most durable and secure toolbox on the market").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("INTEGRATED POWER. Power drawer includes a holster for tool charging and front convenience power is standard on each toolbox (110V and USB)").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("MAKE IT UNIQUE. Choose from 12 paint colors and 6 trim colors to customize your toolbox").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("PREMIUM HANDLES. Aluminum overwrap handles are easy to grip and protect drawer top from scratches").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("ADDITIONAL STORAGE. Increase storage capacity by adding a top drawer, hutch, half chest, or side locker").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("HEAVY LOAD CAPACITY. Drawer slides are rated to hold up to 140 lbs. and each caster is rated up to 900 lbs").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
