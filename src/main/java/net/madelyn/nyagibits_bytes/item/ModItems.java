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
    Nyagi: [Livisite_Alloy, Livisite Slate, Crude Abrasive, Pile of Cogs, Pile of Crude Mechanical Parts, crude/static/entropy science, Soil Sample, Sturdy Box
            Sealed Pouch, Lab Notebook, Lab Notebook with Crude/Static/Entropy Data, Ae2 Schematic, Pen, Pen Assembly, Ball Bearing, Thin Casing, Tiny Spring, Ink Cartridge,
            Ink]
    Flooter: []

    Texture authors:
    SoulRacer: [Livisite_Alloy, Crude Abrasive, Pile of Cogs, Pile of Crude Mechanical Parts]
    ---------------------------------------------------------------------------------------*/

    //Textures are present in the path : resources > assets > nyagibits_byte > models > item
    //Item lang is in the path : resources > assets > nyagibits_byte > lang > en_us.json
    //Adding items here

    //--------------------------------------------------------------------------------------

    /*
       GENERIC ITEMS
     */
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
    //Sealed Pouch added 7/25/23 - Nyagi
    public static final RegistryObject<Item>
            Sealed_Pouch = ITEMS.register("sealed_pouch", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Salt Water added 7/25/23 - Nyagi
    public static final RegistryObject<Item>
            Salt_Water = ITEMS.register("bucket_of_salt_water", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Torn Wool Ball added 7/25/23 - Nyagi
    public static final RegistryObject<Item>
            Torn_Wool_Ball = ITEMS.register("torn_wool_ball", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Etched Redstone Plate added 8/10/23 - Nyagi
    public static final RegistryObject<Item>
            Etched_Redstone_Plate = ITEMS.register("etched_redstone_plate", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Crude Silicon Boule added 8/10/23 - Nyagi
    public static final RegistryObject<Item>
            Crude_Silicon_Boule = ITEMS.register("crude_silicon_boule", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Diamond Shard added 8/10/23 - Nyagi
    public static final RegistryObject<Item>
            Diamond_Shard = ITEMS.register("diamond_shard", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Logic Dud added 8/10/23 - Nyagi
    public static final RegistryObject<Item>
            Logic_Dud = ITEMS.register("logic_dud", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Calculation Dud added 8/10/23 - Nyagi
    public static final RegistryObject<Item>
            Calculation_Dud = ITEMS.register("calculation_dud", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Engineering Dud added 8/10/23 - Nyagi
    public static final RegistryObject<Item>
            Engineering_Dud = ITEMS.register("engineering_dud", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Engineering Dud added 8/27/23 - Nyagi
    public static final RegistryObject<Item>
            Bottle_Of_Anthocyanin = ITEMS.register("bottle_of_anthocyanin", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Engineering Dud added 8/27/23 - Nyagi
    public static final RegistryObject<Item>
            Bottle_Of_Malic_And_Citric_Acid = ITEMS.register("bottle_of_malic_and_citric_acid", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Engineering Dud added 8/27/23 - Nyagi
    public static final RegistryObject<Item>
            Chemistry_Rack = ITEMS.register("chemistry_rack", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

    //Ae2 Assembly added 8/10/23 - Nyagi
    public static final RegistryObject<Item>
            Ae2_Assembly = ITEMS.register("ae2_assembly", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
        //Crystal_Harmonizer added 8/10/23 - Nyagi
        public static final RegistryObject<Item>
                Crystal_Harmonizer = ITEMS.register("crystal_harmonizer", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
        //Processor_Stack added 8/10/23 - Nyagi
        public static final RegistryObject<Item>
                Processor_Stack = ITEMS.register("processor_stack", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
        //Energized_Frame added 8/10/23 - Nyagi
        public static final RegistryObject<Item>
                Energized_Frame = ITEMS.register("energized_frame", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
        //Energized_Wires added 8/10/23 - Nyagi
        public static final RegistryObject<Item>
                Energized_Wires = ITEMS.register("energized_wires", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
        //Skystone Shielding added 8/10/23 - Nyagi
        public static final RegistryObject<Item>
                Skystone_Shielding = ITEMS.register("skystone_shielding", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
        //Matter Converters added 8/10/23 - Nyagi
        public static final RegistryObject<Item>
                Matter_Converters = ITEMS.register("matter_converters", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
        //Decorative Paneling added 8/10/23 - Nyagi
        public static final RegistryObject<Item>
                Decorative_Paneling = ITEMS.register("decorative_paneling", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
        //MicroTools added 8/10/23 - Nyagi
        public static final RegistryObject<Item>
                Micro_Tools = ITEMS.register("micro_tools", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
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
            Crude_Statics_Test = ITEMS.register("crude_statics_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
    public static final RegistryObject<Item>
            Used_Crude_Statics_Test = ITEMS.register("used_crude_statics_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));    //Used/Crude Compression Test added 7/18/23 - Nyagi
    //Used/Crude Entropy Test added 7/18/23 - Nyagi
    public static final RegistryObject<Item>
            Crude_Entropy_Test = ITEMS.register("crude_entropy_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
    public static final RegistryObject<Item>
            Used_Crude_Entropy_Test = ITEMS.register("used_crude_entropy_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));    //Used/Crude Compression Test added 7/18/23 - Nyagi
    //Used/Crude Acidics Test added 8/27/23 - Nyagi
    public static final RegistryObject<Item>
            Crude_Acidics_Test = ITEMS.register("crude_acidics_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
    public static final RegistryObject<Item>
            Used_Crude_Acidics_Test = ITEMS.register("used_crude_acidics_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));    //Used/Crude Compression Test added 7/18/23 - Nyagi
    //Used/Crude Natural Arcana Test added 8/27/23 - Nyagi
    public static final RegistryObject<Item>
            Crude_Natural_Arcana_Test = ITEMS.register("crude_natural_arcana_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
    public static final RegistryObject<Item>
            Used_Crude_Natural_Arcana_Test = ITEMS.register("used_crude_natural_arcana_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));    //Used/Crude Compression Test added 7/18/23 - Nyagi
    //Used/Crude Entropy Test added 8/27/23 - Nyagi
    public static final RegistryObject<Item>
            Crude_Material_Properties_Test = ITEMS.register("crude_material_properties_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
    public static final RegistryObject<Item>
            Used_Crude_Material_Properties_Test = ITEMS.register("used_crude_material_properties_test", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
    /*
       SCIENCE DATA STORAGE
     */
    //added 8/10/23 - Nyagi
    public static final RegistryObject<Item>
            Lab_Notebook = ITEMS.register("lab_notebook", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
            public static final RegistryObject<Item>
                Lab_Notebook_With_Crude_Compression_Data = ITEMS.register("lab_notebook_with_crude_compression_data", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
            public static final RegistryObject<Item>
                Lab_Notebook_With_Crude_Statics_Data = ITEMS.register("lab_notebook_with_crude_statics_data", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
            public static final RegistryObject<Item>
                Lab_Notebook_With_Crude_Entropy_Data = ITEMS.register("lab_notebook_with_crude_entropy_data", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
            //added 8/27/23 - Nyagi
            public static final RegistryObject<Item>
                Lab_Notebook_With_Crude_Acidics_Data = ITEMS.register("lab_notebook_with_crude_acidics_data", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
            public static final RegistryObject<Item>
                Lab_Notebook_With_Crude_Natural_Arcana_Data = ITEMS.register("lab_notebook_with_crude_natural_arcana_data", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
            public static final RegistryObject<Item>
                Lab_Notebook_With_Crude_Material_Properties_Data = ITEMS.register("lab_notebook_with_crude_material_properties_data", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
    public static final RegistryObject<Item>
            Pen = ITEMS.register("pen", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    public static final RegistryObject<Item>
            Pen_Assembly = ITEMS.register("pen_assembly", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    public static final RegistryObject<Item>
            Ball_Bearing = ITEMS.register("ball_bearing", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    public static final RegistryObject<Item>
            Thin_Casing = ITEMS.register("thin_casing", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    public static final RegistryObject<Item>
            Tiny_Spring = ITEMS.register("tiny_spring", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    public static final RegistryObject<Item>
            Ink_Cartridge = ITEMS.register("ink_cartridge", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    public static final RegistryObject<Item>
            Ink = ITEMS.register("ink", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

    /*
       SCHEMATICS
     */
    public static final RegistryObject<Item>
        Ae2_Schematic = ITEMS.register("ae2_schematic", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCHEMATICS)));

    //--------------------------------------------------------------------------------------
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
