package net.madelyn.nyagibits_bytes.pure;

import net.madelyn.nyagibits_bytes.block.BlockInfo;
import net.madelyn.nyagibits_bytes.fluid.FluidInfo;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.world.level.material.Material;

public class ItemPureInfo {
    private final String id;
    private final int tintColor;
    private ItemInfo.Pure sample = null;
    private ItemInfo.Pure dust = null;
    private ItemInfo.Pure nugget = null;
    private ItemInfo.Pure ingot = null;
    private BlockInfo block = null;
    private FluidInfo.Builder molten = null;

    //"name" -> +_tiny_sample +_dust, +_nugget, +_ingot, +_block, +_molten
    //grayscale -> tint
    //creativeTab NYAGIBITS_BYTES_ELEMENTS
    //block -> loot table
    //molten -> bucket

    public ItemPureInfo(String id, int tint){
        this.id = id;
        this.tintColor = tint;
        this.sample = new ItemInfo.Pure("tiny_sample_of_pure_"+this.id, tintColor, "tiny_sample");
        this.dust = new ItemInfo.Pure("pure_"+this.id+"_dust", tintColor, "dust");
        this.nugget = new ItemInfo.Pure("pure_"+this.id+"_nugget", tintColor, "nugget");
        this.ingot = new ItemInfo.Pure("pure_"+this.id+"_ingot", tintColor, "ingot");

        this.block = new BlockInfo("pure_block_of_"+this.id, Material.METAL, 5f, true, Utils.Tab.ELEMENTS);
        this.molten = new FluidInfo.Builder("pure_molten_"+this.id, tintColor);
    }
    public String getId(){
        return id;
    }
    public int getTintColor(){
        return tintColor;
    }
    public ItemInfo.Pure getSample(){
        return sample;
    }
    public ItemInfo.Pure getDust(){
        return dust;
    }
    public ItemInfo.Pure getNugget(){
        return nugget;
    }
    public ItemInfo.Pure getIngot(){
        return ingot;
    }
    public BlockInfo getBlock(){
        return block;
    }
    public FluidInfo.Builder getMolten(){
        return molten;
    }
}