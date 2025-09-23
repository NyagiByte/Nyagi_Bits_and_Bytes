package net.madelyn.nyagibits_bytes.chemical;

import net.madelyn.nyagibits_bytes.fluid.FluidInfo;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.madelyn.nyagibits_bytes.misc.Utils;

public class ChemicalInfo {
    private final String id;
    private final int tintColor;
    private static final int DEFAULT_TINT = 0xFFFF00FF;
    private ItemInfo sample = null;
    private ItemInfo compacted = null;
    private FluidInfo.Builder fluid = null;

    public ChemicalInfo(String id){
        this.id = id;
        this.tintColor = DEFAULT_TINT;
        this.sample = new ItemInfo("sample_"+this.id, ModItems.Type.CUSTOM_TOOLTIP, Utils.Tab.CHEMICALS);
    }
    public ChemicalInfo(String id, int tint){
        this.id = id;
        this.tintColor = tint;
        this.sample = new ItemInfo("sample_"+this.id, ModItems.Type.CUSTOM_TOOLTIP, Utils.Tab.CHEMICALS);
    }

    public ChemicalInfo dust(){
        this.compacted = new ItemInfo(this.id+"_dust", ModItems.Type.CUSTOM_TOOLTIP, Utils.Tab.CHEMICALS);
        return this;
    }

    public ChemicalInfo compacted(String itemId){
        this.compacted = new ItemInfo(itemId, ModItems.Type.CUSTOM_TOOLTIP, Utils.Tab.CHEMICALS);
        return this;
    }
    public ChemicalInfo compacted(ItemInfo info){
        this.compacted = info;
        return this;
    }

    public ChemicalInfo fluid(){
        this.fluid = new FluidInfo.Builder(this.id, this.tintColor);
        return this;
    }

    public ItemInfo getSample(){
        return sample;
    }
    public ItemInfo getCompacted(){
        return compacted;
    }
    public FluidInfo.Builder getFluid(){
        return fluid;
    }

}
