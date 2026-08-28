package net.madelyn.nyagibits_bytes.content.fluid;

import net.minecraft.ChatFormatting;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class CustomBucketItem extends BucketItem {

    private final String chemical;

    public CustomBucketItem(Supplier<? extends Fluid> fluid, Properties props){
        super(fluid, props);
        chemical = "";
    }

    public CustomBucketItem(Supplier<? extends Fluid> fluid, Properties props, String chemical){
        super(fluid, props);
        this.chemical = chemical;
    }

    /*
    *ahem*
    THIS. THIS IS WHAT WAS MISSING. THIS IS WHY THE BUCKETS WOULDN'T FUCKING WORK WITH BASINS AND WHATNOT.
    BECAUSE FORGE ONLY DOES IT FOR BucketItem AND NOT SUBCLASSES. Now, it does have a reason to do that.
    BUT IF YOU ARE SEARCHING GITHUB FOR A SOLUTION TO "CUSTOM BUCKET DOES NOT BUCKET RIGHT", THIS IS PROBABLY IT.
    HEED OUR WARNING AND DO THIS, OR SUFFER LIKE WE DID.
    Anyway, thanks create team for leaving a comment about this, and thanks GT-Modern team for making me realize what was going on.
    */

    @Override
    public @NotNull ICapabilityProvider initCapabilities(@NotNull ItemStack stack, @Nullable CompoundTag nbt) {
        return new FluidBucketWrapper(stack);
    }


    @Override //This is like the one in CustomTooltipItem, but with a secondary fallback tooltip describing the chemical as a whole.
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        String descKey = "item." + ForgeRegistries.ITEMS.getResourceKey(this).get().location().toString().replace(':', '.') + ".desc";
        Component desc = Component.translatable(descKey);
        String chemDescKey = "chemical.nyagibits_bytes."+chemical+".desc";
        Component chemDesc = Component.translatable(chemDescKey);
        if(I18n.exists(descKey)) for(String line : desc.getString().split("\n")) components.add(Component.literal(line).withStyle(ChatFormatting.GRAY));
        else if(!chemical.isEmpty() && I18n.exists(chemDescKey)) for(String line : chemDesc.getString().split("\n")) components.add(Component.literal(line).withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }

}
