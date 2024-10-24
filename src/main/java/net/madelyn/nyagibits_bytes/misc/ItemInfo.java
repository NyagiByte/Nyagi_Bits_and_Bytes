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
    private ModItems.Tab tab;

public ItemInfo(String id, ModItems.Type type, ModItems.Tab tab){
    this.id = id;
    this.type = type;
    this.tab = tab;
}

public String getId(){
    return id;
}

    public Item registerItem(){
        switch (type){
            case CUSTOM_TOOLTIP -> { return new CustomTooltipItem(new Item.Properties().tab(getTab(tab))); }
            case CURIO -> { return new CuriosRingItem(new Item.Properties().tab(getTab(tab))); }
            case CUSTOM_ORE -> { return new CustomOreItem(new Item.Properties().tab(getTab(tab))); }
            case LEVITATING -> { return new LevitatingItem(new Item.Properties().tab(getTab(tab))); }
            default -> {return new Item(new Item.Properties().tab(getTab(tab)));}
            }
        }

    private CreativeModeTab getTab(ModItems.Tab tab){
        switch (tab){
            case BLOCKS -> { return ModCreativeModeTab.NYAGIBITS_BYTES_BLOCKS; }
            case FLUIDS -> { return ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS; }
            case SCIENCE -> { return ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE; }
            case MINERALS -> { return ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS; }
            case SEQUENCE -> { return ModCreativeModeTab.NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS; }
            case SCHEMATICS -> { return ModCreativeModeTab.NYAGIBITS_BYTES_SCHEMATICS; }
            default -> { return ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS; }
        }
    }

}