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

    public static final List<FluidInfo.Builder> FLUIDS_LIST = List.of(
        //Hydrocarbon Tar - Added 6/25/24
        new FluidInfo.Builder("hydrocarbon_tar", 0xff141414)
                .setStillTexture(LAVA_STILL_RL)
                .setFlowingTexture(LAVA_FLOWING_RL)
                .setSlopeFindDistance(2)
                .setLevelDecreasePerBlock(2)
                .setDensity(15)
                .setViscosity(2),
        //Raw Wood Vinegar - Added 6/25/24
        new FluidInfo.Builder("raw_wood_vinegar", 0xC18a3a0a)
                .setSlopeFindDistance(4)
                .setViscosity(5),
        //Pyroligneous Acid - Added 6/25/24
        new FluidInfo.Builder("pyroligneous_acid", 0xA1be8d43)
                .setSlopeFindDistance(4),
        //Acetone - Added 6/25/24
        new FluidInfo.Builder("acetone", 0xA1bbb9b2),
        //Gemstone Polish - Added 11/15/24
        new FluidInfo.Builder("gemstone_polish", 0xA100b2a9),
        //Molten Skystone - Added 11/15/24
        new FluidInfo.Builder("molten_skystone", 0xff001400)
                .setStillTexture(LAVA_STILL_RL)
                .setFlowingTexture(LAVA_FLOWING_RL),
        //Heptafluoropropane - Added 11/29/24
        new FluidInfo.Builder("heptafluoropropane", 0xA145ff64),
        //Amorphous Cellulose - Added 11/29/24
        new FluidInfo.Builder("amorphous_cellulose", 0xA4b6432),
        //Lithium-Alumino Solution - Added 12/12/24
        new FluidInfo.Builder("lithium_alumino_solution", 0xA1c8fa),
        //Tailings - Added 12/12/24
        new FluidInfo.Builder("tailings", 0xA4644b32),
        //Petroleum - Added 12/12/24
        new FluidInfo.Builder("petroleum", 0xA4c89600),
        //Heavy Crude Oil - Added 12/12/24
        new FluidInfo.Builder("heavy_crude_oil", 0xA400000a),
        //Endstone-Leach Water - Added 12/12/24
        new FluidInfo.Builder("endstone_leach_water", 0xA1326496),
        // Bio-Glycerol Mix - Added 03/21/25
        new FluidInfo.Builder("bio_glycerol_mix", 0xA04f4d0a),
        // Crude Biodiesel - Added 02/13/25
        new FluidInfo.Builder("crude_biodiesel", 0xA14f4d0a),
        // Crude Glycerol - Added 02/13/25
        new FluidInfo.Builder("crude_glycerol", 0xA1472b19),
        // Alkaline Technical Grade Glycerol - Added 02/13/25
        new FluidInfo.Builder("alkaline_technical_glycerol", 0xA1804d2e),
        // Technical Grade Glycerol - Added 02/13/25
        new FluidInfo.Builder("technical_glycerol", 0xA1a36e4e),
        // Colorless Glycerol - Added 02/13/25
        new FluidInfo.Builder("colorless_glycerol", 0xA1ccc3be),
        // Odourless Glycerol - Added 02/13/25
        new FluidInfo.Builder("odourless_glycerol", 0xA1dbd1cc),
        // Distilled Glycerol - Added 02/13/25
        new FluidInfo.Builder("distilled_glycerol", 0xA1f5e9e4),
        // Glycerol - Added 02/13/25
        new FluidInfo.Builder("glycerol", 0xA1ededed),
        // Wet Methanol - Added 02/13/25
        new FluidInfo.Builder("wet_methanol", 0xA1e9b8f5),
        // Wet Biodiesel - Added 02/13/25
        new FluidInfo.Builder("wet_biodiesel", 0xA1706e1a),
        // Crude Plant Oil - Added 02/13/25
        new FluidInfo.Builder("crude_plant_oil", 0xA17d824d),
        // Cyclohexanone - Added 02/20/25
        new FluidInfo.Builder("cyclohexanone", 0xA1aad5cb),
        // Methylethyl Ketone - Added 02/20/25
        new FluidInfo.Builder("methylethyl_ketone", 0xA15e9e8f),
        // Ketone Mixture - Added 02/20/25
        new FluidInfo.Builder("ketone_mixture", 0xA1b0c484),
        // Lithium Carboxylate - Added 02/20/25
        new FluidInfo.Builder("lithium_carboxylate", 0xA1c3b0bb),
        // t-Butyllithium - Added 02/20/25
        new FluidInfo.Builder("tert_butyl_lithium", 0xA18c80ae),
        // t-Butylchloride - Added 02/20/25
        new FluidInfo.Builder("tert_butyl_chloride", 0xA178aa99),
        // Methylmagnesium Chloride Solution - Added 02/20/25
        new FluidInfo.Builder("methylmagnesium_chloride_solution", 0xA1c7d9cd),
        // Tetrahydrofuran - Added 02/20/25
        new FluidInfo.Builder("tetrahydrofuran", 0xA1e3c3af),
        // Formaldehyde - Added 02/20/25
        new FluidInfo.Builder("formaldehyde", 0xA1d7933a),
        // Methyl Chloride - Added 04/23/25
        new FluidInfo.Builder("methyl_chloride", 0xA19acdad),
        // Ethylene Oxide - Added 04/23/25
        new FluidInfo.Builder("ethylene_oxide", 0xA198b1b6),
        // Trinitrotoluene - Added 04/23/25
        new FluidInfo.Builder("trinitrotoluene", 0xA1e7dd7a),
        // Dinitrotoluene - Added 04/23/25
        new FluidInfo.Builder("dinitrotoluene", 0xA1c6b097),
        // Mononitrotoluene - Added 04/23/25
        new FluidInfo.Builder("mononitrotoluene", 0xA1b9b890),
        // Toluene - Added 04/23/25
        new FluidInfo.Builder("toluene", 0xA1965517),
        // 2-Phenoxyethanol - Added 04/23/25
        new FluidInfo.Builder("2_phenoxyethanol", 0xA1918c58),
        // Benzyl Alcohol - Added 04/23/25
        new FluidInfo.Builder("benzyl_alcohol", 0xA1839367),
        // Oleum - Added 04/23/25
        new FluidInfo.Builder("oleum", 0xA1e7e2b2),
        // Anthocyanin - Added 04/23/25
        new FluidInfo.Builder("anthocyanin", 0xA1cc8aec),
        // Malic & Citric Acid - Added 04/23/25
        new FluidInfo.Builder("malic_and_citric_acid", 0xA1f0ae5a),
        // Vinegar - Added 04/23/25
        new FluidInfo.Builder("vinegar", 0xA1ccc4ae),
        // Salt Water - Added 04/23/25
        new FluidInfo.Builder("salt_water", 0xA189a5f5),
        // Nickel Sulfate Solution - Added 05/29/25
        new FluidInfo.Builder("solution_nickel_sulfate", 0xA14b7f30),
        // Diluted Sulfuric Acid - Added 05/29/25
        new FluidInfo.Builder("diluted_sulfuric_acid", 0xA1c9c682),
        // Unpasteurized Vinegar - Added 06/10/25
        new FluidInfo.Builder("vinegar_starter", 0xA152362D)
    );

    public static List<ItemInfo.Bucket> buckets = new ArrayList<>();

    static {
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
