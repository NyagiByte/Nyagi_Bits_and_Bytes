package net.madelyn.nyagibits_bytes.item;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

import static net.madelyn.nyagibits_bytes.item.custom.CustomCurioItem.CurioFlags;
import static net.madelyn.nyagibits_bytes.misc.Utils.Tab;

public class ModItems {
  //Do NOT mix this up with Type.ITEM or Tab.ITEMS
  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, NyagiBits_Bytes.MOD_ID);

  //NOTE: This is currently unused, keeping it here just in case.
  // "snake_case_name" -> ["snake", "case", "name"] -> ["Snake", "Case",
  // "Name"]
  // -> "S" + "nake" + "_" + ... + "ame" + "_" ->
  // remove final "_" for "Snake_Case_Name"
  private static String toPascalCase(String snakeCase) {
    String[] parts = snakeCase.split("_");
    StringBuilder pascalCase = new StringBuilder();
    for (String part : parts) {
      pascalCase
          .append(part.substring(0, 1).toUpperCase()) // first letter to upper
          .append(
              part.substring(1).toLowerCase()); // ensure rest of word is lower
      pascalCase.append("_");
    }
    if (pascalCase.length() > 0) {
      pascalCase.setLength(pascalCase.length() - 1);
    }
    return pascalCase.toString();
  }

  //This is the BIG list of items.
  //Follow the format, keep it in the right category and sign new additions with name and timestamp. (MM/DD/YY)
  public static final List<ItemInfo> ITEMS_LIST = new ArrayList<>();
  public static void add(ItemInfo item){
    ITEMS_LIST.add(item);
  }
  public static void populateList() {
      /*
        GENERIC ITEMS
      */
    // God hearts, remember to tag them as rings (data/curios/tags/items/ring.json)
    // Inert God Heart 10/14/24 - Nyagi
    add(new ItemInfo.Curio("inert_god_heart")
            .addModifier("Ring", Attributes.MOVEMENT_SPEED, AttributeModifier.Operation.MULTIPLY_BASE, 0.4)
            .addEffect(MobEffects.JUMP, 2)
            .addFlags(List.of(CurioFlags.SOULBOUND, CurioFlags.DEATH_COUNTER)));
    // Faintly Resonating God Heart 12/12/24 - Nyagi
    add(new ItemInfo.Curio("faintly_resonating_god_heart")
            .addModifier("Ring", Attributes.MOVEMENT_SPEED, AttributeModifier.Operation.MULTIPLY_BASE, 0.4)
            .addEffect(MobEffects.JUMP, 2)
            .addEffect(MobEffects.CONDUIT_POWER, 1)
            .addFlags(List.of(CurioFlags.SOULBOUND, CurioFlags.DEATH_COUNTER, CurioFlags.AQUA_AFFINITY)));
    // Tier 0 Strawberry added 2/21/23 - Nyagi
    add(new ItemInfo("tier_zero_strawberry", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Tier 0 Golden Strawberry added 2/21/23 - Nyagi
    add(new ItemInfo("golden_tier_zero_strawberry", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Tier 1 Strawberry added 2/21/23 - Nyagi
    add(new ItemInfo("tier_one_strawberry", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Tier 1 Golden Strawberry added 2/21/23 - Nyagi
    add(new ItemInfo("golden_tier_one_strawberry", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Tier 2 Strawberry added 5/16/23 - Nyagi
    add(new ItemInfo("tier_two_strawberry", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Tier 2 Golden Strawberry added 5/16/23 - Nyagi
    add(new ItemInfo("golden_tier_two_strawberry", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Livisite Alloy added 7/11/23 - Nyagi
    add(new ItemInfo("livisite_alloy", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Livisite Slate added 7/11/23 - Nyagi
    add(new ItemInfo("livisite_slate", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Crude Abrasive added 7/11/23 - Nyagi
    add(new ItemInfo("crude_abrasive", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Pile of Cogs added 7/11/23 - Nyagi
    add(new ItemInfo("pile_of_cogs", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Pile of Crude Mechanical Parts added 7/11/23 - Nyagi
    add(new ItemInfo("pile_of_crude_mechanical_parts", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Soil Sample added 7/25/23 - Nyagi
    add(new ItemInfo("soil_sample", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Sturdy Box added 7/25/23 - Nyagi
    add(new ItemInfo("sturdy_box", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Sealed Pouch added 7/25/23 - Nyagi
    add(new ItemInfo("sealed_pouch", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Salt Water added 7/25/23 - Nyagi (deprecated)
    // add(new ItemInfo("bucket_of_salt_water", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Torn Wool Ball added 7/25/23 - Nyagi
    add(new ItemInfo("torn_wool_ball", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Etched Redstone Plate added 8/10/23 - Nyagi
    add(new ItemInfo("etched_redstone_plate", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Crude Silicon Boule added 8/10/23 - Nyagi
    add(new ItemInfo("crude_silicon_boule", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Diamond Shard added 8/10/23 - Nyagi
    add(new ItemInfo("diamond_shard", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Logic Dud added 8/10/23 - Nyagi
    add(new ItemInfo("logic_dud", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Calculation Dud added 8/10/23 - Nyagi
    add(new ItemInfo("calculation_dud", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Engineering Dud added 8/10/23 - Nyagi
    add(new ItemInfo("engineering_dud", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Chemistry Rack added 8/27/23 - Nyagi
    add(new ItemInfo("chemistry_rack", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Basic Composite Material added 8/27/23 - Nyagi
    add(new ItemInfo("basic_composite_material", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Basic Composite Plate added 8/27/23 - Nyagi
    add(new ItemInfo("basic_composite_plate", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Compacted Soil added 3/17/24 - Nyagi
    add(new ItemInfo("compacted_soil", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Tough Bag added 3/17/24 - Nyagi
    add(new ItemInfo("tough_bag", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Sponged Steel added 3/25/24 - Nyagi
    add(new ItemInfo("sponged_steel", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Sodium Polyacrylate added 3/26/24 - Nyagi
    add(new ItemInfo("sodium_polyacrylate", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Endoflame Mush added 3/26/24 - Nyagi
    add(new ItemInfo("endoflame_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Hydroangeas Mush added 7/20/24 - Nyagi
    add(new ItemInfo("hydroangeas_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Gourmaryllis Mush added 7/20/24 - Nyagi
    add(new ItemInfo("gourmaryllis_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Thermalily Mush added 7/20/24 - Nyagi
    add(new ItemInfo("thermalily_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Entropinnyum Mush added 7/20/24 - Nyagi
    add(new ItemInfo("entropinnyum_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Munchdew Mush added 7/20/24 - Nyagi
    add(new ItemInfo("munchdew_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Narslimmus Mush added 7/20/24 - Nyagi
    add(new ItemInfo("narslimmus_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Rosa Arcana Mush added 7/20/24 - Nyagi
    add(new ItemInfo("rosa_arcana_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Manasteel Lattice added 3/26/24 - Nyagi
    add(new ItemInfo("manasteel_lattice", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Rune Binder added 3/26/24 - Nyagi
    add(new ItemInfo("rune_binder", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Rubberized Cable added 4/10/24 - Nyagi
    add(new ItemInfo("rubberized_cable", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Ceramic added 4/10/24 - Nyagi
    add(new ItemInfo("ceramic", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Activated Charcoal added 4/10/24 - Nyagi
    add(new ItemInfo("activated_charcoal", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Sturdy Tray added 4/10/24 - Nyagi
    add(new ItemInfo("sturdy_tray", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Beaker added 4/10/24 - Nyagi
    add(new ItemInfo("beaker", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Round Bottom Flask added 4/10/24 - Nyagi
    add(new ItemInfo("round_bottom_flask", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Distillation Column added 4/10/24 - Nyagi
    add(new ItemInfo("distillation_column", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Inlet added 4/10/24 - Nyagi
    add(new ItemInfo("inlet", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Burette added 4/10/24 - Nyagi
    add(new ItemInfo("burette", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Sterilized Quartz Glass added 4/10/24 - Nyagi
    add(new ItemInfo("sterilized_quartz_glass", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // pH Strip added 4/10/24 - Nyagi
    add(new ItemInfo("ph_strip", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Low Grade Coke added 4/21/24 - Nyagi
    add(new ItemInfo("low_grade_coke", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Industrial Grade Coke added 4/21/24 - Nyagi
    add(new ItemInfo("industrial_grade_coke", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Wrought Ball Bearing added 4/21/24 - Nyagi
    add(new ItemInfo("wrought_ball_bearing", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Wrought Tiny Spring added 4/21/24 - Nyagi
    add(new ItemInfo("wrought_tiny_spring", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Wrought Iron Rod added 4/21/24 - Nyagi
    add(new ItemInfo("wrought_iron_rod", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Mixed Seeds added 4/21/24 - Nyagi
    add(new ItemInfo("mixed_seeds", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Hard Hat added 4/21/24 - Nyagi
    add(new ItemInfo("hard_hat", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Protective Eye-wear added 5/1/24 - Nyagi
    add(new ItemInfo("protective_eye_wear", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Fire Extinguisher added 5/1/24 - Nyagi
    add(new ItemInfo("fire_extinguisher", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Organic Vapor Respirator added 5/1/24 - Nyagi
    add(new ItemInfo("organic_vapor_respirator", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Hardened Mechanical Bearing added 5/1/24 - Nyagi
    add(new ItemInfo("hardened_mechanical_bearing", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Fasteners added 5/1/24 - Nyagi
    add(new ItemInfo("fasteners", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Synchronous Electric Motor added 5/1/24 - Nyagi
    add(new ItemInfo("synchronous_electric_motor", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Industrial Gear added 5/1/24 - Nyagi
    add(new ItemInfo("industrial_gear", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Dampener added 5/1/24 - Nyagi
    add(new ItemInfo("dampener", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Reinforced Gearbox added 5/1/24 - Nyagi
    add(new ItemInfo("reinforced_gearbox", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // V-Belt added 5/1/24 - Nyagi
    add(new ItemInfo("v_belt", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Solenoid Component added 5/1/24 - Nyagi
    add(new ItemInfo("solenoid_component", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Flux Mixture added 5/8/24 - Nyagi
    add(new ItemInfo("flux_mixture", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Damascus Steel added 5/13/24 - Nyagi
    add(new ItemInfo("steel_damascus", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // High Carbon Steel - 1080 added 5/13/24 - Nyagi
    add(new ItemInfo("steel_high_carbon_1080", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // High Carbon Steel - 15N20 added 5/13/24 - Nyagi
    add(new ItemInfo("steel_high_carbon_15n20", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Stainless Steel added 5/13/24 - Nyagi
    add(new ItemInfo("steel_stainless", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Low Voltage Capacitor added 6/5/24 - Nyagi
    add(new ItemInfo("low_voltage_capacitor", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Threaded Composite Leather added 6/5/24 - Nyagi
    add(new ItemInfo("threaded_composite_leather", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Industrial Composite Plate added 6/5/24 - Nyagi
    add(new ItemInfo("industrial_composite_plate", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Lead-Acid Cell added 6/5/24 - Nyagi
    add(new ItemInfo("lead_acid_cell", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Heavy Plating added 6/5/24 - Nyagi
    add(new ItemInfo("heavy_plating", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Soldering Iron added 6/5/24 - Nyagi
    add(new ItemInfo("soldering_iron", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Low Temperature Solder added 6/5/24 - Nyagi
    add(new ItemInfo("low_temperature_solder", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Ceramic Encased Copper added 6/5/24 - Nyagi
    add(new ItemInfo("ceramic_encased_copper", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Hydraulic Hammer added 6/5/24 - Nyagi
    add(new ItemInfo("hydraulic_hammer", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Tempered Glass added 6/5/24 - Nyagi
    add(new ItemInfo("tempered_glass", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Annealed Glass added 6/5/24 - Nyagi
    add(new ItemInfo("annealed_glass", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Tungsten Wire added 6/5/24 - Nyagi
    add(new ItemInfo("tungsten_wire", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Woven Cloth added 6/5/24 - Nyagi
    add(new ItemInfo("woven_cloth", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Solder Wire added 6/8/24 - Nyagi
    add(new ItemInfo("solder_wire", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Fluorophlogopite added 6/28/24 - Nyagi
    add(new ItemInfo("fluorophlogopite", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Synthetic Mica added 6/28/24 - Nyagi
    add(new ItemInfo("synthetic_mica", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // TPV Cell added 6/28/24 - Nyagi
    add(new ItemInfo("tpv_cell", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Polycrystalline Silicon Carbide added 6/28/24 - Nyagi
    add(new ItemInfo("polycrystalline_silicon_carbide", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Zinc-Gallium-Antimony Alloy added 6/28/24 - Nyagi
    add(new ItemInfo("zinc_gallium_antimony_alloy", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Ash added 7/15/24 - Nyagi
    add(new ItemInfo("ash", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Potash added 7/15/24 - Nyagi
    add(new ItemInfo("potash", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Wood Ash added 7/15/24 - Nyagi
    add(new ItemInfo("wood_ash", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Metamorphic Alloy added 7/15/24 - Nyagi
    add(new ItemInfo("metamorphic_alloy", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Ore Extraction Plate added 7/15/24 - Nyagi
    add(new ItemInfo("ore_extraction_plate", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Chromatic Compound added 8/3/24 - Barza
    add(new ItemInfo("chromatic_compound", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Refined Radiance added 8/3/24 - Barza
    add(new ItemInfo("refined_radiance", Type.LEVITATING, Tab.ITEMS));
    // Shadow Steel added 8/3/24 - Barza
    add(new ItemInfo("shadow_steel", Type.LEVITATING, Tab.ITEMS));
    // Ae2 Assembly added 8/10/23 - Nyagi
    add(new ItemInfo("ae2_assembly", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Crystal Harmonizer added 8/10/23 - Nyagi
    add(new ItemInfo("crystal_harmonizer", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Processor Stack added 8/10/23 - Nyagi
    add(new ItemInfo("processor_stack", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Energized Frame added 8/10/23 - Nyagi
    add(new ItemInfo("energized_frame", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Energized Wires added 8/10/23 - Nyagi
    add(new ItemInfo("energized_wires", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Skystone Shielding added 8/10/23 - Nyagi
    add(new ItemInfo("skystone_shielding", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Matter Converters added 8/10/23 - Nyagi
    add(new ItemInfo("matter_converters", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Decorative Paneling added 8/10/23 - Nyagi
    add(new ItemInfo("decorative_paneling", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // MicroTools added 8/10/23 - Nyagi
    add(new ItemInfo("micro_tools", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Botania Assembly added 3/17/24 - Nyagi
    add(new ItemInfo("botania_assembly", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Semi-organic Substrate added 3/17/24 - Nyagi
    add(new ItemInfo("semi_organic_substrate", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Soil Conditioner added 3/17/24 - Nyagi
    add(new ItemInfo("soil_conditioner", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Living Frame added 3/17/24 - Nyagi
    add(new ItemInfo("living_frame", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Terrarium added 3/17/24 - Nyagi
    add(new ItemInfo("terrarium", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Organic Pseudo Logic added 3/17/24 - Nyagi
    add(new ItemInfo("organic_pseudo_logic", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Sealant added 3/17/24 - Nyagi
    add(new ItemInfo("sealant", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Magnetic Hematite added 3/17/24 - Nyagi
    add(new ItemInfo("magnetic_hematite", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Mystic Fertilizer added 3/17/24 - Nyagi
    add(new ItemInfo("mystic_fertilizer", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Alchemistry Assembly added 4/6/24 - Nyagi
    add(new ItemInfo("alchemistry_assembly", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Electrolytic Core added 4/6/24 - Nyagi
    add(new ItemInfo("electrolytic_core", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Desiccation Powder added 4/6/24 - Nyagi
    add(new ItemInfo("desiccation_powder", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Chemical Grade Glassware added 4/6/24 - Nyagi
    add(new ItemInfo("chemical_grade_glassware", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Fume Fan added 4/6/24 - Nyagi
    add(new ItemInfo("fume_fan", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Chemically Inert Wood added 4/6/24 - Nyagi
    add(new ItemInfo("chemically_inert_wood", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // pH Strips added 4/6/24 - Nyagi
    add(new ItemInfo("ph_strips", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Chromatography Kit added 4/6/24 - Nyagi
    add(new ItemInfo("chromatography_kit", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Bunsen Burner added 4/6/24 - Nyagi
    add(new ItemInfo("bunsen_burner", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Immersive Assembly added 4/25/24 - Nyagi
    add(new ItemInfo("immersive_assembly", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // High Temperature Heat Exchanger added 4/25/24 - Nyagi
    add(new ItemInfo("high_temperature_heat_exchanger", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Duct Tape added 4/25/24 - Nyagi
    add(new ItemInfo("duct_tape", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // WD40 added 4/25/24 - Nyagi
    add(new ItemInfo("wd_40", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // 79" x 28" TRIPLE-BAY 4s SERIES TOOLBOX added 4/25/24 - Nyagi
    add(new ItemInfo("triple_bay_4s_series_toolbox", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Acetylene Tank added 4/25/24 - Nyagi
    add(new ItemInfo.Tool("acetylene_tank", Tab.ITEMS, 128));
    // OSHA Approved Gear added 4/25/24 - Nyagi
    add(new ItemInfo("osha_approved_gear", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Crate Of Industrial Components added 4/25/24 - Nyagi
    add(new ItemInfo("crate_of_industrial_components", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // High Strength Concrete added 4/25/24 - Nyagi
    add(new ItemInfo("high_strength_concrete", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Smectite Clay added 10/27/24 - Nyagi
    add(new ItemInfo("smectite_clay", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Sodium Hypochlorite added 10/27/24 - Nyagi
    add(new ItemInfo("sodium_hypochlorite", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Volcanic Pumice added 10/27/24 - Nyagi
    add(new ItemInfo("volcanic_pumice", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Dense Slag added 10/27/24 - Nyagi
    add(new ItemInfo("dense_slag", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Skystone Encrusted Boule added 10/27/24 - Nyagi
    add(new ItemInfo("skystone_encrusted_boule", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Botanical Core added 10/27/24 - Nyagi
    add(new ItemInfo("botanical_core", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Everburn Tar added 10/27/24 - Nyagi
    add(new ItemInfo("everburn_tar", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Mercury Thermometer added 10/27/24 - Nyagi
    add(new ItemInfo("mercury_thermometer", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // High Strength Ratio Reducer added 10/27/24 - Nyagi
    add(new ItemInfo("high_strength_ratio_reducer", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Precise Crystal Harmonizer added 10/27/24 - Nyagi
    add(new ItemInfo("precise_crystal_harmonizer", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Mini Faraday Cage added 10/27/24 - Nyagi
    add(new ItemInfo("mini_faraday_cage", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Pile of Basic Mechanical Parts added 10/27/24 - Nyagi
    add(new ItemInfo("pile_of_basic_mechanical_parts", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Gypsum added 11/21/24 - Nyagi
    add(new ItemInfo("gypsum", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Mana-Imbued Glucose Crystal added 11/29/24 - Nyagi
    add(new ItemInfo("mana_imbued_glucose_crystal", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Mana-Imbued Obsidian Shard added 11/29/24 - Nyagi
    add(new ItemInfo("mana_imbued_obsidian_shard", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Mana-Imbued Primary Explosive added 11/29/24 - Nyagi
    add(new ItemInfo("mana_imbued_primary_explosive", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Mana-Imbued Oobleck added 11/29/24 - Nyagi
    add(new ItemInfo("mana_imbued_oobleck", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Quenched Thermalsidian added 11/29/24 - Nyagi
    add(new ItemInfo("quenched_thermalsidian", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Deactivated Entropic Mush added 11/29/24 - Nyagi
    add(new ItemInfo("deactivated_entropic_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Basic Arcana Core added 11/29/24 - Nyagi
    add(new ItemInfo("basic_arcana_core", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Lithium-Alumino Inosilicate Vial added 12/12/24 - Nyagi
    add(new ItemInfo("lithium_alumino_inosilicate", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Oolithus (fossilized egg) added 12/12/24 - Nyagi
    add(new ItemInfo("oolithus", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Fossil Resin added 12/12/24 - Nyagi
    add(new ItemInfo("fossil_resin", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Coprolite (fossilized poop) added 12/12/24 - Nyagi
    add(new ItemInfo("coprolite", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Activated Carbon added 02/13/25 - JJ
    add(new ItemInfo("activated_carbon", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Saturated Carbon Waste added 02/13/25 - JJ
    add(new ItemInfo("saturated_carbon_waste", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Carbon Residue added 02/13/25 - JJ
    add(new ItemInfo("carbon_residue", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Bitumen-Tar Cloth Dust added 03/27/25 - Nyagi
    add(new ItemInfo("bitumen_tar_cloth", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Waterproofing Kit Dust added 03/27/25 - Nyagi
    add(new ItemInfo("waterproofing_kit", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Unprocessed Mild Steel added 03/27/25 - Nyagi
    add(new ItemInfo("unprocessed_mild_steel", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Stainless Steel Mix added 03/27/25 - Nyagi
    add(new ItemInfo("mix_steel_stainless", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  1080 Steel Mix added 03/27/25 - Nyagi
    add(new ItemInfo("mix_steel_1080", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  15n20 Steel Mix added 03/27/25 - Nyagi
    add(new ItemInfo("mix_steel_15n20", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Torn Hemp Ball added 03/27/25 - Nyagi
    add(new ItemInfo("torn_hemp_ball", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Torn Flax Ball added 03/27/25 - Nyagi
    add(new ItemInfo("torn_flax_ball", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Woolen String added 03/27/25 - Nyagi
    add(new ItemInfo("string_woolen", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Unrolled NiCd Stack added 05/27/25 - Nyagi
    add(new ItemInfo("unrolled_nicd_stack", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  NiCd Jelly Roll added 05/27/25 - Nyagi
    add(new ItemInfo("nicd_jelly_roll", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Rolled Mild Steel added 05/27/25 - Nyagi
    add(new ItemInfo("rolled_mild_steel", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Small Steel Pipe added 05/27/25 - Nyagi
    add(new ItemInfo("small_pipe_steel", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Insulating Washer Mold added 05/27/25 - Nyagi
    add(new ItemInfo("mold_insulating_washer", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Insulating Washer added 05/27/25 - Nyagi
    add(new ItemInfo("insulating_washer", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  NiCd Battery Assembly added 05/27/25 - Nyagi
    add(new ItemInfo("nicd_battery_assembly", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  NiCd Battery  added 05/27/25 - Nyagi
    add(new ItemInfo("nicd_battery", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  NiCd Battery Bank added 05/27/25 - Nyagi
    add(new ItemInfo("nicd_battery_bank", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Corporea Tunneler added 06/25/25 - Nyagi
    add(new ItemInfo("corporea_tunneler", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Mini Mana Driven KIWI-A added 06/25/25 - Nyagi
    add(new ItemInfo("mini_mana_driven_kiwi", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Palladium On Carbon added 07/05/25 - Nyagi
    add(new ItemInfo("on_carbon_palladium", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Saturated Palladium On Carbon added 07/05/25 - Nyagi
    add(new ItemInfo("on_carbon_saturated_palladium", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Used Chromatography Kit added 07/05/25 - Nyagi
    add(new ItemInfo("chromatography_kit_used", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    //  Used Chromatography Kit added 09/29/25 - Toda
    add(new ItemInfo("calcinated_agar", Type.CUSTOM_TOOLTIP, Tab.ITEMS));

    //Chemistry
    // Bottle of Anthocyanin added 8/27/23 - Nyagi
    add(new ItemInfo("bottle_of_anthocyanin", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    // Bottle of Malic & Citric Acid added 8/27/23 - Nyagi
    add(new ItemInfo("bottle_of_malic_and_citric_acid", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    // Bottle of Vinegar added 4/10/24 - Nyagi
    add(new ItemInfo("bottle_of_vinegar", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Cadmium Nitrate Crystal added 05/27/25 - Nyagi
    add(new ItemInfo("cadmium_nitrate_crystal", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sludge added 07/25/25 - JJ
    add(new ItemInfo("sludge", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Floc added 07/25/25 - JJ
    add(new ItemInfo("floc", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  2,5-Dimethoxybenzoic Acid Soaked Strip added 08/27/25 - Nyagi
    add(new ItemInfo("2_5_dimethoxybenzoic_acid_strip", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  2,5-Dimethoxy-1,4-Benzenedicarboxylic Acid Soaked Strip added 08/27/25 - Nyagi
    add(new ItemInfo("2_5_dimethoxy_1_4_benzenedicarboxylic_acid_strip", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));

    /* Disabled until floatation line is ready
    //  Sample of Potassium Manganate added 06/19/25 - Nyagi
    add(new ItemInfo("sample_potassium_manganate", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Potassium Manganate Dust added 06/19/25 - Nyagi
    add(new ItemInfo("potassium_manganate_dust", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sample of Zinc-Specific Floatation Mix added 06/19/25 - Nyagi
    add(new ItemInfo("sample_floatation_mix_zinc", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sample of Sodium Sulfide added 06/19/25 - Nyagi
    add(new ItemInfo("sample_sodium_sulfide", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sodium Sulfide Dust added 06/19/25 - Nyagi
    add(new ItemInfo("sodium_sulfide_dust", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sample of OPA 1214 (dodecyl/tetradecyloxypropyl amine) added 06/19/25 - Nyagi
    add(new ItemInfo("sample_opa", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sample of 5-Methyl-1,3-Cyclohexanedione added 06/19/25 - Nyagi
    add(new ItemInfo("sample_5_methyl_1_3_cyclohexanedione", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sample of Hydrochloric Acid Solution added 06/19/25 - Nyagi
    add(new ItemInfo("sample_solution_hydrochloric_acid", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sample of Bis(enol)ethers 1-Aminomethyl-3,5-Dimethoxy-2,5-Cyclohexadiene added 06/19/25 - Nyagi
    add(new ItemInfo("sample_bis_enol_ether", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    */

    //Pollution Items (Chemistry Subset)
    //NOTE: These haven't been moved to ModChemicals as there's...many discrepancies with naming convention
    //  Sample of Generic Organic Tailings added 05/15/25 - Nyagi
    add(new ItemInfo("sample_organic_tailings_generic", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sample of Light Organic Tailings added 05/15/25 - Nyagi
    add(new ItemInfo("sample_organic_tailings_light", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sample of Heavy Organic Tailings added 05/15/25 - Nyagi
    add(new ItemInfo("sample_organic_tailings_heavy", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sample of Generic Lithic Tailings added 05/15/25 - Nyagi
    add(new ItemInfo("sample_lithic_tailings_generic", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Generic Lithic Tailings Dust added 05/15/25 - Nyagi
    add(new ItemInfo("dust_lithic_tailings_generic", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sample of Light Lithic Tailings added 05/15/25 - Nyagi
    add(new ItemInfo("sample_lithic_tailings_light", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Light Lithic Tailings Dust added 05/15/25 - Nyagi
    add(new ItemInfo("dust_lithic_tailings_light", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sample of Heavy Lithic Tailings added 05/15/25 - Nyagi
    add(new ItemInfo("sample_lithic_tailings_heavy", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Heavy Lithic Tailings Dust added 05/15/25 - Nyagi
    add(new ItemInfo("dust_lithic_tailings_heavy", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sample of Unidentified Generic Solid Metallic Tailings added 05/19/25 - Nyagi
    add(new ItemInfo("sample_unidentified_solid_metallic_tailings_generic", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Unidentified Generic Solid Metallic Tailings Dust added 05/19/25 - Nyagi
    add(new ItemInfo("dust_unidentified_solid_metallic_tailings_generic", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));
    //  Sample of Unidentified Generic Dissolved Metallic Tailings added 05/19/25 - Nyagi
    add(new ItemInfo("sample_unidentified_dissolved_metallic_tailings_generic", Type.CUSTOM_TOOLTIP, Tab.CHEMICALS));


    //Biology
    // Agar-Gel added 3/25/24 - Nyagi
    add(new ItemInfo("agar_gel", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    // Agar-Flakes added 3/25/24 - Nyagi
    add(new ItemInfo("agar_flakes", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    // Agar-Powder added 3/25/24 - Nyagi
    add(new ItemInfo("agar_powder", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    // Agar-Agar added 3/20/24 - Nyagi
    add(new ItemInfo("agar_agar", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    // Empty Petri Dish added 3/20/24 - Nyagi
    add(new ItemInfo("petri_dish_empty", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    // Agar-Agar Petri Dish added 3/20/24 - Nyagi
    add(new ItemInfo("petri_dish_agar_agar", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    // Ruined Petri Dish added 6/10/25 - Barza
    add(new ItemInfo("petri_dish_contaminated", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    // Acetobacter Petri Dish added 6/10/25 - Barza
    add(new ItemInfo("petri_dish_acetobacter", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Stomach added 03/27/25 - Nyagi
    add(new ItemInfo("stomach", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Ruminant Stomach added 03/27/25 - Nyagi
    add(new ItemInfo("stomach_ruminant", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Intestines added 03/27/25 - Nyagi
    add(new ItemInfo("intestines", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Loose Brain Matter added 03/27/25 - Nyagi
    add(new ItemInfo("loose_brain_matter", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Lard added 03/27/25 - Nyagi
    add(new ItemInfo("lard", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Heart added 03/27/25 - Nyagi
    add(new ItemInfo("heart", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Kidney added 03/27/25 - Nyagi
    add(new ItemInfo("kidney", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Liver added 03/27/25 - Nyagi
    add(new ItemInfo("liver", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Miscellaneous Scrap Meat added 03/27/25 - Nyagi
    add(new ItemInfo("scrap_meat", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Unprocessed Cow Leather added 03/27/25 - Nyagi
    add(new ItemInfo("leather_unprocessed_cow", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Cow Leather added 03/27/25 - Nyagi
    add(new ItemInfo("leather_cow", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Unprocessed Pig Leather added 03/27/25 - Nyagi
    add(new ItemInfo("leather_unprocessed_pig", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Cow Leather added 03/27/25 - Nyagi
    add(new ItemInfo("leather_pig", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Unprocessed Sheep Leather added 03/27/25 - Nyagi
    add(new ItemInfo("leather_unprocessed_sheep", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Sheep Leather added 03/27/25 - Nyagi
    add(new ItemInfo("leather_sheep", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Unprocessed Equidae Leather added 03/27/25 - Nyagi
    //------Note: Equidae involves all horse & horse-like mobs
    add(new ItemInfo("leather_unprocessed_equidae", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Horse Equidae added 03/27/25 - Nyagi
    add(new ItemInfo("leather_equidae", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    //  Vine Cutting added 05/25/25 - Nyagi
    add(new ItemInfo("vine_cutting", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));
    // Canola Seeds added 7/25/25 - JJ
    add(new ItemInfo("canola_seeds", Type.CUSTOM_TOOLTIP, Tab.BIOLOGY));


    //Custom Botania Runes
    // Blank Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_blank", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Optical Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_optical", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Velocity Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_velocity", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Inertia Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_inertia", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Thermodynamic Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_thermodynamic", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Magnetic Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_magnetic", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Catalytic Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_catalytic", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Computational Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_computational", Type.CUSTOM_TOOLTIP, Tab.ITEMS));


      /*
        SCIENCE ITEMS REGISTRATION
      */

    // Crude Compression Test added 7/18/23 - Nyagi
    add(new ItemInfo("crude_compression_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Used Crude Compression Test added 7/18/23 - Nyagi
    add(new ItemInfo("used_crude_compression_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Crude Statics Test added 7/18/23 - Nyagi
    add(new ItemInfo("crude_statics_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Used Crude Statics Test added 7/18/23 - Nyagi
    add(new ItemInfo("used_crude_statics_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Crude Entropy Test added 7/18/23 - Nyagi
    add(new ItemInfo("crude_entropy_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Used Crude Entropy Test added 7/18/23 - Nyagi
    add(new ItemInfo("used_crude_entropy_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Crude Acidics Test added 8/27/23 - Nyagi
    add(new ItemInfo("crude_acidics_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Used Crude Acidics Test added 8/27/23 - Nyagi
    add(new ItemInfo("used_crude_acidics_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Crude Natural Arcana Test added 8/27/23 - Nyagi
    add(new ItemInfo("crude_natural_arcana_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Used Crude Natural Arcana Test added 8/27/23 - Nyagi
    add(new ItemInfo("used_crude_natural_arcana_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Crude Material Properties Test added 8/27/23 - Nyagi
    add(new ItemInfo("crude_material_properties_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Used Crude Material Properties Test added 8/27/23 - Nyagi
    add(new ItemInfo("used_crude_material_properties_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Mana Bomb-Calorimeter added 10/27/24 - Nyagi
    add(new ItemInfo("mana_bomb_calorimeter", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Used Mana Bomb-Calorimeter added 11/21/24 - Nyagi
    add(new ItemInfo("used_mana_bomb_calorimeter", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Single Use Mana-Ablatives Demonstration added 10/27/24 - Nyagi
    add(new ItemInfo("single_use_mana_ablatives_demonstration", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Used Single Use Mana-Ablatives Demonstration added 11/21/24 - Nyagi
    add(new ItemInfo("used_single_use_mana_ablatives_demonstration", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Basic Material Properties Test added 10/27/24 - Nyagi
    add(new ItemInfo("basic_material_properties_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Used Basic Material Properties Test added 10/27/24 - Nyagi
    add(new ItemInfo("used_basic_material_properties_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));

      /*
         SCIENCE DATA STORAGE
       */

    // Lab Notebook added 8/10/23 - Nyagi
    add(new ItemInfo("lab_notebook", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Lab Notebook With Crude Compression Data added 8/10/23 - Nyagi
    add(new ItemInfo("lab_notebook_with_crude_compression_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Lab Notebook With Crude Statics Data added 8/10/23 - Nyagi
    add(new ItemInfo("lab_notebook_with_crude_statics_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Lab Notebook With Crude Entropy Data added 8/10/23 - Nyagi
    add(new ItemInfo("lab_notebook_with_crude_entropy_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Lab Notebook With Crude Acidics Data added 8/27/23 - Nyagi
    add(new ItemInfo("lab_notebook_with_crude_acidics_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Lab Notebook With Crude Natural Arcana Data added 8/27/23 - Nyagi
    add(new ItemInfo("lab_notebook_with_crude_natural_arcana_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Lab Notebook With Crude Material Properties Data added 8/27/23 - Nyagi
    add(new ItemInfo("lab_notebook_with_crude_material_properties_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Pen added 8/10/23 - Nyagi
    add(new ItemInfo("pen", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Pen Assembly added 8/10/23 - Nyagi
    add(new ItemInfo("pen_assembly", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Ball Bearing added 8/10/23 - Nyagi
    add(new ItemInfo("ball_bearing", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Thin Casing added 8/10/23 - Nyagi
    add(new ItemInfo("thin_casing", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Tiny Spring added 8/10/23 - Nyagi
    add(new ItemInfo("tiny_spring", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Ink Cartridge added 8/10/23 - Nyagi
    add(new ItemInfo("ink_cartridge", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Ink added 8/10/23 - Nyagi
    add(new ItemInfo("ink", Type.CUSTOM_TOOLTIP, Tab.ITEMS));
    // Lexicon added 10/27/24 - Nyagi
    add(new ItemInfo("lexicon", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Lexicon With S.U.M.A.D. Data added 11/29/24 - Nyagi
    add(new ItemInfo("lexicon_with_sumad_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Lexicon With M.B.C. Data added 11/29/24 - Nyagi
    add(new ItemInfo("lexicon_with_mbc_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Lexicon With B.M.P.T. Data added 11/29/24 - Nyagi
    add(new ItemInfo("lexicon_with_bmpt_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));
    // Lexicon With Basic Natural Arcana Data added 11/29/24 - Nyagi
    add(new ItemInfo("lexicon_with_basic_natural_arcana_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE));

      /*
         SCHEMATICS
       */

    // Blank Blueprint added 8/27/23 - Nyagi
    add(new ItemInfo("blank_blueprint", Type.CUSTOM_TOOLTIP, Tab.SCHEMATICS));
    // Ae2 Schematic added 8/27/23 - Nyagi
    add(new ItemInfo("ae2_schematic", Type.CUSTOM_TOOLTIP, Tab.SCHEMATICS));
    // Botania Schematic added 8/27/23 - Nyagi
    add(new ItemInfo("botania_schematic", Type.CUSTOM_TOOLTIP, Tab.SCHEMATICS));
    // Immersive Engineering Schematic added 8/27/23 - Nyagi
    add(new ItemInfo("immersive_engineering_schematic", Type.CUSTOM_TOOLTIP, Tab.SCHEMATICS));
    // Alchemistry Schematic added 8/27/23 - Nyagi
    add(new ItemInfo("alchemistry_schematic", Type.CUSTOM_TOOLTIP, Tab.SCHEMATICS));

      /*
        ORE ITEMS
      */
    //Iron
    // Raw Limonite added 9/29/23 - Nyagi
    add(new ItemInfo("raw_limonite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Limonite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_limonite", Type.ITEM, Tab.MINERALS));
    // Raw Hematite added 9/29/23 - Nyagi
    add(new ItemInfo("raw_hematite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Hematite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_hematite", Type.ITEM, Tab.MINERALS));
    // Raw Magnetite added 9/29/23 - Nyagi
    add(new ItemInfo("raw_magnetite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Magnetite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_magnetite", Type.ITEM, Tab.MINERALS));
    // Raw Pyrite added 9/29/23 - Nyagi
    add(new ItemInfo("raw_pyrite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Pyrite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_pyrite", Type.ITEM, Tab.MINERALS));
    // Raw Siderite added 9/29/23 - Nyagi
    add(new ItemInfo("raw_siderite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Siderite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_siderite", Type.ITEM, Tab.MINERALS));
    // Raw Banded Iron added 9/29/23 - Nyagi
    add(new ItemInfo("raw_banded_iron", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Banded Iron added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_banded_iron", Type.ITEM, Tab.MINERALS));
    // Raw Bog Iron added 9/29/23 - Nyagi
    add(new ItemInfo("raw_bog_iron", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Biologically Activated Bog Iron added 12/24/24 - Nyagi
    add(new ItemInfo("biologically_activated_bog_iron", Type.ITEM, Tab.MINERALS));
    // Raw Meteoric Iron added 9/29/23 - Nyagi
    add(new ItemInfo("raw_meteoric_iron", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Meteoric Iron added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_meteoric_iron", Type.ITEM, Tab.MINERALS));

    //Copper
    // Raw Chalcopyrite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_chalcopyrite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Chalcopyrite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_chalcopyrite", Type.ITEM, Tab.MINERALS));
    // Raw Malachite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_malachite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Malachite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_malachite", Type.ITEM, Tab.MINERALS));
    // Raw Azurite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_azurite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Azurite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_azurite", Type.ITEM, Tab.MINERALS));
    // Raw Tetrahedrite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_tetrahedrite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Tetrahedrite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_tetrahedrite", Type.ITEM, Tab.MINERALS));
    // Raw Enargite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_enargite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Enargite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_enargite", Type.ITEM, Tab.MINERALS));
    // Raw Chrysocolla added 10/1/23 - Nyagi
    add(new ItemInfo("raw_chrysocolla", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Chrysocolla added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_chrysocolla", Type.ITEM, Tab.MINERALS));
    // Raw Tennanite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_tennanite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Tennanite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_tennanite", Type.ITEM, Tab.MINERALS));
    // Raw Dioptase added 10/1/23 - Nyagi
    add(new ItemInfo("raw_dioptase", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Dioptase added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_dioptase", Type.ITEM, Tab.MINERALS));

    //Coal
    // Raw Lignite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_lignite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-mineralized Lignite added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_lignite", Type.ITEM, Tab.MINERALS));
    // Raw Bituminous added 10/1/23 - Nyagi
    add(new ItemInfo("raw_bituminous", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-mineralized Bituminous added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_bituminous", Type.ITEM, Tab.MINERALS));
    // Raw Subbituminous added 10/1/23 - Nyagi
    add(new ItemInfo("raw_subbituminous", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-mineralized Subbituminous added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_subbituminous", Type.ITEM, Tab.MINERALS));
    // Raw Anthracite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_anthracite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-mineralized Anthracite added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_anthracite", Type.ITEM, Tab.MINERALS));
    // Raw Cannel Coal added 10/1/23 - Nyagi
    add(new ItemInfo("raw_cannel_coal", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-mineralized Cannel Coal added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_cannel_coal", Type.ITEM, Tab.MINERALS));
    // Raw Jet added 10/1/23 - Nyagi
    add(new ItemInfo("raw_jet", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-mineralized Jet added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_jet", Type.ITEM, Tab.MINERALS));
    // Raw Peat added 10/1/23 - Nyagi
    add(new ItemInfo("raw_peat", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Biologically Activated Peat added 12/23/24 - Nyagi
    add(new ItemInfo("biologically_activated_peat", Type.ITEM, Tab.MINERALS));
    // Raw Graphite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_graphite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Graphite added 12/23/24 - Nyagi
    add(new ItemInfo("polished_graphite", Type.ITEM, Tab.MINERALS));

    //Gold and Silver
    // Alluvial Slush added 10/1/23 - Nyagi
    add(new ItemInfo("alluvial_slush", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Alluvial Slush added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_alluvial_slush", Type.ITEM, Tab.MINERALS));
    // Native Cluster added 10/1/23 - Nyagi
    add(new ItemInfo("native_cluster", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Native Cluster added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_native_cluster", Type.ITEM, Tab.MINERALS));
    // Raw Argentite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_argentite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Argentite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_argentite", Type.ITEM, Tab.MINERALS));
    // Raw Chlorargyrite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_chlorargyrite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Chlorargyrite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_chlorargyrite", Type.ITEM, Tab.MINERALS));
    // Raw Polybasite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_polybasite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Polybasite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_polybasite", Type.ITEM, Tab.MINERALS));
    // Raw Proustite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_proustite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Proustite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_proustite", Type.ITEM, Tab.MINERALS));
    // Raw Electrum added 10/1/23 - Nyagi
    add(new ItemInfo("raw_electrum", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Electrum added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_electrum", Type.ITEM, Tab.MINERALS));
    // Raw Kustelite Electrum added 10/1/23 - Nyagi
    add(new ItemInfo("raw_kustelite_electrum", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Kustelite Electrum added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_kustelite_electrum", Type.ITEM, Tab.MINERALS));

    //Redstone and Mercury
    // Raw Cinnabar added 10/9/23 - Nyagi
    add(new ItemInfo("raw_cinnabar", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Cinnabar added 12/23/24 - Nyagi
    add(new ItemInfo("polished_cinnabar", Type.ITEM, Tab.MINERALS));
    // Raw Metacinnabar added 10/9/23 - Nyagi
    add(new ItemInfo("raw_metacinnabar", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Metacinnabar added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_metacinnabar", Type.ITEM, Tab.MINERALS));
    // Raw Corderoite added 10/9/23 - Nyagi
    add(new ItemInfo("raw_corderoite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Corderoite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_corderoite", Type.ITEM, Tab.MINERALS));
    // Raw Basaltic Powder added 10/9/23 - Nyagi
    add(new ItemInfo("raw_basaltic_powder", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-mineralized Basaltic Powder added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_basaltic_powder", Type.ITEM, Tab.MINERALS));
    // Raw Calomel added 10/9/23 - Nyagi
    add(new ItemInfo("raw_calomel", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Calomel added 12/23/24 - Nyagi
    add(new ItemInfo("polished_calomel", Type.ITEM, Tab.MINERALS));
    // Raw Native Mercury Spherules added 10/9/23 - Nyagi
    add(new ItemInfo("raw_native_mercury_spherules", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Native Mercury Spherules added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_native_mercury_spherules", Type.ITEM, Tab.MINERALS));
    // Raw Montroydite added 10/9/23 - Nyagi
    add(new ItemInfo("raw_montroydite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Montroydite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_montroydite", Type.ITEM, Tab.MINERALS));
    // Raw Granulated Obsidian added 10/9/23 - Nyagi
    add(new ItemInfo("raw_granulated_obsidian", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-mineralized Granulated Obsidian added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_granulated_obsidian", Type.ITEM, Tab.MINERALS));

    //Crystals and Minerals
    // Raw Kimberlite added 10/9/23 - Nyagi
    add(new ItemInfo("raw_kimberlite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Kimberlite added 12/24/24 - Nyagi
    add(new ItemInfo("polished_kimberlite", Type.ITEM, Tab.MINERALS));
    // Raw Lamproite added 10/9/23 - Nyagi
    add(new ItemInfo("raw_lamproite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Lamproite added 12/24/24 - Nyagi
    add(new ItemInfo("polished_lamproite", Type.ITEM, Tab.MINERALS));
    // Raw Lazurite added 10/9/23 - Nyagi
    add(new ItemInfo("raw_lazurite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Lazurite added 12/24/24 - Nyagi
    add(new ItemInfo("polished_lazurite", Type.ITEM, Tab.MINERALS));
    // Raw Lapis Lazuli added 10/9/23 - Nyagi
    add(new ItemInfo("raw_lapis_lazuli", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Lapis Lazuli added 12/24/24 - Nyagi
    add(new ItemInfo("polished_lapis_lazuli", Type.ITEM, Tab.MINERALS));
    // Raw Prime Beryllic Cluster added 10/9/23 - Nyagi
    add(new ItemInfo("raw_prime_beryllic_cluster", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Prime Beryllic Cluster added 12/24/24 - Nyagi
    add(new ItemInfo("polished_prime_beryllic_cluster", Type.ITEM, Tab.MINERALS));
    // Raw Fluorite added 10/9/23 - Nyagi
    add(new ItemInfo("raw_fluorite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Fluorite added 12/24/24 - Nyagi
    add(new ItemInfo("polished_fluorite", Type.ITEM, Tab.MINERALS));
    // Raw Chalcogenide Crystal Cluster added 10/9/23 - Nyagi
    add(new ItemInfo("raw_chalcogenide_crystal_cluster", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Chalcogenide Crystal Cluster added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_chalcogenide_crystal_cluster", Type.ITEM, Tab.MINERALS));
    // Raw Salt Cluster added 10/9/23 - Nyagi
    add(new ItemInfo("raw_salt_cluster", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-mineralized Salt Cluster added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_salt_cluster", Type.ITEM, Tab.MINERALS));

    //Quartz
    // Raw Herkimer Diamond added 10/13/23 - Nyagi
    add(new ItemInfo("raw_herkimer_diamond", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Herkimer Diamond added 12/24/24 - Nyagi
    add(new ItemInfo("polished_herkimer_diamond", Type.ITEM, Tab.MINERALS));
    // Raw Dendritic Agate added 10/13/23 - Nyagi
    add(new ItemInfo("raw_dendritic_agate", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Dendritic Agate added 12/24/24 - Nyagi
    add(new ItemInfo("polished_dendritic_agate", Type.ITEM, Tab.MINERALS));
    // Raw Chalcedony added 10/13/23 - Nyagi
    add(new ItemInfo("raw_chalcedony", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Chalcedony added 12/24/24 - Nyagi
    add(new ItemInfo("polished_chalcedony", Type.ITEM, Tab.MINERALS));
    // Raw Rutilated Quartz added 10/13/23 - Nyagi
    add(new ItemInfo("raw_rutilated_quartz", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Rutilated Quartz added 12/24/24 - Nyagi
    add(new ItemInfo("polished_rutilated_quartz", Type.ITEM, Tab.MINERALS));
    // Raw Ametrine added 10/13/23 - Nyagi
    add(new ItemInfo("raw_ametrine", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Ametrine added 12/24/24 - Nyagi
    add(new ItemInfo("polished_ametrine", Type.ITEM, Tab.MINERALS));
    // Raw Rose Quartz added 10/13/23 - Nyagi
    add(new ItemInfo("raw_rose_quartz", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Shiny Rose Quartz added 12/24/24 - Nyagi
    add(new ItemInfo("polished_rose_quartz", Type.ITEM, Tab.MINERALS));
    // Raw Prasiolite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_prasiolite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Prasiolite added 12/24/24 - Nyagi
    add(new ItemInfo("polished_prasiolite", Type.ITEM, Tab.MINERALS));
    // Raw Meteoric Certus added 10/13/23 - Nyagi
    add(new ItemInfo("raw_meteoric_certus", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Meteoric Certus added 12/24/24 - Nyagi
    add(new ItemInfo("polished_meteoric_certus", Type.ITEM, Tab.MINERALS));

    //Zinc
    // Raw Zinc Carbonate added 10/13/23 - Nyagi
    add(new ItemInfo("raw_zinc_carbonate", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Zinc Carbonate added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_zinc_carbonate", Type.ITEM, Tab.MINERALS));
    // Raw Sphalerite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_sphalerite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Sphalerite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_sphalerite", Type.ITEM, Tab.MINERALS));
    // Raw Smithsonite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_smithsonite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Smithsonite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_smithsonite", Type.ITEM, Tab.MINERALS));
    // Raw Hemimorphite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_hemimorphite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Hemimorphite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_hemimorphite", Type.ITEM, Tab.MINERALS));
    // Raw Wurtzite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_wurtzite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Wurtzite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_wurtzite", Type.ITEM, Tab.MINERALS));
    // Raw Hydrozincite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_hydrozincite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Hydrozincite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_hydrozincite", Type.ITEM, Tab.MINERALS));
    // Raw Willemite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_willemite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Willemite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_willemite", Type.ITEM, Tab.MINERALS));
    // Raw Franklinite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_franklinite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Franklinite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_franklinite", Type.ITEM, Tab.MINERALS));

    //Aluminium
    // Raw Bauxite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_bauxite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Bauxite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_bauxite", Type.ITEM, Tab.MINERALS));
    // Raw Feldspar added 10/13/23 - Nyagi
    add(new ItemInfo("raw_feldspar", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Feldspar added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_feldspar", Type.ITEM, Tab.MINERALS));
    // Raw Clustered Beryl added 10/13/23 - Nyagi
    add(new ItemInfo("raw_clustered_beryl", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Clustered Beryl added 12/24/24 - Nyagi
    add(new ItemInfo("polished_clustered_beryl", Type.ITEM, Tab.MINERALS));
    // Raw Cryolite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_cryolite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Cryolite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_cryolite", Type.ITEM, Tab.MINERALS));
    // Raw Spinel added 10/13/23 - Nyagi
    add(new ItemInfo("raw_spinel", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Spinel added 12/24/24 - Nyagi
    add(new ItemInfo("polished_spinel", Type.ITEM, Tab.MINERALS));
    // Raw Turquoise added 10/13/23 - Nyagi
    add(new ItemInfo("raw_turquoise", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Polished Turquoise added 12/24/24 - Nyagi
    add(new ItemInfo("polished_turquoise", Type.ITEM, Tab.MINERALS));
    // Raw Garnet Slush added 10/13/23 - Nyagi
    add(new ItemInfo("raw_garnet_slush", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Garnet Slush added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_garnet_slush", Type.ITEM, Tab.MINERALS));
    // Raw Native Aluminum added 10/13/23 - Nyagi
    add(new ItemInfo("raw_native_aluminum", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Native Aluminum added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_native_aluminum", Type.ITEM, Tab.MINERALS));

    //Lead
    //Galena added 10/20/23 - Nyagi
    add(new ItemInfo("raw_galena", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Galena added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_galena", Type.ITEM, Tab.MINERALS));
    //Lead Sulphide added 10/20/23 - Nyagi
    add(new ItemInfo("raw_lead_sulphide", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Lead Sulphide added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_lead_sulphide", Type.ITEM, Tab.MINERALS));
    //Pyromorphite added 10/20/23 - Nyagi
    add(new ItemInfo("raw_pyromorphite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Pyromorphite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_pyromorphite", Type.ITEM, Tab.MINERALS));
    //Cerussite added 10/20/23 - Nyagi
    add(new ItemInfo("raw_cerussite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Cerussite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_cerussite", Type.ITEM, Tab.MINERALS));
    //Anglesite added 10/20/23 - Nyagi
    add(new ItemInfo("raw_anglesite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Anglesite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_anglesite", Type.ITEM, Tab.MINERALS));
    //Wulfenite added 10/20/23 - Nyagi
    add(new ItemInfo("raw_wulfenite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Wulfenite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_wulfenite", Type.ITEM, Tab.MINERALS));
    //Vanadinite added 10/20/23 - Nyagi
    add(new ItemInfo("raw_vanadinite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Vanadinite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_vanadinite", Type.ITEM, Tab.MINERALS));
    //Mimetite added 10/20/23 - Nyagi
    add(new ItemInfo("raw_mimetite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Mimetite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_mimetite", Type.ITEM, Tab.MINERALS));

    //Nickel
    //Pentlandite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_pentlandite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Pentlandite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_pentlandite", Type.ITEM, Tab.MINERALS));
    //Garnierite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_garnierite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Garnierite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_garnierite", Type.ITEM, Tab.MINERALS));
    //Saprolite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_saprolite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Saprolite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_saprolite", Type.ITEM, Tab.MINERALS));
    //Hardened Sulfide Flow added 10/27/23 - Nyagi
    add(new ItemInfo("raw_hardened_sulfide_flow", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-Mineralized Hardened Sulfide Flow added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_hardened_sulfide_flow", Type.ITEM, Tab.MINERALS));
    //Millerite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_millerite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Millerite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_millerite", Type.ITEM, Tab.MINERALS));
    //Nickeline added 10/27/23 - Nyagi
    add(new ItemInfo("raw_nickeline", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Nickeline added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_nickeline", Type.ITEM, Tab.MINERALS));
    //Meteoric Taenite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_meteoric_taenite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Meteoric Taenite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_meteoric_taenite", Type.ITEM, Tab.MINERALS));
    //Meteoric Kamacite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_meteoric_kamacite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Meteoric Kamacite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_meteoric_kamacite", Type.ITEM, Tab.MINERALS));

    //Uranium & Thorium
    //Pitchblende added 10/27/23 - Nyagi
    add(new ItemInfo("raw_pitchblende", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Pitchblende added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_pitchblende", Type.ITEM, Tab.MINERALS));
    //Carnotite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_carnotite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Carnotite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_carnotite", Type.ITEM, Tab.MINERALS));
    //Tyuyamunite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_tyuyamunite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Tyuyamunite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_tyuyamunite", Type.ITEM, Tab.MINERALS));
    //Torbernite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_torbernite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Torbernite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_torbernite", Type.ITEM, Tab.MINERALS));
    //Autunite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_autunite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Autunite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_autunite", Type.ITEM, Tab.MINERALS));
    //Thorite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_thorite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Thorite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_thorite", Type.ITEM, Tab.MINERALS));
    //Uranothorite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_uranothorite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Uranothorite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_uranothorite", Type.ITEM, Tab.MINERALS));
    //Thorianite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_thorianite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Thorianite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_thorianite", Type.ITEM, Tab.MINERALS));

    //Tin
    //Cassiterite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_cassiterite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Cassiterite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_cassiterite", Type.ITEM, Tab.MINERALS));
    //Stannite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_stannite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Stannite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_stannite", Type.ITEM, Tab.MINERALS));
    //Cylindrite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_cylindrite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Cylindrite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_cylindrite", Type.ITEM, Tab.MINERALS));
    //Franckeite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_franckeite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Franckeite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_franckeite", Type.ITEM, Tab.MINERALS));
    //Canfieldite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_canfieldite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Canfieldite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_canfieldite", Type.ITEM, Tab.MINERALS));
    //Teallite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_teallite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Teallite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_teallite", Type.ITEM, Tab.MINERALS));
    //Brannerite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_brannerite", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Brannerite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_brannerite", Type.ITEM, Tab.MINERALS));
    //Orthoclase added 11/3/23 - Nyagi
    add(new ItemInfo("raw_orthoclase", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Sintered Orthoclase added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_orthoclase", Type.ITEM, Tab.MINERALS));

    //Misc Processing Ores
    //Saltpeter added 11/3/23 - Nyagi
    add(new ItemInfo("raw_saltpeter", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-Mineralized Saltpeter added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_saltpeter", Type.ITEM, Tab.MINERALS));
    //Borax added 11/3/23 - Nyagi
    add(new ItemInfo("raw_borax", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-Mineralized Borax added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_borax", Type.ITEM, Tab.MINERALS));
    //Compacted Limestone added 11/3/23 - Nyagi
    add(new ItemInfo("raw_compacted_limestone", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-Mineralized Compacted Limestone added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_compacted_limestone", Type.ITEM, Tab.MINERALS));
    //Volcanic Sulfur added 11/3/23 - Nyagi
    add(new ItemInfo("raw_volcanic_sulfur", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-Mineralized Volcanic Sulfur added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_volcanic_sulfur", Type.ITEM, Tab.MINERALS));
    //Rainbow Obsidian added 11/3/23 - Nyagi
    add(new ItemInfo("raw_rainbow_obsidian", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-Mineralized Rainbow Obsidian added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_rainbow_obsidian", Type.ITEM, Tab.MINERALS));
    //Petrified Wood added 11/3/23 - Nyagi
    add(new ItemInfo("raw_petrified_wood", Type.CUSTOM_ORE, Tab.MINERALS));
    //- Biologically Activated Petrified Wood added 12/24/24 - Nyagi
    add(new ItemInfo("biologically_activated_petrified_wood", Type.ITEM, Tab.MINERALS));
    //Chalk added 11/3/23 - Nyagi
    add(new ItemInfo("raw_chalk", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-Mineralized Chalk added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_chalk", Type.ITEM, Tab.MINERALS));
    //Trona Ore (Baking Soda) added 11/3/23 - Nyagi
    add(new ItemInfo("raw_trona", Type.CUSTOM_ORE, Tab.MINERALS));
    //- De-Mineralized Trona Ore added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_trona", Type.ITEM, Tab.MINERALS));

    //Immersive Engineering Excavator Ores
    //Carbonate Igneous Deposit
    //Columbite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_columbite", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Phosphorite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_phosphorite", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Fluorspar added 12/5/24 - Nyagi
    add(new ItemInfo("raw_fluorspar", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Zirconia added 12/5/24 - Nyagi
    add(new ItemInfo("raw_zirconia", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Argyrodite Deposit
    //Germanite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_germanite", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Ancient Mineral Spring Deposit
    //Spodumene added 12/5/24 - Nyagi
    add(new ItemInfo("raw_spodumene", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Petalite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_petalite", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Lepidolite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_lepidolite", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Amblygonite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_amblygonite", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Hydrocarbon Rich Deposit
    //Oil Sands added 12/5/24 - Nyagi
    add(new ItemInfo("raw_oil_sands", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Kerogen added 12/5/24 - Nyagi
    add(new ItemInfo("raw_kerogen", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Fossil Deposit
    //Ancient Fossil added 12/5/24 - Nyagi
    add(new ItemInfo("ancient_fossil", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Endermorphic Deposit
    //End Organic Mush added 12/5/24 - Nyagi
    add(new ItemInfo("end_organic_mush", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Ender Pumice added 12/5/24 - Nyagi
    add(new ItemInfo("ender_pumice", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Core Seam
    //Deep Ground Sample added 12/5/24 - Nyagi
    add(new ItemInfo("deep_ground_sample", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Helium Deposit
    //items already exist, this is just here to keep track of deposit types
    //Lanthanithic Deposit
    //Monazite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_monazite", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Cerite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_cerite", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Allanite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_allanite", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Bastnasite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_bastnasite", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Xenotime added 12/5/24 - Nyagi
    add(new ItemInfo("raw_xenotime", Type.CUSTOM_TOOLTIP, Tab.MINERALS));
    //Void Seam
    //Cosmic Irradiated Flake Fragment added 12/5/24 - Nyagi
    add(new ItemInfo("cosmic_irradiated_flake_fragment", Type.CUSTOM_TOOLTIP, Tab.MINERALS));

    //Ore-related drops
    //TODO: Find missing date
    //Sapphire
    add(new ItemInfo("sapphire", Type.ITEM, Tab.MINERALS));
    //Sapphire Dust
    add(new ItemInfo("sapphire_dust", Type.ITEM, Tab.MINERALS));
    //Ruby
    add(new ItemInfo("ruby", Type.ITEM, Tab.MINERALS));
    //Ruby Dust
    add(new ItemInfo("ruby_dust", Type.ITEM, Tab.MINERALS));
    //Aquamarine
    add(new ItemInfo("aquamarine", Type.ITEM, Tab.MINERALS));
    //Aquamarine Dust
    add(new ItemInfo("aquamarine_dust", Type.ITEM, Tab.MINERALS));
    //Morganite
    add(new ItemInfo("morganite", Type.ITEM, Tab.MINERALS));
    //Morganite Dust
    add(new ItemInfo("morganite_dust", Type.ITEM, Tab.MINERALS));
    //Heliodor
    add(new ItemInfo("heliodor", Type.ITEM, Tab.MINERALS));
    //Heliodor Dust
    add(new ItemInfo("heliodor_dust", Type.ITEM, Tab.MINERALS));
    //Goshenite
    add(new ItemInfo("goshenite", Type.ITEM, Tab.MINERALS));
    //Goshenite Dust
    add(new ItemInfo("goshenite_dust", Type.ITEM, Tab.MINERALS));
    //Bixbite
    add(new ItemInfo("bixbite", Type.ITEM, Tab.MINERALS));
    //Bixbite Dust
    add(new ItemInfo("bixbite_dust", Type.ITEM, Tab.MINERALS));
    //Pezzottaite
    add(new ItemInfo("pezzottaite", Type.ITEM, Tab.MINERALS));
    //Pezzottaite Dust
    add(new ItemInfo("pezzottaite_dust", Type.ITEM, Tab.MINERALS));

    //Create Sequenced Assembly Intermediates

    //Note: The 4th parameter is to pick what model the item uses instead, to avoid having to repeat models.
    //This works with any ItemInfo, but is mostly relevant for these.

    // Incomplete Controller added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_controller", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Cell Workbench added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_cell_workbench", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Item Cell Housing added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_me_item_cell_housing", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Charged Quartz Fixture added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_charged_quartz_fixture", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Skystone Tank added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_skystone_tank", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Interface added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_me_interface", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Charger added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_charger", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete 1k ME Storage Component added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_onek_me_storage_component", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Inscriber added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_inscriber", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Fluix ME Glass Cable added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_fluix_me_glass_cable", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Fluix ME Smart Cable added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_fluix_me_smart_cable", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Fluix ME Dense Smart Cable added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_fluix_me_dense_smart_cable", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Drive added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_me_drive", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Chest added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_chest", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Vibration Chamber added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_vibration_chamber", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Light Detecting Fixture added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_light_detecting_fixture", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Illuminated Panel added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_illuminated_panel", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Storage Bus added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_storage_bus", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Import Bus added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_import_bus", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Export Bus added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_export_bus", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Level Emitter added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_level_emitter", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Energy Level Emitter added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_energy_level_emitter", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Annihilation Plane added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_annihilation_plane", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Formation Plane added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_formation_plane", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Terminal added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_terminal", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Crafting Terminal added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_crafting_terminal", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME p2p Tunnel added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_ptwop_tunnel", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Security Terminal added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_security_terminal", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME IO Port added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_io_port", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Energy Cell added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_energy_cell", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Storage Monitor added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_storage_monitor", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Color Applicator added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_color_applicator", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Logic Processor added 2/22/24 - Nyagi
    add(new ItemInfo("incomplete_logic_processor", Type.ITEM, Tab.SEQUENCE));
    // Incomplete Calculation Processor added 2/22/24 - Nyagi
    add(new ItemInfo("incomplete_calculation_processor", Type.ITEM, Tab.SEQUENCE));
    // Incomplete Engineering Processor added 2/22/24 - Nyagi
    add(new ItemInfo("incomplete_engineering_processor", Type.ITEM, Tab.SEQUENCE));
    // Incomplete ME Fluid Cell Housing added 2/22/24 - Nyagi
    add(new ItemInfo("incomplete_me_fluid_cell_housing", Type.ITEM, Tab.SEQUENCE));
    // Incomplete Energy Acceptor added 2/22/24 - Nyagi
    add(new ItemInfo("incomplete_energy_acceptor", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Energy Cell added 6/25/24 - Nyagi
    add(new ItemInfo("incomplete_energy_cell", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Logic Dud added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_logic_dud", Type.ITEM, Tab.SEQUENCE));
    // Incomplete Calculation Dud added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_calculation_dud", Type.ITEM, Tab.SEQUENCE));
    // Incomplete Engineering Dud added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_engineering_dud", Type.ITEM, Tab.SEQUENCE));
    // Incomplete Sterilized Quartz Glass Vinegar added 1/4/25 - Nyagi
    add(new ItemInfo("incomplete_sterilized_quartz_glass_vinegar", Type.ITEM, Tab.SEQUENCE, "sterilized_quartz_glass"));
    // Incomplete Sterilized Quartz Glass Phenoxyethanol added 1/4/25 - Nyagi
    add(new ItemInfo("incomplete_sterilized_quartz_glass_phenoxyethanol", Type.ITEM, Tab.SEQUENCE, "sterilized_quartz_glass"));
    // Incomplete Petri Dish Glass added 1/4/25 - Nyagi
    add(new ItemInfo("incomplete_petri_dish_glass", Type.ITEM, Tab.SEQUENCE, "petri_dish_empty"));
    // Incomplete Petri Dish Quartz Glass added 1/4/25 - Nyagi
    add(new ItemInfo("incomplete_petri_dish_quartz_glass", Type.ITEM, Tab.SEQUENCE, "petri_dish_empty"));
    // Incomplete Petri Dish Acetobacter added 1/4/25 - Barza
    add(new ItemInfo("incomplete_petri_dish_acetobacter_initial", Type.ITEM, Tab.SEQUENCE, "petri_dish_agar_agar"));
    // Incomplete Petri Dish Acetobacter added 1/4/25 - Barza
    add(new ItemInfo("incomplete_petri_dish_acetobacter_reclaim", Type.ITEM, Tab.SEQUENCE, "petri_dish_agar_agar"));
    // Incomplete Skystone Shielding added 1/4/25 - Nyagi
    add(new ItemInfo("incomplete_skystone_shielding", Type.ITEM, Tab.SEQUENCE, "skystone_shielding"));
    // Incomplete Skystone Shielding Boule added 1/4/25 - Nyagi
    add(new ItemInfo("incomplete_skystone_shielding_boule", Type.ITEM, Tab.SEQUENCE, "skystone_shielding"));
    // Incomplete Raw Clustered Beryl Crude added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_cluster_beryl_crude", Type.ITEM, Tab.SEQUENCE, "raw_clustered_beryl"));
    // Incomplete Raw Clustered Beryl Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_cluster_beryl_polish", Type.ITEM, Tab.SEQUENCE, "raw_clustered_beryl"));
    // Incomplete Raw Prime Beryl Crude added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_prime_beryl_crude", Type.ITEM, Tab.SEQUENCE, "raw_prime_beryllic_cluster"));
    // Incomplete Raw Prime Beryl Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_prime_beryl_polish", Type.ITEM, Tab.SEQUENCE, "raw_prime_beryllic_cluster"));
    // Incomplete Raw Graphite Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_graphite_polish", Type.ITEM, Tab.SEQUENCE, "raw_graphite"));
    // Incomplete Raw Kimberlite Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_kimberlite_polish", Type.ITEM, Tab.SEQUENCE, "raw_kimberlite"));
    // Incomplete Raw Lamproite Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_lamproite_polish", Type.ITEM, Tab.SEQUENCE, "raw_lamproite"));
    // Incomplete Raw Lazurite Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_lazurite_polish", Type.ITEM, Tab.SEQUENCE, "raw_lazurite"));
    // Incomplete Raw Lapis Lazuli Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_lapis_lazuli_polish", Type.ITEM, Tab.SEQUENCE, "raw_lapis_lazuli"));
    // Incomplete Raw Fluorite Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_fluorite_polish", Type.ITEM, Tab.SEQUENCE, "raw_fluorite"));
    // Incomplete Raw Rutilated Quartz Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_rutilated_quartz_polish", Type.ITEM, Tab.SEQUENCE, "raw_rutilated_quartz"));
    // Incomplete Raw Ametrine Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_ametrine_polish", Type.ITEM, Tab.SEQUENCE, "raw_ametrine"));
    // Incomplete Raw Rose Quartz Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_rose_quartz_polish", Type.ITEM, Tab.SEQUENCE, "raw_rose_quartz"));
    // Incomplete Raw Prasiolite Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_prasiolite_polish", Type.ITEM, Tab.SEQUENCE, "raw_prasiolite"));
    // Incomplete Raw Meteoric Certus Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_meteoric_certus_polish", Type.ITEM, Tab.SEQUENCE, "raw_meteoric_certus"));
    // Incomplete Raw Turquoise Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_turquoise_polish", Type.ITEM, Tab.SEQUENCE, "raw_turquoise"));
    // Incomplete Raw Herkimer Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_herkimer_polish", Type.ITEM, Tab.SEQUENCE, "raw_herkimer_diamond"));
    // Incomplete Raw Dendritic Agate Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_dendritic_agate_polish", Type.ITEM, Tab.SEQUENCE, "raw_dendritic_agate"));
    // Incomplete Raw Chalcedony Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_chalcedony_polish", Type.ITEM, Tab.SEQUENCE, "raw_chalcedony"));
    // Incomplete Raw Spinel Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_spinel_polish", Type.ITEM, Tab.SEQUENCE, "raw_spinel"));

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Sintered/Polished Tier 1 Items
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //NOTICE: Fluid bucket registration is no longer handled here, but it has been compressed into FluidInfo and ModFluids.
  }

  //This goes through the items and runs the method in ItemInfo to then register them.
  static{
    populateList();
    for(ItemInfo info : ITEMS_LIST){
      RegistryObject<Item> registeredItem = ITEMS.register(info.getId(), info::registerItem);
    }
  }


  // Finally, we commit our items
  public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }

  //This replaces the suppliers and is used in ItemInfo to call the correct class to register an item in.
  public enum Type{
    ITEM,
    CUSTOM_TOOLTIP,
    CURIO,
    LEVITATING,
    CUSTOM_ORE
  }

}
