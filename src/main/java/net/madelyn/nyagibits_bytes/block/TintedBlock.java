package net.madelyn.nyagibits_bytes.block;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class TintedBlock extends Block {

    private final int tint;

    public TintedBlock(Properties props, int tint) {
        super(props);
        this.tint = tint;
    }

    public int getColor(BlockState stack, @Nullable BlockAndTintGetter p_92568_, @Nullable BlockPos p_92569_, int index){
        return tint;
    }

    public int getTint(){
        return tint;
    }
}
