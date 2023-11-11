package net.madelyn.nyagibits_bytes.block;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.item.ModCreativeModeTab;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NyagiBits_Bytes.MOD_ID);

    /*--------------------------------------------------------------------------------------
    Block authors:
    Nyagi: [Livisite_Stone, Livisite_Cobble, Polished Livisite, Flake, Etched Living Wood]
    Flooter: []

    Texture authors:
    SoulRacer: [Livisite_Stone,  Livisite_Cobble, Polished Livisite, Flake, Etched Living Wood]
    Tralomine: [Flake]
    ---------------------------------------------------------------------------------------*/

    //Livisite Stone added 7/11/23 - Nyagi
    public static final RegistryObject<Block> LIVISITE_STONE = registerBlock("livisite_stone", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(6f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_BLOCKS);

    //Livisite Cobble added 7/11/23 - Nyagi
    public static final RegistryObject<Block> LIVISITE_COBBLE = registerBlock("livisite_cobble", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(6f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_BLOCKS);

    //Polished Livisite added 7/11/23 - Nyagi
    public static final RegistryObject<Block> POLISHED_LIVISITE = registerBlock("polished_livisite", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(6f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_BLOCKS);

    //Flake added 7/11/23 - Nyagi - Texture: Tralomine
    public static final RegistryObject<Block> FLAKE = registerBlock("flake", () -> new Block(BlockBehaviour.Properties.of
            (Material.AMETHYST).
            strength(150000f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_BLOCKS);

    //Etched Living Wood added 7/11/23 - Nyagi
    public static final RegistryObject<Block> ETCHED_LIVING_WOOD = registerBlock("etched_living_wood", () -> new Block(BlockBehaviour.Properties.of
            (Material.WOOD).
            strength(4f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_BLOCKS);

    //ORE BLOCKS
    //Iron Related added 11/10/23 - Nyagi
        //Conglomerate Iron Ore
        public static final RegistryObject<Block> CONGLOMERATE_IRON_ORE = registerBlock("conglomerate_iron_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(6f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

        //Dense Conglomerate Iron Ore
        public static final RegistryObject<Block> DENSE_CONGLOMERATE_IRON_ORE = registerBlock("dense_conglomerate_iron_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(12f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

        //Hyper Conglomerate Iron Ore
        public static final RegistryObject<Block> HYPER_CONGLOMERATE_IRON_ORE = registerBlock("hyper_conglomerate_iron_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(24f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

        //Techtonic Conglomerate Iron Ore
        public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_IRON_ORE = registerBlock("tectonic_conglomerate_iron_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(48f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

        //Core Conglomerate Iron Ore
        public static final RegistryObject<Block> CORE_CONGLOMERATE_IRON_ORE = registerBlock("core_conglomerate_iron_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(96f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Coal Related added 11/10/23 - Nyagi
        //Conglomerate Coal Ore
        public static final RegistryObject<Block> CONGLOMERATE_COAL_ORE = registerBlock("conglomerate_coal_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(6f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

        //Dense Conglomerate Coal Ore
        public static final RegistryObject<Block> DENSE_CONGLOMERATE_COAL_ORE = registerBlock("dense_conglomerate_coal_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(12f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

        //Hyper Conglomerate Coal Ore
        public static final RegistryObject<Block> HYPER_CONGLOMERATE_COAL_ORE = registerBlock("hyper_conglomerate_coal_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(24f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

        //Techtonic Conglomerate Coal Ore
        public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_COAL_ORE = registerBlock("tectonic_conglomerate_coal_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(48f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

        //Core Conglomerate Coal Ore
        public static final RegistryObject<Block> CORE_CONGLOMERATE_COAL_ORE = registerBlock("core_conglomerate_coal_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(96f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Copper Related added 11/10/23 - Nyagi
        //Conglomerate Copper Ore
        public static final RegistryObject<Block> CONGLOMERATE_COPPER_ORE = registerBlock("conglomerate_copper_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(6f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

        //Dense Conglomerate Copper Ore
        public static final RegistryObject<Block> DENSE_CONGLOMERATE_COPPER_ORE = registerBlock("dense_conglomerate_copper_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(12f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

        //Hyper Conglomerate Copper Ore
        public static final RegistryObject<Block> HYPER_CONGLOMERATE_COPPER_ORE = registerBlock("hyper_conglomerate_copper_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(24f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

        //Techtonic Conglomerate Copper Ore
        public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_COPPER_ORE = registerBlock("tectonic_conglomerate_copper_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(48f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

        //Core Conglomerate Copper Ore
        public static final RegistryObject<Block> CORE_CONGLOMERATE_COPPER_ORE = registerBlock("core_conglomerate_copper_ore", () -> new Block(BlockBehaviour.Properties.of
            (Material.STONE).
            strength(96f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Tin generated 2023/10/11 - Flooter
    //Conglomerate Tin Ore
    public static final RegistryObject<Block> CONGLOMERATE_TIN_ORE = registerBlock("conglomerate_tin_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(6f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Dense Conglomerate Tin Ore
    public static final RegistryObject<Block> DENSE_CONGLOMERATE_TIN_ORE = registerBlock("dense_conglomerate_tin_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(12f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Hyper Conglomerate Tin Ore
    public static final RegistryObject<Block> HYPER_CONGLOMERATE_TIN_ORE = registerBlock("hyper_conglomerate_tin_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(24f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Techtonic Conglomerate Tin Ore
    public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_TIN_ORE = registerBlock("tectonic_conglomerate_tin_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(48f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Core Conglomerate Tin Ore
    public static final RegistryObject<Block> CORE_CONGLOMERATE_TIN_ORE = registerBlock("core_conglomerate_tin_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(96f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Uranium generated 2023/10/11 - Flooter
    //Conglomerate Uranium Ore
    public static final RegistryObject<Block> CONGLOMERATE_URANIUM_ORE = registerBlock("conglomerate_uranium_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(6f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);


    //Dense Conglomerate Uranium Ore
    public static final RegistryObject<Block> DENSE_CONGLOMERATE_URANIUM_ORE = registerBlock("dense_conglomerate_uranium_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(12f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Hyper Conglomerate Uranium Ore
    public static final RegistryObject<Block> HYPER_CONGLOMERATE_URANIUM_ORE = registerBlock("hyper_conglomerate_uranium_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(24f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Techtonic Conglomerate Uranium Ore
    public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_URANIUM_ORE = registerBlock("tectonic_conglomerate_uranium_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(48f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Core Conglomerate Uranium Ore
    public static final RegistryObject<Block> CORE_CONGLOMERATE_URANIUM_ORE = registerBlock("core_conglomerate_uranium_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(96f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Nickel generated 2023/10/11 - Flooter
    //Conglomerate Nickel Ore
    public static final RegistryObject<Block> CONGLOMERATE_NICKEL_ORE = registerBlock("conglomerate_nickel_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(6f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);


    //Dense Conglomerate Nickel Ore
    public static final RegistryObject<Block> DENSE_CONGLOMERATE_NICKEL_ORE = registerBlock("dense_conglomerate_nickel_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(12f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Hyper Conglomerate Nickel Ore
    public static final RegistryObject<Block> HYPER_CONGLOMERATE_NICKEL_ORE = registerBlock("hyper_conglomerate_nickel_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(24f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Techtonic Conglomerate Nickel Ore
    public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_NICKEL_ORE = registerBlock("tectonic_conglomerate_nickel_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(48f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Core Conglomerate Nickel Ore
    public static final RegistryObject<Block> CORE_CONGLOMERATE_NICKEL_ORE = registerBlock("core_conglomerate_nickel_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(96f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Lead generated 2023/10/11 - Flooter
    //Conglomerate Lead Ore
    public static final RegistryObject<Block> CONGLOMERATE_LEAD_ORE = registerBlock("conglomerate_lead_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(6f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);


    //Dense Conglomerate Lead Ore
    public static final RegistryObject<Block> DENSE_CONGLOMERATE_LEAD_ORE = registerBlock("dense_conglomerate_lead_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(12f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Hyper Conglomerate Lead Ore
    public static final RegistryObject<Block> HYPER_CONGLOMERATE_LEAD_ORE = registerBlock("hyper_conglomerate_lead_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(24f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Techtonic Conglomerate Lead Ore
    public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_LEAD_ORE = registerBlock("tectonic_conglomerate_lead_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(48f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Core Conglomerate Lead Ore
    public static final RegistryObject<Block> CORE_CONGLOMERATE_LEAD_ORE = registerBlock("core_conglomerate_lead_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(96f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Bauxite generated 2023/10/11 - Flooter
    //Conglomerate Bauxite Ore
    public static final RegistryObject<Block> CONGLOMERATE_BAUXITE_ORE = registerBlock("conglomerate_bauxite_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(6f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);


    //Dense Conglomerate Bauxite Ore
    public static final RegistryObject<Block> DENSE_CONGLOMERATE_BAUXITE_ORE = registerBlock("dense_conglomerate_bauxite_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(12f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Hyper Conglomerate Bauxite Ore
    public static final RegistryObject<Block> HYPER_CONGLOMERATE_BAUXITE_ORE = registerBlock("hyper_conglomerate_bauxite_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(24f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Techtonic Conglomerate Bauxite Ore
    public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_BAUXITE_ORE = registerBlock("tectonic_conglomerate_bauxite_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(48f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Core Conglomerate Bauxite Ore
    public static final RegistryObject<Block> CORE_CONGLOMERATE_BAUXITE_ORE = registerBlock("core_conglomerate_bauxite_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(96f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Zinc generated 2023/10/11 - Flooter
    //Conglomerate Zinc Ore
    public static final RegistryObject<Block> CONGLOMERATE_ZINC_ORE = registerBlock("conglomerate_zinc_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(6f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);


    //Dense Conglomerate Zinc Ore
    public static final RegistryObject<Block> DENSE_CONGLOMERATE_ZINC_ORE = registerBlock("dense_conglomerate_zinc_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(12f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Hyper Conglomerate Zinc Ore
    public static final RegistryObject<Block> HYPER_CONGLOMERATE_ZINC_ORE = registerBlock("hyper_conglomerate_zinc_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(24f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Techtonic Conglomerate Zinc Ore
    public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_ZINC_ORE = registerBlock("tectonic_conglomerate_zinc_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(48f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Core Conglomerate Zinc Ore
    public static final RegistryObject<Block> CORE_CONGLOMERATE_ZINC_ORE = registerBlock("core_conglomerate_zinc_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(96f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Quartz generated 2023/10/11 - Flooter
    //Conglomerate Quartz Ore
    public static final RegistryObject<Block> CONGLOMERATE_QUARTZ_ORE = registerBlock("conglomerate_quartz_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(6f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);


    //Dense Conglomerate Quartz Ore
    public static final RegistryObject<Block> DENSE_CONGLOMERATE_QUARTZ_ORE = registerBlock("dense_conglomerate_quartz_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(12f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Hyper Conglomerate Quartz Ore
    public static final RegistryObject<Block> HYPER_CONGLOMERATE_QUARTZ_ORE = registerBlock("hyper_conglomerate_quartz_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(24f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Techtonic Conglomerate Quartz Ore
    public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_QUARTZ_ORE = registerBlock("tectonic_conglomerate_quartz_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(48f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Core Conglomerate Quartz Ore
    public static final RegistryObject<Block> CORE_CONGLOMERATE_QUARTZ_ORE = registerBlock("core_conglomerate_quartz_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(96f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Gemstones generated 2023/10/11 - Flooter
    //Conglomerate Gemstones Ore
    public static final RegistryObject<Block> CONGLOMERATE_GEMSTONES_ORE = registerBlock("conglomerate_gemstones_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(6f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);


    //Dense Conglomerate Gemstones Ore
    public static final RegistryObject<Block> DENSE_CONGLOMERATE_GEMSTONES_ORE = registerBlock("dense_conglomerate_gemstones_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(12f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Hyper Conglomerate Gemstones Ore
    public static final RegistryObject<Block> HYPER_CONGLOMERATE_GEMSTONES_ORE = registerBlock("hyper_conglomerate_gemstones_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(24f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Techtonic Conglomerate Gemstones Ore
    public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_GEMSTONES_ORE = registerBlock("tectonic_conglomerate_gemstones_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(48f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Core Conglomerate Gemstones Ore
    public static final RegistryObject<Block> CORE_CONGLOMERATE_GEMSTONES_ORE = registerBlock("core_conglomerate_gemstones_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(96f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Redstone generated 2023/10/11 - Flooter
    //Conglomerate Redstone Ore
    public static final RegistryObject<Block> CONGLOMERATE_REDSTONE_ORE = registerBlock("conglomerate_redstone_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(6f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);


    //Dense Conglomerate Redstone Ore
    public static final RegistryObject<Block> DENSE_CONGLOMERATE_REDSTONE_ORE = registerBlock("dense_conglomerate_redstone_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(12f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Hyper Conglomerate Redstone Ore
    public static final RegistryObject<Block> HYPER_CONGLOMERATE_REDSTONE_ORE = registerBlock("hyper_conglomerate_redstone_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(24f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Techtonic Conglomerate Redstone Ore
    public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_REDSTONE_ORE = registerBlock("tectonic_conglomerate_redstone_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(48f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Core Conglomerate Redstone Ore
    public static final RegistryObject<Block> CORE_CONGLOMERATE_REDSTONE_ORE = registerBlock("core_conglomerate_redstone_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(96f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Electrum generated 2023/10/11 - Flooter
    //Conglomerate Electrum Ore
    public static final RegistryObject<Block> CONGLOMERATE_ELECTRUM_ORE = registerBlock("conglomerate_electrum_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(6f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);


    //Dense Conglomerate Electrum Ore
    public static final RegistryObject<Block> DENSE_CONGLOMERATE_ELECTRUM_ORE = registerBlock("dense_conglomerate_electrum_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(12f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Hyper Conglomerate Electrum Ore
    public static final RegistryObject<Block> HYPER_CONGLOMERATE_ELECTRUM_ORE = registerBlock("hyper_conglomerate_electrum_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(24f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Techtonic Conglomerate Electrum Ore
    public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_ELECTRUM_ORE = registerBlock("tectonic_conglomerate_electrum_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(48f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Core Conglomerate Electrum Ore
    public static final RegistryObject<Block> CORE_CONGLOMERATE_ELECTRUM_ORE = registerBlock("core_conglomerate_electrum_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(96f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);



    //Migmamite generated 2023/10/11 - Flooter
    //Conglomerate Migmamite Ore
    public static final RegistryObject<Block> CONGLOMERATE_MIGMAMITE_ORE = registerBlock("conglomerate_migmamite_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(6f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);


    //Dense Conglomerate Migmamite Ore
    public static final RegistryObject<Block> DENSE_CONGLOMERATE_MIGMAMITE_ORE = registerBlock("dense_conglomerate_migmamite_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(12f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Hyper Conglomerate Migmamite Ore
    public static final RegistryObject<Block> HYPER_CONGLOMERATE_MIGMAMITE_ORE = registerBlock("hyper_conglomerate_migmamite_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(24f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Techtonic Conglomerate Migmamite Ore
    public static final RegistryObject<Block> TECHTONIC_CONGLOMERATE_MIGMAMITE_ORE = registerBlock("tectonic_conglomerate_migmamite_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(48f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);

    //Core Conglomerate Migmamite Ore
    public static final RegistryObject<Block> CORE_CONGLOMERATE_MIGMAMITE_ORE = registerBlock("core_conglomerate_migmamite_ore", () -> new Block(BlockBehaviour.Properties.of
                            (Material.STONE).
                    strength(96f).
                    requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS);
    //--------------------------------------------------------------------------------------
    // DO NOT TOUCH BELOW
    //--------------------------------------------------------------------------------------
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    //--------------------------------------------------------------------------------------

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
