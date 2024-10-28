package net.madelyn.nyagibits_bytes.fluid;

import com.mojang.math.Vector3f;
import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
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

public class NewModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, NyagiBits_Bytes.MOD_ID);

    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation LAVA_STILL_RL = new ResourceLocation("block/lava_still");
    public static final ResourceLocation LAVA_FLOWING_RL = new ResourceLocation("block/lava_flow");

    private static final FluidInfo HYDROCARBON_TAR = new FluidInfo.Builder("hydrocarbon_tar_fluid", "flowing_hydrocarbon_tar", "hydrocarbon_tar_fluid")
            .setStillTexture(LAVA_STILL_RL)
            .setFlowingTexture(LAVA_FLOWING_RL)
            .setOverlayTexture(new ResourceLocation(NyagiBits_Bytes.MOD_ID, "misc/in_hydrocarbon_tar"))
            .setTint(0xff141414)
            .setFogColor(new Vector3f(1f / 255f, 1f / 255f, 1f/255f))
            .setFluidProperties(properties -> {
                properties.slopeFindDistance(2)
                .levelDecreasePerBlock(2)
                .block(() -> (LiquidBlock) Utils.fetchBlock(new ResourceLocation(NyagiBits_Bytes.MOD_ID, "hydrocarbon_tar_block")))
                .bucket(() -> Utils.fetchItem(new ResourceLocation(NyagiBits_Bytes.MOD_ID,"bucket_of_hydrocarbon_tar")));
            })
            .setFluidTypeProperties(properties -> {
                properties.lightLevel(2)
                .density(15)
                .viscosity(2)
                .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK);
            })
            .build();

    private static void registerFluid(FluidInfo info){
        FLUIDS.register(info.getSourceId(), info.getSourceFluid());
        FLUIDS.register(info.getFlowingId(), info.getFlowingFluid());
        FLUID_TYPES.register(info.getFluidTypeId(), info.getFluidType());
    }




    static {
        registerFluid(HYDROCARBON_TAR);
    }

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
        FLUID_TYPES.register(eventBus);
    }

}
