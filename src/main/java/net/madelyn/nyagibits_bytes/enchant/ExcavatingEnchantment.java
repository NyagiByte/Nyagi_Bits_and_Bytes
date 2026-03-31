package net.madelyn.nyagibits_bytes.enchant;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;


//This can be either the Excavating enchant or Blasting enchant
//Both provide 3x3 aoe mining. Blasting is faster, but doesn't drop the items.
public class ExcavatingEnchantment extends Enchantment {

    private final boolean destructive;

    protected ExcavatingEnchantment(boolean isDestructive) {
        super(Rarity.UNCOMMON, EnchantmentCategory.DIGGER, EquipmentSlot.values());
        this.destructive = isDestructive;
    }

    public boolean isDestructive(){
        return destructive;
    }

    //NOTE: If readding Blasting, add compatibility check!

    @Override
    public boolean isTreasureOnly() {
        return true;
    }

    @Override
    public boolean isTradeable() {
        return false;
    }

    @Override
    public boolean isDiscoverable() {
        return false;
    }



    //Yes, this looks dumb, but hey if it works...
    public static ExcavatingEnchantment makeExcavating(){
        return new ExcavatingEnchantment(false);
    }
    public static ExcavatingEnchantment makeBlasting(){
        return new ExcavatingEnchantment(true);
    }
}
