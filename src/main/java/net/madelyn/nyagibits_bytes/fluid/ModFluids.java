package net.madelyn.nyagibits_bytes.fluid;

import com.mojang.math.Vector3f;
import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.SoundAction;
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
    NOTE: The fluid block and fluid bucket should be registered in ModBlocks and ModItems respectively!
    The first block will be documented for reference, to add more fluids, copy-paste one block and change the values.
     */

    private static final List<FluidInfo> FLUIDS_LIST = List.of(
        //Hydrocarbon Tar - Added 6/25/24
        //Registry IDs in order of still fluid, flowing fluid and fluid type.
        //You will need the source fluid ID to register the block and bucket.
        new FluidInfo.Builder("hydrocarbon_tar_fluid", "flowing_hydrocarbon_tar", "hydrocarbon_tar_fluid")
                //The texture of still fluid (ResourceLocation)
                .setStillTexture(LAVA_STILL_RL)
                //The texture of flowing fluid (ResourceLocation)
                .setFlowingTexture(LAVA_FLOWING_RL)
                //The gui overlay when submerged (ResourceLocation)
                .setOverlayTexture(Utils.NBNB("misc/in_hydrocarbon_tar"))
                //The color of the fluid (This is an int, actually)
                .setTint(0xff141414)
                //The color of the fog when the camera is submerged. this is the default value and could be left out if needed.
                .setFogColor(new Vector3f(1f / 255f, 1f / 255f, 1f/255f))
                //Block of fluid properties needed to register the fluids themselves. There are more methods than shown here.
                .setFluidProperties(properties -> {
                    //Flow properties
                    properties.slopeFindDistance(2)
                            .levelDecreasePerBlock(2)
                            //These are the block and bucket registered in ModBlocks and ModItems
                            .block(() -> (LiquidBlock) Utils.fetchBlock(Utils.NBNB( "hydrocarbon_tar_block")))
                            .bucket(() -> Utils.fetchItem(Utils.NBNB("bucket_of_hydrocarbon_tar")));
                })
                //Block of Fluid Type properties. Yes, they are a different thing. Again, there's more methods than this.
                .setFluidTypeProperties(properties -> {
                    properties.lightLevel(2)
                            //I don't actually know what these do.
                            .density(15)
                            .viscosity(2)
                            //Yumby
                            .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK);
                })
                //Finally, this packages everything and returns the new FluidInfo object, ready to be processed.
                .build(),
        //Raw Wood Vinegar - Added 6/25/24
        new FluidInfo.Builder("raw_wood_vinegar_fluid", "flowing_raw_wood_vinegar", "raw_wood_vinegar_fluid")
                .setStillTexture(WATER_STILL_RL)
                .setFlowingTexture(WATER_FLOWING_RL)
                .setOverlayTexture(Utils.NBNB("misc/in_raw_wood_vinegar"))
                .setTint(0xC18a3a0a)
                .setFogColor(new Vector3f(1f / 255f, 1f / 255f, 1f/255f))
                .setFluidProperties(properties -> {
                    properties.slopeFindDistance(4)
                            .levelDecreasePerBlock(1)
                            .block(() -> (LiquidBlock) Utils.fetchBlock(Utils.NBNB("raw_wood_vinegar_block")))
                            .bucket(() -> Utils.fetchItem(Utils.NBNB("bucket_of_raw_wood_vinegar")));
                })
                .setFluidTypeProperties(properties -> {
                    properties.lightLevel(2)
                            .density(5)
                            .viscosity(5)
                            .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK);
                })
                .build(),
        //Pyroligneous Acid - Added 6/25/24
        new FluidInfo.Builder("pyroligneous_acid_fluid", "flowing_pyroligneous_acid", "pyroligneous_acid_fluid")
                .setStillTexture(WATER_STILL_RL)
                .setFlowingTexture(WATER_FLOWING_RL)
                .setOverlayTexture(Utils.NBNB("misc/in_pyroligneous_acid"))
                .setTint(0xA1be8d43)
                .setFogColor(new Vector3f(1f / 255f, 1f / 255f, 1f/255f))
                .setFluidProperties(properties -> {
                    properties.slopeFindDistance(4)
                            .levelDecreasePerBlock(1)
                            .block(() -> (LiquidBlock) Utils.fetchBlock(Utils.NBNB("pyroligneous_acid_block")))
                            .bucket(() -> Utils.fetchItem(Utils.NBNB("bucket_of_pyroligneous_acid")));
                })
                .setFluidTypeProperties(properties -> {
                    properties.lightLevel(2)
                            .density(5)
                            .viscosity(7)
                            .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK);
                })
                .build(),
        //Acetone - Added 6/25/24
        new FluidInfo.Builder("acetone_fluid", "flowing_acetone", "acetone_fluid")
                .setStillTexture(WATER_STILL_RL)
                .setFlowingTexture(WATER_FLOWING_RL)
                .setOverlayTexture(Utils.NBNB("misc/in_acetone"))
                .setTint(0xA1bbb9b2)
                .setFogColor(new Vector3f(1f / 255f, 1f / 255f, 1f/255f))
                .setFluidProperties(properties -> {
                    properties.slopeFindDistance(3)
                            .levelDecreasePerBlock(1)
                            .block(() -> (LiquidBlock) Utils.fetchBlock(Utils.NBNB("acetone_block")))
                            .bucket(() -> Utils.fetchItem(Utils.NBNB("bucket_of_acetone")));
                })
                .setFluidTypeProperties(properties -> {
                    properties.lightLevel(2)
                            .density(5)
                            .viscosity(7)
                            .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK);
                })
                .build(),
        //Gemstone Polish - Added 11/15/24
        new FluidInfo.Builder("gemstone_polish_fluid", "flowing_gemstone_polish", "gemstone_polish_fluid")
                .setStillTexture(WATER_STILL_RL)
                .setFlowingTexture(WATER_FLOWING_RL)
                .setOverlayTexture(Utils.NBNB("misc/in_gemstone_polish"))
                .setTint(0xA100b2a9)
                .setFogColor(new Vector3f(1f / 255f, 1f / 255f, 1f/255f))
                .setFluidProperties(properties -> {
                    properties.slopeFindDistance(3)
                            .levelDecreasePerBlock(1)
                            .block(() -> (LiquidBlock) Utils.fetchBlock(Utils.NBNB("gemstone_polish_block")))
                            .bucket(() -> Utils.fetchItem(Utils.NBNB("bucket_of_gemstone_polish")));
                })
                .setFluidTypeProperties(properties -> {
                    properties.lightLevel(2)
                            .density(5)
                            .viscosity(7)
                            .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK);
                })
                .build(),
        //Molten Skystone - Added 11/15/24
        new FluidInfo.Builder("molten_skystone_fluid", "flowing_molten_skystone", "molten_skystone_fluid")
                .setStillTexture(LAVA_STILL_RL)
                .setFlowingTexture(LAVA_FLOWING_RL)
                .setOverlayTexture(Utils.NBNB("misc/in_molten_skystone"))
                .setTint(0xff001400)
                .setFogColor(new Vector3f(1f / 255f, 1f / 255f, 1f/255f))
                .setFluidProperties(properties -> {
                    properties.slopeFindDistance(3)
                            .levelDecreasePerBlock(1)
                            .block(() -> (LiquidBlock) Utils.fetchBlock(Utils.NBNB("molten_skystone_block")))
                            .bucket(() -> Utils.fetchItem(Utils.NBNB("bucket_of_molten_skystone")));
                })
                .setFluidTypeProperties(properties -> {
                    properties.lightLevel(2)
                            .density(5)
                            .viscosity(7)
                            .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK);
                })
                .build(),
        //Heptafluoropropane - Added 11/29/24
        new FluidInfo.Builder("heptafluoropropane_fluid", "flowing_heptafluoropropane", "heptafluoropropane_fluid")
                .setStillTexture(WATER_STILL_RL)
                .setFlowingTexture(WATER_FLOWING_RL)
                .setOverlayTexture(Utils.NBNB("misc/in_heptafluoropropane"))
                .setTint(0xA145ff64)
                .setFogColor(new Vector3f(1f / 255f, 1f / 255f, 1f/255f))
                .setFluidProperties(properties -> {
                    properties.slopeFindDistance(3)
                            .levelDecreasePerBlock(1)
                            .block(() -> (LiquidBlock) Utils.fetchBlock(Utils.NBNB("heptafluoropropane_block")))
                            .bucket(() -> Utils.fetchItem(Utils.NBNB("bucket_of_heptafluoropropane")));
                })
                .setFluidTypeProperties(properties -> {
                    properties.lightLevel(2)
                            .density(5)
                            .viscosity(7)
                            .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK);
                })
                .build(),
        //Amorphous Cellulose - Added 11/29/24
        new FluidInfo.Builder("amorphous_cellulose_fluid", "flowing_amorphous_cellulose", "amorphous_cellulose_fluid")
                .setStillTexture(WATER_STILL_RL)
                .setFlowingTexture(WATER_FLOWING_RL)
                .setOverlayTexture(Utils.NBNB("misc/in_amorphous_cellulose"))
                .setTint(0xA4b6432)
                .setFogColor(new Vector3f(1f / 255f, 1f / 255f, 1f/255f))
                .setFluidProperties(properties -> {
                    properties.slopeFindDistance(3)
                            .levelDecreasePerBlock(1)
                            .block(() -> (LiquidBlock) Utils.fetchBlock(Utils.NBNB("amorphous_cellulose_block")))
                            .bucket(() -> Utils.fetchItem(Utils.NBNB("bucket_of_amorphous_cellulose")));
                })
                .setFluidTypeProperties(properties -> {
                    properties.lightLevel(2)
                            .density(5)
                            .viscosity(7)
                            .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK);
                })
                .build()

    );


    static {
        for(FluidInfo info : FLUIDS_LIST){
            FLUIDS.register(info.getSourceId(), info.getSourceFluid());
            FLUIDS.register(info.getFlowingId(), info.getFlowingFluid());
            FLUID_TYPES.register(info.getFluidTypeId(), info.getFluidType());
        }
    }

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
        FLUID_TYPES.register(eventBus);
    }

}
