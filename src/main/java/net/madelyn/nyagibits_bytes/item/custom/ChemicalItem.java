package net.madelyn.nyagibits_bytes.item.custom;

import net.madelyn.nyagibits_bytes.chemical.ChemicalInfo;
import net.minecraft.world.item.ItemStack;

public class ChemicalItem extends CustomTooltipItem {

    private final int tint;

    public ChemicalItem(Properties properties, int tint){
        super(properties);
        this.tint = tint;
    }

    public ChemicalItem(Properties properties){
        super(properties);
        tint = ChemicalInfo.DEFAULT_TINT;
    }

    public int getColor(ItemStack stack, int layer){
        return layer == 1 ? tint : -1;
    }

}
