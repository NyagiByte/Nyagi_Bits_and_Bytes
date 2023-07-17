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
    SoulRacer: [Livisite_Stone]
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

    //Flake added 7/11/23 - Nyagi
    public static final RegistryObject<Block> FLAKE = registerBlock("flake", () -> new Block(BlockBehaviour.Properties.of
            (Material.AMETHYST).
            strength(6f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_BLOCKS);

    //Etched Living Wood added 7/11/23 - Nyagi
    public static final RegistryObject<Block> ETCHED_LIVING_WOOD = registerBlock("etched_living_wood", () -> new Block(BlockBehaviour.Properties.of
            (Material.WOOD).
            strength(6f).
            requiresCorrectToolForDrops()),
            ModCreativeModeTab.NYAGIBITS_BYTES_BLOCKS);

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
