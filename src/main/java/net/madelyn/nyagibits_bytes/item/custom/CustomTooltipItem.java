package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CustomTooltipItem extends Item {
    public CustomTooltipItem(Properties properties) {super(properties);}

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        String descKey = "item." + ForgeRegistries.ITEMS.getResourceKey(this).get().location().toString().replace(':', '.') + ".desc";
        Component desc = Component.translatable(descKey);
        if(I18n.exists(descKey)) for(String line : desc.getString().split("\n")) components.add(Component.literal(line).withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }

    public int getColor(ItemStack pItemStack, int pTintIndex) {
        return 0xff00ff;
    }
}
