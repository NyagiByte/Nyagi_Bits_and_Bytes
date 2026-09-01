package net.madelyn.nyagibits_bytes.content.item;

import net.madelyn.nyagibits_bytes.registry.helpers.IAbbreviatedItem;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class NBNBItem extends Item implements IAbbreviatedItem {
    public static final RandomSource random = RandomSource.createNewThreadLocalInstance();

    private final List<ItemTraits> traits;
    private final int burnTime;
    private final int tint;

    private final String chemical;
    private final String abbreviation;


    public NBNBItem(Properties props) {
        super(props);
        this.traits = new ArrayList<>();
        this.burnTime = -1;
        this.tint = -1;
        this.chemical = "";
        this.abbreviation = "";
    }

    public NBNBItem(Properties props, List<ItemTraits> traits, int burnTime, int tint, String chemical, String abbreviation){
        super(props);
        this.traits = traits;
        this.burnTime = burnTime;
        this.tint = tint;
        this.chemical = chemical;
        this.abbreviation = abbreviation;
    }

    @Override
    public void appendHoverText(ItemStack stack, @org.jetbrains.annotations.Nullable Level level, List<Component> components, TooltipFlag flag) {
        String yieldKey = "item." + ForgeRegistries.ITEMS.getResourceKey(this).get().location().toString().replace(':', '.') + ".yield";
        String descKey = "item." + ForgeRegistries.ITEMS.getResourceKey(this).get().location().toString().replace(':', '.') + ".desc";
        String chemDescKey = "chemical.nyagibits_bytes." + chemical+".desc";
        Component desc = null;
        if(traits.contains(ItemTraits.IS_ORE) && I18n.exists(yieldKey) && Screen.hasShiftDown()){
            desc = Component.translatable(yieldKey);
            for(String line : desc.getString().split("\n")) components.add(Component.literal(line).withStyle(ChatFormatting.BLUE));
        } else {
            if(I18n.exists(descKey)) desc = Component.translatable(descKey);
            else if (traits.contains(ItemTraits.IS_CHEMICAL) && I18n.exists(chemDescKey)) {
                desc = Component.translatable(chemDescKey);
            }
            if(desc != null) for(String line : desc.getString().split("\n")) components.add(Component.literal(line).withStyle(ChatFormatting.GRAY));
        }

        if(traits.contains(ItemTraits.IS_ORE) && I18n.exists(yieldKey) && !Screen.hasShiftDown()){
            components.add(Component.literal(" "));
            components.add(Component.translatable("nyagi_bits_bytes.tooltip.shift_yield_prompt").withStyle(ChatFormatting.YELLOW));
        }
        super.appendHoverText(stack, level, components, flag);
    }



    public List<ItemTraits> getTraits(){
        return this.traits;
    }

    @Override
    public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType){ return burnTime; }

    @Override
    public boolean isEnchantable(@Nonnull ItemStack stack){
        return traits.contains(ItemTraits.HAS_DURABILITY); }

    @Override public int getEnchantmentValue(ItemStack stack) { return 0; }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack){
        return traits.contains(ItemTraits.HAS_DURABILITY); }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack){
        if(!traits.contains(ItemTraits.HAS_DURABILITY)) return ItemStack.EMPTY;
        ItemStack item = stack.copy();
        if(item.hurt(1, random, null)){
            return ItemStack.EMPTY;
        }
        return item;
    }

    @Override //This makes the item float. Can also have some fiendish fun by using entity.setDeltaMovement()
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity){
        if(!traits.contains(ItemTraits.LEVITATES)) return false; //NEVER RETURN TRUE HERE
        Level level = entity.level();
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

    public int getColor(ItemStack stack, int layer){
        return layer == 1 ? tint : -1;
    }

    @Override
    public boolean isAbbreviated() {
        return traits.contains(ItemTraits.HAS_ABBREVIATION);
    }
    @Override
    public String getAbbreviation(){
        return abbreviation;
    }

    public enum ItemTraits{
        HAS_DURABILITY,
        IS_CHEMICAL,
        IS_TINTED,
        IS_FUEL,
        IS_ORE,
        LEVITATES,
        HAS_ABBREVIATION
    }

}
