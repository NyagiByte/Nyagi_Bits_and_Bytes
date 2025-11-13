package net.madelyn.nyagibits_bytes.block;

import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;

public class BlockInfo {
    private final String id;
    private final SoundType soundtype;
    private final float strength;
    private final boolean requiresTool;
    private final Utils.Tab tab;

    public BlockInfo(String id, SoundType soundtype, float str, boolean tool, Utils.Tab tab){
        this.id = id;
        this.soundtype = soundtype;
        this.strength = str;
        this.requiresTool = tool;
        this.tab = tab;
    }

    public String getId(){
        return id;
    }

    public Utils.Tab getTab(){
        return tab;
    }

    public Block createBlock(){
        BlockBehaviour.Properties props = BlockBehaviour.Properties.of()
                .strength(strength).sound(soundtype);
        if(requiresTool) props = props.requiresCorrectToolForDrops();
        return new Block(props);
    }
    //This is mostly to enable instanceof shenanigans later in loot table datagen.
    public static class Ore extends BlockInfo{
        public Ore(String id, SoundType soundtype, float str, boolean tool, Utils.Tab tab){
            super(id, soundtype, str, tool, tab);
        }
    }

    public static class Rotatable extends BlockInfo{
        public Rotatable(String id, SoundType soundtype, float str, boolean tool, Utils.Tab tab){
            super(id, soundtype, str, tool, tab);
        }

        @Override
        public Block createBlock(){
            BlockBehaviour.Properties props = BlockBehaviour.Properties.of()
                    .strength(super.strength).sound(super.soundtype);
            if(super.requiresTool) props = props.requiresCorrectToolForDrops();
            return new RotatedPillarBlock(props);
        }

    }

}
