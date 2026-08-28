package net.madelyn.nyagibits_bytes.registry.categories;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.registry.ModRegistries;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTab {

    public static void registerCreativeTab(String id, ResourceLocation icon, Utils.Tab tab){
        RegistryObject<CreativeModeTab> creativeTab =
                ModRegistries.CREATIVE_TABS.register("nyagibits_bytes_tab_"+id, () -> CreativeModeTab.builder()
                        .icon(() -> new ItemStack(Utils.fetchItem(icon)))
                        .title(Component.translatable("itemGroup.nyagibits_bytes_tab_"+id))
                        .displayItems((params, output) -> {
                            for(Item item : Utils.CREATIVE_CACHE.get(tab)) output.accept(item);
                        }).build());
    }

    public static void init(){
        NyagiBits_Bytes.LOGGER.info("Registering Creative Mode Tabs");
        registerCreativeTab("items", Utils.NBNB("livisite_alloy"), Utils.Tab.ITEMS);
        registerCreativeTab("blocks", Utils.NBNB("flake"), Utils.Tab.BLOCKS);
        registerCreativeTab("science", Utils.NBNB("lab_notebook"), Utils.Tab.SCIENCE);
        registerCreativeTab("schematics", Utils.NBNB("blank_blueprint"), Utils.Tab.SCHEMATICS);
        registerCreativeTab("minerals", Utils.NBNB("raw_hematite"), Utils.Tab.MINERALS);
        registerCreativeTab("biology", Utils.NBNB("stomach"), Utils.Tab.BIOLOGY);
        registerCreativeTab("chemicals", Utils.NBNB("sample_oleum"), Utils.Tab.CHEMICALS);
        registerCreativeTab("fluids", Utils.NBNB("bucket_of_hydrocarbon_tar"), Utils.Tab.FLUIDS);
        registerCreativeTab("tequeno", Utils.NBNB("tequeno_t0"), Utils.Tab.TEQUENO);
        //NOTE: UNCOMMENT WHEN ACTUALLY ADDING STUFF
        registerCreativeTab("elements", Utils.NBNB("sample_dcm"), Utils.Tab.ELEMENTS);
        registerCreativeTab("incomplete_sequence_items", Utils.NBNB("incomplete_controller"), Utils.Tab.SEQUENCE);
    }

}
