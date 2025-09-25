package net.madelyn.nyagibits_bytes.chemical;

import net.madelyn.nyagibits_bytes.fluid.FluidInfo;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.madelyn.nyagibits_bytes.misc.Utils;

public class ChemicalInfo {
    private final String id;
    private final int tintColor;
    public static final int DEFAULT_TINT = 0xFFFF00FF;
    private ItemInfo.Chem sample = null;
    private ItemInfo compacted = null;
    private FluidInfo.Builder fluid = null;
    private Type state;

    public ChemicalInfo(String id, Type state){
        this.id = id;
        this.tintColor = DEFAULT_TINT;
        this.state = state;
        this.sample = new ItemInfo.Chem("sample_"+this.id, Utils.Tab.CHEMICALS, tintColor, state);
    }
    public ChemicalInfo(String id, int tint, Type state){
        this.id = id;
        this.tintColor = tint;
        this.state = state;
        this.sample = new ItemInfo.Chem("sample_"+this.id, Utils.Tab.CHEMICALS, tintColor, state);
    }

    public ChemicalInfo dust(){
        this.compacted = new ItemInfo.Chem(this.id+"_dust", Utils.Tab.CHEMICALS, this.tintColor, Type.DUST);
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

    public ItemInfo.Chem getSample(){
        return sample;
    }
    public ItemInfo getCompacted(){
        return compacted;
    }
    public FluidInfo.Builder getFluid(){
        return fluid;
    }

    public enum Type{
        SOLID, //Solid Sample
        LIQUID, //Liquid Sample
        GAS, //Gas Samplee
        DUST //Compacted Dust
    }

}
