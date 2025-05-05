package net.madelyn.nyagibits_bytes.item;

import net.madelyn.nyagibits_bytes.item.custom.CustomCurioItem;
import net.madelyn.nyagibits_bytes.item.custom.CustomOreItem;
import net.madelyn.nyagibits_bytes.item.custom.CustomTooltipItem;
import net.madelyn.nyagibits_bytes.item.custom.LevitatingItem;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ItemInfo {
    private final String id;
    private final ModItems.Type type;
    private final CreativeModeTab tab;
    private String parentModel = "";
    private String subFolder = "";

    public ItemInfo(String id, ModItems.Type type, CreativeModeTab tab){
        this.id = id;
        this.type = type;
        this.tab = tab;
    }

    public String getId(){
        return id;
    }
    public ModItems.Type getType(){
        return type;
    }
    public CreativeModeTab getTab(){
        return tab;
    }

    //Used in datagen by most incomplete sequence items
    public ItemInfo parent(String model){
        this.parentModel = model;
        return this;
    }
    public ItemInfo subFolder(String folder){
        this.subFolder = folder;
        return this;
    }

    public String getParentModel(){
        return parentModel;
    }
    public String getSubFolder(){
        return subFolder;
    }

    public Item registerItem(){
        switch (type){
            case CUSTOM_TOOLTIP -> { return new CustomTooltipItem(new Item.Properties().tab(tab)); }
            case CUSTOM_ORE -> { return new CustomOreItem(new Item.Properties().tab(tab)); }
            case LEVITATING -> { return new LevitatingItem(new Item.Properties().tab(tab)); }
            default -> {return new Item(new Item.Properties().tab(tab));}
            }
    }

    //This subclass serves to register fluid buckets while bundling them in with the rest of the items to be registered.
    public static class Bucket extends ItemInfo{

        private final Supplier<? extends Fluid> fluid;

        public Bucket (String id, Supplier<? extends Fluid> fluidSupplier){
            super(id, ModItems.Type.ITEM, Utils.Tab.FLUIDS);
            this.fluid = fluidSupplier;
        }

        //This should get called even in the context of the list of Item Info. Go back and interface some stuff if not.
        @Override
        public Item registerItem(){
            return new BucketItem(fluid,
                    new Item.Properties()
                            .tab(Utils.Tab.FLUIDS)
                            .craftRemainder(Items.BUCKET)
                            .stacksTo(1)
            );
        }

    }

    // This subclass serves to register curios and provides a builder for attribute modifiers, effects and special flags
    // Note: don't forget to tag the curio with the correct slot tag! See data/curios/tags/items/ring.json
    public static class Curio extends ItemInfo{

        private final List<Utils.Modifier> modifiers = new ArrayList<>();
        private final List<MobEffectInstance> effects = new ArrayList<>();
        private final List<CustomCurioItem.CurioFlags> flags = new ArrayList<>();

        public Curio (String id){
            super(id, ModItems.Type.ITEM, Utils.Tab.ITEMS);
        }

        //This is a builder-style method to add curio attributes. See usage in ModItems for reference.
        public Curio addModifier(String slot, Attribute attribute, AttributeModifier.Operation operation, double value){
            modifiers.add(new Utils.Modifier(slot, attribute, operation, value));
            return this;
        }

        //Another builder-style method, this adds a potion effect applied whenever the curio is equipped.
        public Curio addEffect(MobEffect effect, int amplifier){
            //Amplifier is zero-based. Don't ask why. Duration is in ticks.
            //Booleans are in order: Ambient effect (only ever used by beacons), particle visibility and icon visibility.
            this.effects.add(new MobEffectInstance(effect, 300, amplifier-1, false, false, true));
            return this;
        }

        public Curio addFlags(List<CustomCurioItem.CurioFlags> flagsList){
            flags.addAll(flagsList);
            return this;
        }

        @Override
        public Item registerItem(){
            return new CustomCurioItem(new Item.Properties().tab(getTab()), modifiers, effects, flags);
        }
    }



}