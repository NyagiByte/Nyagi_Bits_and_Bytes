package net.madelyn.nyagibits_bytes.item;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NyagiBits_Bytes.MOD_ID);

    public static void registerCreativeTab(String id, ResourceLocation icon, Utils.Tab tab){
        RegistryObject<CreativeModeTab> creativeTab =
                TABS.register("nyagibits_bytes_tab_"+id, () -> CreativeModeTab.builder()
                        .icon(() -> new ItemStack(Utils.fetchItem(icon)))
                        .title(Component.translatable("itemGroup.nyagibits_bytes_tab_"+id))
                        .displayItems((params, output) -> {
                            for(Item item : Utils.CREATIVE_CACHE.get(tab)) output.accept(item);
                        }).build());
    }

    static {
        registerCreativeTab("items", Utils.NBNB("livisite_alloy"), Utils.Tab.ITEMS);
        registerCreativeTab("blocks", Utils.NBNB("flake"), Utils.Tab.BLOCKS);
        registerCreativeTab("science", Utils.NBNB("lab_notebook"), Utils.Tab.SCIENCE);
        registerCreativeTab("schematics", Utils.NBNB("blank_blueprint"), Utils.Tab.SCHEMATICS);
        registerCreativeTab("minerals", Utils.NBNB("raw_hematite"), Utils.Tab.MINERALS);
        registerCreativeTab("biology", Utils.NBNB("stomach"), Utils.Tab.BIOLOGY);
        registerCreativeTab("chemicals", Utils.NBNB("sample_oleum"), Utils.Tab.CHEMICALS);
        registerCreativeTab("fluids", Utils.NBNB("bucket_of_hydrocarbon_tar"), Utils.Tab.FLUIDS);
        //NOTE: UNCOMMENT WHEN ACTUALLY ADDING STUFF
        //registerCreativeTab("elements", Utils.NBNB("sample_dcm"), Utils.Tab.ELEMENTS);
        registerCreativeTab("incomplete_sequence_items", Utils.NBNB("incomplete_controller"), Utils.Tab.SEQUENCE);
    }

    public static void register(IEventBus eventBus) { TABS.register(eventBus); }

}
