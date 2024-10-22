package net.madelyn.nyagibits_bytes.item;

import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {

    public static final CreativeModeTab NYAGIBITS_BYTES_ITEMS = new CreativeModeTab("nyagibits_bytes_tab_items") {
        @Override
        public ItemStack makeIcon() {
            RegistryObject<?> item = ModItems.ITEM_MAP.get("livisite_alloy");
            System.out.println("Attempting to get item: 'livisite_alloy' -> " + item);
            if (item == null || item.get() == null) {
                System.out.println("Item not found or is null, returning fallback icon.");
                return new ItemStack(ModBlocks.FLAKE.get());
            }
            return new ItemStack(ModBlocks.FLAKE.get());        }
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
            RegistryObject<?> item = ModItems.ITEM_MAP.get("lab_notebook");
            System.out.println("Attempting to get item: 'lab_notebook' -> " + item);
            if (item == null || item.get() == null) {
                System.out.println("Item not found or is null, returning fallback icon.");
                return new ItemStack(ModBlocks.FLAKE.get());
            }
            return new ItemStack(ModBlocks.FLAKE.get());        }
    };

    public static final CreativeModeTab NYAGIBITS_BYTES_SCHEMATICS = new CreativeModeTab("nyagibits_bytes_tab_schematics") {
        @Override
        public ItemStack makeIcon() {
            RegistryObject<?> item = ModItems.ITEM_MAP.get("blank_blueprint");
            System.out.println("Attempting to get item: 'blank_blueprint' -> " + item);
            if (item == null || item.get() == null) {
                System.out.println("Item not found or is null, returning fallback icon.");
                return new ItemStack(ModBlocks.FLAKE.get());
            }
            return new ItemStack(ModBlocks.FLAKE.get());        }
    };

    public static final CreativeModeTab NYAGIBITS_BYTES_MINERALS = new CreativeModeTab("nyagibits_bytes_tab_minerals") {
        @Override
        public ItemStack makeIcon() {
            RegistryObject<?> item = ModItems.ITEM_MAP.get("raw_hematite");
            System.out.println("Attempting to get item: 'raw_hematite' -> " + item);
            if (item == null || item.get() == null) {
                System.out.println("Item not found or is null, returning fallback icon.");
                return new ItemStack(ModBlocks.FLAKE.get());
            }
            return new ItemStack(ModBlocks.FLAKE.get());        }
    };

    public static final CreativeModeTab NYAGIBITS_BYTES_FLUIDS = new CreativeModeTab("nyagibits_bytes_tab_fluids") {
        @Override
        public ItemStack makeIcon() {
            RegistryObject<?> item = ModItems.ITEM_MAP.get("bucket_of_hydrocarbon_tar");
            System.out.println("Attempting to get item: 'bucket_of_hydrocarbon_tar' -> " + item);
            if (item == null || item.get() == null) {
                System.out.println("Item not found or is null, returning fallback icon.");
                return new ItemStack(ModBlocks.FLAKE.get());
            }
            return new ItemStack(ModBlocks.FLAKE.get());        }
    };

    public static final CreativeModeTab NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS = new CreativeModeTab("nyagibits_bytes_tab_incomplete_sequence_items") {
        @Override
        public ItemStack makeIcon() {
            RegistryObject<?> item = ModItems.ITEM_MAP.get("incomplete_controller");
            System.out.println("Attempting to get item: 'incomplete_controller' -> " + item);
            if (item == null || item.get() == null) {
                System.out.println("Item not found or is null, returning fallback icon.");

            }
            return new ItemStack(ModBlocks.FLAKE.get());        }
    };
}
