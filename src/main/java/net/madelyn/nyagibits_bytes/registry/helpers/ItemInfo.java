package net.madelyn.nyagibits_bytes.registry.helpers;

import net.madelyn.nyagibits_bytes.content.fluid.CustomBucketItem;
import net.madelyn.nyagibits_bytes.content.item.CustomCurioItem;
import net.madelyn.nyagibits_bytes.content.item.NBNBItem;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ItemInfo {
    private final String id;
    private final Utils.Tab tab;
    private String parentModel = "";
    private List<NBNBItem.ItemTraits> traits = new ArrayList<>();
    private int burnTime = -1;
    private int tint = -1;
    private String chemical = "";
    private String abbreviation = "";
    private ChemType chemType = ChemType.NONE;
    private int durability = -1;


    public ItemInfo(String id, Utils.Tab tab){
        this.id = id;
        this.tab = tab;
    }

    public ItemInfo(String id, Utils.Tab tab, String parentModel){
        this.id = id;
        this.tab = tab;
        this.parentModel = parentModel;
    }

    public ItemInfo fuel(int burnTime){
        traits.add(NBNBItem.ItemTraits.IS_FUEL);
        this.burnTime = burnTime;
        return this;
    }

    public ItemInfo ore(){
        traits.add(NBNBItem.ItemTraits.IS_ORE);
        return this;
    }

    public ItemInfo levitates(){
        traits.add(NBNBItem.ItemTraits.LEVITATES);
        return this;
    }

    public ItemInfo chem(ChemType chemType, String chemID){
        traits.add(NBNBItem.ItemTraits.IS_CHEMICAL);
        this.chemType = chemType;
        this.chemical = chemID;
        return this;
    }

    public ItemInfo abbreviation(String element){
        traits.add(NBNBItem.ItemTraits.HAS_ABBREVIATION);
        this.abbreviation = element;
        return this;
    }

    public ItemInfo tint(int tint){
        traits.add(NBNBItem.ItemTraits.IS_TINTED);
        this.tint = tint;
        return this;
    }

    public ItemInfo durability(int durability){
        traits.add(NBNBItem.ItemTraits.HAS_DURABILITY);
        this.durability = durability;
        return this;
    }

    public String getId(){
        return id;
    }
    public Utils.Tab getTab(){
        return tab;
    }
    public List<NBNBItem.ItemTraits> getTraits(){
        return traits;
    }
    public ChemType getChemType(){
        return chemType;
    }
    public String getChemical(){
        return chemical;
    }

    //Used in datagen by most incomplete sequence items
    public ItemInfo parent(String model){
        this.parentModel = model;
        return this;
    }

    public String getParentModel(){
        return parentModel;
    }


    public Item registerItem(){
        Item.Properties props = new Item.Properties();
        if(traits.contains(NBNBItem.ItemTraits.HAS_DURABILITY)) props.durability(durability);
        Item ret = new NBNBItem(props, traits, burnTime, tint, chemical, abbreviation);
        Utils.CREATIVE_CACHE.get(tab).add(ret);
        return ret;
    }


    //This subclass serves to register fluid buckets while bundling them in with the rest of the items to be registered.
    public static class Bucket extends ItemInfo {

        private final Supplier<? extends Fluid> fluid;
        private String chemical;
        private boolean isFroth = false;

        public Bucket (String id, Supplier<? extends Fluid> fluidSupplier){
            super(id, Utils.Tab.FLUIDS);
            this.fluid = fluidSupplier;
            chemical = "";
        }
        public Bucket (String id, Supplier<? extends Fluid> fluidSupplier, String chemical){
            super(id, Utils.Tab.FLUIDS);
            this.fluid = fluidSupplier;
            this.chemical = chemical;
        }

        public Bucket chemical(String chem){
            this.chemical = chem;
            return this;
        }
        public Bucket froth(){
            this.isFroth = true;
            return this;
        }
        public boolean isFroth(){
            return isFroth;
        }
        public String getChemical(){
            return chemical;
        }

        //This should get called even in the context of the list of Item Info. Go back and interface some stuff if not.
        @Override
        public Item registerItem(){
            Item ret = new CustomBucketItem(fluid,
                    new Item.Properties()
                            .craftRemainder(Items.BUCKET)
                            .stacksTo(1),
                    chemical
            );
            Utils.CREATIVE_CACHE.get(getTab()).add(ret);
            return ret;
        }

    }

    // This subclass serves to register curios and provides a builder for attribute modifiers, effects and special flags
    // Note: don't forget to tag the curio with the correct slot tag! See data/curios/tags/items/ring.json
    public static class Curio extends ItemInfo {

        private final List<Utils.Modifier> modifiers = new ArrayList<>();
        private final List<MobEffectInstance> effects = new ArrayList<>();
        private final List<CustomCurioItem.CurioFlags> flags = new ArrayList<>();

        public Curio (String id){
            super(id, Utils.Tab.ITEMS);
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
            Item ret = new CustomCurioItem(new Item.Properties(), modifiers, effects, flags);
            Utils.CREATIVE_CACHE.get(getTab()).add(ret);
            return ret;
        }
    }

    public enum ChemType{
        NONE, //Placeholder for non-chems
        SOLID, //Solid Sample
        LIQUID, //Liquid Sample
        GAS, //Gas Samplee
        DUST, //Compacted Dust
        INGOT, //Ingots (for OPA metals)
        PLATE, //Plates (for OPA metals)
        FLOAT_DUST //Float-Separated Dust (for OPA metals)
    }


}