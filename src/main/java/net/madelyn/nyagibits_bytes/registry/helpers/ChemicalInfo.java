package net.madelyn.nyagibits_bytes.registry.helpers;

import net.madelyn.nyagibits_bytes.misc.Utils;
import net.madelyn.nyagibits_bytes.registry.ModRegistries;

public class ChemicalInfo {
    private final String id;
    private final int tintColor;
    private final ItemInfo.ChemType state;
    public static final int DEFAULT_TINT = 0xFFFF00FF;

    public ChemicalInfo(String id, ItemInfo.ChemType state){
        this.id = id;
        this.tintColor = DEFAULT_TINT;
        this.state = state;
        ModRegistries.ITEMS_LIST.add(new ItemInfo("sample_"+this.id, Utils.Tab.CHEMICALS).chem(state, id).tint(tintColor));
    }

    public ChemicalInfo(String id, int tint, ItemInfo.ChemType state){
        this.id = id;
        this.tintColor = tint;
        this.state = state;
        ModRegistries.ITEMS_LIST.add(new ItemInfo("sample_"+this.id, Utils.Tab.CHEMICALS).chem(state, id).tint(tintColor));
    }

    
    public ChemicalInfo dust(){
        ModRegistries.ITEMS_LIST.add(new ItemInfo(this.id+"_dust", Utils.Tab.CHEMICALS).chem(ItemInfo.ChemType.DUST, id).tint(tintColor));
        return this;
    }

    public ChemicalInfo ingot(){
        ModRegistries.ITEMS_LIST.add(new ItemInfo(this.id+"_ingot", Utils.Tab.CHEMICALS).chem(ItemInfo.ChemType.INGOT, id).tint(tintColor));
        return this;
    }

    public ChemicalInfo plate(){
        ModRegistries.ITEMS_LIST.add(new ItemInfo(this.id+"_plate", Utils.Tab.CHEMICALS).chem(ItemInfo.ChemType.PLATE, id).tint(tintColor));
        return this;
    }
    
    public ChemicalInfo compacted(String itemID){
        ModRegistries.ITEMS_LIST.add(new ItemInfo(itemID, Utils.Tab.CHEMICALS));
        return this;
    }
    
    public ChemicalInfo compacted(ItemInfo info){
        ModRegistries.ITEMS_LIST.add(info);
        return this;
    }
    
    public ChemicalInfo fluid(){
        ModRegistries.FLUIDS_LIST.add(new FluidInfo.Builder(this.id, tintColor).setChemical(this.id));
        return this;
    }

    public ChemicalInfo tickingFluid(){
        ModRegistries.FLUIDS_LIST.add(new FluidInfo.Builder(this.id, tintColor).setTicking().setChemical(this.id));
        return this;
    }
    
    public ChemicalInfo fluid(FluidInfo.Builder builder){
        ModRegistries.FLUIDS_LIST.add(builder);
        return this;
    }

    public String getId(){return id;}
    
}
