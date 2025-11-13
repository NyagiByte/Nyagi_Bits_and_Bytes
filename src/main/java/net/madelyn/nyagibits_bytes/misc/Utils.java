package net.madelyn.nyagibits_bytes.misc;

import com.mojang.logging.LogUtils;
import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.item.ModCreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {

    private static final Logger LOGGER = LogUtils.getLogger();

    public static Map<Tab, List<Item>> CREATIVE_CACHE = new HashMap<>();

    static { //Init the creative tab cache
        for(Tab tab : Tab.values()){
            CREATIVE_CACHE.put(tab, new ArrayList<>());
        }
    }

    //Because i was getting tired of using the full thing.
    public static ResourceLocation NBNB(String s){
        return ResourceLocation.tryBuild(NyagiBits_Bytes.MOD_ID, s);
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

    //This is to cache data for creative tab registry
    public enum Tab{
        ITEMS,
        BLOCKS,
        SCIENCE,
        SCHEMATICS,
        SEQUENCE,
        FLUIDS,
        MINERALS,
        BIOLOGY,
        CHEMICALS,
        ELEMENTS
    }

    //This is a helper class to hold the data needed to apply one curio attribute modifier
    public static class Modifier{
        private String slot;
        private Attribute attribute;
        private AttributeModifier.Operation operation;
        private double value;
        public Modifier (String slot, Attribute attribute, AttributeModifier.Operation operation, double value){
            this.slot = slot;
            this.attribute = attribute;
            this.operation = operation;
            this.value = value;
        }
        public String getSlot(){return slot;}
        public Attribute getAttribute(){return attribute;}
        public AttributeModifier.Operation getOperation(){return operation;}
        public double getValue(){return value;}
    }


}
