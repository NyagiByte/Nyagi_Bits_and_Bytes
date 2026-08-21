package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class CustomFuelItem extends CustomTooltipItem{

    private final int burnTime;

    public CustomFuelItem(Properties properties, int time) {
        super(properties);
        this.burnTime = time;
    }

    @Override
    public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType){
        return burnTime;
    }

}
