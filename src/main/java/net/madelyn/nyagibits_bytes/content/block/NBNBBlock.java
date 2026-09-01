package net.madelyn.nyagibits_bytes.content.block;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class NBNBBlock extends Block {

    private final int tint;
    private final boolean isTinted;

    public NBNBBlock(Properties props){
        super(props);
        this.tint = -1;
        this.isTinted = false;
    }

    public NBNBBlock(Properties props, int tint) {
        super(props);
        this.tint = tint;
        this.isTinted = true;
    }

    public int getColor(BlockState stack, @Nullable BlockAndTintGetter p_92568_, @Nullable BlockPos p_92569_, int index){
        return tint;
    }

    public boolean hasTint(){
        return isTinted;
    }

    public int getTint(){
        return tint;
    }
}
