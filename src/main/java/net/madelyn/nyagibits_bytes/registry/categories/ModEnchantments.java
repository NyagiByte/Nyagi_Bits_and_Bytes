package net.madelyn.nyagibits_bytes.registry.categories;


import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.content.enchantment.ExcavatingEnchantment;
import net.madelyn.nyagibits_bytes.registry.ModRegistries;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {


    public static final RegistryObject<Enchantment> EXCAVATING = ModRegistries.ENCHANTMENTS.register("excavating",ExcavatingEnchantment::makeExcavating);
    //public static final RegistryObject<Enchantment> BLASTING = ENCHANTMENTS.register("blasting", ExcavatingEnchantment::makeBlasting);

    public static void init(){
        NyagiBits_Bytes.LOGGER.info("Registering Enchantments");
    }
}
