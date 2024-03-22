package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CrudeMaterialPropertiesTestItem extends Item {
    public CrudeMaterialPropertiesTestItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Gotta test how well this new").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("composite material holds up").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("BURN! SLASH! SMASH!").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("And take some notes").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
