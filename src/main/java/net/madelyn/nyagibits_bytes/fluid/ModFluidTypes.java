package net.madelyn.nyagibits_bytes.fluid;

import com.mojang.math.Vector3f;
import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation SOAP_OVERLAY_RL = new ResourceLocation(NyagiBits_Bytes.MOD_ID, "misc/in_soap_water");

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, NyagiBits_Bytes.MOD_ID);

    public static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, SOAP_OVERLAY_RL, 0xA1E038D0, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }
    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
