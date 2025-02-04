package net.madelyn.nyagibits_bytes.fluid;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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
    Each FluidInfo.Builder creates everything necessary to register one (1) fluid. Fun, right?
    It builds all the parameters necessary to register a still fluid, a flowing fluid and a fluid type.
    TODO: List out default values here, since now FluidInfo takes care of a LOT of defaults
     */

    private static final List<FluidInfo> FLUIDS_LIST = List.of(
        //Hydrocarbon Tar - Added 6/25/24
        new FluidInfo.Builder("hydrocarbon_tar")
                //The texture of still fluid (ResourceLocation)
                .setStillTexture(LAVA_STILL_RL)
                //The texture of flowing fluid (ResourceLocation)
                .setFlowingTexture(LAVA_FLOWING_RL)
                .setTint(0xff141414)
                .setSlopeFindDistance(2)
                .setLevelDecreasePerBlock(2)
                .setDensity(15)
                .setViscosity(2)
                .build(),
        //Raw Wood Vinegar - Added 6/25/24
        new FluidInfo.Builder("raw_wood_vinegar")
                .setTint(0xC18a3a0a)
                .setSlopeFindDistance(4)
                .setViscosity(5)
                .build(),
        //Pyroligneous Acid - Added 6/25/24
        new FluidInfo.Builder("pyroligneous_acid")
                .setTint(0xA1be8d43)
                .setSlopeFindDistance(4)
                .build(),
        //Acetone - Added 6/25/24
        new FluidInfo.Builder("acetone")
                .setTint(0xA1bbb9b2)
                .build(),
        //Gemstone Polish - Added 11/15/24
        new FluidInfo.Builder("gemstone_polish")
                .setTint(0xA100b2a9)
                .build(),
        //Molten Skystone - Added 11/15/24
        new FluidInfo.Builder("molten_skystone")
                .setStillTexture(LAVA_STILL_RL)
                .setFlowingTexture(LAVA_FLOWING_RL)
                .setTint(0xff001400)
                .build(),
        //Heptafluoropropane - Added 11/29/24
        new FluidInfo.Builder("heptafluoropropane")
                .setTint(0xA145ff64)
                .build(),
        //Amorphous Cellulose - Added 11/29/24
        new FluidInfo.Builder("amorphous_cellulose")
                .setTint(0xA4b6432)
                .build(),
        //Lithium-Alumino Solution - Added 12/12/24
        new FluidInfo.Builder("lithium_alumino_solution")
                .setTint(0xA1c8fa)
                .build(),
        //Tailings - Added 12/12/24
        new FluidInfo.Builder("tailings")
                .setTint(0xA4644b32)
                .build(),
        //Petroleum - Added 12/12/24
        new FluidInfo.Builder("petroleum")
                .setTint(0xA4c89600)
                .build(),
        //Heavy Crude Oil - Added 12/12/24
        new FluidInfo.Builder("heavy_crude_oil")
                //Is this intentional?
                .setOverlayTexture(Utils.NBNB("misc/in_petroleum"))
                .setTint(0xA400000a)
                .build(),
        //Endstone-Leach Water - Added 12/12/24
        new FluidInfo.Builder("endstone_leach_water")
                .setTint(0xA1326496)
                .build()
    );


    static {
        for(FluidInfo info : FLUIDS_LIST){
            FLUIDS.register(info.getSourceId(), info.getSourceFluid());
            FLUIDS.register(info.getFlowingId(), info.getFlowingFluid());
            FLUID_TYPES.register(info.getFluidTypeId(), info.getFluidType());
            ItemInfo.Bucket bucket = info.createBucket();
            ModItems.ITEMS.register(bucket.getId(), bucket::registerItem);
            ModBlocks.BLOCKS.register(info.getBlockId(), info.createBlock());
        }
    }

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
        FLUID_TYPES.register(eventBus);
    }

}
