package net.madelyn.nyagibits_bytes.chemical;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.fluid.FluidInfo;
import net.madelyn.nyagibits_bytes.fluid.ModFluids;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class ModChemicals {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, NyagiBits_Bytes.MOD_ID);


    public static final List<ChemicalInfo> CHEM_LIST = new ArrayList<>();
    public static void add(ChemicalInfo info){
        CHEM_LIST.add(info);
    }

    public static void populateList(){

        //  Impure Methanol added 08/26/25 - JJ
        add(new ChemicalInfo("impure_methanol", 0xA19e64a3).fluid());
        //  Impure Acetone added 08/26/25 - JJ
        add(new ChemicalInfo("impure_acetone", 0xA19c9b97).fluid());
        //  Acetone added 08/26/25 - JJ
        add(new ChemicalInfo("acetone", 0xA1bbb9b2).fluid());
        //  Screened Water added 08/26/25 - JJ
        add(new ChemicalInfo("screened_water", 0xA10c6ac8).fluid());
        //  Flocculated Water added 08/26/25 - JJ
        add(new ChemicalInfo("flocculated_water", 0xA10e6fd0).fluid());
        //  Settled Water added 08/26/25 - JJ
        add(new ChemicalInfo("settled_water", 0xA11073d7).fluid());
        //  Clarified Water added 08/26/25 - JJ
        add(new ChemicalInfo("clarified_water", 0xA11278df).fluid());
        //  Sand Filtered Water added 08/26/25 - JJ
        add(new ChemicalInfo("sand_filtered_water", 0xA1137ae2).fluid());
        //  Filtered Water added 08/26/25 - JJ
        add(new ChemicalInfo("filtered_water", 0xA12c88e4).fluid());
        //  Contaminated Water added 08/26/25 - JJ
        add(new ChemicalInfo("contaminated_water", 0xA16aa49b).fluid());
        //  Deionised Water added 08/26/25 - JJ
        add(new ChemicalInfo("deionised_water", 0xA14599ee).fluid());
        //  Disinfected Water added 08/26/25 - JJ
        add(new ChemicalInfo("disinfected_water", 0xA15aa4f0).fluid());
        //  Distilled Water added 08/26/25 - JJ
        add(new ChemicalInfo("distilled_water", 0xA172b1f2).fluid());
        //  Type 3 Water added 08/26/25 - JJ
        add(new ChemicalInfo("type3_water", 0xA178b3f0).fluid());
        //  Type 2 Water added 08/26/25 - JJ
        add(new ChemicalInfo("type2_water", 0xA186b9ee).fluid());
        //  Type 1 Water added 08/26/25 - JJ
        add(new ChemicalInfo("type1_water", 0xA195bfeb).fluid());
        //  Wet Methanol added 08/26/25 - JJ
        add(new ChemicalInfo("wet_methanol", 0xA1e9b8f5).fluid());
        //  Crude Biodiesel added 08/26/25 - JJ
        add(new ChemicalInfo("crude_biodiesel", 0xA14f4d0a).fluid());
        //  Crude Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("crude_glycerol", 0xA1472b19).fluid());
        //  Alkaline Technical Grade Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("alkaline_technical_grade_glycerol", 0xA1804d2e).fluid());
        //  Technical Grade Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("technical_grade_glycerol", 0xA1a36e4e).fluid());
        //  Colorless Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("colorless_glycerol", 0xA1ccc3be).fluid());
        //  Odourless Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("odourless_glycerol", 0xA1dbd1cc).fluid());
        //  Distilled Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("distilled_glycerol", 0xA1f5e9e4).fluid());
        //  Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("glycerol", 0xA1ededed).fluid());
        //  Wet Biodiesel added 08/26/25 - JJ
        add(new ChemicalInfo("wet_biodiesel", 0xA1706e1a).fluid());
        //  Crude Plant Oil added 08/26/25 - JJ
        add(new ChemicalInfo("crude_plant_oil", 0xA17d824d).fluid());
        //  Chlorine Dioxide added 08/26/25 - JJ
        add(new ChemicalInfo("chlorine_dioxide", 0xA1d1e614).fluid());

    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        FLUIDS.register(eventBus);
        FLUID_TYPES.register(eventBus);
    }

    static{
        populateList();
        for(ChemicalInfo chem : CHEM_LIST){
            ItemInfo item = chem.getSample();
            RegistryObject<Item> registeredSample = ITEMS.register(item.getId(), item::registerItem);
            if(chem.getCompacted() != null){
                ItemInfo cmp = chem.getCompacted();
                RegistryObject<Item> registeredCompacted = ITEMS.register(cmp.getId(), cmp::registerItem);
            }
            if(chem.getFluid() != null){
                FluidInfo.Builder builder = chem.getFluid();
                FluidInfo info = builder.build();
                FLUIDS.register(info.getSourceId(), info.getSourceFluid());
                FLUIDS.register(info.getFlowingId(), info.getFlowingFluid());
                FLUID_TYPES.register(info.getFluidTypeId(), info.getFluidType());
                ItemInfo.Bucket bucket = info.createBucket();
                ModFluids.buckets.add(bucket); //This is to datagen the item models.
                ModItems.ITEMS.register(bucket.getId(), bucket::registerItem);
                ModBlocks.BLOCKS.register(info.getBlockId(), info.createBlock());
            }
        }
    }
}
