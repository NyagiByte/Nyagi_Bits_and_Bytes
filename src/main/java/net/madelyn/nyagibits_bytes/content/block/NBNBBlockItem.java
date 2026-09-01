package net.madelyn.nyagibits_bytes.content.block;

import net.madelyn.nyagibits_bytes.registry.helpers.IAbbreviatedItem;
import net.minecraft.ChatFormatting;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NBNBBlockItem extends BlockItem implements IAbbreviatedItem {

    private final int tint;
    private final boolean isTinted;
    private final String abbreviation;

    public NBNBBlockItem(Block block, Properties props, String abbreviation) {
        super(block, props);
        this.tint = -1;
        this.isTinted = false;
        this.abbreviation = abbreviation;
    }

    public NBNBBlockItem(Block block, Properties props, int tint, String abbreviation) {
        super(block, props);
        this.tint = tint;
        this.isTinted = true;
        this.abbreviation = abbreviation;
    }

    @Override //This is like the one in CustomTooltipItem, but with a secondary fallback tooltip describing the chemical as a whole.
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        String descKey = "block." + ForgeRegistries.ITEMS.getResourceKey(this).get().location().toString().replace(':', '.') + ".desc";
        Component desc = Component.translatable(descKey);
        if(I18n.exists(descKey)) for(String line : desc.getString().split("\n")) components.add(Component.literal(line).withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }


    public int getColor(ItemStack stack, int layer){
        return tint;
    }

    public boolean hasTint(){
        return isTinted;
    }

    @Override
    public boolean isAbbreviated() {
        return !this.abbreviation.isEmpty();
    }

    @Override
    public String getAbbreviation() {
        return abbreviation;
    }
}
