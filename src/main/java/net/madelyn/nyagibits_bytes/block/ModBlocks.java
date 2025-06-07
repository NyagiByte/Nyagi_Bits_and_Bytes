package net.madelyn.nyagibits_bytes.block;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.madelyn.nyagibits_bytes.misc.Utils.Tab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
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

    //Not sure what to do with these since i mulched all the individual bits for these.
    //ORE BLOCKS
    //Iron Related added 11/10/23 - Nyagi
    //Coal Related added 11/10/23 - Nyagi
    //Copper Related added 11/10/23 - Nyagi
    //Tin generated 2023/10/11 - Flooter
    //Uranium generated 2023/10/11 - Flooter
    //Nickel generated 2023/10/11 - Flooter
    //Lead generated 2023/10/11 - Flooter
    //Bauxite generated 2023/10/11 - Flooter
    //Zinc generated 2023/10/11 - Flooter
    //Quartz generated 2023/10/11 - Flooter
    //Gemstones generated 2023/10/11 - Flooter
    //Redstone generated 2023/10/11 - Flooter
    //Electrum generated 2023/10/11 - Flooter
    //Migmamite generated 2023/10/11 - Flooter


    //This is used to generate and register all the conglomerate ores
    private static final List<String> BOULDER_TYPES = List.of("iron", "coal", "copper", "tin", "uranium", "nickel", "lead", "bauxite", "zinc", "quartz", "gemstones", "redstone", "electrum", "migmamite");

    //Do not register conglomerate ores here if adding new boulders. Use the list above.
    //FORMAT: Block Id (String), Material, Strength (float), Requires Tool (boolean), Creative Tab (for the item form)
    @SuppressWarnings("FieldMayBeFinal") //Why the new ArrayList? List.of returns an immutable list.
    public static List<BlockInfo> BLOCKS_LIST = new ArrayList<>(List.of(
            //All Color Puzzle Block added 1/12/25 - Nyagi
            //new BlockInfo("a",Material.GLASS, 10000f, true, Tab.BLOCKS),
            //------- Block added 1/16/25 - Nyagi
            new BlockInfo("7y5r4jwg8m",Material.GLASS, 10000f, true, Tab.BLOCKS),
            //------- Block added 1/16/25 - Nyagi
            new BlockInfo("szd6kmksx8",Material.GLASS, 10000f, true, Tab.BLOCKS),
            //------- Block added 1/16/25 - Nyagi
            new BlockInfo("mwjfdqlzgx",Material.GLASS, 10000f, true, Tab.BLOCKS),
            //------- Block added 1/16/25 - Nyagi
            new BlockInfo("ughn6anla6",Material.GLASS, 10000f, true, Tab.BLOCKS),
            //------- Back Block added 1/16/25 - Nyagi
            new BlockInfo("h1g1tl8dx7",Material.GLASS, 10000f, true, Tab.BLOCKS),
            //------- Block added 1/16/25 - Nyagi
            new BlockInfo("k4k3ggaog2",Material.GLASS, 10000f, true, Tab.BLOCKS),
            //------- Block added 1/16/25 - Nyagi
            new BlockInfo("d0e9458sgj",Material.GLASS, 10000f, true, Tab.BLOCKS),
            //------- Block added 1/18/25 - Nyagi
            new BlockInfo("2lbxyud1od",Material.GLASS, 10000f, true, Tab.BLOCKS),
            //------- Block added 1/18/25 - Nyagi
            new BlockInfo("ceug19q0vj",Material.GLASS, 10000f, true, Tab.BLOCKS),
            //------- Block added 1/18/25 - Nyagi
            new BlockInfo("rtesw3kpoi",Material.GLASS, 10000f, true, Tab.BLOCKS),
            //------- Block added 1/18/25 - Nyagi
            new BlockInfo("vhzlw7iim4",Material.GLASS, 10000f, true, Tab.BLOCKS),

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
        //Skystone Melt Included Andesite added 11/21/24 - Nyagi
        new BlockInfo("skystone_melt_included_andesite",Material.STONE, 4f, true, Tab.BLOCKS),
        //Gypsum Block added 11/21/24 - Nyagi
        new BlockInfo("gypsum_block",Material.STONE, 4f, true, Tab.BLOCKS),
        //Volcanic Pumice Block Block added 11/21/24 - Nyagi
        new BlockInfo("volcanic_pumice_block",Material.SAND, 2f, true, Tab.BLOCKS),
        //Heliodor Block added 1/29/25 - Nyagi
        new BlockInfo("block_heliodor",Material.METAL, 2f, true, Tab.BLOCKS),
        //Morganite Block added 1/29/25 - Nyagi
        new BlockInfo("block_morganite",Material.METAL, 2f, true, Tab.BLOCKS),
        //Aquamarine Block added 1/29/25 - Nyagi
        new BlockInfo("block_aquamarine",Material.METAL, 2f, true, Tab.BLOCKS),
        //Pezzottaite Block added 1/29/25 - Nyagi
        new BlockInfo("block_pezzottaite",Material.METAL, 2f, true, Tab.BLOCKS),
        //Bixbite Block added 1/29/25 - Nyagi
        new BlockInfo("block_bixbite",Material.METAL, 2f, true, Tab.BLOCKS),
        //Goshenite Block added 1/29/25 - Nyagi
        new BlockInfo("block_goshenite",Material.METAL, 2f, true, Tab.BLOCKS),
        //Waterproof Casing added 4/24/25 - Nyagi
        new BlockInfo("waterproof_casing",Material.WOOD, 2f, true, Tab.BLOCKS),
        //Glimmering Wood added 6/6/25 - Nyagi
        new BlockInfo("glimmering_wood",Material.WOOD, 1f, true, Tab.BLOCKS),
        //Stripped Glimmering Wood added 6/6/25 - Nyagi
        new BlockInfo("glimmering_stripped_wood",Material.WOOD, 1f, true, Tab.BLOCKS),
        //Glimmering Log added 6/6/25 - Nyagi
        new BlockInfo.Rotatable("glimmering_log",Material.WOOD, 1f, true, Tab.BLOCKS),
        //Stripped Glimmering Log added 6/6/25 - Nyagi
        new BlockInfo.Rotatable("glimmering_stripped_log",Material.WOOD, 1f, true, Tab.BLOCKS),
        //Glimmering Stone added 6/6/25 - Nyagi
        new BlockInfo("glimmering_stone",Material.STONE, 1f, true, Tab.BLOCKS),
        //Glimmering Andesite added 6/6/25 - Nyagi
        new BlockInfo("glimmering_andesite",Material.STONE, 1f, true, Tab.BLOCKS)
    ));

    //A small helper function to add the data for all 5 conglomerate ores for each type.
    private static List<BlockInfo> generateConglomerates(String type){
        return List.of(
            new BlockInfo.Ore("conglomerate_"+type+"_ore",Material.STONE, 6f, true, Tab.MINERALS),
            new BlockInfo.Ore("dense_conglomerate_"+type+"_ore",Material.STONE, 12f, true, Tab.MINERALS),
            new BlockInfo.Ore("hyper_conglomerate_"+type+"_ore",Material.STONE, 24f, true, Tab.MINERALS),
            new BlockInfo.Ore("tectonic_conglomerate_"+type+"_ore",Material.STONE, 48f, true, Tab.MINERALS),
            new BlockInfo.Ore("core_conglomerate_"+type+"_ore",Material.STONE, 96f, true, Tab.MINERALS)
        );
    }

    //NOTICE: Fluid block registration is no longer handled here, but it has been compressed into FluidInfo and ModFluids.

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

    //Generates all the conglomerate ores
    //Then registers all the blocks
    static{
        for(String ore : BOULDER_TYPES){
            BLOCKS_LIST.addAll(generateConglomerates(ore));
        }
        for(BlockInfo info : BLOCKS_LIST){
            registerBlock(info.getId(), info::createBlock, info.getTab());
        }
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
