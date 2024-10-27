package net.madelyn.nyagibits_bytes.misc;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
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

}
