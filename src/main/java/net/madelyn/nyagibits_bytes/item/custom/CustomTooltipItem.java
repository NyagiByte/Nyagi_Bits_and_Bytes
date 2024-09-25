package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.property.Properties;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CustomTooltipItem extends Item {
    public CustomTooltipItem(Properties properties) {super(properties);}

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        Component desc = Component.translatable("item." +
                ForgeRegistries.ITEMS.getResourceKey(this).get().location().toString().replace(':', '.') + ".desc");
        for(String line : desc.getString().split("\n")) components.add(Component.literal(line).withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
