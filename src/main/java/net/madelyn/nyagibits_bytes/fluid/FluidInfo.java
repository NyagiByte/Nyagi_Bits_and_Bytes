package net.madelyn.nyagibits_bytes.fluid;

import com.mojang.math.Vector3f;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import java.util.function.Consumer;
import java.util.function.Supplier;


public class FluidInfo {
    //These will be the registry IDs
    private final String sourceId;
    private final String flowingId;
    private final String fluidTypeId;

    //This is to create the fluids themselves
    private ForgeFlowingFluid.Properties fluidProps;

    //These are the actual objects that will be registered.
    //Or at least suppliers for them. God i hate fluid suppliers.
    private final Supplier<? extends Fluid> sourceFluid;
    private final Supplier<? extends Fluid> flowingFluid;
    private final Supplier<? extends FluidType> fluidType;

    //See the builder class below
    public FluidInfo(Builder builder){
        this.sourceId = builder.sourceId;
        this.flowingId = builder.flowingId;
        this.fluidTypeId = builder.fluidTypeId;
        this.fluidProps = builder.fluidProps;
        //More supplier fuckery, yay!
        this.sourceFluid = () -> new ForgeFlowingFluid.Source(fluidProps);
        this.flowingFluid = () -> new ForgeFlowingFluid.Flowing(fluidProps);
        //This is part of why we use a builder. These 6 need to be available all at once.
        //The constructor would be massive and hard to read otherwise.
        this.fluidType = () -> new BaseFluidType(
                builder.stillTexture,
                builder.flowingTexture,
                builder.overlayTexture,
                builder.tintColor,
                builder.fogColor,
                builder.fluidTypeProps
        );
    }
    //These getters are used in the actual registry process.
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

    //Since we need to have a bunch of parameters available at once to build the fluid type and fluids, we first instantiate a builder.
    //This lets us structure the registry as seen in ModFluids and be able to tell what each field is.
    public static class Builder {
        //These must be present to instantiate the builder
        private final String sourceId;
        private final String flowingId;
        private final String fluidTypeId;
        //These must be present, but might not be called, so they get default values.
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
            //The bare minimum to create the properties instance, the rest can be added down the line.
            //We use suppliers to methods in Utils because...it's the best way i can think of.
            this.fluidProps = new ForgeFlowingFluid.Properties(
                    () -> Utils.fetchFluidType(Utils.NBNB(fluidTypeId)),
                    () -> Utils.fetchFluid(Utils.NBNB(sourceId)),
                    () -> Utils.fetchFluid(Utils.NBNB(flowingId))
            );
        }
        //This lets us do the properties ->{do stuff} in the registry. It's better than making builder function for each parameter.
        public Builder setFluidProperties(Consumer<ForgeFlowingFluid.Properties> props){
            props.accept(fluidProps);
            return this;
        }
        //Generic builder methods. doing it this way lets us chain them easily.
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
        //see setFluidProperties()
        public Builder setFluidTypeProperties(Consumer<FluidType.Properties> props){
            props.accept(fluidTypeProps);
            return this;
        }
        //When the builder is instantiated it has all the bare minimum properties (including default values)
        //needed to properly create a FluidInfo
        public FluidInfo build(){
            return new FluidInfo(this);
        }
    }


}
