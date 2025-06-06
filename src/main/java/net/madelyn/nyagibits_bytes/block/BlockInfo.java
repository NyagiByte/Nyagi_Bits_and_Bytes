package net.madelyn.nyagibits_bytes.block;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class BlockInfo {
    private final String id;
    private final Material material;
    private final float strength;
    private final boolean requiresTool;
    private final CreativeModeTab tab;

    public BlockInfo(String id, Material mat, float str, boolean tool, CreativeModeTab tab){
        this.id = id;
        this.material = mat;
        this.strength = str;
        this.requiresTool = tool;
        this.tab = tab;
    }

    public String getId(){
        return id;
    }

    public CreativeModeTab getTab(){
        return tab;
    }

    public Block createBlock(){
        BlockBehaviour.Properties props = BlockBehaviour.Properties.of
                (material)
                .strength(strength);
        if(requiresTool) props = props.requiresCorrectToolForDrops();
        return new Block(props);
    }
    //This is mostly to enable instanceof shenanigans later in loot table datagen.
    public static class Ore extends BlockInfo{
        public Ore(String id, Material mat, float str, boolean tool, CreativeModeTab tab){
            super(id, mat, str, tool, tab);
        }
    }

}
