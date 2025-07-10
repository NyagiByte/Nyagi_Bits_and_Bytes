package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class CustomToolItem extends CustomTooltipItem{

    public static final RandomSource random = RandomSource.createNewThreadLocalInstance();

    public CustomToolItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isEnchantable(@Nonnull ItemStack stack)
    {
        return true;
    }

    @Override
    public int getEnchantmentValue(ItemStack stack)
    {
        return 0;
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack){
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack){
        ItemStack item = stack.copy();
        if(item.hurt(1, random, null)){
            return ItemStack.EMPTY;
        }
        return item;
    }

    @Override
    public boolean isRepairable(ItemStack stack){
        return false;
    }


}
