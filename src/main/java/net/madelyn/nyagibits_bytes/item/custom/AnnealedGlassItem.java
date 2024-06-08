package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AnnealedGlassItem extends Item {
    public AnnealedGlassItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Glass tends to be quite stressed").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("when it is first made, so naturally").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("de-stressing it involves almost").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("melting it again and letting it").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("slowly relax (cool) after.").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
