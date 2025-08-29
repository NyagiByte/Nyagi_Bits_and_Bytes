package net.madelyn.nyagibits_bytes.fluid;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, NyagiBits_Bytes.MOD_ID);


    //These are just some commonly used vanilla resourcelocations.
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation LAVA_STILL_RL = new ResourceLocation("block/lava_still");
    public static final ResourceLocation LAVA_FLOWING_RL = new ResourceLocation("block/lava_flow");

    /*
    Each FluidInfo.Builder creates everything necessary to register one fluid
    It builds all the parameters necessary to register a still fluid, a flowing fluid and a fluid type.
    Builder methods are available to set whichever properties are needed, but pretty much everything has a default value.
    For info on the default values, or the available builder methods, see the FluidInfo.Builder class.
     */

    public static final List<FluidInfo.Builder> FLUIDS_LIST = new ArrayList<>();
    public static void add(FluidInfo.Builder fluid){
        FLUIDS_LIST.add(fluid);
    }
    public static void populateList(){
        //Hydrocarbon Tar - Added 6/25/24
        add(new FluidInfo.Builder("hydrocarbon_tar", 0xff141414)
                .setStillTexture(LAVA_STILL_RL)
                .setFlowingTexture(LAVA_FLOWING_RL)
                .setSlopeFindDistance(2)
                .setLevelDecreasePerBlock(2)
                .setDensity(15)
                .setViscosity(2));
        //Raw Wood Vinegar - Added 6/25/24
        add(new FluidInfo.Builder("raw_wood_vinegar", 0xC18a3a0a)
                .setSlopeFindDistance(4)
                .setViscosity(5));
        //Pyroligneous Acid - Added 6/25/24
        add(new FluidInfo.Builder("pyroligneous_acid", 0xA1be8d43)
                .setSlopeFindDistance(4));
        //Acetone - Added 6/25/24
        add(new FluidInfo.Builder("acetone", 0xA1bbb9b2));
        //Gemstone Polish - Added 11/15/24
        add(new FluidInfo.Builder("gemstone_polish", 0xA100b2a9));
        //Molten Skystone - Added 11/15/24
        add(new FluidInfo.Builder("molten_skystone", 0xff001400)
                .setStillTexture(LAVA_STILL_RL)
                .setFlowingTexture(LAVA_FLOWING_RL));
        //Heptafluoropropane - Added 11/29/24
        add(new FluidInfo.Builder("heptafluoropropane", 0xA145ff64));
        //Amorphous Cellulose - Added 11/29/24
        add(new FluidInfo.Builder("amorphous_cellulose", 0xA4b6432));
        //Lithium-Alumino Solution - Added 12/12/24
        add(new FluidInfo.Builder("lithium_alumino_solution", 0xA1c8fa));
        //Tailings - Added 12/12/24
        add(new FluidInfo.Builder("tailings", 0xA4644b32));
        //Petroleum - Added 12/12/24
        add(new FluidInfo.Builder("petroleum", 0xA4c89600));
        //Heavy Crude Oil - Added 12/12/24
        add(new FluidInfo.Builder("heavy_crude_oil", 0xA400000a));
        //Endstone-Leach Water - Added 12/12/24
        add(new FluidInfo.Builder("endstone_leach_water", 0xA1326496));
        // Bio-Glycerol Mix - Added 03/21/25
        add(new FluidInfo.Builder("bio_glycerol_mix", 0xA04f4d0a));
        // Crude Biodiesel - Added 02/13/25
        add(new FluidInfo.Builder("crude_biodiesel", 0xA14f4d0a));
        // Crude Glycerol - Added 02/13/25
        add(new FluidInfo.Builder("crude_glycerol", 0xA1472b19));
        // Alkaline Technical Grade Glycerol - Added 02/13/25
        add(new FluidInfo.Builder("alkaline_technical_glycerol", 0xA1804d2e));
        // Technical Grade Glycerol - Added 02/13/25
        add(new FluidInfo.Builder("technical_glycerol", 0xA1a36e4e));
        // Colorless Glycerol - Added 02/13/25
        add(new FluidInfo.Builder("colorless_glycerol", 0xA1ccc3be));
        // Odourless Glycerol - Added 02/13/25
        add(new FluidInfo.Builder("odourless_glycerol", 0xA1dbd1cc));
        // Distilled Glycerol - Added 02/13/25
        add(new FluidInfo.Builder("distilled_glycerol", 0xA1f5e9e4));
        // Glycerol - Added 02/13/25
        add(new FluidInfo.Builder("glycerol", 0xA1ededed));
        // Wet Methanol - Added 02/13/25
        add(new FluidInfo.Builder("wet_methanol", 0xA1e9b8f5));
        // Wet Biodiesel - Added 02/13/25
        add(new FluidInfo.Builder("wet_biodiesel", 0xA1706e1a));
        // Crude Plant Oil - Added 02/13/25
        add(new FluidInfo.Builder("crude_plant_oil", 0xA17d824d));
        // Cyclohexanone - Added 02/20/25
        add(new FluidInfo.Builder("cyclohexanone", 0xA1aad5cb));
        // Methylethyl Ketone - Added 02/20/25
        add(new FluidInfo.Builder("methylethyl_ketone", 0xA15e9e8f));
        // Ketone Mixture - Added 02/20/25
        add(new FluidInfo.Builder("ketone_mixture", 0xA1b0c484));
        // Lithium Carboxylate - Added 02/20/25
        add(new FluidInfo.Builder("lithium_carboxylate", 0xA1c3b0bb));
        // t-Butyllithium - Added 02/20/25
        add(new FluidInfo.Builder("tert_butyl_lithium", 0xA18c80ae));
        // t-Butylchloride - Added 02/20/25
        add(new FluidInfo.Builder("tert_butyl_chloride", 0xA178aa99));
        // Methylmagnesium Chloride Solution - Added 02/20/25
        add(new FluidInfo.Builder("methylmagnesium_chloride_solution", 0xA1c7d9cd));
        // Tetrahydrofuran - Added 02/20/25
        add(new FluidInfo.Builder("tetrahydrofuran", 0xA1e3c3af));
        // Formaldehyde - Added 02/20/25
        add(new FluidInfo.Builder("formaldehyde", 0xA1d7933a));
        // Methyl Chloride - Added 04/23/25
        add(new FluidInfo.Builder("methyl_chloride", 0xA19acdad));
        // Ethylene Oxide - Added 04/23/25
        add(new FluidInfo.Builder("ethylene_oxide", 0xA198b1b6));
        // Trinitrotoluene - Added 04/23/25
        add(new FluidInfo.Builder("trinitrotoluene", 0xA1e7dd7a));
        // Dinitrotoluene - Added 04/23/25
        add(new FluidInfo.Builder("dinitrotoluene", 0xA1c6b097));
        // Mononitrotoluene - Added 04/23/25
        add(new FluidInfo.Builder("mononitrotoluene", 0xA1b9b890));
        // Toluene - Added 04/23/25
        add(new FluidInfo.Builder("toluene", 0xA1965517));
        // 2-Phenoxyethanol - Added 04/23/25
        add(new FluidInfo.Builder("2_phenoxyethanol", 0xA1918c58));
        // Benzyl Alcohol - Added 04/23/25
        add(new FluidInfo.Builder("benzyl_alcohol", 0xA1839367));
        // Oleum - Added 04/23/25
        add(new FluidInfo.Builder("oleum", 0xA1e7e2b2));
        // Anthocyanin - Added 04/23/25
        add(new FluidInfo.Builder("anthocyanin", 0xA1cc8aec));
        // Malic & Citric Acid - Added 04/23/25
        add(new FluidInfo.Builder("malic_and_citric_acid", 0xA1f0ae5a));
        // Vinegar - Added 04/23/25
        add(new FluidInfo.Builder("vinegar", 0xA1ccc4ae));
        // Salt Water - Added 04/23/25
        add(new FluidInfo.Builder("salt_water", 0xA189a5f5));
        // Nickel Sulfate Solution - Added 05/29/25
        add(new FluidInfo.Builder("solution_nickel_sulfate", 0xA14b7f30));
        // Diluted Sulfuric Acid - Added 05/29/25
        add(new FluidInfo.Builder("diluted_sulfuric_acid", 0xA1c9c682));
        // Vinegar Starter - Added 06/10/25
        add(new FluidInfo.Builder("vinegar_starter", 0xA152362D));
        // Vinegar Starter - Added 06/10/25
        add(new FluidInfo.Builder("thin_ink", 0xA1111111));
        // Commercial Grade Hydrogen Peroxide (3%) - Added 06/15/25
        add(new FluidInfo.Builder("hydrogen_peroxide_003", 0xA10d5e8b));
        // Concentrated Hydrogen Peroxide (15%) - Added 06/15/25
        add(new FluidInfo.Builder("hydrogen_peroxide_015", 0xA116869c));
        // Industrial Grade Hydrogen Peroxide (32%) - Added 06/15/25
        add(new FluidInfo.Builder("hydrogen_peroxide_032", 0xA11ea69f));
        // Explosives Grade Hydrogen Peroxide (75%) - Added 06/15/25
        add(new FluidInfo.Builder("hydrogen_peroxide_075", 0xA129b38f));
        // Anhydrous Hydrogen Peroxide (~99.9%) - Added 06/15/25
        add(new FluidInfo.Builder("hydrogen_peroxide_100", 0xA149ca99));
        // Unbleached Chitin Solution - Added 06/15/25
        add(new FluidInfo.Builder("solution_unbleached_chitin", 0xA19e8948));
        // Decolorized Chitin Solution - Added 06/15/25
        add(new FluidInfo.Builder("solution_decolorized_chitin", 0xA1613125));
        // Chitosan Solution - Added 06/15/25
        add(new FluidInfo.Builder("solution_chitosan", 0xA1974e39));
        // Hydroquinone - Added 07/06/25
        add(new FluidInfo.Builder("hydroquinone", 0xA18a67ac));
        // 1,4-Napthoquinone - Added 07/06/25
        add(new FluidInfo.Builder("1_4_napthoquinone", 0xA13e4ab5));
        // 9,10-Anthraquinone - Added 07/06/25
        add(new FluidInfo.Builder("9_10_anthraquinone", 0xA1b03e74));
        // Bubbled Pre-Peroxide - Added 07/06/25
        add(new FluidInfo.Builder("bubbled_pre_peroxide", 0xA16081a1));
        // Mixed Peroxide Product - Added 07/06/25
        add(new FluidInfo.Builder("mixed_peroxide_product", 0xA1909b9c));
        // Steam Cracked Ethylene - Added 07/06/25
        add(new FluidInfo.Builder("steam_cracked_ethylene", 0xA178987e));
        // 1,3-Butadiene - Added 07/06/25
        add(new FluidInfo.Builder("1_3_butadiene", 0xA1868453));
        // Wet HPA-4 - Added 07/06/25
        add(new FluidInfo.Builder("wet_hpa_4", 0xA15b859e));
        // HPA-4 Precursor #3 - Added 07/06/25
        add(new FluidInfo.Builder("precursor_3_hpa_4", 0xA1787f87));
        // HPA-4 Precursor #2- Added 07/06/25
        add(new FluidInfo.Builder("precursor_2_hpa_4", 0xA152807c));
        // HPA-4 Precursor #1 - Added 07/06/25
        add(new FluidInfo.Builder("precursor_1_hpa_4", 0xA185997c));
        // Diethyl Ether - Added 07/06/25
        add(new FluidInfo.Builder("diethyl_ether", 0xA1ab8339));
        // Screened Water - Added 07/25/25
        add(new FluidInfo.Builder("screened_water", 0xA10c6ac8));
        // Flocculated Water - Added 07/25/25
        add(new FluidInfo.Builder("flocculated_water", 0xA10e6fd0));
        // Settled Water - Added 07/25/25
        add(new FluidInfo.Builder("settled_water", 0xA11073d7));
        // Clarified Water - Added 07/25/25
        add(new FluidInfo.Builder("clarified_water", 0xA11278df));
        // Sand Filtered Water - Added 07/25/25
        add(new FluidInfo.Builder("sand_filtered_water", 0xA1137ae2));
        // Filtered Water - Added 07/25/25
        add(new FluidInfo.Builder("filtered_water", 0xA12c88e4));
        // Contaminated Water - Added 07/25/25
        add(new FluidInfo.Builder("contaminated_water", 0xA16aa49b));
        // Deionised Water - Added 07/25/25
        add(new FluidInfo.Builder("deionised_water", 0xA14599ee));
        // Chlorine Dioxide - Added 07/25/25
        add(new FluidInfo.Builder("chlorine_dioxide", 0xA1d1e614));
        // Disinfected Water - Added 07/25/25
        add(new FluidInfo.Builder("disinfected_water", 0xA15aa4f0));
        // Distilled Water - Added 07/25/25
        add(new FluidInfo.Builder("distilled_water", 0xA172b1f2));
        // Type 3 Water - Added 07/25/25
        add(new FluidInfo.Builder("type3_water", 0xA178b3f0));
        // Type 2 Water - Added 07/25/25
        add(new FluidInfo.Builder("type2_water", 0xA186b9ee));
        // Type 1 Water - Added 07/25/25
        add(new FluidInfo.Builder("type1_water", 0xA195bfeb));
        // Seawater - Added 08/18/25
        add(new FluidInfo.Builder("seawater", 0xA1bfcbed));
        // Hydrogen Bromide - Added 08/18/25
        add(new FluidInfo.Builder("hydrogen_bromide", 0xA1812626));
        // Wet Hydrazine - Added 08/19/25
        add(new FluidInfo.Builder("wet_hydrazine", 0xA1101065));
        // Hydrazine - Added 08/19/25
        add(new FluidInfo.Builder("hydrazine", 0xA1312b75));
        // Hydrogen Iodide - Added 08/19/25
        add(new FluidInfo.Builder("hydrogen_iodide", 0xA187336c));
        // Iodomethane - Added 08/19/25
        add(new FluidInfo.Builder("iodomethane", 0xA1b46ec7));
        // DMSO - Added 08/19/25
        add(new FluidInfo.Builder("dmso", 0xA18eb960));
        // DMS - Added 08/19/25
        add(new FluidInfo.Builder("dms", 0xA1d8cb63));
        // Impure Methanol - Added 08/24/25
        add(new FluidInfo.Builder("impure_methanol", 0xA19e64a3));
        // Impure Acetone - Added 08/24/25
        add(new FluidInfo.Builder("impure_acetone", 0xA19c9b97));
        // Chloropropane - Added 08/27/25
        add(new FluidInfo.Builder("chloropropane", 0xA15d3137));
        // Chlorooctane - Added 08/27/25
        add(new FluidInfo.Builder("chlorooctane", 0xA17f5377));
        // Bromooctane - Added 08/27/25
        add(new FluidInfo.Builder("bromooctane", 0xA1512415));
        // CHC 68 - Added 08/27/25
        add(new FluidInfo.Builder("chc_68", 0xA145301f));
        // Anhydrous Toluene - Added 08/27/25
        add(new FluidInfo.Builder("anhydrous_toluene", 0xA14e2f12));
        // Octane - Added 08/27/25
        add(new FluidInfo.Builder("octane", 0xA147124e));
        // Mixed Pre-Dimethoxybenzoic Acid Product - Added 08/27/25
        add(new FluidInfo.Builder("mixed_pre_dimethoxybenzoic_acid_product", 0xA13d7081));
        // Mixed Dimethoxybenzoic Acid Product - Added 08/27/25
        add(new FluidInfo.Builder("mixed_dimethoxybenzoic_acid_product", 0xA1627397));
        // Impure 2,5-Dimethoxybenzoic Acid - Added 08/27/25
        add(new FluidInfo.Builder("impure_2_5_dimethoxybenzoic_acid", 0xA13e3c70));
        // Impure 2,5-Dimethoxy-1,4-Benzenedicarboxylic Acid - Added 08/27/25
        add(new FluidInfo.Builder("impure_2_5_dimethoxy_1_4_benzenedicarboxylic_acid", 0xA1a9c8c6));
        // 2,5-Dimethoxybenzoic Acid Solution - Added 08/27/25
        add(new FluidInfo.Builder("2_5_dimethoxybenzoic_acid_solution", 0xA19274a4));
        // 2,5-Dimethoxy-1,4-Benzenedicarboxylic Acid Solution - Added 08/27/25
        add(new FluidInfo.Builder("2_5_dimethoxy_1_4_benzenedicarboxylic_acid_solution", 0xA1a4749d));
    }

    public static List<ItemInfo.Bucket> buckets = new ArrayList<>();

    static {
        populateList();
        for(FluidInfo.Builder infoBuilder : FLUIDS_LIST){
            FluidInfo info = infoBuilder.build();
            FLUIDS.register(info.getSourceId(), info.getSourceFluid());
            FLUIDS.register(info.getFlowingId(), info.getFlowingFluid());
            FLUID_TYPES.register(info.getFluidTypeId(), info.getFluidType());
            ItemInfo.Bucket bucket = info.createBucket();
            buckets.add(bucket); //This is to datagen the item models.
            ModItems.ITEMS.register(bucket.getId(), bucket::registerItem);
            ModBlocks.BLOCKS.register(info.getBlockId(), info.createBlock());
        }
    }

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
        FLUID_TYPES.register(eventBus);
    }

}
