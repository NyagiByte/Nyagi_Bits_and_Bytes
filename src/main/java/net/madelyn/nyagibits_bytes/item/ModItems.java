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
    //Basic Composite Material added 8/27/23 - Nyagi
    public static final RegistryObject<Item>
            Basic_Composite_Material = ITEMS.register("basic_composite_material", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
    //Basic Composite Plate added 8/27/23 - Nyagi
    public static final RegistryObject<Item>
            Basic_Composite_Plate = ITEMS.register("basic_composite_plate", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

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
    //Blank Blueprint added 8/27/23 - Nyagi
    public static final RegistryObject<Item>
            Blank_Blueprint = ITEMS.register("blank_blueprint", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCHEMATICS)));
    public static final RegistryObject<Item>
        Ae2_Schematic = ITEMS.register("ae2_schematic", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_SCHEMATICS)));

     /*
       Ore items
     */
    //Iron-related added 9/29/23 - Nyagi
        //Limonite
            public static final RegistryObject<Item>
                    Raw_Limonite = ITEMS.register("raw_limonite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Hematite
            public static final RegistryObject<Item>
                    Raw_Hematite = ITEMS.register("raw_hematite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Magnetite
            public static final RegistryObject<Item>
                    Raw_Magnetite = ITEMS.register("raw_magnetite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Pyrite
            public static final RegistryObject<Item>
                    Raw_Pyrite = ITEMS.register("raw_pyrite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Siderite
            public static final RegistryObject<Item>
                    Raw_Siderite = ITEMS.register("raw_siderite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Banded Iron
            public static final RegistryObject<Item>
                    Raw_Banded_Iron = ITEMS.register("raw_banded_iron", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Bog Iron
            public static final RegistryObject<Item>
                    Raw_Bog_Iron = ITEMS.register("raw_bog_iron", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Meteoric
            public static final RegistryObject<Item>
                    Raw_Meteoric_Iron = ITEMS.register("raw_meteoric_iron", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
    //Copper-related added 10/1/23 - Nyagi
        //Chalcopyrite
            public static final RegistryObject<Item>
                    Raw_Chalcopyrite = ITEMS.register("raw_chalcopyrite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Malachite
            public static final RegistryObject<Item>
                    Raw_Malachite = ITEMS.register("raw_malachite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Azurite
            public static final RegistryObject<Item>
                    Raw_Azurite = ITEMS.register("raw_azurite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Tetrahedrite
            public static final RegistryObject<Item>
                    Raw_Tetrahedrite = ITEMS.register("raw_tetrahedrite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Enargite
            public static final RegistryObject<Item>
                    Raw_Enargite = ITEMS.register("raw_enargite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Chrysocolla
            public static final RegistryObject<Item>
                    Raw_Chrysocolla = ITEMS.register("raw_chrysocolla", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Tennanite
            public static final RegistryObject<Item>
                    Raw_Tennanite = ITEMS.register("raw_tennanite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Dioptase
            public static final RegistryObject<Item>
                    Raw_Dioptase = ITEMS.register("raw_dioptase", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
    //Coal-related added 10/1/23 - Nyagi
        //Lignite
            public static final RegistryObject<Item>
                    Raw_Lignite = ITEMS.register("raw_lignite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Bituminous
            public static final RegistryObject<Item>
                    Raw_Bituminous = ITEMS.register("raw_bituminous", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Subbituminous
            public static final RegistryObject<Item>
                    Raw_Subbituminous = ITEMS.register("raw_subbituminous", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Anthracite
            public static final RegistryObject<Item>
                    Raw_Anthracite = ITEMS.register("raw_anthracite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Cannel Coal
            public static final RegistryObject<Item>
                    Raw_Cannel_Coal = ITEMS.register("raw_cannel_coal", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Jet
            public static final RegistryObject<Item>
                    Raw_Jet = ITEMS.register("raw_jet", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Peat
            public static final RegistryObject<Item>
                    Raw_Peat = ITEMS.register("raw_peat", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Graphite
            public static final RegistryObject<Item>
                    Raw_Graphite = ITEMS.register("raw_graphite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
    //Gold&Silver-related added 10/1/23 - Nyagi
        //Alluvial Slush
            public static final RegistryObject<Item>
                    Alluvial_Slush = ITEMS.register("alluvial_slush", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Native Cluster (Gold, Silver, Electrum)
            public static final RegistryObject<Item>
                    Native_Cluster = ITEMS.register("native_cluster", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Argentite
            public static final RegistryObject<Item>
                    Raw_Argentite = ITEMS.register("raw_argentite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Chlorargyrite
            public static final RegistryObject<Item>
                    Raw_Chlorargyrite = ITEMS.register("raw_chlorargyrite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Polybasite
            public static final RegistryObject<Item>
                    Raw_Polybasite = ITEMS.register("raw_polybasite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Proustite
            public static final RegistryObject<Item>
                    Raw_Proustite = ITEMS.register("raw_proustite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Electrum
            public static final RegistryObject<Item>
                    Raw_Electrum = ITEMS.register("raw_electrum", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Kustelite Electrum
            public static final RegistryObject<Item>
                    Raw_Kustelite_Electrum = ITEMS.register("raw_kustelite_electrum", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
    //Redstone&Mercury-related added 10/9/23 - Nyagi
        //Cinnabar
            public static final RegistryObject<Item>
                    Raw_Cinnabar = ITEMS.register("raw_cinnabar", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Metacinnabar
            public static final RegistryObject<Item>
                    Raw_Metacinnabar = ITEMS.register("raw_metacinnabar", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Corderoite
            public static final RegistryObject<Item>
                    Raw_Corderoite = ITEMS.register("raw_corderoite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Basaltic Powder
            public static final RegistryObject<Item>
                    Raw_Basaltic_Powder = ITEMS.register("raw_basaltic_powder", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Calomel
            public static final RegistryObject<Item>
                    Raw_Calomel = ITEMS.register("raw_calomel", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Native Mercury Spherules
            public static final RegistryObject<Item>
                    Raw_Native_Mercury_Spherules = ITEMS.register("raw_native_mercury_spherules", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Montroydite
            public static final RegistryObject<Item>
                    Raw_Montroydite = ITEMS.register("raw_montroydite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Granulated Obsidian
            public static final RegistryObject<Item>
                    Raw_Granulated_Obsidian = ITEMS.register("raw_granulated_obsidian", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
    //Crystals & Minerals Related added 10/9/23 - Nyagi
        //Kimberlite
            public static final RegistryObject<Item>
                    Raw_Kimberlite = ITEMS.register("raw_kimberlite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Lamproite
            public static final RegistryObject<Item>
                    Raw_Lamproite = ITEMS.register("raw_lamproite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Lazurite
            public static final RegistryObject<Item>
                    Raw_Lazurite = ITEMS.register("raw_lazurite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Lapis Lazuli
            public static final RegistryObject<Item>
                    Raw_Lapis_Lazuli = ITEMS.register("raw_lapis_lazuli", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Prime Beryllic Cluster (Emerald, Sapphire, Ruby)
            public static final RegistryObject<Item>
                    Raw_Prime_Beryllic_Cluster = ITEMS.register("raw_prime_beryllic_cluster", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Fluorite
            public static final RegistryObject<Item>
                    Raw_Fluorite = ITEMS.register("raw_fluorite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Chalcogenide Crystal Cluster (Hawleyite, Selenite, Calaverite)
            public static final RegistryObject<Item>
                    Raw_Chalcogenide_Crystal_Cluster = ITEMS.register("raw_chalcogenide_crystal_cluster", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Salt Cluster (Sodium Chloride, Salt Peter, Rock Salt)
            public static final RegistryObject<Item>
                    Raw_Salt_Cluster = ITEMS.register("raw_salt_cluster", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

    //Quartz Related added 10/13/23 - Nyagi
        //Herkimer Diamond (Water/Petroleum Inclusions)
            public static final RegistryObject<Item>
                Raw_Herkimer_Diamond = ITEMS.register("raw_herkimer_diamond", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Dendritic Agate
            public static final RegistryObject<Item>
                Raw_Dendritic_Agate = ITEMS.register("raw_dendritic_agate", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Chalcedony
            public static final RegistryObject<Item>
                Raw_Chalcedony = ITEMS.register("raw_chalcedony", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Rutilated quartz
            public static final RegistryObject<Item>
                Raw_Rutilated_Quartz = ITEMS.register("raw_rutilated_quartz", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Ametrine
            public static final RegistryObject<Item>
                Raw_Ametrine = ITEMS.register("raw_ametrine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Rose Quartz
            public static final RegistryObject<Item>
                Raw_Rose_Quartz = ITEMS.register("raw_rose_quartz", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Prasiolite
            public static final RegistryObject<Item>
                Raw_Prasiolite = ITEMS.register("raw_prasiolite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Meteoric Certus
            public static final RegistryObject<Item>
                Raw_Meteoric_Certus = ITEMS.register("raw_meteoric_certus", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

    //Zinc Related added 10/13/23 - Nyagi
        //Zinc Carbonate
            public static final RegistryObject<Item>
                    Raw_Zinc_Carbonate = ITEMS.register("raw_zinc_carbonate", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Sphalerite
            public static final RegistryObject<Item>
                    Raw_Sphalerite = ITEMS.register("raw_sphalerite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Smithsonite
            public static final RegistryObject<Item>
                    Raw_Smithsonite = ITEMS.register("raw_smithsonite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Hemimorphite
            public static final RegistryObject<Item>
                    Raw_Hemimorphite = ITEMS.register("raw_hemimorphite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Wurtzite
            public static final RegistryObject<Item>
                    Raw_Wurtzite = ITEMS.register("raw_wurtzite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Hydrozincite
            public static final RegistryObject<Item>
                    Raw_Hydrozincite= ITEMS.register("raw_hydrozincite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Willemite (Highly fluorescent (green))
            public static final RegistryObject<Item>
                    Raw_Willemite= ITEMS.register("raw_willemite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Franklinite
            public static final RegistryObject<Item>
                    Raw_Franklinite= ITEMS.register("raw_franklinite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

    //Aluminum Related added 10/13/23 - Nyagi
        //Bauxite
            public static final RegistryObject<Item>
                    Raw_Bauxite = ITEMS.register("raw_bauxite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Feldspar
            public static final RegistryObject<Item>
                    Raw_Feldspar = ITEMS.register("raw_feldspar", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Beryl (Clustered Beryl) (Emerald, Aquamarine, Morganite, Heliodor, Goshenite, Bixbite, Pezzottaite)
            public static final RegistryObject<Item>
                    Raw_Clustered_Beryl = ITEMS.register("raw_clustered_beryl", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Cryolite
            public static final RegistryObject<Item>
                    Raw_Cryolite = ITEMS.register("raw_cryolite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Spinel
            public static final RegistryObject<Item>
                    Raw_Spinel = ITEMS.register("raw_spinel", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Turquoise
            public static final RegistryObject<Item>
                    Raw_Turquoise = ITEMS.register("raw_turquoise", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Garnet Slush
            public static final RegistryObject<Item>
                    Raw_Garnet_Slush = ITEMS.register("raw_garnet_slush", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Native Aluminum (Extremely rare)
            public static final RegistryObject<Item>
                    Raw_Native_Aluminum = ITEMS.register("raw_native_aluminum", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

    //Lead Related added 10/20/23 - Nyagi
        //Galena
            public static final RegistryObject<Item>
                    Raw_Galena = ITEMS.register("raw_galena", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Lead Sulphide
            public static final RegistryObject<Item>
                    Raw_Lead_Sulphide = ITEMS.register("raw_lead_sulphide", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Pyromorphite
            public static final RegistryObject<Item>
                    Raw_Pyromorphite = ITEMS.register("raw_pyromorphite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Cerussite
            public static final RegistryObject<Item>
                    Raw_Cerussite = ITEMS.register("raw_cerussite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Anglesite
            public static final RegistryObject<Item>
                    Raw_Anglesite = ITEMS.register("raw_anglesite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Wulfenite
            public static final RegistryObject<Item>
                    Raw_Wulfenite = ITEMS.register("raw_wulfenite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Vanadinite
            public static final RegistryObject<Item>
                    Raw_Vanadinite = ITEMS.register("raw_vanadinite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Mimetite
            public static final RegistryObject<Item>
                    Raw_Mimetite = ITEMS.register("raw_mimetite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

    //Nickel Related added 10/27/23 - Nyagi
        //Pentlandite
            public static final RegistryObject<Item>
                    Raw_Pentlandite = ITEMS.register("raw_pentlandite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Garnierite
            public static final RegistryObject<Item>
                    Raw_Garnierite = ITEMS.register("raw_garnierite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Saprolite
            public static final RegistryObject<Item>
                    Raw_Saprolite = ITEMS.register("raw_saprolite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Hardened Sulfide Flow
            public static final RegistryObject<Item>
                    Raw_Hardened_Sulfide_Flow = ITEMS.register("raw_hardened_sulfide_flow", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Millerite
            public static final RegistryObject<Item>
                    Raw_Millerite = ITEMS.register("raw_millerite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Nickeline
            public static final RegistryObject<Item>
                    Raw_Nickeline = ITEMS.register("raw_nickeline", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Meteoric Taenite
            public static final RegistryObject<Item>
                    Raw_Meteoric_Taenite = ITEMS.register("raw_meteoric_taenite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Meteoric Kamacite
            public static final RegistryObject<Item>
                    Raw_Meteoric_Kamacite = ITEMS.register("raw_meteoric_kamacite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

    //Uranium & Thorium Related added 10/27/23 - Nyagi
        //Pitchblende
            public static final RegistryObject<Item>
                    Raw_Pitchblende = ITEMS.register("raw_pitchblende", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Carnotite
            public static final RegistryObject<Item>
                    Raw_Carnotite = ITEMS.register("raw_carnotite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Tyuyamunite
            public static final RegistryObject<Item>
                    Raw_Tyuyamunite = ITEMS.register("raw_tyuyamunite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Torbernite
            public static final RegistryObject<Item>
                    Raw_Torbernite = ITEMS.register("raw_torbernite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Autunite
            public static final RegistryObject<Item>
                    Raw_Autunite = ITEMS.register("raw_autunite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Thorite
            public static final RegistryObject<Item>
                    Raw_Thorite = ITEMS.register("raw_thorite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Uranothorite
            public static final RegistryObject<Item>
                    Raw_Uranothorite = ITEMS.register("raw_uranothorite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Thorianite
            public static final RegistryObject<Item>
                    Raw_Thorianite = ITEMS.register("raw_thorianite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

    //Tin Related added 11/3/23 - Nyagi
        //Cassiterite
            public static final RegistryObject<Item>
                    Raw_Cassiterite = ITEMS.register("raw_cassiterite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Stannite
            public static final RegistryObject<Item>
                    Raw_Stannite = ITEMS.register("raw_stannite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Cylindrite
            public static final RegistryObject<Item>
                    Raw_Cylindrite = ITEMS.register("raw_cylindrite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Franckeite
            public static final RegistryObject<Item>
                    Raw_Franckeite = ITEMS.register("raw_franckeite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Canfieldite
            public static final RegistryObject<Item>
                    Raw_Canfieldite = ITEMS.register("raw_canfieldite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Teallite
            public static final RegistryObject<Item>
                    Raw_Teallite = ITEMS.register("raw_teallite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Brannerite
            public static final RegistryObject<Item>
                    Raw_Brannerite = ITEMS.register("raw_brannerite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Orthoclase
            public static final RegistryObject<Item>
                    Raw_Orthoclase = ITEMS.register("raw_orthoclase", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

    //Misc Processing Ores added 11/3/23 - Nyagi
        //Saltpeter
            public static final RegistryObject<Item>
                    Raw_Saltpeter = ITEMS.register("raw_saltpeter", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Borax
            public static final RegistryObject<Item>
                    Raw_Borax = ITEMS.register("raw_borax", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Compacted Limestone
            public static final RegistryObject<Item>
                    Raw_Compacted_Limestone = ITEMS.register("raw_compacted_limestone", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Volcanic Sulfur
            public static final RegistryObject<Item>
                    Raw_Volcanic_Sulfur = ITEMS.register("raw_volcanic_sulfur", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Rainbow Obsidian
            public static final RegistryObject<Item>
                    Raw_Rainbow_Obsidian = ITEMS.register("raw_rainbow_obsidian", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Petrified Wood
            public static final RegistryObject<Item>
                    Raw_Petrified_Wood = ITEMS.register("raw_petrified_wood", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Chalk
            public static final RegistryObject<Item>
                    Raw_Chalk = ITEMS.register("raw_chalk", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
        //Trona Ore (Baking Soda)
            public static final RegistryObject<Item>
                    Raw_Trona = ITEMS.register("raw_trona", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));


    //--------------------------------------------------------------------------------------
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
