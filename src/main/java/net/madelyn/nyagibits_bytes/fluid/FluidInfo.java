package net.madelyn.nyagibits_bytes.fluid;

import com.mojang.math.Vector3f;
import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class FluidInfo {
    private final String sourceId;
    private final String flowingId;
    private final String fluidTypeId;
    private final Fluid sourceFluid;
    private final Fluid flowingFluid;
    private ResourceLocation stillTexture = new ResourceLocation("block/water_still");
    private ResourceLocation flowingTexture = new ResourceLocation("block/water_flow");
    private ResourceLocation overlayTexture = new ResourceLocation("block/water_still");
    private int tintColor = 0xffffffff;
    private Vector3f fogColor = new Vector3f(1f / 255f, 1f / 255f, 1f/255f);
    private FluidType.Properties typeProps = FluidType.Properties.create();
    private ForgeFlowingFluid.Properties fluidProps;
    private BaseFluidType fluidType;

    public FluidInfo(String sourceId, String flowingId, String fluidTypeId, BaseFluidType fluidType){
        this.sourceId = sourceId;
        this.flowingId = flowingId;
        this.fluidTypeId = fluidTypeId;
        this.fluidProps = new ForgeFlowingFluid.Properties(this::getFluidType, this::getSourceFluid, this::getFlowingFluid);

        sourceFluid = new ForgeFlowingFluid.Source(fluidProps);
        flowingFluid = new ForgeFlowingFluid.Flowing(fluidProps);
    }

    public String getSourceId(){
        return sourceId;
    }
    public String getFlowingId(){
        return flowingId;
    }
    public String getFluidTypeId(){
        return fluidTypeId;
    }

    public Fluid getSourceFluid(){
        return sourceFluid;
    }
    public Fluid getFlowingFluid(){
        return flowingFluid;
    }
    public BaseFluidType createFluidType(){
        return new BaseFluidType(stillTexture, flowingTexture, overlayTexture, tintColor, fogColor, typeProps)
    }
    public BaseFluidType getFluidType(){
        return (BaseFluidType) ForgeRegistries.FLUID_TYPES.get().getValue(new ResourceLocation(NyagiBits_Bytes.MOD_ID, fluidTypeId));
    }

    public FluidInfo slopeFindDistance(int dist){
       this.fluidProps.slopeFindDistance(dist);
        return this;
    }
    public FluidInfo levelDecreasePerBlock(int dec){
        this.fluidProps.levelDecreasePerBlock(dec);
        return this;
    }
    public FluidInfo block(Supplier<? extends LiquidBlock> block){
        this.fluidProps.block(block);
        return this;
    }
    public FluidInfo bucket(Supplier<? extends Item> bucket){
        this.fluidProps.bucket(bucket);
        return this;
    }
    public FluidInfo lightLevel(int light){
        this.typeProps.lightLevel(light);
        return this;
    }
    public FluidInfo density(int density){
        this.typeProps.density(density);
        return this;
    }
    public FluidInfo viscosity(int visc){
        this.typeProps.viscosity(visc);
        return this;
    }
    public FluidInfo sound(SoundAction action, SoundEvent event){
        this.typeProps.sound(action, event);
        return this;
    }



}
