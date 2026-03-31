package net.madelyn.nyagibits_bytes.enchant;


import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.madelyn.nyagibits_bytes.NyagiBits_Bytes.MOD_ID;

public class ModEnchantments {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MOD_ID);

    public static final RegistryObject<Enchantment> EXCAVATING = ENCHANTMENTS.register("excavating", ExcavatingEnchantment::makeExcavating);
    //public static final RegistryObject<Enchantment> BLASTING = ENCHANTMENTS.register("blasting", ExcavatingEnchantment::makeBlasting);

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
