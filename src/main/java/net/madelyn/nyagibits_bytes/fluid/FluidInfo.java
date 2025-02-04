package net.madelyn.nyagibits_bytes.fluid;

import com.mojang.math.Vector3f;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import java.util.function.Consumer;
import java.util.function.Supplier;

//This class pulls all the info together to make everything needed to register a fluid.
//If you're looking for the default values, they're down there at the builder.
public class FluidInfo {
    //This is used to create the other IDs.
    private final String id;
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

    //All the info needs to be available at once. So we use a builder instead, defined below.
    public FluidInfo(Builder builder){
        this.id = builder.id;
        this.sourceId = builder.sourceId;
        this.flowingId = builder.flowingId;
        this.fluidTypeId = builder.fluidTypeId;
        this.fluidProps = builder.fluidProps;//More supplier fuckery, yay!
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
    //These 3 methods define the bucket item and the fluid block. We're going to register them here for convenience, outside of ModItems and ModBlocks
    public ItemInfo.Bucket createBucket(){
        return new ItemInfo.Bucket("bucket_of_"+id, () -> Utils.fetchFluid(Utils.NBNB(sourceId)));
    }
    public String getBlockId(){
        return id+"_block";
    }
    public Supplier<? extends LiquidBlock> createBlock(){
        return () -> new LiquidBlock(() -> (FlowingFluid) Utils.fetchFluid(Utils.NBNB(sourceId)), BlockBehaviour.Properties.copy(Blocks.WATER));
    }

    //Since we need to have a bunch of parameters available at once to build the fluid type and fluids, we first instantiate a builder.
    //This lets us structure the registry as seen in ModFluids and be able to tell what each field is.
    public static class Builder {
        //These must be present to instantiate the builder
        private final String id; //This is to build the other IDs
        private final int tintColor; //This used to be optional, but it really shouldn't be.
        //These are now generated on the fly
        private final String sourceId;
        private final String flowingId;
        private final String fluidTypeId;
        //These must be present, but might not be called, so they get default values.
        private ResourceLocation stillTexture = new ResourceLocation("block/water_still");
        private ResourceLocation flowingTexture = new ResourceLocation("block/water_flow");
        //This is now generated on the fly to be "nyagibits_bytes:misc/in_<fluidname>"
        //It can still be overwritten with the builder method.
        private ResourceLocation overlayTexture;
        //No one ever touched this. It can still be overwritten
        private Vector3f fogColor = new Vector3f(1f / 255f, 1f / 255f, 1f/255f);
        //Fluid properties and fluid type properties defaults.
        //Some of these might be a bit whack, especially density and viscosity, TODO: re-evaluate default values
        //If access to other properties is needed, use the old consumer methods for fluid props and fluid type props.
        private int slopeFindDistance = 3;
        private int levelDecreasePerBlock = 1;
        private int lightLevel = 2;
        private int density = 5;
        private int viscosity = 7;
        //More suppliers, wahoo
        private final Supplier<? extends LiquidBlock> blockSupplier;
        private final Supplier<? extends Item> bucketSupplier;

        private ForgeFlowingFluid.Properties fluidProps;
        private FluidType.Properties fluidTypeProps = FluidType.Properties.create();
        public Builder(String id, int tint){
            this.id = id;
            this.tintColor = tint;
            this.sourceId = id+"_fluid";
            this.flowingId = "flowing_"+id;
            this.fluidTypeId = sourceId;
            this.overlayTexture = new ResourceLocation("misc/in_"+id);
            blockSupplier = () -> (LiquidBlock) Utils.fetchBlock((Utils.NBNB(id+"_block")));
            bucketSupplier = () -> Utils.fetchItem(Utils.NBNB("bucket_of_"+id));
            //The bare minimum to create the properties instance, the rest can be added down the line.
            //We use suppliers to methods in Utils because...it's the best way i can think of.
            this.fluidProps = new ForgeFlowingFluid.Properties(
                    () -> Utils.fetchFluidType(Utils.NBNB(fluidTypeId)),
                    () -> Utils.fetchFluid(Utils.NBNB(sourceId)),
                    () -> Utils.fetchFluid(Utils.NBNB(flowingId))
            );
        }
        //This lets us do the properties ->{do stuff} in the registry. It's better than making builder function for each parameter.
        //It is now unused, but it's still here, if we need to access properties unaccounted for.
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
        public Builder setFogColor(Vector3f fog){
            this.fogColor = fog;
            return this;
        }
        public Builder setSlopeFindDistance(int d){
            this.slopeFindDistance = d;
            return this;
        }
        public Builder setLevelDecreasePerBlock(int l){
            this.levelDecreasePerBlock = l;
            return this;
        }
        //This is fluid type properties stuff. We only touch lightlevel, density and viscosity normally.
        public Builder setLightLevel(int l){
            this.lightLevel = l;
            return this;
        }
        public Builder setDensity(int d){
            this.density = d;
            return this;
        }
        public Builder setViscosity(int v){
            this.viscosity = v;
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
            fluidProps.levelDecreasePerBlock(levelDecreasePerBlock)
                    .slopeFindDistance(slopeFindDistance)
                    .block(blockSupplier)
                    .bucket(bucketSupplier);
            fluidTypeProps.lightLevel(lightLevel)
                    .density(density)
                    .viscosity(viscosity)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK);
            return new FluidInfo(this);
        }
    }


}
