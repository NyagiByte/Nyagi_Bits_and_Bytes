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

//TODO: Document the post-refactoring process
public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, NyagiBits_Bytes.MOD_ID);

    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation LAVA_STILL_RL = new ResourceLocation("block/lava_still");
    public static final ResourceLocation LAVA_FLOWING_RL = new ResourceLocation("block/lava_flow");

    private static final List<FluidInfo> FLUIDS_LIST = List.of(
        //Hydrocarbon Tar - Added 6/25/24
        new FluidInfo.Builder("hydrocarbon_tar_fluid", "flowing_hydrocarbon_tar", "hydrocarbon_tar_fluid")
                .setStillTexture(LAVA_STILL_RL)
                .setFlowingTexture(LAVA_FLOWING_RL)
                .setOverlayTexture(Utils.NBNB("misc/in_hydrocarbon_tar"))
                .setTint(0xff141414)
                .setFogColor(new Vector3f(1f / 255f, 1f / 255f, 1f/255f))
                .setFluidProperties(properties -> {
                    properties.slopeFindDistance(2)
                            .levelDecreasePerBlock(2)
                            .block(() -> (LiquidBlock) Utils.fetchBlock(Utils.NBNB( "hydrocarbon_tar_block")))
                            .bucket(() -> Utils.fetchItem(Utils.NBNB("bucket_of_hydrocarbon_tar")));
                })
                .setFluidTypeProperties(properties -> {
                    properties.lightLevel(2)
                            .density(15)
                            .viscosity(2)
                            .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK);
                })
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
