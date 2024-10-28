package net.madelyn.nyagibits_bytes.fluid;

import com.mojang.math.Vector3f;
import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation LAVA_STILL_RL = new ResourceLocation("block/lava_still");
    public static final ResourceLocation LAVA_FLOWING_RL = new ResourceLocation("block/lava_flow");
    public static final ResourceLocation HYDROCARBON_TAR_OVERLAY_RL = new ResourceLocation(NyagiBits_Bytes.MOD_ID, "misc/in_hydrocarbon_tar");
    public static final ResourceLocation RAW_WOOD_VINEGAR_OVERLAY_RL = new ResourceLocation(NyagiBits_Bytes.MOD_ID, "misc/in_raw_wood_vinegar");
    public static final ResourceLocation PYROLIGNEOUS_ACID_OVERLAY_RL = new ResourceLocation(NyagiBits_Bytes.MOD_ID, "misc/in_pyroligneous_acid");
    public static final ResourceLocation ACETONE_OVERLAY_RL = new ResourceLocation(NyagiBits_Bytes.MOD_ID, "misc/in_acetone");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, NyagiBits_Bytes.MOD_ID);

    //Hydrocarbon Tar - Added 6/25/24
    /*public static final RegistryObject<FluidType> HYDROCARBON_TAR_FLUID_TYPE = FLUID_TYPES.register("hydrocarbon_tar_fluid",
            () -> new BaseFluidType(
                    LAVA_STILL_RL,
                    LAVA_FLOWING_RL,
                    HYDROCARBON_TAR_OVERLAY_RL,
                    0xff141414,
                    new Vector3f(1f / 255f, 1f / 255f, 1f/255f),
                    FluidType.Properties.create()
                            .lightLevel(2)
                            .density(15)
                            .viscosity(2)
                            .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)
            )
    );*/

    //Raw Wood Vinegar - Added 6/25/24
    public static final RegistryObject<FluidType> RAW_WOOD_VINEGAR_FLUID_TYPE = FLUID_TYPES.register("raw_wood_vinegar_fluid",
            () -> new BaseFluidType(
                    WATER_STILL_RL,
                    WATER_FLOWING_RL,
                    RAW_WOOD_VINEGAR_OVERLAY_RL,
                    0xC18a3a0a,
                    new Vector3f(1f / 255f, 1f / 255f, 1f/255f),
                    FluidType.Properties.create()
                            .lightLevel(2)
                            .density(5)
                            .viscosity(5)
                            .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)
            )
    );

    //Pyroligneous Acid - Added 6/25/24
    public static final RegistryObject<FluidType> PYROLIGNEOUS_ACID_FLUID_TYPE = FLUID_TYPES.register("pyroligneous_acid_fluid",
            () -> new BaseFluidType(
                    WATER_STILL_RL,
                    WATER_FLOWING_RL,
                    PYROLIGNEOUS_ACID_OVERLAY_RL,
                    0xA1be8d43,
                    new Vector3f(1f / 255f, 1f / 255f, 1f/255f),
                    FluidType.Properties.create()
                            .lightLevel(2)
                            .density(5)
                            .viscosity(7)
                            .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)
            )
    );

    //Acetone - Added 6/25/24
    public static final RegistryObject<FluidType> ACETONE_FLUID_TYPE = FLUID_TYPES.register("acetone_fluid",
            () -> new BaseFluidType(
                    WATER_STILL_RL,
                    WATER_FLOWING_RL,
                    ACETONE_OVERLAY_RL,
                    0xA1bbb9b2,
                    new Vector3f(1f / 255f, 1f / 255f, 1f/255f),
                    FluidType.Properties.create()
                            .lightLevel(2)
                            .density(5)
                            .viscosity(7)
                            .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)
            )
    );


    public static void register(IEventBus eventBus){
        FLUID_TYPES.register(eventBus);
    }
}
