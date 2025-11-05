package net.madelyn.nyagibits_bytes.pure;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.chemical.ChemicalInfo;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class ModPureItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NyagiBits_Bytes.MOD_ID);


    public static final List<ItemPureInfo> ELEMENT_LIST = new ArrayList<>();

    public static void add(ItemPureInfo info){
        ELEMENT_LIST.add(info);
    }

    public static void populateList() {

        // Pure Iron
        add(new ItemPureInfo("iron", 0xA1ff00a7));

    }
}
