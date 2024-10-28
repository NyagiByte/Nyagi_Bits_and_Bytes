package net.madelyn.nyagibits_bytes.fluid;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.item.ModCreativeModeTab;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, NyagiBits_Bytes.MOD_ID);

    //Hydrocarbon Tar
    /*public static final RegistryObject<FlowingFluid> SOURCE_HYDROCARBON_TAR = FLUIDS.register("hydrocarbon_tar_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.HYDROCARBON_TAR_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HYDROCARBON_TAR = FLUIDS.register("flowing_hydrocarbon_tar",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.HYDROCARBON_TAR_FLUID_PROPERTIES));*/

    //Raw Wood Vinegar
    public static final RegistryObject<FlowingFluid> SOURCE_RAW_WOOD_VINEGAR = FLUIDS.register("raw_wood_vinegar_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.RAW_WOOD_VINEGAR_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_RAW_WOOD_VINEGAR = FLUIDS.register("flowing_raw_wood_vinegar",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.RAW_WOOD_VINEGAR_FLUID_PROPERTIES));

    //Pyroligneous Acid
    public static final RegistryObject<FlowingFluid> SOURCE_PYROLIGNEOUS_ACID = FLUIDS.register("pyroligneous_acid_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.PYROLIGNEOUS_ACID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_PYROLIGNEOUS_ACID = FLUIDS.register("flowing_pyroligneous_acid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.PYROLIGNEOUS_ACID_FLUID_PROPERTIES));

    //Acetone
    public static final RegistryObject<FlowingFluid> SOURCE_ACETONE = FLUIDS.register("acetone_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.ACETONE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ACETONE = FLUIDS.register("flowing_acetone",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ACETONE_FLUID_PROPERTIES));

    //---------------------------------------------------------------------------------------------------------------------------

    //Hydrocarbon Tar - Added 6/25/24
  /*  public static final ForgeFlowingFluid.Properties HYDROCARBON_TAR_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.HYDROCARBON_TAR_FLUID_TYPE, SOURCE_HYDROCARBON_TAR, FLOWING_HYDROCARBON_TAR)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.HYDROCARBON_TAR_BLOCK)
            .bucket(() -> Utils.fetchItem(new ResourceLocation(NyagiBits_Bytes.MOD_ID,"bucket_of_hydrocarbon_tar")));*/


    //Raw Wood Vinegar - Added 6/25/24
    public static final ForgeFlowingFluid.Properties RAW_WOOD_VINEGAR_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.RAW_WOOD_VINEGAR_FLUID_TYPE, SOURCE_RAW_WOOD_VINEGAR, FLOWING_RAW_WOOD_VINEGAR)
            .slopeFindDistance(4)
            .levelDecreasePerBlock(1)
            .block(ModBlocks.RAW_WOOD_VINEGAR_BLOCK)
            .bucket(() -> Utils.fetchItem(new ResourceLocation(NyagiBits_Bytes.MOD_ID,"bucket_of_raw_wood_vinegar")));

    //Pyroligneous Acid - Added 6/25/24
    public static final ForgeFlowingFluid.Properties PYROLIGNEOUS_ACID_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.PYROLIGNEOUS_ACID_FLUID_TYPE, SOURCE_PYROLIGNEOUS_ACID, FLOWING_PYROLIGNEOUS_ACID)
            .slopeFindDistance(4)
            .levelDecreasePerBlock(1)
            .block(ModBlocks.PYROLIGNEOUS_ACID_BLOCK)
            .bucket(() -> Utils.fetchItem(new ResourceLocation(NyagiBits_Bytes.MOD_ID,"bucket_of_pyroligneous_acid")));

    //Acetone - Added 6/25/24
    public static final ForgeFlowingFluid.Properties ACETONE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.ACETONE_FLUID_TYPE, SOURCE_ACETONE, FLOWING_ACETONE)
            .slopeFindDistance(3)
            .levelDecreasePerBlock(1)
            .block(ModBlocks.ACETONE_BLOCK)
            .bucket(() -> Utils.fetchItem(new ResourceLocation(NyagiBits_Bytes.MOD_ID,"bucket_of_acetone")));


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
