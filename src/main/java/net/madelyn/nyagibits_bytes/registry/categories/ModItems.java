package net.madelyn.nyagibits_bytes.registry.categories;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.registry.ModRegistries;
import net.madelyn.nyagibits_bytes.registry.helpers.ItemInfo;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

import java.util.List;

import static net.madelyn.nyagibits_bytes.content.item.CustomCurioItem.CurioFlags;
import static net.madelyn.nyagibits_bytes.misc.Utils.Tab;

public class ModItems {
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
  public static void add(ItemInfo item){
    ModRegistries.ITEMS_LIST.add(item);
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
    add(new ItemInfo("tier_zero_strawberry", Tab.ITEMS));
    // Tier 0 Golden Strawberry added 2/21/23 - Nyagi
    add(new ItemInfo("golden_tier_zero_strawberry", Tab.ITEMS));
    // Tier 1 Strawberry added 2/21/23 - Nyagi
    add(new ItemInfo("tier_one_strawberry", Tab.ITEMS));
    // Tier 1 Golden Strawberry added 2/21/23 - Nyagi
    add(new ItemInfo("golden_tier_one_strawberry", Tab.ITEMS));
    // Tier 2 Strawberry added 5/16/23 - Nyagi
    add(new ItemInfo("tier_two_strawberry", Tab.ITEMS));
    // Tier 2 Golden Strawberry added 5/16/23 - Nyagi
    add(new ItemInfo("golden_tier_two_strawberry", Tab.ITEMS));
    // Livisite Alloy added 7/11/23 - Nyagi
    add(new ItemInfo("livisite_alloy", Tab.ITEMS));
    // Livisite Slate added 7/11/23 - Nyagi
    add(new ItemInfo("livisite_slate", Tab.ITEMS));
    // Crude Abrasive added 7/11/23 - Nyagi
    add(new ItemInfo("crude_abrasive", Tab.ITEMS));
    // Pile of Cogs added 7/11/23 - Nyagi
    add(new ItemInfo("pile_of_cogs", Tab.ITEMS));
    // Pile of Crude Mechanical Parts added 7/11/23 - Nyagi
    add(new ItemInfo("pile_of_crude_mechanical_parts", Tab.ITEMS));
    // Soil Sample added 7/25/23 - Nyagi
    add(new ItemInfo("soil_sample", Tab.ITEMS));
    // Sturdy Box added 7/25/23 - Nyagi
    add(new ItemInfo("sturdy_box", Tab.ITEMS));
    // Sealed Pouch added 7/25/23 - Nyagi
    add(new ItemInfo("sealed_pouch", Tab.ITEMS));
    // Salt Water added 7/25/23 - Nyagi (deprecated)
    // add(new ItemInfo("bucket_of_salt_water", Tab.ITEMS));
    // Torn Wool Ball added 7/25/23 - Nyagi
    add(new ItemInfo("torn_wool_ball", Tab.ITEMS));
    // Etched Redstone Plate added 8/10/23 - Nyagi
    add(new ItemInfo("etched_redstone_plate", Tab.ITEMS));
    // Crude Silicon Boule added 8/10/23 - Nyagi
    add(new ItemInfo("crude_silicon_boule", Tab.ITEMS));
    // Diamond Shard added 8/10/23 - Nyagi
    add(new ItemInfo("diamond_shard", Tab.ITEMS));
    // Logic Dud added 8/10/23 - Nyagi
    add(new ItemInfo("logic_dud", Tab.ITEMS));
    // Calculation Dud added 8/10/23 - Nyagi
    add(new ItemInfo("calculation_dud", Tab.ITEMS));
    // Engineering Dud added 8/10/23 - Nyagi
    add(new ItemInfo("engineering_dud", Tab.ITEMS));
    // Chemistry Rack added 8/27/23 - Nyagi
    add(new ItemInfo("chemistry_rack", Tab.ITEMS));
    // Basic Composite Material added 8/27/23 - Nyagi
    add(new ItemInfo("basic_composite_material", Tab.ITEMS));
    // Basic Composite Plate added 8/27/23 - Nyagi
    add(new ItemInfo("basic_composite_plate", Tab.ITEMS));
    // Compacted Soil added 3/17/24 - Nyagi
    add(new ItemInfo("compacted_soil", Tab.ITEMS));
    // Tough Bag added 3/17/24 - Nyagi
    add(new ItemInfo("tough_bag", Tab.ITEMS));
    // Sponged Steel added 3/25/24 - Nyagi
    add(new ItemInfo("sponged_steel", Tab.ITEMS));
    // Sodium Polyacrylate added 3/26/24 - Nyagi
    add(new ItemInfo("sodium_polyacrylate", Tab.ITEMS));
    // Endoflame Mush added 3/26/24 - Nyagi
    add(new ItemInfo("endoflame_mush", Tab.ITEMS));
    // Hydroangeas Mush added 7/20/24 - Nyagi
    add(new ItemInfo("hydroangeas_mush", Tab.ITEMS));
    // Gourmaryllis Mush added 7/20/24 - Nyagi
    add(new ItemInfo("gourmaryllis_mush", Tab.ITEMS));
    // Thermalily Mush added 7/20/24 - Nyagi
    add(new ItemInfo("thermalily_mush", Tab.ITEMS));
    // Entropinnyum Mush added 7/20/24 - Nyagi
    add(new ItemInfo("entropinnyum_mush", Tab.ITEMS));
    // Munchdew Mush added 7/20/24 - Nyagi
    add(new ItemInfo("munchdew_mush", Tab.ITEMS));
    // Narslimmus Mush added 7/20/24 - Nyagi
    add(new ItemInfo("narslimmus_mush", Tab.ITEMS));
    // Rosa Arcana Mush added 7/20/24 - Nyagi
    add(new ItemInfo("rosa_arcana_mush", Tab.ITEMS));
    // Manasteel Lattice added 3/26/24 - Nyagi
    add(new ItemInfo("manasteel_lattice", Tab.ITEMS));
    // Rune Binder added 3/26/24 - Nyagi
    add(new ItemInfo("rune_binder", Tab.ITEMS));
    // Rubberized Cable added 4/10/24 - Nyagi
    add(new ItemInfo("rubberized_cable", Tab.ITEMS));
    // Ceramic added 4/10/24 - Nyagi
    add(new ItemInfo("ceramic", Tab.ITEMS));
    // Activated Charcoal added 4/10/24 - Nyagi
    add(new ItemInfo("activated_charcoal", Tab.ITEMS));
    // Sturdy Tray added 4/10/24 - Nyagi
    add(new ItemInfo("sturdy_tray", Tab.ITEMS));
    // Beaker added 4/10/24 - Nyagi
    add(new ItemInfo("beaker", Tab.ITEMS));
    // Round Bottom Flask added 4/10/24 - Nyagi
    add(new ItemInfo("round_bottom_flask", Tab.ITEMS));
    // Distillation Column added 4/10/24 - Nyagi
    add(new ItemInfo("distillation_column", Tab.ITEMS));
    // Inlet added 4/10/24 - Nyagi
    add(new ItemInfo("inlet", Tab.ITEMS));
    // Burette added 4/10/24 - Nyagi
    add(new ItemInfo("burette", Tab.ITEMS));
    // Sterilized Quartz Glass added 4/10/24 - Nyagi
    add(new ItemInfo("sterilized_quartz_glass", Tab.ITEMS));
    // pH Strip added 4/10/24 - Nyagi
    add(new ItemInfo("ph_strip", Tab.ITEMS));
    // Low Grade Coke added 4/21/24 - Nyagi
    add(new ItemInfo("low_grade_coke", Tab.ITEMS));
    // Industrial Grade Coke added 4/21/24 - Nyagi
    add(new ItemInfo("industrial_grade_coke", Tab.ITEMS));
    // Wrought Ball Bearing added 4/21/24 - Nyagi
    add(new ItemInfo("wrought_ball_bearing", Tab.ITEMS));
    // Wrought Tiny Spring added 4/21/24 - Nyagi
    add(new ItemInfo("wrought_tiny_spring", Tab.ITEMS));
    // Wrought Iron Rod added 4/21/24 - Nyagi
    add(new ItemInfo("wrought_iron_rod", Tab.ITEMS));
    // Mixed Seeds added 4/21/24 - Nyagi
    add(new ItemInfo("mixed_seeds", Tab.ITEMS));
    // Hard Hat added 4/21/24 - Nyagi
    add(new ItemInfo("hard_hat", Tab.ITEMS));
    // Protective Eye-wear added 5/1/24 - Nyagi
    add(new ItemInfo("protective_eye_wear", Tab.ITEMS));
    // Fire Extinguisher added 5/1/24 - Nyagi
    add(new ItemInfo("fire_extinguisher", Tab.ITEMS));
    // Organic Vapor Respirator added 5/1/24 - Nyagi
    add(new ItemInfo("organic_vapor_respirator", Tab.ITEMS));
    // Hardened Mechanical Bearing added 5/1/24 - Nyagi
    add(new ItemInfo("hardened_mechanical_bearing", Tab.ITEMS));
    // Fasteners added 5/1/24 - Nyagi
    add(new ItemInfo("fasteners", Tab.ITEMS));
    // Synchronous Electric Motor added 5/1/24 - Nyagi
    add(new ItemInfo("synchronous_electric_motor", Tab.ITEMS));
    // Industrial Gear added 5/1/24 - Nyagi
    add(new ItemInfo("industrial_gear", Tab.ITEMS));
    // Dampener added 5/1/24 - Nyagi
    add(new ItemInfo("dampener", Tab.ITEMS));
    // Reinforced Gearbox added 5/1/24 - Nyagi
    add(new ItemInfo("reinforced_gearbox", Tab.ITEMS));
    // V-Belt added 5/1/24 - Nyagi
    add(new ItemInfo("v_belt", Tab.ITEMS));
    // Solenoid Component added 5/1/24 - Nyagi
    add(new ItemInfo("solenoid_component", Tab.ITEMS));
    // Flux Mixture added 5/8/24 - Nyagi
    add(new ItemInfo("flux_mixture", Tab.ITEMS));
    // Damascus Steel added 5/13/24 - Nyagi
    add(new ItemInfo("steel_damascus", Tab.ITEMS));
    // High Carbon Steel - 1080 added 5/13/24 - Nyagi
    add(new ItemInfo("steel_high_carbon_1080", Tab.ITEMS));
    // High Carbon Steel - 15N20 added 5/13/24 - Nyagi
    add(new ItemInfo("steel_high_carbon_15n20", Tab.ITEMS));
    // Stainless Steel added 5/13/24 - Nyagi
    add(new ItemInfo("steel_stainless", Tab.ITEMS));
    // Low Voltage Capacitor added 6/5/24 - Nyagi
    add(new ItemInfo("low_voltage_capacitor", Tab.ITEMS));
    // Threaded Composite Leather added 6/5/24 - Nyagi
    add(new ItemInfo("threaded_composite_leather", Tab.ITEMS));
    // Industrial Composite Plate added 6/5/24 - Nyagi
    add(new ItemInfo("industrial_composite_plate", Tab.ITEMS));
    // Lead-Acid Cell added 6/5/24 - Nyagi
    add(new ItemInfo("lead_acid_cell", Tab.ITEMS));
    // Heavy Plating added 6/5/24 - Nyagi
    add(new ItemInfo("heavy_plating", Tab.ITEMS));
    // Soldering Iron added 6/5/24 - Nyagi
    add(new ItemInfo("soldering_iron", Tab.ITEMS));
    // Low Temperature Solder added 6/5/24 - Nyagi
    add(new ItemInfo("low_temperature_solder", Tab.ITEMS));
    // Ceramic Encased Copper added 6/5/24 - Nyagi
    add(new ItemInfo("ceramic_encased_copper", Tab.ITEMS));
    // Hydraulic Hammer added 6/5/24 - Nyagi
    add(new ItemInfo("hydraulic_hammer", Tab.ITEMS));
    // Tempered Glass added 6/5/24 - Nyagi
    add(new ItemInfo("tempered_glass", Tab.ITEMS));
    // Annealed Glass added 6/5/24 - Nyagi
    add(new ItemInfo("annealed_glass", Tab.ITEMS));
    // Tungsten Wire added 6/5/24 - Nyagi
    add(new ItemInfo("tungsten_wire", Tab.ITEMS));
    // Woven Cloth added 6/5/24 - Nyagi
    add(new ItemInfo("woven_cloth", Tab.ITEMS));
    // Solder Wire added 6/8/24 - Nyagi
    add(new ItemInfo("solder_wire", Tab.ITEMS));
    // Fluorophlogopite added 6/28/24 - Nyagi
    add(new ItemInfo("fluorophlogopite", Tab.ITEMS));
    // Synthetic Mica added 6/28/24 - Nyagi
    add(new ItemInfo("synthetic_mica", Tab.ITEMS));
    // TPV Cell added 6/28/24 - Nyagi
    add(new ItemInfo("tpv_cell", Tab.ITEMS));
    // Polycrystalline Silicon Carbide added 6/28/24 - Nyagi
    add(new ItemInfo("polycrystalline_silicon_carbide", Tab.ITEMS));
    // Zinc-Gallium-Antimony Alloy added 6/28/24 - Nyagi
    add(new ItemInfo("zinc_gallium_antimony_alloy", Tab.ITEMS));
    // Ash added 7/15/24 - Nyagi
    add(new ItemInfo("ash", Tab.ITEMS));
    // Potash added 7/15/24 - Nyagi
    add(new ItemInfo("potash", Tab.ITEMS));
    // Wood Ash added 7/15/24 - Nyagi
    add(new ItemInfo("wood_ash", Tab.ITEMS));
    // Metamorphic Alloy added 7/15/24 - Nyagi
    add(new ItemInfo("metamorphic_alloy", Tab.ITEMS));
    // Ore Extraction Plate added 7/15/24 - Nyagi
    add(new ItemInfo("ore_extraction_plate", Tab.ITEMS));
    // Chromatic Compound added 8/3/24 - Barza
    add(new ItemInfo("chromatic_compound", Tab.ITEMS));
    // Refined Radiance added 8/3/24 - Barza
    add(new ItemInfo("refined_radiance", Tab.ITEMS).levitates());
    // Shadow Steel added 8/3/24 - Barza
    add(new ItemInfo("shadow_steel", Tab.ITEMS).levitates());
    // Ae2 Assembly added 8/10/23 - Nyagi
    add(new ItemInfo("ae2_assembly", Tab.ITEMS));
    // Crystal Harmonizer added 8/10/23 - Nyagi
    add(new ItemInfo("crystal_harmonizer", Tab.ITEMS));
    // Processor Stack added 8/10/23 - Nyagi
    add(new ItemInfo("processor_stack", Tab.ITEMS));
    // Energized Frame added 8/10/23 - Nyagi
    add(new ItemInfo("energized_frame", Tab.ITEMS));
    // Energized Wires added 8/10/23 - Nyagi
    add(new ItemInfo("energized_wires", Tab.ITEMS));
    // Skystone Shielding added 8/10/23 - Nyagi
    add(new ItemInfo("skystone_shielding", Tab.ITEMS));
    // Matter Converters added 8/10/23 - Nyagi
    add(new ItemInfo("matter_converters", Tab.ITEMS));
    // Decorative Paneling added 8/10/23 - Nyagi
    add(new ItemInfo("decorative_paneling", Tab.ITEMS));
    // MicroTools added 8/10/23 - Nyagi
    add(new ItemInfo("micro_tools", Tab.ITEMS));
    // Botania Assembly added 3/17/24 - Nyagi
    add(new ItemInfo("botania_assembly", Tab.ITEMS));
    // Semi-organic Substrate added 3/17/24 - Nyagi
    add(new ItemInfo("semi_organic_substrate", Tab.ITEMS));
    // Soil Conditioner added 3/17/24 - Nyagi
    add(new ItemInfo("soil_conditioner", Tab.ITEMS));
    // Living Frame added 3/17/24 - Nyagi
    add(new ItemInfo("living_frame", Tab.ITEMS));
    // Terrarium added 3/17/24 - Nyagi
    add(new ItemInfo("terrarium", Tab.ITEMS));
    // Organic Pseudo Logic added 3/17/24 - Nyagi
    add(new ItemInfo("organic_pseudo_logic", Tab.ITEMS));
    // Sealant added 3/17/24 - Nyagi
    add(new ItemInfo("sealant", Tab.ITEMS));
    // Magnetic Hematite added 3/17/24 - Nyagi
    add(new ItemInfo("magnetic_hematite", Tab.ITEMS));
    // Mystic Fertilizer added 3/17/24 - Nyagi
    add(new ItemInfo("mystic_fertilizer", Tab.ITEMS));
    // Alchemistry Assembly added 4/6/24 - Nyagi
    add(new ItemInfo("alchemistry_assembly", Tab.ITEMS));
    // Electrolytic Core added 4/6/24 - Nyagi
    add(new ItemInfo("electrolytic_core", Tab.ITEMS));
    // Desiccation Powder added 4/6/24 - Nyagi
    add(new ItemInfo("desiccation_powder", Tab.ITEMS));
    // Chemical Grade Glassware added 4/6/24 - Nyagi
    add(new ItemInfo("chemical_grade_glassware", Tab.ITEMS));
    // Fume Fan added 4/6/24 - Nyagi
    add(new ItemInfo("fume_fan", Tab.ITEMS));
    // Chemically Inert Wood added 4/6/24 - Nyagi
    add(new ItemInfo("chemically_inert_wood", Tab.ITEMS));
    // pH Strips added 4/6/24 - Nyagi
    add(new ItemInfo("ph_strips", Tab.ITEMS));
    // Chromatography Kit added 4/6/24 - Nyagi
    add(new ItemInfo("chromatography_kit", Tab.ITEMS));
    // Bunsen Burner added 4/6/24 - Nyagi
    add(new ItemInfo("bunsen_burner", Tab.ITEMS));
    // Immersive Assembly added 4/25/24 - Nyagi
    add(new ItemInfo("immersive_assembly", Tab.ITEMS));
    // High Temperature Heat Exchanger added 4/25/24 - Nyagi
    add(new ItemInfo("high_temperature_heat_exchanger", Tab.ITEMS));
    // Duct Tape added 4/25/24 - Nyagi
    add(new ItemInfo("duct_tape", Tab.ITEMS));
    // WD40 added 4/25/24 - Nyagi
    add(new ItemInfo("wd_40", Tab.ITEMS));
    // 79" x 28" TRIPLE-BAY 4s SERIES TOOLBOX added 4/25/24 - Nyagi
    add(new ItemInfo("triple_bay_4s_series_toolbox", Tab.ITEMS));
    // Acetylene Tank added 4/25/24 - Nyagi
    add(new ItemInfo("acetylene_tank", Tab.ITEMS).durability(128));
    // OSHA Approved Gear added 4/25/24 - Nyagi
    add(new ItemInfo("osha_approved_gear", Tab.ITEMS));
    // Crate Of Industrial Components added 4/25/24 - Nyagi
    add(new ItemInfo("crate_of_industrial_components", Tab.ITEMS));
    // High Strength Concrete added 4/25/24 - Nyagi
    add(new ItemInfo("high_strength_concrete", Tab.ITEMS));
    // Smectite Clay added 10/27/24 - Nyagi
    add(new ItemInfo("smectite_clay", Tab.ITEMS));
    // Sodium Hypochlorite added 10/27/24 - Nyagi
    add(new ItemInfo("sodium_hypochlorite", Tab.ITEMS));
    // Volcanic Pumice added 10/27/24 - Nyagi
    add(new ItemInfo("volcanic_pumice", Tab.ITEMS));
    // Dense Slag added 10/27/24 - Nyagi
    add(new ItemInfo("dense_slag", Tab.ITEMS));
    // Skystone Encrusted Boule added 10/27/24 - Nyagi
    add(new ItemInfo("skystone_encrusted_boule", Tab.ITEMS));
    // Botanical Core added 10/27/24 - Nyagi
    add(new ItemInfo("botanical_core", Tab.ITEMS));
    // Everburn Tar added 10/27/24 - Nyagi
    add(new ItemInfo("everburn_tar", Tab.ITEMS));
    // Mercury Thermometer added 10/27/24 - Nyagi
    add(new ItemInfo("mercury_thermometer", Tab.ITEMS));
    // High Strength Ratio Reducer added 10/27/24 - Nyagi
    add(new ItemInfo("high_strength_ratio_reducer", Tab.ITEMS));
    // Precise Crystal Harmonizer added 10/27/24 - Nyagi
    add(new ItemInfo("precise_crystal_harmonizer", Tab.ITEMS));
    // Mini Faraday Cage added 10/27/24 - Nyagi
    add(new ItemInfo("mini_faraday_cage", Tab.ITEMS));
    // Pile of Basic Mechanical Parts added 10/27/24 - Nyagi
    add(new ItemInfo("pile_of_basic_mechanical_parts", Tab.ITEMS));
    // Gypsum added 11/21/24 - Nyagi
    add(new ItemInfo("gypsum", Tab.ITEMS));
    // Mana-Imbued Glucose Crystal added 11/29/24 - Nyagi
    add(new ItemInfo("mana_imbued_glucose_crystal", Tab.ITEMS));
    // Mana-Imbued Obsidian Shard added 11/29/24 - Nyagi
    add(new ItemInfo("mana_imbued_obsidian_shard", Tab.ITEMS));
    // Mana-Imbued Primary Explosive added 11/29/24 - Nyagi
    add(new ItemInfo("mana_imbued_primary_explosive", Tab.ITEMS));
    // Mana-Imbued Oobleck added 11/29/24 - Nyagi
    add(new ItemInfo("mana_imbued_oobleck", Tab.ITEMS));
    // Quenched Thermalsidian added 11/29/24 - Nyagi
    add(new ItemInfo("quenched_thermalsidian", Tab.ITEMS));
    // Deactivated Entropic Mush added 11/29/24 - Nyagi
    add(new ItemInfo("deactivated_entropic_mush", Tab.ITEMS));
    // Basic Arcana Core added 11/29/24 - Nyagi
    add(new ItemInfo("basic_arcana_core", Tab.ITEMS));
    // Lithium-Alumino Inosilicate Vial added 12/12/24 - Nyagi
    add(new ItemInfo("lithium_alumino_inosilicate", Tab.ITEMS));
    // Oolithus (fossilized egg) added 12/12/24 - Nyagi
    add(new ItemInfo("oolithus", Tab.ITEMS));
    // Fossil Resin added 12/12/24 - Nyagi
    add(new ItemInfo("fossil_resin", Tab.ITEMS));
    // Coprolite (fossilized poop) added 12/12/24 - Nyagi
    add(new ItemInfo("coprolite", Tab.ITEMS));
    // Activated Carbon added 02/13/25 - JJ
    add(new ItemInfo("activated_carbon", Tab.ITEMS));
    // Saturated Carbon Waste added 02/13/25 - JJ
    add(new ItemInfo("saturated_carbon_waste", Tab.ITEMS));
    // Carbon Residue added 02/13/25 - JJ
    add(new ItemInfo("carbon_residue", Tab.ITEMS));
    //  Bitumen-Tar Cloth Dust added 03/27/25 - Nyagi
    add(new ItemInfo("bitumen_tar_cloth", Tab.ITEMS));
    //  Waterproofing Kit Dust added 03/27/25 - Nyagi
    add(new ItemInfo("waterproofing_kit", Tab.ITEMS));
    //  Unprocessed Mild Steel added 03/27/25 - Nyagi
    add(new ItemInfo("unprocessed_mild_steel", Tab.ITEMS));
    //  Stainless Steel Mix added 03/27/25 - Nyagi
    add(new ItemInfo("mix_steel_stainless", Tab.ITEMS));
    //  1080 Steel Mix added 03/27/25 - Nyagi
    add(new ItemInfo("mix_steel_1080", Tab.ITEMS));
    //  15n20 Steel Mix added 03/27/25 - Nyagi
    add(new ItemInfo("mix_steel_15n20", Tab.ITEMS));
    //  Torn Hemp Ball added 03/27/25 - Nyagi
    add(new ItemInfo("torn_hemp_ball", Tab.ITEMS));
    //  Torn Flax Ball added 03/27/25 - Nyagi
    add(new ItemInfo("torn_flax_ball", Tab.ITEMS));
    //  Woolen String added 03/27/25 - Nyagi
    add(new ItemInfo("string_woolen", Tab.ITEMS));
    //  Unrolled NiCd Stack added 05/27/25 - Nyagi
    add(new ItemInfo("unrolled_nicd_stack", Tab.ITEMS));
    //  NiCd Jelly Roll added 05/27/25 - Nyagi
    add(new ItemInfo("nicd_jelly_roll", Tab.ITEMS));
    //  Rolled Mild Steel added 05/27/25 - Nyagi
    add(new ItemInfo("rolled_mild_steel", Tab.ITEMS));
    //  Small Steel Pipe added 05/27/25 - Nyagi
    add(new ItemInfo("small_pipe_steel", Tab.ITEMS));
    //  Insulating Washer Mold added 05/27/25 - Nyagi
    add(new ItemInfo("mold_insulating_washer", Tab.ITEMS));
    //  Insulating Washer added 05/27/25 - Nyagi
    add(new ItemInfo("insulating_washer", Tab.ITEMS));
    //  NiCd Battery Assembly added 05/27/25 - Nyagi
    add(new ItemInfo("nicd_battery_assembly", Tab.ITEMS));
    //  NiCd Battery  added 05/27/25 - Nyagi
    add(new ItemInfo("nicd_battery", Tab.ITEMS));
    //  NiCd Battery Bank added 05/27/25 - Nyagi
    add(new ItemInfo("nicd_battery_bank", Tab.ITEMS));
    //  Corporea Tunneler added 06/25/25 - Nyagi
    add(new ItemInfo("corporea_tunneler", Tab.ITEMS));
    //  Mini Mana Driven KIWI-A added 06/25/25 - Nyagi
    add(new ItemInfo("mini_mana_driven_kiwi", Tab.ITEMS));
    //  Palladium On Carbon added 07/05/25 - Nyagi
    add(new ItemInfo("on_carbon_palladium", Tab.ITEMS));
    //  Saturated Palladium On Carbon added 07/05/25 - Nyagi
    add(new ItemInfo("on_carbon_saturated_palladium", Tab.ITEMS));
    //  Used Chromatography Kit added 07/05/25 - Nyagi
    add(new ItemInfo("chromatography_kit_used", Tab.ITEMS));
    //  Used Chromatography Kit added 09/29/25 - Toda
    add(new ItemInfo("calcinated_agar", Tab.ITEMS));
    //  Copper-Bismuth Crystal added 10/19/25 - Nyagi
    add(new ItemInfo("copper_bismuth_crystal", Tab.ITEMS));
    //  FASIL Multi-Material Catalyst added 10/19/25 - Nyagi
    add(new ItemInfo("fasil_multi_material_catalyst", Tab.ITEMS));
    //  Palladium Catalyst-Doped Exchange Resin added 10/26/25 - Nyagi
    add(new ItemInfo("palladium_catalyst_doped_exchange_resin", Tab.ITEMS));
    //  Automatic Cardboard Reconstitutor & Folder added 12/2/25 - Nyagi
    add(new ItemInfo("automatic_cardboard_reconstitutor_folder", Tab.ITEMS));
    //  Semi Automatic Round Labeling Machine added 12/2/25 - Nyagi
    add(new ItemInfo("semi_automatic_round_labeling_machine", Tab.ITEMS));
    //  Synthetic Plagioclase Feldspar added 12/15/25 - Nyagi
    add(new ItemInfo("synthetic_plagioclase_feldspar", Tab.ITEMS));
    //  Synthetic Biotite added 12/15/25 - Nyagi
    add(new ItemInfo("synthetic_biotite", Tab.ITEMS));
    //  Pyroxene Mix added 12/15/25 - Nyagi
    add(new ItemInfo("pyroxene_mix", Tab.ITEMS));
    //  Synthetic Pyroxene added 12/15/25 - Nyagi
    add(new ItemInfo("synthetic_pyroxene", Tab.ITEMS));
    //  Wetted Cardboard Pulp added 12/29/25 - Nyagi
    add(new ItemInfo("wetted_cardboard_pulp", Tab.ITEMS));
    //  Impregnated Cardboard Pulp added 12/29/25 - Nyagi
    add(new ItemInfo("impregnated_cardboard_pulp", Tab.ITEMS));
    //  Cooked Wood Chips added 12/29/25 - Nyagi
    add(new ItemInfo("cooked_wood_chips", Tab.ITEMS));
    //  Dried Wood Chips added 12/29/25 - Nyagi
    add(new ItemInfo("dried_wood_chips", Tab.ITEMS));
    //  Large Shives added 12/29/25 - Nyagi
    add(new ItemInfo("large_shives", Tab.ITEMS));
    //  Wood Knots added 12/29/25 - Nyagi
    add(new ItemInfo("wood_knots", Tab.ITEMS));
    //  Processed Pulp added 12/29/25 - Nyagi
    add(new ItemInfo("processed_pulp", Tab.ITEMS));
    //  Heavy Black Liquor added 12/29/25 - Nyagi
    add(new ItemInfo("heavy_black_liquor", Tab.ITEMS));
    //  Cement Binder added 12/29/25 - Nyagi
    add(new ItemInfo("cement_binder", Tab.ITEMS));
    //  Wood Sealant added 12/29/25 - Nyagi
    add(new ItemInfo("wood_sealant", Tab.ITEMS));
    //  Nitrocellulose added 12/29/25 - Nyagi
    add(new ItemInfo("nitrocellulose", Tab.ITEMS));
    //  Floral Fruit Flavoring added 12/29/25 - Nyagi
    add(new ItemInfo("floral_fruit_flavoring", Tab.ITEMS));
    //  Simple Targeting System added 12/31/25 - Nyagi
    add(new ItemInfo("simple_targeting_system", Tab.ITEMS));
    //  Brain On A Dish added 1/5/26 - Nyagi
    add(new ItemInfo("brain_on_a_dish", Tab.ITEMS));
    //  Metal Scrap added 1/14/26 - Nyagi
    add(new ItemInfo("scrap_metal", Tab.ITEMS));
    //  Insulation Scrap added 1/14/26 - Nyagi
    add(new ItemInfo("scrap_insulation", Tab.ITEMS));
    //  Structural Scrap added 1/14/26 - Nyagi
    add(new ItemInfo("scrap_structural", Tab.ITEMS));
    //  Component Scrap added 1/14/26 - Nyagi
    add(new ItemInfo("scrap_component", Tab.ITEMS));
    //  Organic Scrap added 1/14/26 - Nyagi
    add(new ItemInfo("scrap_organic", Tab.ITEMS));
    //  Waste Scrap added 1/14/26 - Nyagi
    add(new ItemInfo("scrap_waste", Tab.ITEMS));
    //  Electronic Scrap added 1/14/26 - Nyagi
    add(new ItemInfo("scrap_electronic", Tab.ITEMS));
    //  Hazardous Scrap added 1/14/26 - Nyagi
    add(new ItemInfo("scrap_hazardous", Tab.ITEMS));
    //  Nuclear Scrap added 1/14/26 - Nyagi
    add(new ItemInfo("scrap_nuclear", Tab.ITEMS));
    //  Fiberglass Batt added 1/14/26 - Nyagi
    add(new ItemInfo("fiberglass_batt", Tab.ITEMS));
    //  Vermiculite Asbestos Blend added 1/14/26 - Nyagi
    add(new ItemInfo("vermiculite_asbestos_blend", Tab.ITEMS));
    //  Foam Board added 1/14/26 - Nyagi
    add(new ItemInfo("foam_board", Tab.ITEMS));
    //  Hardened Polyurethane Foam  added 1/14/26 - Nyagi
    add(new ItemInfo("hardened_polyurethane_foam", Tab.ITEMS));
    //  Trinitite  added 1/14/26 - Nyagi
    add(new ItemInfo("trinitite", Tab.ITEMS));
    //  Cobalt 60 Tube  added 1/14/26 - Nyagi
    add(new ItemInfo("cobalt_60_tube", Tab.ITEMS));
    //  Tritium Tube  added 1/14/26 - Nyagi
    add(new ItemInfo("tritium_tube", Tab.ITEMS));
    //  Embrittled Fuel Casing  added 1/14/26 - Nyagi
    add(new ItemInfo("embrittled_fuel_casing", Tab.ITEMS));
    //  Embrittled Zircaloy-4 Plating  added 1/14/26 - Nyagi
    add(new ItemInfo("embrittled_plating_zircaloy_4", Tab.ITEMS));
    //  Alloy Powder Billet added 6/1/26 - Nyagi
    add(new ItemInfo("billet_empty", Tab.ITEMS));
      //  Bulk-Packed Iron Billet  added 6/1/26 - Nyagi
      add(new ItemInfo("billet_iron_bulk", Tab.ITEMS));
      //  Bulk-Packed 1080 Mix Billet  added 6/1/26 - Nyagi
      add(new ItemInfo("billet_1080", Tab.ITEMS));
      //  Bulk-Packed 15N20 Mix Billet  added 6/1/26 - Nyagi
      add(new ItemInfo("billet_15n20", Tab.ITEMS));
      //  Bulk-Packed Stainless Mix Billet  added 6/1/26 - Nyagi
      add(new ItemInfo("billet_stainless", Tab.ITEMS));
      //  Blast-Smelted 1080 Mix Billet  added 6/1/26 - Nyagi
      add(new ItemInfo("billet_blasted_1080", Tab.ITEMS));
      //  Blast-Smelted 15N20 Mix Billet  added 6/1/26 - Nyagi
      add(new ItemInfo("billet_blasted_15n20", Tab.ITEMS));
      //  Blast-Smelted Stainless Mix Billet  added 6/1/26 - Nyagi
      add(new ItemInfo("billet_blasted_stainless", Tab.ITEMS));
    //  Dirty Glassware added 6/13/26 - Nyagi
    add(new ItemInfo("dirty_glassware", Tab.ITEMS));
    //  Cream added 6/29/26 - Nyagi
    add(new ItemInfo("cream", Tab.ITEMS));
    //  Saturated Filter added 6/29/26 - Nyagi
    add(new ItemInfo("filter_saturated", Tab.ITEMS));
    //  Precipitated Casein added 6/29/26 - Nyagi
    add(new ItemInfo("casein_precipitated", Tab.ITEMS));
    //  High-Grade Casein added 6/29/26 - Nyagi
    add(new ItemInfo("casein_high", Tab.ITEMS));
    //  Low-Grade Casein added 6/29/26 - Nyagi
    add(new ItemInfo("casein_low", Tab.ITEMS));
    //  Casein Powder added 6/29/26 - Nyagi
    add(new ItemInfo("casein_powder", Tab.ITEMS));
    //  Whey Powder added 6/29/26 - Nyagi
    add(new ItemInfo("whey_powder", Tab.ITEMS));
    //  Peptone added 6/29/26 - Nyagi
    add(new ItemInfo("peptone", Tab.ITEMS));
    //  Sabouraud Agar added 6/29/26 - Nyagi
    add(new ItemInfo("petri_dish_sabouraud", Tab.BIOLOGY));
    //  Mushroom Culture added 6/29/26 - Nyagi
    add(new ItemInfo("petri_dish_mushrooms_vanilla", Tab.BIOLOGY));
    //  Compacted Wood Pile added 6/29/26 - Nyagi
    add(new ItemInfo("compacted_wood_pile", Tab.ITEMS));
    //  Inoculated Wood Pile added 6/29/26 - Nyagi
    add(new ItemInfo("inoculated_wood_pile", Tab.ITEMS));
    //  Uncut Porcelain Slab added 7/25/26 - Nyagi
    add(new ItemInfo("porcelain_slab_uncut", Tab.ITEMS));
    //  Small-Tile Porcelain added 7/25/26 - Nyagi
    add(new ItemInfo("porcelain_slab_small", Tab.ITEMS));
    //  Medium-Tile Porcelain added 7/25/26 - Nyagi
    add(new ItemInfo("porcelain_slab_med", Tab.ITEMS));
    //  Large-Tile Porcelain added 7/25/26 - Nyagi
    add(new ItemInfo("porcelain_slab_large", Tab.ITEMS));
    //  Mini-Frasch Apparatus added 8/7/26 - Nyagi
    add(new ItemInfo("mini_frasch_apparatus", Tab.ITEMS));
    //  Un-Sifted Sulfur Pellets added 8/7/26 - Nyagi
    add(new ItemInfo("sulfur_pellets_unsifted", Tab.ITEMS));
    //  Uniform Grade Sulfur Pellets added 8/7/26 - Nyagi
    add(new ItemInfo("sulfur_pellets_uniform", Tab.ITEMS));
    //  Misshapen Sulfur Pellets added 8/7/26 - Nyagi
    add(new ItemInfo("sulfur_pellets_misshapen", Tab.ITEMS));
    //  Metal-Mesh Filter added 8/7/26 - Nyagi
    add(new ItemInfo("filter_metal_mesh", Tab.ITEMS));
    //  Jammed Metal-Mesh Filter added 8/7/26 - Nyagi
    add(new ItemInfo("filter_metal_mesh_jammed", Tab.ITEMS));
    //  Roll Sulfur added 8/7/26 - Nyagi
    add(new ItemInfo("sulfur_roll", Tab.ITEMS));
    //  Tres' Blazes Cake added 8/18/26 - Nyagi
    add(new ItemInfo("tres_blazes_cake", Tab.ITEMS).fuel(128000));
    //  Anode Grade Coke added 9/3/26 - Nyagi
    add(new ItemInfo("coke_anode_grade", Tab.ITEMS));
    //  Anode Baking Rack added 9/3/26 - Nyagi
    add(new ItemInfo("anode_baking_rack", Tab.ITEMS));
    //  Wet Coke added 9/3/26 - Nyagi
    add(new ItemInfo("coke_wet", Tab.ITEMS));
    //  Coking Residue added 9/3/26 - Nyagi
    add(new ItemInfo("coke_residue", Tab.ITEMS));
    //  Miniaturized High Pressure System added 9/3/26 - Nyagi
    add(new ItemInfo("miniaturized_high_pressure_system", Tab.ITEMS));
    //  Porous Insulating Firebrick added 9/3/26 - Nyagi
    add(new ItemInfo("porous_insulating_firebrick", Tab.ITEMS));
    //  Raw Residual Solids added 9/3/26 - Nyagi
    add(new ItemInfo("residual_solids_raw", Tab.ITEMS));

    //Scrap system
    //  Plastonium Paste I  added 2/3/26 - Nyagi
    add(new ItemInfo("ball_plastic_i", Tab.ITEMS));
    //  Plastonium Paste II  added 2/3/26 - Nyagi
    add(new ItemInfo("ball_plastic_ii", Tab.ITEMS));
    //  Plastonium Paste III  added 2/3/26 - Nyagi
    add(new ItemInfo("ball_plastic_iii", Tab.ITEMS));
    //  Plastonium Paste IV  added 2/3/26 - Nyagi
    add(new ItemInfo("ball_plastic_iv", Tab.ITEMS));


    //Tequeño
      //  Tequeño 0  added 2/3/26 - Nyagi
      add(new ItemInfo("tequeno_t0", Tab.TEQUENO));

    //Questbook & Ponder Objects

      //  Questbook Object T0-7063B8BCE64899C9 added 7/25/26 - Nyagi
      add(new ItemInfo("qo_t0_7063b8bce64899c9", Tab.TEQUENO));

    //Chemistry
    // Bottle of Anthocyanin added 8/27/23 - Nyagi
    add(new ItemInfo("bottle_of_anthocyanin", Tab.CHEMICALS));
    // Bottle of Malic & Citric Acid added 8/27/23 - Nyagi
    add(new ItemInfo("bottle_of_malic_and_citric_acid", Tab.CHEMICALS));
    // Bottle of Vinegar added 4/10/24 - Nyagi
    add(new ItemInfo("bottle_of_vinegar", Tab.CHEMICALS));
    //  Cadmium Nitrate Crystal added 05/27/25 - Nyagi
    add(new ItemInfo("cadmium_nitrate_crystal", Tab.CHEMICALS));
    //  Sludge added 07/25/25 - JJ
    add(new ItemInfo("sludge", Tab.CHEMICALS));
    //  Floc added 07/25/25 - JJ
    add(new ItemInfo("floc", Tab.CHEMICALS));
    //  2,5-Dimethoxybenzoic Acid Soaked Strip added 08/27/25 - Nyagi
    add(new ItemInfo("2_5_dimethoxybenzoic_acid_strip", Tab.CHEMICALS));
    //  2,5-Dimethoxy-1,4-Benzenedicarboxylic Acid Soaked Strip added 08/27/25 - Nyagi
    add(new ItemInfo("2_5_dimethoxy_1_4_benzenedicarboxylic_acid_strip", Tab.CHEMICALS));

    /* Disabled until floatation line is ready
    //  Sample of Potassium Manganate added 06/19/25 - Nyagi
    add(new ItemInfo("sample_potassium_manganate", Tab.CHEMICALS));
    //  Potassium Manganate Dust added 06/19/25 - Nyagi
    add(new ItemInfo("potassium_manganate_dust", Tab.CHEMICALS));
    //  Sample of Zinc-Specific Floatation Mix added 06/19/25 - Nyagi
    add(new ItemInfo("sample_floatation_mix_zinc", Tab.CHEMICALS));
    //  Sample of Sodium Sulfide added 06/19/25 - Nyagi
    add(new ItemInfo("sample_sodium_sulfide", Tab.CHEMICALS));
    //  Sodium Sulfide Dust added 06/19/25 - Nyagi
    add(new ItemInfo("sodium_sulfide_dust", Tab.CHEMICALS));
    //  Sample of OPA 1214 (dodecyl/tetradecyloxypropyl amine) added 06/19/25 - Nyagi
    add(new ItemInfo("sample_opa", Tab.CHEMICALS));
    //  Sample of 5-Methyl-1,3-Cyclohexanedione added 06/19/25 - Nyagi
    add(new ItemInfo("sample_5_methyl_1_3_cyclohexanedione", Tab.CHEMICALS));
    //  Sample of Hydrochloric Acid Solution added 06/19/25 - Nyagi
    add(new ItemInfo("sample_solution_hydrochloric_acid", Tab.CHEMICALS));
    //  Sample of Bis(enol)ethers 1-Aminomethyl-3,5-Dimethoxy-2,5-Cyclohexadiene added 06/19/25 - Nyagi
    add(new ItemInfo("sample_bis_enol_ether", Tab.CHEMICALS));
    */

    //Pollution Items (Chemistry Subset)
    //NOTE: These haven't been moved to ModChemicals as there's...many discrepancies with naming convention
    //  Sample of Generic Organic Tailings added 05/15/25 - Nyagi
    add(new ItemInfo("sample_organic_tailings_generic", Tab.CHEMICALS));
    //  Sample of Light Organic Tailings added 05/15/25 - Nyagi
    add(new ItemInfo("sample_organic_tailings_light", Tab.CHEMICALS));
    //  Sample of Heavy Organic Tailings added 05/15/25 - Nyagi
    add(new ItemInfo("sample_organic_tailings_heavy", Tab.CHEMICALS));
    //  Sample of Generic Lithic Tailings added 05/15/25 - Nyagi
    add(new ItemInfo("sample_lithic_tailings_generic", Tab.CHEMICALS));
    //  Generic Lithic Tailings Dust added 05/15/25 - Nyagi
    add(new ItemInfo("dust_lithic_tailings_generic", Tab.CHEMICALS));
    //  Sample of Light Lithic Tailings added 05/15/25 - Nyagi
    add(new ItemInfo("sample_lithic_tailings_light", Tab.CHEMICALS));
    //  Light Lithic Tailings Dust added 05/15/25 - Nyagi
    add(new ItemInfo("dust_lithic_tailings_light", Tab.CHEMICALS));
    //  Sample of Heavy Lithic Tailings added 05/15/25 - Nyagi
    add(new ItemInfo("sample_lithic_tailings_heavy", Tab.CHEMICALS));
    //  Heavy Lithic Tailings Dust added 05/15/25 - Nyagi
    add(new ItemInfo("dust_lithic_tailings_heavy", Tab.CHEMICALS));
    //  Sample of Unidentified Generic Solid Metallic Tailings added 05/19/25 - Nyagi
    add(new ItemInfo("sample_unidentified_solid_metallic_tailings_generic", Tab.CHEMICALS));
    //  Unidentified Generic Solid Metallic Tailings Dust added 05/19/25 - Nyagi
    add(new ItemInfo("dust_unidentified_solid_metallic_tailings_generic", Tab.CHEMICALS));
    //  Sample of Unidentified Generic Dissolved Metallic Tailings added 05/19/25 - Nyagi
    add(new ItemInfo("sample_unidentified_dissolved_metallic_tailings_generic", Tab.CHEMICALS));


    //Biology
    // Agar-Gel added 3/25/24 - Nyagi
    add(new ItemInfo("agar_gel", Tab.BIOLOGY));
    // Agar-Flakes added 3/25/24 - Nyagi
    add(new ItemInfo("agar_flakes", Tab.BIOLOGY));
    // Agar-Powder added 3/25/24 - Nyagi
    add(new ItemInfo("agar_powder", Tab.BIOLOGY));
    // Agar-Agar added 3/20/24 - Nyagi
    add(new ItemInfo("agar_agar", Tab.BIOLOGY));
    // Empty Petri Dish added 3/20/24 - Nyagi
    add(new ItemInfo("petri_dish_empty", Tab.BIOLOGY));
    // Agar-Agar Petri Dish added 3/20/24 - Nyagi
    add(new ItemInfo("petri_dish_agar_agar", Tab.BIOLOGY));
    // Ruined Petri Dish added 6/10/25 - Barza
    add(new ItemInfo("petri_dish_contaminated", Tab.BIOLOGY));
    // Acetobacter Petri Dish added 6/10/25 - Barza
    add(new ItemInfo("petri_dish_acetobacter", Tab.BIOLOGY));
    //  Stomach added 03/27/25 - Nyagi
    add(new ItemInfo("stomach", Tab.BIOLOGY));
    //  Ruminant Stomach added 03/27/25 - Nyagi
    add(new ItemInfo("stomach_ruminant", Tab.BIOLOGY));
    //  Intestines added 03/27/25 - Nyagi
    add(new ItemInfo("intestines", Tab.BIOLOGY));
    //  Loose Brain Matter added 03/27/25 - Nyagi
    add(new ItemInfo("loose_brain_matter", Tab.BIOLOGY));
    //  Lard added 03/27/25 - Nyagi
    add(new ItemInfo("lard", Tab.BIOLOGY));
    //  Heart added 03/27/25 - Nyagi
    add(new ItemInfo("heart", Tab.BIOLOGY));
    //  Kidney added 03/27/25 - Nyagi
    add(new ItemInfo("kidney", Tab.BIOLOGY));
    //  Liver added 03/27/25 - Nyagi
    add(new ItemInfo("liver", Tab.BIOLOGY));
    //  Miscellaneous Scrap Meat added 03/27/25 - Nyagi
    add(new ItemInfo("scrap_meat", Tab.BIOLOGY));
    //  Unprocessed Cow Leather added 03/27/25 - Nyagi
    add(new ItemInfo("leather_unprocessed_cow", Tab.BIOLOGY));
    //  Cow Leather added 03/27/25 - Nyagi
    add(new ItemInfo("leather_cow", Tab.BIOLOGY));
    //  Unprocessed Pig Leather added 03/27/25 - Nyagi
    add(new ItemInfo("leather_unprocessed_pig", Tab.BIOLOGY));
    //  Cow Leather added 03/27/25 - Nyagi
    add(new ItemInfo("leather_pig", Tab.BIOLOGY));
    //  Unprocessed Sheep Leather added 03/27/25 - Nyagi
    add(new ItemInfo("leather_unprocessed_sheep", Tab.BIOLOGY));
    //  Sheep Leather added 03/27/25 - Nyagi
    add(new ItemInfo("leather_sheep", Tab.BIOLOGY));
    //  Unprocessed Equidae Leather added 03/27/25 - Nyagi
    //------Note: Equidae involves all horse & horse-like mobs
    add(new ItemInfo("leather_unprocessed_equidae", Tab.BIOLOGY));
    //  Horse Equidae added 03/27/25 - Nyagi
    add(new ItemInfo("leather_equidae", Tab.BIOLOGY));
    //  Vine Cutting added 05/25/25 - Nyagi
    add(new ItemInfo("vine_cutting", Tab.BIOLOGY));
    // Canola Seeds added 7/25/25 - JJ
    add(new ItemInfo("canola_seeds", Tab.BIOLOGY));


    //Custom Botania Runes
    // Blank Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_blank", Tab.ITEMS));
    // Optical Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_optical", Tab.ITEMS));
    // Velocity Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_velocity", Tab.ITEMS));
    // Inertia Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_inertia", Tab.ITEMS));
    // Thermodynamic Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_thermodynamic", Tab.ITEMS));
    // Magnetic Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_magnetic", Tab.ITEMS));
    // Catalytic Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_catalytic", Tab.ITEMS));
    // Computational Rune added 3/8/24 - Nyagi
    add(new ItemInfo("rune_computational", Tab.ITEMS));


      /*
        SCIENCE ITEMS REGISTRATION
      */

    // Crude Compression Test added 7/18/23 - Nyagi
    add(new ItemInfo("crude_compression_test", Tab.SCIENCE));
    // Used Crude Compression Test added 7/18/23 - Nyagi
    add(new ItemInfo("used_crude_compression_test", Tab.SCIENCE));
    // Crude Statics Test added 7/18/23 - Nyagi
    add(new ItemInfo("crude_statics_test", Tab.SCIENCE));
    // Used Crude Statics Test added 7/18/23 - Nyagi
    add(new ItemInfo("used_crude_statics_test", Tab.SCIENCE));
    // Crude Entropy Test added 7/18/23 - Nyagi
    add(new ItemInfo("crude_entropy_test", Tab.SCIENCE));
    // Used Crude Entropy Test added 7/18/23 - Nyagi
    add(new ItemInfo("used_crude_entropy_test", Tab.SCIENCE));
    // Crude Acidics Test added 8/27/23 - Nyagi
    add(new ItemInfo("crude_acidics_test", Tab.SCIENCE));
    // Used Crude Acidics Test added 8/27/23 - Nyagi
    add(new ItemInfo("used_crude_acidics_test", Tab.SCIENCE));
    // Crude Natural Arcana Test added 8/27/23 - Nyagi
    add(new ItemInfo("crude_natural_arcana_test", Tab.SCIENCE));
    // Used Crude Natural Arcana Test added 8/27/23 - Nyagi
    add(new ItemInfo("used_crude_natural_arcana_test", Tab.SCIENCE));
    // Crude Material Properties Test added 8/27/23 - Nyagi
    add(new ItemInfo("crude_material_properties_test", Tab.SCIENCE));
    // Used Crude Material Properties Test added 8/27/23 - Nyagi
    add(new ItemInfo("used_crude_material_properties_test", Tab.SCIENCE));
    // Mana Bomb-Calorimeter added 10/27/24 - Nyagi
    add(new ItemInfo("mana_bomb_calorimeter", Tab.SCIENCE));
    // Used Mana Bomb-Calorimeter added 11/21/24 - Nyagi
    add(new ItemInfo("used_mana_bomb_calorimeter", Tab.SCIENCE));
    // Single Use Mana-Ablatives Demonstration added 10/27/24 - Nyagi
    add(new ItemInfo("single_use_mana_ablatives_demonstration", Tab.SCIENCE));
    // Used Single Use Mana-Ablatives Demonstration added 11/21/24 - Nyagi
    add(new ItemInfo("used_single_use_mana_ablatives_demonstration", Tab.SCIENCE));
    // Basic Material Properties Test added 10/27/24 - Nyagi
    add(new ItemInfo("basic_material_properties_test", Tab.SCIENCE));
    // Used Basic Material Properties Test added 10/27/24 - Nyagi
    add(new ItemInfo("used_basic_material_properties_test", Tab.SCIENCE));

      /*
         SCIENCE DATA STORAGE
       */

    // Lab Notebook added 8/10/23 - Nyagi
    add(new ItemInfo("lab_notebook", Tab.SCIENCE));
    // Lab Notebook With Crude Compression Data added 8/10/23 - Nyagi
    add(new ItemInfo("lab_notebook_with_crude_compression_data", Tab.SCIENCE));
    // Lab Notebook With Crude Statics Data added 8/10/23 - Nyagi
    add(new ItemInfo("lab_notebook_with_crude_statics_data", Tab.SCIENCE));
    // Lab Notebook With Crude Entropy Data added 8/10/23 - Nyagi
    add(new ItemInfo("lab_notebook_with_crude_entropy_data", Tab.SCIENCE));
    // Lab Notebook With Crude Acidics Data added 8/27/23 - Nyagi
    add(new ItemInfo("lab_notebook_with_crude_acidics_data", Tab.SCIENCE));
    // Lab Notebook With Crude Natural Arcana Data added 8/27/23 - Nyagi
    add(new ItemInfo("lab_notebook_with_crude_natural_arcana_data", Tab.SCIENCE));
    // Lab Notebook With Crude Material Properties Data added 8/27/23 - Nyagi
    add(new ItemInfo("lab_notebook_with_crude_material_properties_data", Tab.SCIENCE));
    // Pen added 8/10/23 - Nyagi
    add(new ItemInfo("pen", Tab.ITEMS));
    // Pen Assembly added 8/10/23 - Nyagi
    add(new ItemInfo("pen_assembly", Tab.ITEMS));
    // Ball Bearing added 8/10/23 - Nyagi
    add(new ItemInfo("ball_bearing", Tab.ITEMS));
    // Thin Casing added 8/10/23 - Nyagi
    add(new ItemInfo("thin_casing", Tab.ITEMS));
    // Tiny Spring added 8/10/23 - Nyagi
    add(new ItemInfo("tiny_spring", Tab.ITEMS));
    // Ink Cartridge added 8/10/23 - Nyagi
    add(new ItemInfo("ink_cartridge", Tab.ITEMS));
    // Ink added 8/10/23 - Nyagi
    add(new ItemInfo("ink", Tab.ITEMS));
    // Lexicon added 10/27/24 - Nyagi
    add(new ItemInfo("lexicon", Tab.SCIENCE));
    // Lexicon With S.U.M.A.D. Data added 11/29/24 - Nyagi
    add(new ItemInfo("lexicon_with_sumad_data", Tab.SCIENCE));
    // Lexicon With M.B.C. Data added 11/29/24 - Nyagi
    add(new ItemInfo("lexicon_with_mbc_data", Tab.SCIENCE));
    // Lexicon With B.M.P.T. Data added 11/29/24 - Nyagi
    add(new ItemInfo("lexicon_with_bmpt_data", Tab.SCIENCE));
    // Lexicon With Basic Natural Arcana Data added 11/29/24 - Nyagi
    add(new ItemInfo("lexicon_with_basic_natural_arcana_data", Tab.SCIENCE));

      /*
         SCHEMATICS
       */

    // Blank Blueprint added 8/27/23 - Nyagi
    add(new ItemInfo("blank_blueprint", Tab.SCHEMATICS));
    // Ae2 Schematic added 8/27/23 - Nyagi
    add(new ItemInfo("ae2_schematic", Tab.SCHEMATICS));
    // Botania Schematic added 8/27/23 - Nyagi
    add(new ItemInfo("botania_schematic", Tab.SCHEMATICS));
    // Immersive Engineering Schematic added 8/27/23 - Nyagi
    add(new ItemInfo("immersive_engineering_schematic", Tab.SCHEMATICS));
    // Alchemistry Schematic added 8/27/23 - Nyagi
    add(new ItemInfo("alchemistry_schematic", Tab.SCHEMATICS));

      /*
        ORE ITEMS
      */
    //Iron
    // Raw Limonite added 9/29/23 - Nyagi
    add(new ItemInfo("raw_limonite", Tab.MINERALS).ore());
    //- Sintered Limonite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_limonite", Tab.MINERALS));
    // Raw Hematite added 9/29/23 - Nyagi
    add(new ItemInfo("raw_hematite", Tab.MINERALS).ore());
    //- Sintered Hematite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_hematite", Tab.MINERALS));
    // Raw Magnetite added 9/29/23 - Nyagi
    add(new ItemInfo("raw_magnetite", Tab.MINERALS).ore());
    //- Sintered Magnetite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_magnetite", Tab.MINERALS));
    // Raw Pyrite added 9/29/23 - Nyagi
    add(new ItemInfo("raw_pyrite", Tab.MINERALS).ore());
    //- Sintered Pyrite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_pyrite", Tab.MINERALS));
    // Raw Siderite added 9/29/23 - Nyagi
    add(new ItemInfo("raw_siderite", Tab.MINERALS).ore());
    //- Sintered Siderite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_siderite", Tab.MINERALS));
    // Raw Banded Iron added 9/29/23 - Nyagi
    add(new ItemInfo("raw_banded_iron", Tab.MINERALS).ore());
    //- Sintered Banded Iron added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_banded_iron", Tab.MINERALS));
    // Raw Bog Iron added 9/29/23 - Nyagi
    add(new ItemInfo("raw_bog_iron", Tab.MINERALS).ore());
    //- Biologically Activated Bog Iron added 12/24/24 - Nyagi
    add(new ItemInfo("biologically_activated_bog_iron", Tab.MINERALS));
    // Raw Meteoric Iron added 9/29/23 - Nyagi
    add(new ItemInfo("raw_meteoric_iron", Tab.MINERALS).ore());
    //- Sintered Meteoric Iron added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_meteoric_iron", Tab.MINERALS));

    //Copper
    // Raw Chalcopyrite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_chalcopyrite", Tab.MINERALS).ore());
    //- Sintered Chalcopyrite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_chalcopyrite", Tab.MINERALS));
    // Raw Malachite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_malachite", Tab.MINERALS).ore());
    //- Sintered Malachite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_malachite", Tab.MINERALS));
    // Raw Azurite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_azurite", Tab.MINERALS).ore());
    //- Sintered Azurite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_azurite", Tab.MINERALS));
    // Raw Tetrahedrite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_tetrahedrite", Tab.MINERALS).ore());
    //- Sintered Tetrahedrite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_tetrahedrite", Tab.MINERALS));
    // Raw Enargite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_enargite", Tab.MINERALS).ore());
    //- Sintered Enargite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_enargite", Tab.MINERALS));
    // Raw Chrysocolla added 10/1/23 - Nyagi
    add(new ItemInfo("raw_chrysocolla", Tab.MINERALS).ore());
    //- Sintered Chrysocolla added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_chrysocolla", Tab.MINERALS));
    // Raw Tennanite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_tennanite", Tab.MINERALS).ore());
    //- Sintered Tennanite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_tennanite", Tab.MINERALS));
    // Raw Dioptase added 10/1/23 - Nyagi
    add(new ItemInfo("raw_dioptase", Tab.MINERALS).ore());
    //- Sintered Dioptase added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_dioptase", Tab.MINERALS));

    //Coal
    // Raw Lignite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_lignite", Tab.MINERALS).ore());
    //- De-mineralized Lignite added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_lignite", Tab.MINERALS));
    // Raw Bituminous added 10/1/23 - Nyagi
    add(new ItemInfo("raw_bituminous", Tab.MINERALS).ore());
    //- De-mineralized Bituminous added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_bituminous", Tab.MINERALS));
    // Raw Subbituminous added 10/1/23 - Nyagi
    add(new ItemInfo("raw_subbituminous", Tab.MINERALS).ore());
    //- De-mineralized Subbituminous added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_subbituminous", Tab.MINERALS));
    // Raw Anthracite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_anthracite", Tab.MINERALS).ore());
    //- De-mineralized Anthracite added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_anthracite", Tab.MINERALS));
    // Raw Cannel Coal added 10/1/23 - Nyagi
    add(new ItemInfo("raw_cannel_coal", Tab.MINERALS).ore());
    //- De-mineralized Cannel Coal added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_cannel_coal", Tab.MINERALS));
    // Raw Jet added 10/1/23 - Nyagi
    add(new ItemInfo("raw_jet", Tab.MINERALS).ore());
    //- De-mineralized Jet added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_jet", Tab.MINERALS));
    // Raw Peat added 10/1/23 - Nyagi
    add(new ItemInfo("raw_peat", Tab.MINERALS).ore());
    //- Biologically Activated Peat added 12/23/24 - Nyagi
    add(new ItemInfo("biologically_activated_peat", Tab.MINERALS));
    // Raw Graphite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_graphite", Tab.MINERALS).ore());
    //- Polished Graphite added 12/23/24 - Nyagi
    add(new ItemInfo("polished_graphite", Tab.MINERALS));

    //Gold and Silver
    // Alluvial Slush added 10/1/23 - Nyagi
    add(new ItemInfo("alluvial_slush", Tab.MINERALS).ore());
    //- Sintered Alluvial Slush added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_alluvial_slush", Tab.MINERALS));
    // Native Cluster added 10/1/23 - Nyagi
    add(new ItemInfo("native_cluster", Tab.MINERALS).ore());
    //- Sintered Native Cluster added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_native_cluster", Tab.MINERALS));
    // Raw Argentite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_argentite", Tab.MINERALS).ore());
    //- Sintered Argentite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_argentite", Tab.MINERALS));
    // Raw Chlorargyrite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_chlorargyrite", Tab.MINERALS).ore());
    //- Sintered Chlorargyrite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_chlorargyrite", Tab.MINERALS));
    // Raw Polybasite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_polybasite", Tab.MINERALS).ore());
    //- Sintered Polybasite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_polybasite", Tab.MINERALS));
    // Raw Proustite added 10/1/23 - Nyagi
    add(new ItemInfo("raw_proustite", Tab.MINERALS).ore());
    //- Sintered Proustite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_proustite", Tab.MINERALS));
    // Raw Electrum added 10/1/23 - Nyagi
    add(new ItemInfo("raw_electrum", Tab.MINERALS).ore());
    //- Sintered Electrum added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_electrum", Tab.MINERALS));
    // Raw Kustelite Electrum added 10/1/23 - Nyagi
    add(new ItemInfo("raw_kustelite_electrum", Tab.MINERALS).ore());
    //- Sintered Kustelite Electrum added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_kustelite_electrum", Tab.MINERALS));

    //Redstone and Mercury
    // Raw Cinnabar added 10/9/23 - Nyagi
    add(new ItemInfo("raw_cinnabar", Tab.MINERALS).ore());
    //- Polished Cinnabar added 12/23/24 - Nyagi
    add(new ItemInfo("polished_cinnabar", Tab.MINERALS));
    // Raw Metacinnabar added 10/9/23 - Nyagi
    add(new ItemInfo("raw_metacinnabar", Tab.MINERALS).ore());
    //- Sintered Metacinnabar added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_metacinnabar", Tab.MINERALS));
    // Raw Corderoite added 10/9/23 - Nyagi
    add(new ItemInfo("raw_corderoite", Tab.MINERALS).ore());
    //- Sintered Corderoite added 12/23/24 - Nyagi
    add(new ItemInfo("sintered_corderoite", Tab.MINERALS));
    // Raw Basaltic Powder added 10/9/23 - Nyagi
    add(new ItemInfo("raw_basaltic_powder", Tab.MINERALS).ore());
    //- De-mineralized Basaltic Powder added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_basaltic_powder", Tab.MINERALS));
    // Raw Calomel added 10/9/23 - Nyagi
    add(new ItemInfo("raw_calomel", Tab.MINERALS).ore());
    //- Polished Calomel added 12/23/24 - Nyagi
    add(new ItemInfo("polished_calomel", Tab.MINERALS));
    // Raw Native Mercury Spherules added 10/9/23 - Nyagi
    add(new ItemInfo("raw_native_mercury_spherules", Tab.MINERALS).ore());
    //- Sintered Native Mercury Spherules added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_native_mercury_spherules", Tab.MINERALS));
    // Raw Montroydite added 10/9/23 - Nyagi
    add(new ItemInfo("raw_montroydite", Tab.MINERALS).ore());
    //- Sintered Montroydite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_montroydite", Tab.MINERALS));
    // Raw Granulated Obsidian added 10/9/23 - Nyagi
    add(new ItemInfo("raw_granulated_obsidian", Tab.MINERALS).ore());
    //- De-mineralized Granulated Obsidian added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_granulated_obsidian", Tab.MINERALS));

    //Crystals and Minerals
    // Raw Kimberlite added 10/9/23 - Nyagi
    add(new ItemInfo("raw_kimberlite", Tab.MINERALS).ore());
    //- Polished Kimberlite added 12/24/24 - Nyagi
    add(new ItemInfo("polished_kimberlite", Tab.MINERALS));
    // Raw Lamproite added 10/9/23 - Nyagi
    add(new ItemInfo("raw_lamproite", Tab.MINERALS).ore());
    //- Polished Lamproite added 12/24/24 - Nyagi
    add(new ItemInfo("polished_lamproite", Tab.MINERALS));
    // Raw Lazurite added 10/9/23 - Nyagi
    add(new ItemInfo("raw_lazurite", Tab.MINERALS).ore());
    //- Polished Lazurite added 12/24/24 - Nyagi
    add(new ItemInfo("polished_lazurite", Tab.MINERALS));
    // Raw Lapis Lazuli added 10/9/23 - Nyagi
    add(new ItemInfo("raw_lapis_lazuli", Tab.MINERALS).ore());
    //- Polished Lapis Lazuli added 12/24/24 - Nyagi
    add(new ItemInfo("polished_lapis_lazuli", Tab.MINERALS));
    // Raw Prime Beryllic Cluster added 10/9/23 - Nyagi
    add(new ItemInfo("raw_prime_beryllic_cluster", Tab.MINERALS).ore());
    //- Polished Prime Beryllic Cluster added 12/24/24 - Nyagi
    add(new ItemInfo("polished_prime_beryllic_cluster", Tab.MINERALS));
    // Raw Fluorite added 10/9/23 - Nyagi
    add(new ItemInfo("raw_fluorite", Tab.MINERALS).ore());
    //- Polished Fluorite added 12/24/24 - Nyagi
    add(new ItemInfo("polished_fluorite", Tab.MINERALS));
    // Raw Chalcogenide Crystal Cluster added 10/9/23 - Nyagi
    add(new ItemInfo("raw_chalcogenide_crystal_cluster", Tab.MINERALS).ore());
    //- Sintered Chalcogenide Crystal Cluster added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_chalcogenide_crystal_cluster", Tab.MINERALS));
    // Raw Salt Cluster added 10/9/23 - Nyagi
    add(new ItemInfo("raw_salt_cluster", Tab.MINERALS).ore());
    //- De-mineralized Salt Cluster added 12/23/24 - Nyagi
    add(new ItemInfo("de_mineralized_salt_cluster", Tab.MINERALS));

    //Quartz
    // Raw Herkimer Diamond added 10/13/23 - Nyagi
    add(new ItemInfo("raw_herkimer_diamond", Tab.MINERALS).ore());
    //- Polished Herkimer Diamond added 12/24/24 - Nyagi
    add(new ItemInfo("polished_herkimer_diamond", Tab.MINERALS));
    // Raw Dendritic Agate added 10/13/23 - Nyagi
    add(new ItemInfo("raw_dendritic_agate", Tab.MINERALS).ore());
    //- Polished Dendritic Agate added 12/24/24 - Nyagi
    add(new ItemInfo("polished_dendritic_agate", Tab.MINERALS));
    // Raw Chalcedony added 10/13/23 - Nyagi
    add(new ItemInfo("raw_chalcedony", Tab.MINERALS).ore());
    //- Polished Chalcedony added 12/24/24 - Nyagi
    add(new ItemInfo("polished_chalcedony", Tab.MINERALS));
    // Raw Rutilated Quartz added 10/13/23 - Nyagi
    add(new ItemInfo("raw_rutilated_quartz", Tab.MINERALS).ore());
    //- Polished Rutilated Quartz added 12/24/24 - Nyagi
    add(new ItemInfo("polished_rutilated_quartz", Tab.MINERALS));
    // Raw Ametrine added 10/13/23 - Nyagi
    add(new ItemInfo("raw_ametrine", Tab.MINERALS).ore());
    //- Polished Ametrine added 12/24/24 - Nyagi
    add(new ItemInfo("polished_ametrine", Tab.MINERALS));
    // Raw Rose Quartz added 10/13/23 - Nyagi
    add(new ItemInfo("raw_rose_quartz", Tab.MINERALS).ore());
    //- Shiny Rose Quartz added 12/24/24 - Nyagi
    add(new ItemInfo("polished_rose_quartz", Tab.MINERALS));
    // Raw Prasiolite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_prasiolite", Tab.MINERALS).ore());
    //- Polished Prasiolite added 12/24/24 - Nyagi
    add(new ItemInfo("polished_prasiolite", Tab.MINERALS));
    // Raw Meteoric Certus added 10/13/23 - Nyagi
    add(new ItemInfo("raw_meteoric_certus", Tab.MINERALS).ore());
    //- Polished Meteoric Certus added 12/24/24 - Nyagi
    add(new ItemInfo("polished_meteoric_certus", Tab.MINERALS));

    //Zinc
    // Raw Zinc Carbonate added 10/13/23 - Nyagi
    add(new ItemInfo("raw_zinc_carbonate", Tab.MINERALS).ore());
    //- Sintered Zinc Carbonate added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_zinc_carbonate", Tab.MINERALS));
    // Raw Sphalerite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_sphalerite", Tab.MINERALS).ore());
    //- Sintered Sphalerite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_sphalerite", Tab.MINERALS));
    // Raw Smithsonite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_smithsonite", Tab.MINERALS).ore());
    //- Sintered Smithsonite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_smithsonite", Tab.MINERALS));
    // Raw Hemimorphite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_hemimorphite", Tab.MINERALS).ore());
    //- Sintered Hemimorphite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_hemimorphite", Tab.MINERALS));
    // Raw Wurtzite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_wurtzite", Tab.MINERALS).ore());
    //- Sintered Wurtzite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_wurtzite", Tab.MINERALS));
    // Raw Hydrozincite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_hydrozincite", Tab.MINERALS).ore());
    //- Sintered Hydrozincite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_hydrozincite", Tab.MINERALS));
    // Raw Willemite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_willemite", Tab.MINERALS).ore());
    //- Sintered Willemite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_willemite", Tab.MINERALS));
    // Raw Franklinite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_franklinite", Tab.MINERALS).ore());
    //- Sintered Franklinite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_franklinite", Tab.MINERALS));

    //Aluminium
    // Raw Bauxite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_bauxite", Tab.MINERALS).ore());
    //- Sintered Bauxite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_bauxite", Tab.MINERALS));
    // Raw Feldspar added 10/13/23 - Nyagi
    add(new ItemInfo("raw_feldspar", Tab.MINERALS).ore());
    //- Sintered Feldspar added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_feldspar", Tab.MINERALS));
    // Raw Clustered Beryl added 10/13/23 - Nyagi
    add(new ItemInfo("raw_clustered_beryl", Tab.MINERALS).ore());
    //- Polished Clustered Beryl added 12/24/24 - Nyagi
    add(new ItemInfo("polished_clustered_beryl", Tab.MINERALS));
    // Raw Cryolite added 10/13/23 - Nyagi
    add(new ItemInfo("raw_cryolite", Tab.MINERALS).ore());
    //- Sintered Cryolite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_cryolite", Tab.MINERALS));
    // Raw Spinel added 10/13/23 - Nyagi
    add(new ItemInfo("raw_spinel", Tab.MINERALS).ore());
    //- Polished Spinel added 12/24/24 - Nyagi
    add(new ItemInfo("polished_spinel", Tab.MINERALS));
    // Raw Turquoise added 10/13/23 - Nyagi
    add(new ItemInfo("raw_turquoise", Tab.MINERALS).ore());
    //- Polished Turquoise added 12/24/24 - Nyagi
    add(new ItemInfo("polished_turquoise", Tab.MINERALS));
    // Raw Garnet Slush added 10/13/23 - Nyagi
    add(new ItemInfo("raw_garnet_slush", Tab.MINERALS).ore());
    //- Sintered Garnet Slush added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_garnet_slush", Tab.MINERALS));
    // Raw Native Aluminum added 10/13/23 - Nyagi
    add(new ItemInfo("raw_native_aluminum", Tab.MINERALS).ore());
    //- Sintered Native Aluminum added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_native_aluminum", Tab.MINERALS));

    //Lead
    //Galena added 10/20/23 - Nyagi
    add(new ItemInfo("raw_galena", Tab.MINERALS).ore());
    //- Sintered Galena added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_galena", Tab.MINERALS));
    //Lead Sulphide added 10/20/23 - Nyagi
    add(new ItemInfo("raw_lead_sulphide", Tab.MINERALS).ore());
    //- Sintered Lead Sulphide added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_lead_sulphide", Tab.MINERALS));
    //Pyromorphite added 10/20/23 - Nyagi
    add(new ItemInfo("raw_pyromorphite", Tab.MINERALS).ore());
    //- Sintered Pyromorphite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_pyromorphite", Tab.MINERALS));
    //Cerussite added 10/20/23 - Nyagi
    add(new ItemInfo("raw_cerussite", Tab.MINERALS).ore());
    //- Sintered Cerussite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_cerussite", Tab.MINERALS));
    //Anglesite added 10/20/23 - Nyagi
    add(new ItemInfo("raw_anglesite", Tab.MINERALS).ore());
    //- Sintered Anglesite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_anglesite", Tab.MINERALS));
    //Wulfenite added 10/20/23 - Nyagi
    add(new ItemInfo("raw_wulfenite", Tab.MINERALS).ore());
    //- Sintered Wulfenite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_wulfenite", Tab.MINERALS));
    //Vanadinite added 10/20/23 - Nyagi
    add(new ItemInfo("raw_vanadinite", Tab.MINERALS).ore());
    //- Sintered Vanadinite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_vanadinite", Tab.MINERALS));
    //Mimetite added 10/20/23 - Nyagi
    add(new ItemInfo("raw_mimetite", Tab.MINERALS).ore());
    //- Sintered Mimetite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_mimetite", Tab.MINERALS));

    //Nickel
    //Pentlandite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_pentlandite", Tab.MINERALS).ore());
    //- Sintered Pentlandite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_pentlandite", Tab.MINERALS));
    //Garnierite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_garnierite", Tab.MINERALS).ore());
    //- Sintered Garnierite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_garnierite", Tab.MINERALS));
    //Saprolite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_saprolite", Tab.MINERALS).ore());
    //- Sintered Saprolite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_saprolite", Tab.MINERALS));
    //Hardened Sulfide Flow added 10/27/23 - Nyagi
    add(new ItemInfo("raw_hardened_sulfide_flow", Tab.MINERALS).ore());
    //- De-Mineralized Hardened Sulfide Flow added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_hardened_sulfide_flow", Tab.MINERALS));
    //Millerite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_millerite", Tab.MINERALS).ore());
    //- Sintered Millerite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_millerite", Tab.MINERALS));
    //Nickeline added 10/27/23 - Nyagi
    add(new ItemInfo("raw_nickeline", Tab.MINERALS).ore());
    //- Sintered Nickeline added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_nickeline", Tab.MINERALS));
    //Meteoric Taenite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_meteoric_taenite", Tab.MINERALS).ore());
    //- Sintered Meteoric Taenite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_meteoric_taenite", Tab.MINERALS));
    //Meteoric Kamacite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_meteoric_kamacite", Tab.MINERALS).ore());
    //- Sintered Meteoric Kamacite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_meteoric_kamacite", Tab.MINERALS));

    //Uranium & Thorium
    //Pitchblende added 10/27/23 - Nyagi
    add(new ItemInfo("raw_pitchblende", Tab.MINERALS).ore());
    //- Sintered Pitchblende added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_pitchblende", Tab.MINERALS));
    //Carnotite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_carnotite", Tab.MINERALS).ore());
    //- Sintered Carnotite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_carnotite", Tab.MINERALS));
    //Tyuyamunite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_tyuyamunite", Tab.MINERALS).ore());
    //- Sintered Tyuyamunite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_tyuyamunite", Tab.MINERALS));
    //Torbernite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_torbernite", Tab.MINERALS).ore());
    //- Sintered Torbernite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_torbernite", Tab.MINERALS));
    //Autunite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_autunite", Tab.MINERALS).ore());
    //- Sintered Autunite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_autunite", Tab.MINERALS));
    //Thorite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_thorite", Tab.MINERALS).ore());
    //- Sintered Thorite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_thorite", Tab.MINERALS));
    //Uranothorite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_uranothorite", Tab.MINERALS).ore());
    //- Sintered Uranothorite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_uranothorite", Tab.MINERALS));
    //Thorianite added 10/27/23 - Nyagi
    add(new ItemInfo("raw_thorianite", Tab.MINERALS).ore());
    //- Sintered Thorianite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_thorianite", Tab.MINERALS));

    //Tin
    //Cassiterite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_cassiterite", Tab.MINERALS).ore());
    //- Sintered Cassiterite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_cassiterite", Tab.MINERALS));
    //Stannite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_stannite", Tab.MINERALS).ore());
    //- Sintered Stannite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_stannite", Tab.MINERALS));
    //Cylindrite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_cylindrite", Tab.MINERALS).ore());
    //- Sintered Cylindrite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_cylindrite", Tab.MINERALS));
    //Franckeite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_franckeite", Tab.MINERALS).ore());
    //- Sintered Franckeite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_franckeite", Tab.MINERALS));
    //Canfieldite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_canfieldite", Tab.MINERALS).ore());
    //- Sintered Canfieldite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_canfieldite", Tab.MINERALS));
    //Teallite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_teallite", Tab.MINERALS).ore());
    //- Sintered Teallite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_teallite", Tab.MINERALS));
    //Brannerite added 11/3/23 - Nyagi
    add(new ItemInfo("raw_brannerite", Tab.MINERALS).ore());
    //- Sintered Brannerite added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_brannerite", Tab.MINERALS));
    //Orthoclase added 11/3/23 - Nyagi
    add(new ItemInfo("raw_orthoclase", Tab.MINERALS).ore());
    //- Sintered Orthoclase added 12/24/24 - Nyagi
    add(new ItemInfo("sintered_orthoclase", Tab.MINERALS));

    //Misc Processing Ores
    //Saltpeter added 11/3/23 - Nyagi
    add(new ItemInfo("raw_saltpeter", Tab.MINERALS).ore());
    //- De-Mineralized Saltpeter added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_saltpeter", Tab.MINERALS));
    //Borax added 11/3/23 - Nyagi
    add(new ItemInfo("raw_borax", Tab.MINERALS).ore());
    //- De-Mineralized Borax added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_borax", Tab.MINERALS));
    //Compacted Limestone added 11/3/23 - Nyagi
    add(new ItemInfo("raw_compacted_limestone", Tab.MINERALS).ore());
    //- De-Mineralized Compacted Limestone added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_compacted_limestone", Tab.MINERALS));
    //Volcanic Sulfur added 11/3/23 - Nyagi
    add(new ItemInfo("raw_volcanic_sulfur", Tab.MINERALS).ore());
    //- De-Mineralized Volcanic Sulfur added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_volcanic_sulfur", Tab.MINERALS));
    //Rainbow Obsidian added 11/3/23 - Nyagi
    add(new ItemInfo("raw_rainbow_obsidian", Tab.MINERALS).ore());
    //- De-Mineralized Rainbow Obsidian added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_rainbow_obsidian", Tab.MINERALS));
    //Petrified Wood added 11/3/23 - Nyagi
    add(new ItemInfo("raw_petrified_wood", Tab.MINERALS).ore());
    //- Biologically Activated Petrified Wood added 12/24/24 - Nyagi
    add(new ItemInfo("biologically_activated_petrified_wood", Tab.MINERALS));
    //Chalk added 11/3/23 - Nyagi
    add(new ItemInfo("raw_chalk", Tab.MINERALS).ore());
    //- De-Mineralized Chalk added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_chalk", Tab.MINERALS));
    //Trona Ore (Baking Soda) added 11/3/23 - Nyagi
    add(new ItemInfo("raw_trona", Tab.MINERALS).ore());
    //- De-Mineralized Trona Ore added 12/24/24 - Nyagi
    add(new ItemInfo("de_mineralized_trona", Tab.MINERALS));

    //Immersive Engineering Excavator Ores
    //Carbonate Igneous Deposit
    //Columbite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_columbite", Tab.MINERALS));
    //Phosphorite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_phosphorite", Tab.MINERALS));
    //Fluorspar added 12/5/24 - Nyagi
    add(new ItemInfo("raw_fluorspar", Tab.MINERALS));
    //Zirconia added 12/5/24 - Nyagi
    add(new ItemInfo("raw_zirconia", Tab.MINERALS));
    //Argyrodite Deposit
    //Germanite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_germanite", Tab.MINERALS));
    //Ancient Mineral Spring Deposit
    //Spodumene added 12/5/24 - Nyagi
    add(new ItemInfo("raw_spodumene", Tab.MINERALS));
    //Petalite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_petalite", Tab.MINERALS));
    //Lepidolite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_lepidolite", Tab.MINERALS));
    //Amblygonite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_amblygonite", Tab.MINERALS));
    //Hydrocarbon Rich Deposit
    //Oil Sands added 12/5/24 - Nyagi
    add(new ItemInfo("raw_oil_sands", Tab.MINERALS));
    //Kerogen added 12/5/24 - Nyagi
    add(new ItemInfo("raw_kerogen", Tab.MINERALS));
    //Fossil Deposit
    //Ancient Fossil added 12/5/24 - Nyagi
    add(new ItemInfo("ancient_fossil", Tab.MINERALS));
    //Endermorphic Deposit
    //End Organic Mush added 12/5/24 - Nyagi
    add(new ItemInfo("end_organic_mush", Tab.MINERALS));
    //Ender Pumice added 12/5/24 - Nyagi
    add(new ItemInfo("ender_pumice", Tab.MINERALS));
    //Core Seam
    //Deep Ground Sample added 12/5/24 - Nyagi
    add(new ItemInfo("deep_ground_sample", Tab.MINERALS));
    //Helium Deposit
    //items already exist, this is just here to keep track of deposit types
    //Lanthanithic Deposit
    //Monazite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_monazite", Tab.MINERALS));
    //Cerite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_cerite", Tab.MINERALS));
    //Allanite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_allanite", Tab.MINERALS));
    //Bastnasite added 12/5/24 - Nyagi
    add(new ItemInfo("raw_bastnasite", Tab.MINERALS));
    //Xenotime added 12/5/24 - Nyagi
    add(new ItemInfo("raw_xenotime", Tab.MINERALS));
    //Void Seam
    //Cosmic Irradiated Flake Fragment added 12/5/24 - Nyagi
    add(new ItemInfo("cosmic_irradiated_flake_fragment", Tab.MINERALS));

    //Ore-related drops
    //TODO: Find missing date
    //Sapphire
    add(new ItemInfo("sapphire", Tab.MINERALS));
    //Sapphire Dust
    add(new ItemInfo("sapphire_dust", Tab.MINERALS));
    //Ruby
    add(new ItemInfo("ruby", Tab.MINERALS));
    //Ruby Dust
    add(new ItemInfo("ruby_dust", Tab.MINERALS));
    //Aquamarine
    add(new ItemInfo("aquamarine", Tab.MINERALS));
    //Aquamarine Dust
    add(new ItemInfo("aquamarine_dust", Tab.MINERALS));
    //Morganite
    add(new ItemInfo("morganite", Tab.MINERALS));
    //Morganite Dust
    add(new ItemInfo("morganite_dust", Tab.MINERALS));
    //Heliodor
    add(new ItemInfo("heliodor", Tab.MINERALS));
    //Heliodor Dust
    add(new ItemInfo("heliodor_dust", Tab.MINERALS));
    //Goshenite
    add(new ItemInfo("goshenite", Tab.MINERALS));
    //Goshenite Dust
    add(new ItemInfo("goshenite_dust", Tab.MINERALS));
    //Bixbite
    add(new ItemInfo("bixbite", Tab.MINERALS));
    //Bixbite Dust
    add(new ItemInfo("bixbite_dust", Tab.MINERALS));
    //Pezzottaite
    add(new ItemInfo("pezzottaite", Tab.MINERALS));
    //Pezzottaite Dust
    add(new ItemInfo("pezzottaite_dust", Tab.MINERALS));

    //Create Sequenced Assembly Intermediates

    //Note: The 4th parameter is to pick what model the item uses instead, to avoid having to repeat models.
    //This works with any ItemInfo, but is mostly relevant for these.

    // Incomplete Controller added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_controller", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Cell Workbench added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_cell_workbench", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Item Cell Housing added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_me_item_cell_housing", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Charged Quartz Fixture added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_charged_quartz_fixture", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Skystone Tank added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_skystone_tank", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Interface added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_me_interface", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Charger added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_charger", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete 1k ME Storage Component added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_onek_me_storage_component", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Inscriber added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_inscriber", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Fluix ME Glass Cable added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_fluix_me_glass_cable", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Fluix ME Smart Cable added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_fluix_me_smart_cable", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Fluix ME Dense Smart Cable added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_fluix_me_dense_smart_cable", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Drive added 2/20/24 - Nyagi
    add(new ItemInfo("incomplete_me_drive", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Chest added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_chest", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Vibration Chamber added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_vibration_chamber", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Light Detecting Fixture added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_light_detecting_fixture", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Illuminated Panel added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_illuminated_panel", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Storage Bus added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_storage_bus", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Import Bus added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_import_bus", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Export Bus added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_export_bus", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Level Emitter added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_level_emitter", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Energy Level Emitter added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_energy_level_emitter", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Annihilation Plane added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_annihilation_plane", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Formation Plane added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_formation_plane", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Terminal added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_terminal", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Crafting Terminal added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_crafting_terminal", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME p2p Tunnel added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_ptwop_tunnel", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Security Terminal added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_security_terminal", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME IO Port added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_io_port", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Energy Cell added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_energy_cell", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete ME Storage Monitor added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_me_storage_monitor", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Color Applicator added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_color_applicator", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Logic Processor added 2/22/24 - Nyagi
    add(new ItemInfo("incomplete_logic_processor", Tab.SEQUENCE));
    // Incomplete Calculation Processor added 2/22/24 - Nyagi
    add(new ItemInfo("incomplete_calculation_processor", Tab.SEQUENCE));
    // Incomplete Engineering Processor added 2/22/24 - Nyagi
    add(new ItemInfo("incomplete_engineering_processor", Tab.SEQUENCE));
    // Incomplete ME Fluid Cell Housing added 2/22/24 - Nyagi
    add(new ItemInfo("incomplete_me_fluid_cell_housing", Tab.SEQUENCE));
    // Incomplete Energy Acceptor added 2/22/24 - Nyagi
    add(new ItemInfo("incomplete_energy_acceptor", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Energy Cell added 6/25/24 - Nyagi
    add(new ItemInfo("incomplete_energy_cell", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Resonance Generator added 12/04/25 - Nyagi
      add(new ItemInfo("incomplete_resonance_generator", Tab.SEQUENCE, "incomplete_ae2_assembly"));
    // Incomplete Logic Dud added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_logic_dud", Tab.SEQUENCE));
    // Incomplete Calculation Dud added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_calculation_dud", Tab.SEQUENCE));
    // Incomplete Engineering Dud added 2/21/24 - Nyagi
    add(new ItemInfo("incomplete_engineering_dud", Tab.SEQUENCE));
    // Incomplete Sterilized Quartz Glass Vinegar added 1/4/25 - Nyagi
    add(new ItemInfo("incomplete_sterilized_quartz_glass_vinegar", Tab.SEQUENCE, "sterilized_quartz_glass"));
    // Incomplete Sterilized Quartz Glass Phenoxyethanol added 1/4/25 - Nyagi
    add(new ItemInfo("incomplete_sterilized_quartz_glass_phenoxyethanol", Tab.SEQUENCE, "sterilized_quartz_glass"));
    // Incomplete Sterilized Quartz Glass Turpentine Vapor added 12/29/25 - Nyagi
    add(new ItemInfo("incomplete_sterilized_quartz_glass_turpentine_vapor", Tab.SEQUENCE, "sterilized_quartz_glass"));
    // Incomplete Petri Dish Glass added 1/4/25 - Nyagi
    add(new ItemInfo("incomplete_petri_dish_glass", Tab.SEQUENCE, "petri_dish_empty"));
    // Incomplete Petri Dish Quartz Glass added 1/4/25 - Nyagi
    add(new ItemInfo("incomplete_petri_dish_quartz_glass", Tab.SEQUENCE, "petri_dish_empty"));
    // Incomplete Petri Dish Acetobacter added 1/4/25 - Barza
    add(new ItemInfo("incomplete_petri_dish_acetobacter_initial", Tab.SEQUENCE, "petri_dish_agar_agar"));
    // Incomplete Petri Dish Acetobacter added 1/4/25 - Barza
    add(new ItemInfo("incomplete_petri_dish_acetobacter_reclaim", Tab.SEQUENCE, "petri_dish_agar_agar"));
    // Incomplete Skystone Shielding added 1/4/25 - Nyagi
    add(new ItemInfo("incomplete_skystone_shielding", Tab.SEQUENCE, "skystone_shielding"));
    // Incomplete Skystone Shielding Boule added 1/4/25 - Nyagi
    add(new ItemInfo("incomplete_skystone_shielding_boule", Tab.SEQUENCE, "skystone_shielding"));
    // Incomplete Raw Clustered Beryl Crude added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_cluster_beryl_crude", Tab.SEQUENCE, "raw_clustered_beryl"));
    // Incomplete Raw Clustered Beryl Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_cluster_beryl_polish", Tab.SEQUENCE, "raw_clustered_beryl"));
    // Incomplete Raw Prime Beryl Crude added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_prime_beryl_crude", Tab.SEQUENCE, "raw_prime_beryllic_cluster"));
    // Incomplete Raw Prime Beryl Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_prime_beryl_polish", Tab.SEQUENCE, "raw_prime_beryllic_cluster"));
    // Incomplete Raw Graphite Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_graphite_polish", Tab.SEQUENCE, "raw_graphite"));
    // Incomplete Raw Kimberlite Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_kimberlite_polish", Tab.SEQUENCE, "raw_kimberlite"));
    // Incomplete Raw Lamproite Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_lamproite_polish", Tab.SEQUENCE, "raw_lamproite"));
    // Incomplete Raw Lazurite Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_lazurite_polish", Tab.SEQUENCE, "raw_lazurite"));
    // Incomplete Raw Lapis Lazuli Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_lapis_lazuli_polish", Tab.SEQUENCE, "raw_lapis_lazuli"));
    // Incomplete Raw Fluorite Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_fluorite_polish", Tab.SEQUENCE, "raw_fluorite"));
    // Incomplete Raw Rutilated Quartz Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_rutilated_quartz_polish", Tab.SEQUENCE, "raw_rutilated_quartz"));
    // Incomplete Raw Ametrine Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_ametrine_polish", Tab.SEQUENCE, "raw_ametrine"));
    // Incomplete Raw Rose Quartz Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_rose_quartz_polish", Tab.SEQUENCE, "raw_rose_quartz"));
    // Incomplete Raw Prasiolite Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_prasiolite_polish", Tab.SEQUENCE, "raw_prasiolite"));
    // Incomplete Raw Meteoric Certus Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_meteoric_certus_polish", Tab.SEQUENCE, "raw_meteoric_certus"));
    // Incomplete Raw Turquoise Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_turquoise_polish", Tab.SEQUENCE, "raw_turquoise"));
    // Incomplete Raw Herkimer Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_herkimer_polish", Tab.SEQUENCE, "raw_herkimer_diamond"));
    // Incomplete Raw Dendritic Agate Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_dendritic_agate_polish", Tab.SEQUENCE, "raw_dendritic_agate"));
    // Incomplete Raw Chalcedony Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_chalcedony_polish", Tab.SEQUENCE, "raw_chalcedony"));
    // Incomplete Raw Spinel Polish added 1/5/25 - Nyagi
    add(new ItemInfo("incomplete_raw_spinel_polish", Tab.SEQUENCE, "raw_spinel"));

    // Processed Pulp [Formaldehyde] added 12/21/25 - Nyagi
    add(new ItemInfo("incomplete_processed_pulp_formaldehyde", Tab.SEQUENCE, "processed_pulp"));
    // Processed Pulp [Potassium Permanganate] added 12/21/25 - Nyagi
    add(new ItemInfo("incomplete_processed_pulp_potassium_permanganate", Tab.SEQUENCE, "processed_pulp"));
    // Processed Pulp [Glutaraldehyde] added 12/21/25 - Nyagi
    add(new ItemInfo("incomplete_processed_pulp_glutaraldehyde", Tab.SEQUENCE, "processed_pulp"));
    // Processed Pulp [AMeX] added 12/21/25 - Nyagi
    add(new ItemInfo("incomplete_processed_pulp_amex", Tab.SEQUENCE, "processed_pulp"));

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Sintered/Polished Tier 1 Items
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //NOTICE: Fluid bucket registration is no longer handled here, but it has been compressed into FluidInfo and ModFluids.
  }

  //This goes through the items and runs the method in ItemInfo to then register them.
  public static void init(){
    NyagiBits_Bytes.LOGGER.info("Registering Items");
    populateList();
  }

}
