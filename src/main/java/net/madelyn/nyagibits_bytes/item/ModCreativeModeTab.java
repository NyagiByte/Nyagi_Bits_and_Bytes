package net.madelyn.nyagibits_bytes.item;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ModCreativeModeTab {

  private static final Logger LOGGER = LogManager.getLogger();

  public static final CreativeModeTab NYAGIBITS_BYTES_ITEMS =
      new CreativeModeTab("nyagibits_bytes_tab_items") {
        @Override
        public ItemStack makeIcon() {
          return new ItemStack(Utils.fetchItem(Utils.NBNB("livisite_alloy")));
        }
      };

  public static final CreativeModeTab NYAGIBITS_BYTES_BLOCKS =
      new CreativeModeTab("nyagibits_bytes_tab_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Utils.fetchItem(Utils.NBNB("flake")));
        }
      };

  public static final CreativeModeTab NYAGIBITS_BYTES_SCIENCE =
      new CreativeModeTab("nyagibits_bytes_tab_science") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Utils.fetchItem(Utils.NBNB("lab_notebook")));
        }
      };

  public static final CreativeModeTab NYAGIBITS_BYTES_SCHEMATICS =
      new CreativeModeTab("nyagibits_bytes_tab_schematics") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Utils.fetchItem(Utils.NBNB("blank_blueprint")));
        }
      };

  public static final CreativeModeTab NYAGIBITS_BYTES_MINERALS =
      new CreativeModeTab("nyagibits_bytes_tab_minerals") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Utils.fetchItem(Utils.NBNB("raw_hematite")));
        }
      };

  public static final CreativeModeTab NYAGIBITS_BYTES_FLUIDS =
      new CreativeModeTab("nyagibits_bytes_tab_fluids") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Utils.fetchItem(Utils.NBNB("bucket_of_hydrocarbon_tar")));
        }
      };

  public static final CreativeModeTab
      NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS =
          new CreativeModeTab("nyagibits_bytes_tab_incomplete_sequence_items") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(Utils.fetchItem(Utils.NBNB("incomplete_controller")));
            }
          };
}
