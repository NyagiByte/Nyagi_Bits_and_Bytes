package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SealedPouchItem extends Item {
    public SealedPouchItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Threading hemp fibers through").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("paper and leather to create a").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("pouch to burn more energetic").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("compounds").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
