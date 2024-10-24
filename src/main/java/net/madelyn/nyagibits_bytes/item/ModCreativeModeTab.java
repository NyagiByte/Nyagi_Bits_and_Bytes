package net.madelyn.nyagibits_bytes.item;

import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ModCreativeModeTab {

  private static final Logger LOGGER = LogManager.getLogger();

  //TODO: Either move this elsewhere or figure out if it can be fetched from ForgeRegistries
  public static ItemStack getItemIcon(String itemName) {
    RegistryObject<Item> item = ModItems.ITEM_MAP.get(itemName);
    LOGGER.info("Attempting to get item: '{}' -> {}", itemName,
                item != null ? item.get() : "null");
    if (item == null || item.get() == null) {
      LOGGER.warn("Item '{}' not found or is null, returning fallback icon.",
                  itemName);
      return new ItemStack(ModBlocks.FLAKE.get());
    }
    return new ItemStack(item.get());
  }

  public static final CreativeModeTab NYAGIBITS_BYTES_ITEMS =
      new CreativeModeTab("nyagibits_bytes_tab_items") {
        @Override
        public ItemStack makeIcon() {
          return getItemIcon("livisite_alloy");
        }
      };

  public static final CreativeModeTab NYAGIBITS_BYTES_BLOCKS =
      new CreativeModeTab("nyagibits_bytes_tab_blocks") {
        @Override
        public ItemStack makeIcon() {
          return new ItemStack(ModBlocks.FLAKE.get());
        }
      };

  public static final CreativeModeTab NYAGIBITS_BYTES_SCIENCE =
      new CreativeModeTab("nyagibits_bytes_tab_science") {
        @Override
        public ItemStack makeIcon() {
          return getItemIcon("lab_notebook");
        }
      };

  public static final CreativeModeTab NYAGIBITS_BYTES_SCHEMATICS =
      new CreativeModeTab("nyagibits_bytes_tab_schematics") {
        @Override
        public ItemStack makeIcon() {
          return getItemIcon("blank_blueprint");
        }
      };

  public static final CreativeModeTab NYAGIBITS_BYTES_MINERALS =
      new CreativeModeTab("nyagibits_bytes_tab_minerals") {
        @Override
        public ItemStack makeIcon() {
          return getItemIcon("raw_hematite");
        }
      };

  public static final CreativeModeTab NYAGIBITS_BYTES_FLUIDS =
      new CreativeModeTab("nyagibits_bytes_tab_fluids") {
        @Override
        public ItemStack makeIcon() {
            return getItemIcon("bucket_of_hydrocarbon_tar");
        }
      };

  public static final CreativeModeTab
      NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS =
          new CreativeModeTab("nyagibits_bytes_tab_incomplete_sequence_items") {
            @Override
            public ItemStack makeIcon() {
              return getItemIcon("incomplete_controller");
            }
          };
}
