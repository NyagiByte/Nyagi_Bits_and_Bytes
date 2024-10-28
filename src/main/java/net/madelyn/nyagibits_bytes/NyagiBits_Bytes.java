package net.madelyn.nyagibits_bytes;
/*------------------------------------------------------------------------------
--------------------------------------------------------------------------------*/

import com.mojang.logging.LogUtils;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.fluid.ModFluidTypes;
import net.madelyn.nyagibits_bytes.fluid.ModFluids;
import net.madelyn.nyagibits_bytes.fluid.NewModFluids;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NyagiBits_Bytes.MOD_ID)
public class NyagiBits_Bytes {
    public static final String MOD_ID = "nyagibits_bytes";
    private static final Logger LOGGER = LogUtils.getLogger();

    public NyagiBits_Bytes() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Registers adds items
        ModItems.register(modEventBus);
        //Register adds blocks
        ModBlocks.register(modEventBus);
        //Register adds fluids
        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        NewModFluids.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_RAW_WOOD_VINEGAR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_RAW_WOOD_VINEGAR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_PYROLIGNEOUS_ACID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_PYROLIGNEOUS_ACID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_ACETONE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_ACETONE.get(), RenderType.translucent());
        }
    }
}
