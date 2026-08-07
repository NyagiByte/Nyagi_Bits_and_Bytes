package net.madelyn.nyagibits_bytes;
/*------------------------------------------------------------------------------
--------------------------------------------------------------------------------*/

import com.mojang.logging.LogUtils;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.chemical.ModChemicals;
import net.madelyn.nyagibits_bytes.enchant.ModEnchantments;
import net.madelyn.nyagibits_bytes.fluid.ModFluids;
import net.madelyn.nyagibits_bytes.item.ModCreativeModeTab;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.ComposterBlock;
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
    public static final Logger LOGGER = LogUtils.getLogger();



    public NyagiBits_Bytes(FMLJavaModLoadingContext ctx) {
        IEventBus modEventBus = ctx.getModEventBus(); //Oh the irony, fixing this by referencing 1.20 Immersive Petroleum

        //Registers adds items
        ModItems.register(modEventBus);
        //Register adds blocks
        ModBlocks.register(modEventBus);
        //Register adds fluids
        ModFluids.register(modEventBus);
        //Register adds chemical item and fluids
        ModChemicals.register(modEventBus);
        //Register adds creative mode tabs
        ModCreativeModeTab.register(modEventBus);
        //Register adds new enchantments
        ModEnchantments.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        /*
        NOTE: the chance is not intended to go past 1f.
        Overloading the change like this is NOT what makes the insta-fill work.
        That's handled by the "nyagibits_bytes:max_fills_composter" item tag.
        This is to make EMI display it as "700%"
         */
        makeCompostable("inoculated_wood_pile", 7f);
        makeCompostable("mixed_seeds", 0.5f);
    }

    private static void makeCompostable(String id, float chance){
        Item item = Utils.fetchItem(Utils.NBNB(id));
        if (item == Items.BARRIER){
            NyagiBits_Bytes.LOGGER.error("Attempted to make an invalid item compostable: {}", id);
            return;
        }
        ComposterBlock.COMPOSTABLES.put(item, chance);
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(Utils.fetchFluid(Utils.NBNB("raw_wood_vinegar_fluid")), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(Utils.fetchFluid(Utils.NBNB("flowing_raw_wood_vinegar")), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(Utils.fetchFluid(Utils.NBNB("pyroligneous_acid_fluid")), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(Utils.fetchFluid(Utils.NBNB("flowing_pyroligneous_acid")), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(Utils.fetchFluid(Utils.NBNB("acetone_fluid")), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(Utils.fetchFluid(Utils.NBNB("flowing_acetone")), RenderType.translucent());
        }
    }
}
