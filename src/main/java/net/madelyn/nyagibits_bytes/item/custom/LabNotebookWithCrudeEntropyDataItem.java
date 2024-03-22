package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LabNotebookWithCrudeEntropyDataItem extends Item {
    public LabNotebookWithCrudeEntropyDataItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("The gunpowder seems to of").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("forced the quartz into a").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("less energetically favorable").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("formation. The rest of this I'm").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("not sure if it did anything..").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
