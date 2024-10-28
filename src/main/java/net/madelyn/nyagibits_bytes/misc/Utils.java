package net.madelyn.nyagibits_bytes.misc;

import com.mojang.logging.LogUtils;
import net.madelyn.nyagibits_bytes.item.ModCreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

public class Utils {

    private static final Logger LOGGER = LogUtils.getLogger();

    public static Item fetchItem(ResourceLocation key){
        Item item = ForgeRegistries.ITEMS.getValue(key);
        if(item == null){
            LOGGER.error("No item found for '+"+key+"', defaulting to minecraft:barrier");
            return Items.BARRIER;
        }
        return item;
    }

    public static Block fetchBlock(ResourceLocation key){
        Block block = ForgeRegistries.BLOCKS.getValue(key);
        if(block == null){
            LOGGER.error("No block found for '+"+key+"', defaulting to minecraft:barrier");
            return Blocks.BARRIER;
        }
        return block;
    }

    //This is just a list of shorthands to make the list cleaner.
    public static class Tab{
        public static CreativeModeTab ITEMS = ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS;
        public static CreativeModeTab BLOCKS = ModCreativeModeTab.NYAGIBITS_BYTES_BLOCKS;
        public static CreativeModeTab SCIENCE = ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE;
        public static CreativeModeTab SCHEMATICS = ModCreativeModeTab.NYAGIBITS_BYTES_SCHEMATICS;
        public static CreativeModeTab SEQUENCE = ModCreativeModeTab.NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS;
        public static CreativeModeTab FLUIDS = ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS;
        public static CreativeModeTab MINERALS = ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS;
    }


}
