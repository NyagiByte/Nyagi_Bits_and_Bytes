package net.madelyn.nyagibits_bytes.mixin;

import net.madelyn.nyagibits_bytes.misc.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/*Composters only allow defining to fill one level at a time.
However, items like the inoculated wood pile are meant to fill it up all at once.
This mixin implements the logic needed for that.*/
@Mixin(ComposterBlock.class)
public class ComposterMixin {
    @Redirect(method = "addItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;getValue(Lnet/minecraft/world/level/block/state/properties/Property;)Ljava/lang/Comparable;"))
    private static Comparable<Integer> checkForSuperCompost(BlockState composter, Property<Integer> levelProperty, Entity player, BlockState state, LevelAccessor level, BlockPos pos, ItemStack stack){
        /* This is a bit more jank that i'd have liked. Apparently replicating the composter's logic
        to update the level properly...does not work. So spoofing the initial level it is.*/
        if(stack.is(ModTags.Items.SUPER_COMPOST)) return Integer.valueOf(6); //6 lets the rest of the composter logic fill it up and not take it out ouf bounds.
        else return composter.getValue(levelProperty);
    }

}
