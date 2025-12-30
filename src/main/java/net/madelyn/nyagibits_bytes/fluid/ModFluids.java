package net.madelyn.nyagibits_bytes.fluid;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
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
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NyagiBits_Bytes.MOD_ID);


    //These are just some commonly used vanilla resourcelocations.
    public static final ResourceLocation WATER_STILL_RL = ResourceLocation.parse("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = ResourceLocation.parse("block/water_flow");
    public static final ResourceLocation LAVA_STILL_RL =  ResourceLocation.parse("block/lava_still");
    public static final ResourceLocation LAVA_FLOWING_RL = ResourceLocation.parse("block/lava_flow");

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
        //Gemstone Polish - Added 11/15/24
        add(new FluidInfo.Builder("gemstone_polish", 0xA100b2a9));
        //Molten Skystone - Added 11/15/24
        add(new FluidInfo.Builder("molten_skystone", 0xff001400)
                .setStillTexture(LAVA_STILL_RL)
                .setFlowingTexture(LAVA_FLOWING_RL));

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
        // Anthocyanin - Added 04/23/25
        add(new FluidInfo.Builder("anthocyanin", 0xA1cc8aec));
        // Malic & Citric Acid - Added 04/23/25
        add(new FluidInfo.Builder("malic_and_citric_acid", 0xA1f0ae5a));
        // Vinegar - Added 04/23/25
        add(new FluidInfo.Builder("vinegar", 0xA1ccc4ae));
        // Salt Water - Added 04/23/25
        add(new FluidInfo.Builder("salt_water", 0xA189a5f5));
        // Vinegar Starter - Added 06/10/25
        add(new FluidInfo.Builder("vinegar_starter", 0xA152362D));
        // Vinegar Starter - Added 06/10/25
        add(new FluidInfo.Builder("thin_ink", 0xA1111111));
        // Chorus Juice - Added 10/16/25
        add(new FluidInfo.Builder("chorus_juice", 0xA1a900dc));
        // De-citrated Chorus Juice - Added 10/16/25
        add(new FluidInfo.Builder("decitrated_chorus_juice", 0xA1420496));
        // De-leaded De-citrated Chorus Juice - Added 10/16/25
        add(new FluidInfo.Builder("deleaded_decitrated_chorus_juice", 0xA1280060));
        // White Liquor - Added 12/29/25
        add(new FluidInfo.Builder("white_liquor", 0xA1d1b4a1));
        // Weak White Liquor - Added 12/29/25
        add(new FluidInfo.Builder("white_liquor_weak", 0xA1e0c9ba));
        // Black Liquor - Added 12/29/25
        add(new FluidInfo.Builder("black_liquor", 0xA14b2a13));
        // Weak Black Liquor - Added 12/29/25
        add(new FluidInfo.Builder("black_liquor_weak", 0xA17c4e2e));
        // Tall Oil - Added 12/29/25
        add(new FluidInfo.Builder("tall_oil", 0xA1371604));
        // Turpentine Vapor - Added 12/29/25
        add(new FluidInfo.Builder("turpentine_vapor", 0xA1280060));

        //OPA-Related Contaminated Fluid & Froth
        // Aluminum Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_aluminum", 0xA1342d25));
        // Aluminum-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_aluminum", 0xA1504732));

        // Scandium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_scandium", 0xA1594f20));
        // Scandium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_scandium", 0xA1736d3b));

        // Titanium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_titanium", 0xA129232b));
        // Titanium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_titanium", 0xA1554e4d));

        // Vanadium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_vanadium", 0xA1332b1f));
        // Vanadium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_vanadium", 0xA1514d3e));

        // Chromium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_chromium", 0xA1271e17));
        // Chromium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_chromium", 0xA14f4639));

        // Manganese Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_manganese", 0xA1392b1c));
        // Manganese-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_manganese", 0xA164563d));

        // Iron Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_iron", 0xA11c150d));
        // Iron-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_iron", 0xA13a3427));

        // Cobalt Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_cobalt", 0xA139325f));
        // Cobalt-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_cobalt", 0xA16d6586));

        // Nickel Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_nickel", 0xA130301c));
        // Nickel-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_nickel", 0xA1646243));

        // Copper Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_copper", 0xA1412d1f));
        // Copper-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_copper", 0xA1756046));

        // Zinc Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_zinc", 0xA14d4432));
        // Zinc-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_zinc", 0xA1796f53));

        // Gallium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_gallium", 0xA145403f));
        // Gallium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_gallium", 0xA1797367));

        // Yttrium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_yttrium", 0xA14a2d40));
        // Yttrium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_yttrium", 0xA17e5f68));

        // Zirconium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_zirconium", 0xA1534631));
        // Zirconium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_zirconium", 0xA1877958));

        // Niobium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_niobium", 0xA133221e));
        // Niobium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_niobium", 0xA15b4e39));

        // Molybdenum Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_molybdenum", 0xA1313133));
        // Molybdenum-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_molybdenum", 0xA16a675c));

        // Ruthenium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_ruthenium", 0xA1322822));
        // Ruthenium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_ruthenium", 0xA16b5e4b));

        // Rhodium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_rhodium", 0xA1372e24));
        // Rhodium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_rhodium", 0xA170644d));

        // Palladium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_palladium", 0xA1342121));
        // Palladium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_palladium", 0xA16c5749));

        // Silver Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_silver", 0xA14a4640));
        // Silver-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_silver", 0xA1827c69));

        // Cadmium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_cadmium", 0xA13e2019));
        // Cadmium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_cadmium", 0xA1775642));

        // Indium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_indium", 0xA138322a));
        // Indium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_indium", 0xA1716853));

        // Tin Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_tin", 0xA1262019));
        // Tin-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_tin", 0xA15e5642));

        // Hafnium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_hafnium", 0xA1252024));
        // Hafnium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_hafnium", 0xA15e564d));

        // Tantalum Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_tantalum", 0xA143201a));
        // Tantalum-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_tantalum", 0xA17c5642));

        // Tungsten Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_tungsten", 0xA11e1812));
        // Tungsten-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_tungsten", 0xA1564e3b));

        // Rhenium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_rhenium", 0xA117120c));
        // Rhenium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_rhenium", 0xA1514832));

        // Osmium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_osmium", 0xA13a4148));
        // Osmium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_osmium", 0xA1727771));

        // Iridium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_iridium", 0xA125284c));
        // Iridium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_iridium", 0xA15e5e75));

        // Platinum Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_platinum", 0xA14f4a44));
        // Platinum-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_platinum", 0xA188806d));

        // Gold Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_gold", 0xA14e3e19));
        // Gold-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_gold", 0xA1867442));

        // Thallium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_thallium", 0xA135251a));
        // Thallium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_thallium", 0xA16d5a43));

        // Lead Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_lead", 0xA125201f));
        // Lead-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_lead", 0xA15d5648));

        // Bismuth Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_bismuth", 0xA125362c));
        // Bismuth-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_bismuth", 0xA15d6c55));

        // Polonium Contaminated OPA - Added 10/27/25
        add(new FluidInfo.Builder("opa_polonium", 0xA117120c));
        // Polonium-Sourced Froth Layer - Added 10/27/25
        add(new FluidInfo.Builder("froth_opa_polonium", 0xA1504834));
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
            ITEMS.register(bucket.getId(), bucket::registerItem);
            ModBlocks.BLOCKS.register(info.getBlockId(), info.createBlock());
        }
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        FLUIDS.register(eventBus);
        FLUID_TYPES.register(eventBus);
    }

}