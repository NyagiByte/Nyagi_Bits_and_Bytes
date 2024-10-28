package net.madelyn.nyagibits_bytes.misc;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModMiningTiers {
    public static Tier MANASTEEL;
    public static Tier ELEMENTIUM;
    public static Tier TERRASTEEL;
    public static Tier ALFSTEEL;
    public static Tier FLAKE;

    static {
        MANASTEEL = TierSortingRegistry.registerTier(new ForgeTier(5,
                2500,
                10.0F,
                5.0F,
                20,
                ModTags.Blocks.NEEDS_MANASTEEL_TOOL,
                () -> Ingredient.EMPTY), Utils.NBNB("manasteel"), List.of(Tiers.NETHERITE), List.of());
        ELEMENTIUM = TierSortingRegistry.registerTier(new ForgeTier(6,
                2700,
                11.0F,
                6.0F,
                20,
                ModTags.Blocks.NEEDS_ELEMENTIUM_TOOL,
                () -> Ingredient.EMPTY), Utils.NBNB("elementium"), List.of(MANASTEEL), List.of());
        TERRASTEEL = TierSortingRegistry.registerTier(new ForgeTier(7,
                2800,
                12.0F,
                7.0F,
                20,
                ModTags.Blocks.NEEDS_TERRASTEEL_TOOL,
                () -> Ingredient.EMPTY), Utils.NBNB("terrasteel"), List.of(ELEMENTIUM), List.of());
        ALFSTEEL = TierSortingRegistry.registerTier(new ForgeTier(8,
                2850,
                13.0F,
                8.0F,
                20,
                ModTags.Blocks.NEEDS_ALFSTEEL_TOOL,
                () -> Ingredient.EMPTY), Utils.NBNB("alfsteel"), List.of(TERRASTEEL), List.of());
        FLAKE = TierSortingRegistry.registerTier(new ForgeTier(9,
                2880,
                14.0F,
                9.0F,
                20,
                ModTags.Blocks.NEEDS_FLAKE_TOOL,
                () -> Ingredient.EMPTY), Utils.NBNB("flake"), List.of(ALFSTEEL), List.of());
    }
}
