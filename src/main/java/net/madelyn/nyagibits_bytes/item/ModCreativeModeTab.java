package net.madelyn.nyagibits_bytes.item;

import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab NYAGIBITS_BYTES_ITEMS = new CreativeModeTab("nyagibits_bytes_tab_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Livisite_Alloy.get());
        }
    };
    public static final CreativeModeTab NYAGIBITS_BYTES_BLOCKS = new CreativeModeTab("nyagibits_bytes_tab_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.FLAKE.get());
        }
    };
    public static final CreativeModeTab NYAGIBITS_BYTES_SCIENCE = new CreativeModeTab("nyagibits_bytes_tab_science") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Lab_Notebook.get());
        }
    };
    public static final CreativeModeTab NYAGIBITS_BYTES_SCHEMATICS = new CreativeModeTab("nyagibits_bytes_tab_schematics") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Blank_Blueprint.get());
        }
    };
    public static final CreativeModeTab NYAGIBITS_BYTES_MINERALS = new CreativeModeTab("nyagibits_bytes_tab_minerals") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Raw_Hematite.get());
        }
    };
    public static final CreativeModeTab NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS = new CreativeModeTab("nyagibits_bytes_tab_incomplete_sequence_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Incomplete_Controller.get());
        }
    };
}
