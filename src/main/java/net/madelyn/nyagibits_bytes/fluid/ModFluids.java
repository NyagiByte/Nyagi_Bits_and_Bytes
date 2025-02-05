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
    Each FluidInfo.Builder creates everything necessary to register one fluid
    It builds all the parameters necessary to register a still fluid, a flowing fluid and a fluid type.
    Builder methods are available to set whichever properties are needed, but pretty much everything has a default value.
    For info on the default values, or the available builder methods, see the FluidInfo.Builder class.
     */

    private static final List<FluidInfo.Builder> FLUIDS_LIST = List.of(
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
        new FluidInfo.Builder("heavy_crude_oil", 0xA400000a)
                //Is this intentional?
                .setOverlayTexture(Utils.NBNB("misc/in_petroleum")),
        //Endstone-Leach Water - Added 12/12/24
        new FluidInfo.Builder("endstone_leach_water", 0xA1326496)
    );


    static {
        for(FluidInfo.Builder infoBuilder : FLUIDS_LIST){
            FluidInfo info = infoBuilder.build();
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
