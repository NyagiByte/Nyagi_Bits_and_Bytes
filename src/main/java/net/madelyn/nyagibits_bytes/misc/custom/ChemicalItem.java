package net.madelyn.nyagibits_bytes.misc.custom;

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

public class ChemicalItem extends Item {

    private final int tint;
    private final String chemical;

    public ChemicalItem(Properties properties, int tint, String chemical){
        super(properties);
        this.tint = tint;
        this.chemical = chemical;
    }

    @Override //This is like the one in CustomTooltipItem, but with a secondary fallback tooltip describing the chemical as a whole.
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        String descKey = "item." + ForgeRegistries.ITEMS.getResourceKey(this).get().location().toString().replace(':', '.') + ".desc";
        Component desc = Component.translatable(descKey);
        String chemDescKey = "chemical.nyagibits_bytes." + chemical+".desc";
        Component chemDesc = Component.translatable(chemDescKey);
        if(I18n.exists(descKey)) for(String line : desc.getString().split("\n")) components.add(Component.literal(line).withStyle(ChatFormatting.GRAY));
        else if(!chemical.isEmpty() && I18n.exists(chemDescKey)) for(String line : chemDesc.getString().split("\n")) components.add(Component.literal(line).withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }

    public int getColor(ItemStack stack, int layer){
        return layer == 1 ? tint : -1;
    }

}
