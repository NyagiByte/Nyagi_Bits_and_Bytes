package net.madelyn.nyagibits_bytes.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class TintedBlockItem extends BlockItem {

    private final int tint;

    public TintedBlockItem(Block block, Properties props, int tint) {
        super(block, props);
        this.tint = tint;
    }

    public int getColor(ItemStack stack, int layer){
        return tint;
    }

}
