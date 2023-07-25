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
    Nyagi: [Livisite_Alloy, Livisite Slate, Crude Abrasive, Pile of Cogs, Pile of Crude Mechanical Parts, crude/static/entropy science, Soil Sample, Sturdy Box]
    Flooter: []

    Texture authors:
    SoulRacer: [Livisite_Alloy, Crude Abrasive, Pile of Cogs, Pile of Crude Mechanical Parts]
    ---------------------------------------------------------------------------------------*/

    //Textures are present in the path : resources > assets > nyagibits_byte > models > item
    //Item lang is in the path : resources > assets > nyagibits_byte > lang > en_us.json
    //Adding items here

    //--------------------------------------------------------------------------------------



    //Livisite Alloy added 7/11/23 - Nyagi
    public static final RegistryObject<Item>
            Livisite_Alloy = ITEMS.register("livisite_alloy", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
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
    //Soil Sample added 7/25/23 - Nyagi
    public static final RegistryObject<Item>
        Soil_Sample = ITEMS.register("soil_sample", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Sturdy Box added 7/25/23 - Nyagi
    public static final RegistryObject<Item>
        Sturdy_Box = ITEMS.register("sturdy_box", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

    /*
       SCIENCE ITEMS REGISTRATION
     */
    //Used/Crude Compression Test added 7/18/23 - Nyagi
    public static final RegistryObject<Item>
            Crude_Compression_Test = ITEMS.register("crude_compression_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
    public static final RegistryObject<Item>
            Used_Crude_Compression_Test = ITEMS.register("used_crude_compression_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));    //Used/Crude Compression Test added 7/18/23 - Nyagi
    //Used/Crude Statics Test added 7/18/23 - Nyagi
    public static final RegistryObject<Item>
            Statics_Compression_Test = ITEMS.register("crude_statics_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
    public static final RegistryObject<Item>
            Used_Statics_Compression_Test = ITEMS.register("used_crude_statics_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));    //Used/Crude Compression Test added 7/18/23 - Nyagi
    //Used/Crude Entropy Test added 7/18/23 - Nyagi
    public static final RegistryObject<Item>
            Crude_Entropy_Test = ITEMS.register("crude_entropy_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
    public static final RegistryObject<Item>
            Used_Crude_Entropy_Test = ITEMS.register("used_crude_entropy_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));

    //--------------------------------------------------------------------------------------
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
