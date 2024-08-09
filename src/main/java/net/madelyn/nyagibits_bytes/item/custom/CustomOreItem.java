package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CustomOreItem extends Item {
    public CustomOreItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown()){
            Component desc = Component.translatable("item." +
                    ForgeRegistries.ITEMS.getResourceKey(this).get().location().toString().replace(':', '.') + ".yield");
            for(String line : desc.getString().split("\n")) components.add(Component.literal(line).withStyle(ChatFormatting.BLUE));
        }else{
            Component desc = Component.translatable("item." +
                    ForgeRegistries.ITEMS.getResourceKey(this).get().location().toString().replace(':', '.') + ".desc");
            for(String line : desc.getString().split("\n")) components.add(Component.literal(line).withStyle(ChatFormatting.GRAY));
            components.add(Component.literal(" "));
            components.add(Component.translatable("nyagi_bits_bytes.tooltip.shift_yield_prompt").withStyle(ChatFormatting.YELLOW));
        }

        super.appendHoverText(stack, level, components, flag);
    }
}