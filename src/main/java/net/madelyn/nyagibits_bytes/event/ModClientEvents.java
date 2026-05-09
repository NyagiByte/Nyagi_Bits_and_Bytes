package net.madelyn.nyagibits_bytes.event;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.block.TintedBlock;
import net.madelyn.nyagibits_bytes.block.TintedBlockItem;
import net.madelyn.nyagibits_bytes.chemical.ModChemicals;
import net.madelyn.nyagibits_bytes.fluid.ModFluids;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.madelyn.nyagibits_bytes.item.custom.ChemicalItem;
import net.minecraft.world.item.BucketItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.model.DynamicFluidContainerModel;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT, modid = NyagiBits_Bytes.MOD_ID)
public class ModClientEvents {

    @SubscribeEvent
    public static void onItemColorHandlerEvent(RegisterColorHandlersEvent.Item e){
        ModItems.ITEMS.getEntries().stream().map(RegistryObject::get).filter(item -> item instanceof TintedBlockItem block).map(block -> (TintedBlockItem) block)
                        .toList().forEach(tintedBlockItem -> {
                            e.register(tintedBlockItem::getColor, tintedBlockItem);
                        });
        ModChemicals.ITEMS.getEntries().stream().map(RegistryObject::get).map(item -> (ChemicalItem) item).toList().forEach(item -> {
            e.register(item::getColor, item);
        });
        ModFluids.ITEMS.getEntries().stream().map(RegistryObject::get).map(item -> (BucketItem) item).toList().forEach(bucket -> {
            e.register(new DynamicFluidContainerModel.Colors(), bucket);
        });
    }

    @SubscribeEvent
    public static void onBlockColorHandlerEvent(RegisterColorHandlersEvent.Block e){
        ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(block -> block instanceof TintedBlock tinted).map(block -> (TintedBlock) block).toList().forEach(tintedBlock -> {
            e.register(tintedBlock::getColor, tintedBlock);
        });
    }

}
