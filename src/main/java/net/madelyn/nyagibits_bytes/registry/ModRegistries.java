package net.madelyn.nyagibits_bytes.registry;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.content.block.NBNBBlockItem;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.madelyn.nyagibits_bytes.registry.helpers.BlockInfo;
import net.madelyn.nyagibits_bytes.registry.helpers.ChemicalInfo;
import net.madelyn.nyagibits_bytes.registry.helpers.FluidInfo;
import net.madelyn.nyagibits_bytes.registry.helpers.ItemInfo;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

import static net.madelyn.nyagibits_bytes.NyagiBits_Bytes.MOD_ID;
import static net.madelyn.nyagibits_bytes.registry.categories.ModFluids.buckets;

/* This class is intended to gather all registries in one place instead of having them scattered across different places.
Differentiating the categories of items will be done through flags in the item's class instead. */
public class ModRegistries {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MOD_ID);


    public static final List<ItemInfo> ITEMS_LIST = new ArrayList<>();
    public static final List<BlockInfo> BLOCKS_LIST = new ArrayList<>();
    public static final List<FluidInfo.Builder> FLUIDS_LIST = new ArrayList<>();
    //All registry was delegated elsewhere, this is just a place to store the info objects.
    public static final List<ChemicalInfo> CHEM_LIST = new ArrayList<>();



    public static void initRegistry() {
        for(ItemInfo info : ITEMS_LIST){
            RegistryObject<Item> registeredItem = ITEMS.register(info.getId(), info::registerItem);
        }
        for (BlockInfo info : BLOCKS_LIST){
            RegistryObject<Block> registeredBlock = BLOCKS.register(info.getId(), info::createBlock);
            RegistryObject<Item> blockItem = ITEMS.register(info.getId(), () -> {
                Item item = info.isTinted() ?
                        new NBNBBlockItem(registeredBlock.get(), new Item.Properties(), info.getTint(), info.getAbbreviation()) :
                        new NBNBBlockItem(registeredBlock.get(), new Item.Properties(), info.getAbbreviation());
                Utils.CREATIVE_CACHE.get(info.getTab()).add(item);
                return item;
            });

        }
        for(FluidInfo.Builder infoBuilder : FLUIDS_LIST){
            FluidInfo info = infoBuilder.build();
            FLUIDS.register(info.getSourceId(), info.getSourceFluid());
            FLUIDS.register(info.getFlowingId(), info.getFlowingFluid());
            FLUID_TYPES.register(info.getFluidTypeId(), info.getFluidType());
            ItemInfo.Bucket bucket = info.createBucket();
            buckets.add(bucket); //This is to datagen the item models.
            ITEMS.register(bucket.getId(), bucket::registerItem);
            BLOCKS.register(info.getBlockId(), info.createBlock());
        }
    }


    public static void register(IEventBus eventBus) {
        NyagiBits_Bytes.LOGGER.info("ITEMS: {}",ITEMS.getEntries().size());
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
        FLUIDS.register(eventBus);
        FLUID_TYPES.register(eventBus);
        CREATIVE_TABS.register(eventBus);
        ENCHANTMENTS.register(eventBus);
    }



}
