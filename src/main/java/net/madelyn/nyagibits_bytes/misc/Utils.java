package net.madelyn.nyagibits_bytes.misc;

import com.mojang.logging.LogUtils;
import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.item.ModCreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

public class Utils {

    private static final Logger LOGGER = LogUtils.getLogger();

    //Because i was getting tired of using the full thing.
    public static ResourceLocation NBNB(String s){
        return new ResourceLocation(NyagiBits_Bytes.MOD_ID, s);
    }

    //The following methods call ForgeRegistries to fetch something and return a fallback entry if nothing is found

    public static Item fetchItem(ResourceLocation key){
        Item item = ForgeRegistries.ITEMS.getValue(key);
        if(item == null){
            LOGGER.error("No item found for {}, defaulting to minecraft:barrier", key);
            return Items.BARRIER;
        }
        return item;
    }

    public static Block fetchBlock(ResourceLocation key){
        Block block = ForgeRegistries.BLOCKS.getValue(key);
        if(block == null){
            LOGGER.error("No block found for {}, defaulting to minecraft:barrier", key);
            return Blocks.BARRIER;
        }
        return block;
    }

    public static Fluid fetchFluid(ResourceLocation key){
        Fluid fluid = ForgeRegistries.FLUIDS.getValue(key);
        if(fluid == null){
            LOGGER.error("No fluid found for {}, defaulting to an empty fluid", key);
            return Fluids.EMPTY;
        }
        return fluid;
    }

    public static FluidType fetchFluidType(ResourceLocation key){
        FluidType type = ForgeRegistries.FLUID_TYPES.get().getValue(key);
        if(type == null){
            LOGGER.error("No fluid type found for {}, defaulting to an empty fluid's type", key);
            return Fluids.EMPTY.getFluidType();
        }
        return type;
    }

    //This is just a list of shorthands to make the lists cleaner.
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
