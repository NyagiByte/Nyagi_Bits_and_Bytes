package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RefinedRadianceItem extends Item {
    public RefinedRadianceItem(Properties prop){
        super(prop);
    }

    @Override //This makes the item float. Can also have some fiendish fun by using entity.setDeltaMovement()
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity){

        Level level = entity.level;
        Vec3 pos = entity.position();
        if(level.isClientSide){ //We don't want to spawn particles on the server's side.
            float particleChance = Mth.clamp(entity.getItem().getCount()-10, 5, 100) / 64f;
            if(level.random.nextFloat() < particleChance){
                //The helper to randomize the offset for the particle seems to be missing, so need to do it manually.
                Vec3 ppos = pos.add((Math.random()/2)-0.25,Math.random()-0.5,(Math.random()/2)-0.25);
                level.addParticle(ParticleTypes.END_ROD, ppos.x, ppos.y, ppos.z, 0, -0.1f, 0);
            }
        }

        entity.setNoGravity(true);
        return false;
    }


    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("A chromatic material forged").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("from a bright and powerful").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("beam of pure radiance").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}
