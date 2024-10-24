package net.madelyn.nyagibits_bytes.misc;

import net.madelyn.nyagibits_bytes.item.ModCreativeModeTab;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.madelyn.nyagibits_bytes.item.custom.CuriosRingItem;
import net.madelyn.nyagibits_bytes.item.custom.CustomOreItem;
import net.madelyn.nyagibits_bytes.item.custom.CustomTooltipItem;
import net.madelyn.nyagibits_bytes.item.custom.LevitatingItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ItemInfo {
    private String id;
    private ModItems.Type type;
    private CreativeModeTab tab;

public ItemInfo(String id, ModItems.Type type, CreativeModeTab tab){
    this.id = id;
    this.type = type;
    this.tab = tab;
}

public String getId(){
    return id;
}

    public Item registerItem(){
        switch (type){
            case CUSTOM_TOOLTIP -> { return new CustomTooltipItem(new Item.Properties().tab(tab)); }
            case CURIO -> { return new CuriosRingItem(new Item.Properties().tab(tab)); }
            case CUSTOM_ORE -> { return new CustomOreItem(new Item.Properties().tab(tab)); }
            case LEVITATING -> { return new LevitatingItem(new Item.Properties().tab(tab)); }
            default -> {return new Item(new Item.Properties().tab(tab));}
            }
        }
        

}