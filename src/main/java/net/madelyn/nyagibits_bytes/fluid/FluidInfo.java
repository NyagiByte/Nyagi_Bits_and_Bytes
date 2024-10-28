package net.madelyn.nyagibits_bytes.fluid;

import com.mojang.math.Vector3f;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import java.util.function.Consumer;
import java.util.function.Supplier;

//TODO: Slather the whole thing in comments
public class FluidInfo {
    private final String sourceId;
    private final String flowingId;
    private final String fluidTypeId;
    private final Supplier<? extends Fluid> sourceFluid;
    private final Supplier<? extends Fluid> flowingFluid;
    private ForgeFlowingFluid.Properties fluidProps;
    private final Supplier<? extends FluidType> fluidType;

    public FluidInfo(Builder builder){
        this.sourceId = builder.sourceId;
        this.flowingId = builder.flowingId;
        this.fluidTypeId = builder.fluidTypeId;
        this.fluidProps = builder.fluidProps;

        this.sourceFluid = () -> new ForgeFlowingFluid.Source(fluidProps);
        this.flowingFluid = () -> new ForgeFlowingFluid.Flowing(fluidProps);

        this.fluidType = () -> new BaseFluidType(
                builder.stillTexture,
                builder.flowingTexture,
                builder.overlayTexture,
                builder.tintColor,
                builder.fogColor,
                builder.fluidTypeProps
        );
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

    public Supplier<? extends Fluid> getSourceFluid(){
        return sourceFluid;
    }
    public Supplier<? extends Fluid> getFlowingFluid(){
        return flowingFluid;
    }
    public Supplier<? extends FluidType> getFluidType(){
        return fluidType;
    }

    public static class Builder {
        private final String sourceId;
        private final String flowingId;
        private final String fluidTypeId;
        private ResourceLocation stillTexture = new ResourceLocation("block/water_still");
        private ResourceLocation flowingTexture = new ResourceLocation("block/water_flow");
        private ResourceLocation overlayTexture = new ResourceLocation("block/water_still");
        private int tintColor = 0xffffffff;
        private Vector3f fogColor = new Vector3f(1f / 255f, 1f / 255f, 1f/255f);
        private ForgeFlowingFluid.Properties fluidProps;
        private FluidType.Properties fluidTypeProps = FluidType.Properties.create();
        public Builder(String source, String flowing, String type){
            this.sourceId = source;
            this.flowingId = flowing;
            this.fluidTypeId = type;
            this.fluidProps = new ForgeFlowingFluid.Properties(
                    () -> Utils.fetchFluidType(Utils.NBNB(fluidTypeId)),
                    () -> Utils.fetchFluid(Utils.NBNB(sourceId)),
                    () -> Utils.fetchFluid(Utils.NBNB(flowingId))
            );
        }

        public Builder setFluidProperties(Consumer<ForgeFlowingFluid.Properties> props){
            props.accept(fluidProps);
            return this;
        }

        public Builder setStillTexture(ResourceLocation tex){
            this.stillTexture = tex;
            return this;
        }
        public Builder setFlowingTexture(ResourceLocation tex){
            this.flowingTexture = tex;
            return this;
        }
        public Builder setOverlayTexture(ResourceLocation tex){
            this.overlayTexture = tex;
            return this;
        }
        public Builder setTint(int tint){
            this.tintColor = tint;
            return this;
        }
        public Builder setFogColor(Vector3f fog){
            this.fogColor = fog;
            return this;
        }
        public Builder setFluidTypeProperties(Consumer<FluidType.Properties> props){
            props.accept(fluidTypeProps);
            return this;
        }
        public FluidInfo build(){
            return new FluidInfo(this);
        }
    }


}
