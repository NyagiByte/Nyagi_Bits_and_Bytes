package net.madelyn.nyagibits_bytes.item;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NyagiBits_Bytes.MOD_ID);

    /*--------------------------------------------------------------------------------------
    Item authors:
    Nyagi: [Livisite_Alloy, Livisite Slate, Crude Abrasive, Pile of Cogs, Pile of Crude Mechanical Parts]
    Flooter: []

    Texture authors:
    SoulRacer: [Livisite_Alloy, Crude Abrasive, Pile of Cogs]
    ---------------------------------------------------------------------------------------*/

    //Textures are present in the path : resources > assets > nyagibits_byte > models > item
    //Item lang is in the path : resources > assets > nyagibits_byte > lang > en_us.json
    //Adding items here

    //--------------------------------------------------------------------------------------
    //Livisite Alloy added 7/11/23 - Nyagi
    public static final RegistryObject<Item>
            Livisite_Alloy = ITEMS.register("livisite_alloy", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));//Livisite added 7/11/23 - Nyagi
    //Livisite Slate added 7/11/23 - Nyagi
    public static final RegistryObject<Item>
            Livisite_Slate = ITEMS.register("livisite_slate", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Crude Abrasive added 7/11/23 - Nyagi
    public static final RegistryObject<Item>
            Crude_Abrasive = ITEMS.register("crude_abrasive", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Pile of Cogs added 7/11/23 - Nyagi
    public static final RegistryObject<Item>
            Pile_of_Cogs = ITEMS.register("pile_of_cogs", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Pile of Crude Mechanical Parts added 7/11/23 - Nyagi
    public static final RegistryObject<Item>
    Pile_of_Crude_Mechanical_Parts = ITEMS.register("pile_of_crude_mechanical_parts", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));


    //--------------------------------------------------------------------------------------
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
