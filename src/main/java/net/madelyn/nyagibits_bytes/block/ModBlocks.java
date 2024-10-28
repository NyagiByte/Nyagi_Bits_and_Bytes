package net.madelyn.nyagibits_bytes.block;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.fluid.ModFluids;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.madelyn.nyagibits_bytes.misc.Utils.Tab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
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

    //FORMAT: Id, Material, Strength, Requires Tool, Creative Tab

    private static final List<BlockInfo> BLOCKS_LIST = List.of(
        //Livisite Stone added 7/11/23 - Nyagi
        new BlockInfo("livisite_stone", Material.STONE, 2f, true, Tab.BLOCKS),
        //Livisite Cobble added 7/11/23 - Nyagi
        new BlockInfo("livisite_cobble", Material.STONE, 2f, true, Tab.BLOCKS),
        //Polished Livisite added 7/11/23 - Nyagi
        new BlockInfo("polished_livisite", Material.STONE, 2f, true, Tab.BLOCKS),
        //Flake added 7/11/23 - Nyagi - Texture: Tralomine
        new BlockInfo("flake", (Material.AMETHYST), 150000f, true, Tab.BLOCKS),
        //Etched Living Wood added 7/11/23 - Nyagi
        new BlockInfo("etched_living_wood", Material.WOOD, 1f, true, Tab.BLOCKS),
        //Pulp added 5/16/24 - Nyagi
        new BlockInfo("pulp",(Material.SPONGE), 1f, false, Tab.BLOCKS),
        //Steel Casing added 5/16/24 - Nyagi
        new BlockInfo("steel_casing",Material.METAL, 4f, true, Tab.BLOCKS),
        //Mana Infused Casing added 5/16/24 - Nyagi
        new BlockInfo("mana_infused_casing",Material.METAL, 4f, true, Tab.BLOCKS),
        //Slushy Ice added 5/16/24 - Nyagi
        new BlockInfo("slushy_ice",Material.ICE, 1f, false, Tab.BLOCKS),
        //Damascus Steel Block added 5/16/24 - Nyagi
        new BlockInfo("block_of_damascus_steel",Material.METAL, 4f, true, Tab.BLOCKS),
        //1080 High Carbon Steel Block added 5/16/24 - Nyagi
        new BlockInfo("block_of_1080_high_carbon_steel",Material.METAL, 4f, true, Tab.BLOCKS),
        //15N20 High Carbon Steel Block added 5/16/24 - Nyagi
        new BlockInfo("block_of_15n20_high_carbon_steel",Material.METAL, 4f, true, Tab.BLOCKS),
        //Stainless Steel Block added 5/16/24 - Nyagi
        new BlockInfo("block_of_stainless_steel",Material.METAL, 4f, true, Tab.BLOCKS),

        //ORE BLOCKS
        //Iron Related added 11/10/23 - Nyagi
        //Conglomerate Iron Ore
        new BlockInfo("conglomerate_iron_ore", Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Iron Ore
        new BlockInfo("dense_conglomerate_iron_ore", Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Iron Ore
        new BlockInfo("hyper_conglomerate_iron_ore", Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Iron Ore
        new BlockInfo("tectonic_conglomerate_iron_ore", Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Iron Ore
        new BlockInfo("core_conglomerate_iron_ore", Material.STONE, 96f, true, Tab.MINERALS),

        //Coal Related added 11/10/23 - Nyagi
        //Conglomerate Coal Ore
        new BlockInfo("conglomerate_coal_ore", Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Coal Ore
        new BlockInfo("dense_conglomerate_coal_ore", Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Coal Ore
        new BlockInfo("hyper_conglomerate_coal_ore", Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Coal Ore
        new BlockInfo("tectonic_conglomerate_coal_ore", Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Coal Ore
        new BlockInfo("core_conglomerate_coal_ore", Material.STONE, 96f, true, Tab.MINERALS),

        //Copper Related added 11/10/23 - Nyagi
        //Conglomerate Copper Ore
        new BlockInfo("conglomerate_copper_ore", Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Copper Ore
        new BlockInfo("dense_conglomerate_copper_ore", Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Copper Ore
        new BlockInfo("hyper_conglomerate_copper_ore", Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Copper Ore
        new BlockInfo("tectonic_conglomerate_copper_ore", Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Copper Ore
        new BlockInfo("core_conglomerate_copper_ore", Material.STONE, 96f, true, Tab.MINERALS),

        //Tin generated 2023/10/11 - Flooter
        //Conglomerate Tin Ore
        new BlockInfo("conglomerate_tin_ore",Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Tin Ore
        new BlockInfo("dense_conglomerate_tin_ore",Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Tin Ore
        new BlockInfo("hyper_conglomerate_tin_ore",Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Tin Ore
        new BlockInfo("tectonic_conglomerate_tin_ore",Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Tin Ore
        new BlockInfo("core_conglomerate_tin_ore",Material.STONE, 96f, true, Tab.MINERALS),

        //Uranium generated 2023/10/11 - Flooter
        //Conglomerate Uranium Ore
        new BlockInfo("conglomerate_uranium_ore",Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Uranium Ore
        new BlockInfo("dense_conglomerate_uranium_ore",Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Uranium Ore
        new BlockInfo("hyper_conglomerate_uranium_ore",Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Uranium Ore
        new BlockInfo("tectonic_conglomerate_uranium_ore",Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Uranium Ore
        new BlockInfo("core_conglomerate_uranium_ore",Material.STONE, 96f, true, Tab.MINERALS),

        //Nickel generated 2023/10/11 - Flooter
        //Conglomerate Nickel Ore
        new BlockInfo("conglomerate_nickel_ore",Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Nickel Ore
        new BlockInfo("dense_conglomerate_nickel_ore",Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Nickel Ore
        new BlockInfo("hyper_conglomerate_nickel_ore",Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Nickel Ore
        new BlockInfo("tectonic_conglomerate_nickel_ore",Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Nickel Ore
        new BlockInfo("core_conglomerate_nickel_ore",Material.STONE, 96f, true, Tab.MINERALS),

        //Lead generated 2023/10/11 - Flooter
        //Conglomerate Lead Ore
        new BlockInfo("conglomerate_lead_ore",Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Lead Ore
        new BlockInfo("dense_conglomerate_lead_ore",Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Lead Ore
        new BlockInfo("hyper_conglomerate_lead_ore",Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Lead Ore
        new BlockInfo("tectonic_conglomerate_lead_ore",Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Lead Ore
        new BlockInfo("core_conglomerate_lead_ore",Material.STONE, 96f, true, Tab.MINERALS),

        //Bauxite generated 2023/10/11 - Flooter
        //Conglomerate Bauxite Ore
        new BlockInfo("conglomerate_bauxite_ore",Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Bauxite Ore
        new BlockInfo("dense_conglomerate_bauxite_ore",Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Bauxite Ore
        new BlockInfo("hyper_conglomerate_bauxite_ore",Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Bauxite Ore
        new BlockInfo("tectonic_conglomerate_bauxite_ore",Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Bauxite Ore
        new BlockInfo("core_conglomerate_bauxite_ore",Material.STONE, 96f, true, Tab.MINERALS),

        //Zinc generated 2023/10/11 - Flooter
        //Conglomerate Zinc Ore
        new BlockInfo("conglomerate_zinc_ore",Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Zinc Ore
        new BlockInfo("dense_conglomerate_zinc_ore",Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Zinc Ore
        new BlockInfo("hyper_conglomerate_zinc_ore",Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Zinc Ore
        new BlockInfo("tectonic_conglomerate_zinc_ore",Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Zinc Ore
        new BlockInfo("core_conglomerate_zinc_ore",Material.STONE, 96f, true, Tab.MINERALS),

        //Quartz generated 2023/10/11 - Flooter
        //Conglomerate Quartz Ore
        new BlockInfo("conglomerate_quartz_ore",Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Quartz Ore
        new BlockInfo("dense_conglomerate_quartz_ore",Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Quartz Ore
        new BlockInfo("hyper_conglomerate_quartz_ore",Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Quartz Ore
        new BlockInfo("tectonic_conglomerate_quartz_ore",Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Quartz Ore
        new BlockInfo("core_conglomerate_quartz_ore",Material.STONE, 96f, true, Tab.MINERALS),

        //Gemstones generated 2023/10/11 - Flooter
        //Conglomerate Gemstones Ore
        new BlockInfo("conglomerate_gemstones_ore",Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Gemstones Ore
        new BlockInfo("dense_conglomerate_gemstones_ore",Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Gemstones Ore
        new BlockInfo("hyper_conglomerate_gemstones_ore",Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Gemstones Ore
        new BlockInfo("tectonic_conglomerate_gemstones_ore",Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Gemstones Ore
        new BlockInfo("core_conglomerate_gemstones_ore",Material.STONE, 96f, true, Tab.MINERALS),

        //Redstone generated 2023/10/11 - Flooter
        //Conglomerate Redstone Ore
        new BlockInfo("conglomerate_redstone_ore",Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Redstone Ore
        new BlockInfo("dense_conglomerate_redstone_ore",Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Redstone Ore
        new BlockInfo("hyper_conglomerate_redstone_ore",Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Redstone Ore
        new BlockInfo("tectonic_conglomerate_redstone_ore",Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Redstone Ore
        new BlockInfo("core_conglomerate_redstone_ore",Material.STONE, 96f, true, Tab.MINERALS),

        //Electrum generated 2023/10/11 - Flooter
        //Conglomerate Electrum Ore
        new BlockInfo("conglomerate_electrum_ore",Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Electrum Ore
        new BlockInfo("dense_conglomerate_electrum_ore",Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Electrum Ore
        new BlockInfo("hyper_conglomerate_electrum_ore",Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Electrum Ore
        new BlockInfo("tectonic_conglomerate_electrum_ore",Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Electrum Ore
        new BlockInfo("core_conglomerate_electrum_ore",Material.STONE, 96f, true, Tab.MINERALS),


        //Migmamite generated 2023/10/11 - Flooter
        //Conglomerate Migmamite Ore
        new BlockInfo("conglomerate_migmamite_ore",Material.STONE, 6f, true, Tab.MINERALS),
        //Dense Conglomerate Migmamite Ore
        new BlockInfo("dense_conglomerate_migmamite_ore",Material.STONE, 12f, true, Tab.MINERALS),
        //Hyper Conglomerate Migmamite Ore
        new BlockInfo("hyper_conglomerate_migmamite_ore",Material.STONE, 24f, true, Tab.MINERALS),
        //Tectonic Conglomerate Migmamite Ore
        new BlockInfo("tectonic_conglomerate_migmamite_ore",Material.STONE, 48f, true, Tab.MINERALS),
        //Core Conglomerate Migmamite Ore
        new BlockInfo("core_conglomerate_migmamite_ore",Material.STONE, 96f, true, Tab.MINERALS)
    );


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //FLUID-BLOCKS BELOW
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    //Hydrocarbon Tar - Added 6/25/24
    public static final RegistryObject<LiquidBlock> HYDROCARBON_TAR_BLOCK = BLOCKS.register("hydrocarbon_tar_block",
            () -> new LiquidBlock(ModFluids.SOURCE_HYDROCARBON_TAR, BlockBehaviour.Properties.copy(Blocks.WATER)));

    //Raw Wood Vinegar - Added 6/25/24
    public static final RegistryObject<LiquidBlock> RAW_WOOD_VINEGAR_BLOCK = BLOCKS.register("raw_wood_vinegar_block",
            () -> new LiquidBlock(ModFluids.SOURCE_RAW_WOOD_VINEGAR, BlockBehaviour.Properties.copy(Blocks.WATER)));

    //Pyroligneous Acid - Added 6/25/24
    public static final RegistryObject<LiquidBlock> PYROLIGNEOUS_ACID_BLOCK = BLOCKS.register("pyroligneous_acid_block",
            () -> new LiquidBlock(ModFluids.SOURCE_PYROLIGNEOUS_ACID, BlockBehaviour.Properties.copy(Blocks.WATER)));

    //Acetone - Added 6/25/24
    public static final RegistryObject<LiquidBlock> ACETONE_BLOCK = BLOCKS.register("acetone_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ACETONE, BlockBehaviour.Properties.copy(Blocks.WATER)));



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

    //Goes through the block list and registers them.
    static{
        for(BlockInfo info : BLOCKS_LIST){
            registerBlock(info.getId(), info::createBlock, info.getTab());
        }
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
