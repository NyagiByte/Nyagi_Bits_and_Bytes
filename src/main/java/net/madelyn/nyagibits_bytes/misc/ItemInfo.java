package net.madelyn.nyagibits_bytes.misc;

import net.madelyn.nyagibits_bytes.item.ModCreativeModeTab;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.madelyn.nyagibits_bytes.item.custom.CuriosRingItem;
import net.madelyn.nyagibits_bytes.item.custom.CustomOreItem;
import net.madelyn.nyagibits_bytes.item.custom.CustomTooltipItem;
import net.madelyn.nyagibits_bytes.item.custom.LevitatingItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;

import java.util.function.Supplier;

public class ItemInfo {
    private final String id;
    private final ModItems.Type type;
    private final CreativeModeTab tab;

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

    public static class Bucket extends ItemInfo{

        private final Supplier<? extends Fluid> fluid;

        public Bucket (String id, Supplier<? extends Fluid> fluidSupplier){
            super(id, ModItems.Type.ITEM, ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS);
            this.fluid = fluidSupplier;
        }

        //This should get called even in the context of the list of Item Info. Go back and interface some stuff if not.
        @Override
        public Item registerItem(){
            return new BucketItem(fluid,
                    new Item.Properties()
                            .tab(ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS)
                            .craftRemainder(Items.BUCKET)
                            .stacksTo(1)
            );
        }

    }

}