package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PetriDishAgarAgarItem extends Item {
    public PetriDishAgarAgarItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Agar-Agar substrate can be").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("considered the 'vanilla' type").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("as it is not specifically made").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("for any 1 type of bacteria.").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
