package net.madelyn.nyagibits_bytes.event;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.content.item.NBNBItem;
import net.madelyn.nyagibits_bytes.registry.ModRegistries;
import net.madelyn.nyagibits_bytes.content.block.TintedBlock;
import net.madelyn.nyagibits_bytes.content.block.TintedBlockItem;
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
        ModRegistries.ITEMS.getEntries().stream().map(RegistryObject::get).toList().forEach(item -> {
            if(item instanceof TintedBlockItem tinted) e.register(tinted::getColor, tinted);
            if(item instanceof NBNBItem nbnbItem && nbnbItem.getTraits().contains(NBNBItem.ItemTraits.IS_TINTED))
                e.register(nbnbItem::getColor, nbnbItem);
            if(item instanceof BucketItem bucket) e.register(new DynamicFluidContainerModel.Colors(), bucket);
        });
    }

    @SubscribeEvent
    public static void onBlockColorHandlerEvent(RegisterColorHandlersEvent.Block e){
        ModRegistries.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(block -> block instanceof TintedBlock tinted).map(block -> (TintedBlock) block).toList().forEach(tintedBlock -> {
            e.register(tintedBlock::getColor, tintedBlock);
        });
    }

}
