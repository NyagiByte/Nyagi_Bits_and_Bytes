package net.madelyn.nyagibits_bytes.item;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.madelyn.nyagibits_bytes.misc.Utils.Tab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

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
  //Follow the format, keep it in the right category and sign new additions with name and timestamp.
  private static final List<ItemInfo> ITEMS_LIST = List.of(
      /*
        GENERIC ITEMS
      */
          // Inert God Heart 10/14/24 - Nyagi
          new ItemInfo("inert_god_heart", Type.CURIO, Tab.ITEMS),
          // Tier 0 Strawberry added 2/21/23 - Nyagi
          new ItemInfo("tier_zero_strawberry", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Tier 0 Golden Strawberry added 2/21/23 - Nyagi
          new ItemInfo("golden_tier_zero_strawberry", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Tier 1 Strawberry added 2/21/23 - Nyagi
          new ItemInfo("tier_one_strawberry", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Tier 1 Golden Strawberry added 2/21/23 - Nyagi
          new ItemInfo("golden_tier_one_strawberry", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Tier 2 Strawberry added 5/16/23 - Nyagi
          new ItemInfo("tier_two_strawberry", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Tier 2 Golden Strawberry added 5/16/23 - Nyagi
          new ItemInfo("golden_tier_two_strawberry", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Livisite Alloy added 7/11/23 - Nyagi
          new ItemInfo("livisite_alloy", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Livisite Slate added 7/11/23 - Nyagi
          new ItemInfo("livisite_slate", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Crude Abrasive added 7/11/23 - Nyagi
          new ItemInfo("crude_abrasive", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Pile of Cogs added 7/11/23 - Nyagi
          new ItemInfo("pile_of_cogs", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Pile of Crude Mechanical Parts added 7/11/23 - Nyagi
          new ItemInfo("pile_of_crude_mechanical_parts", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Soil Sample added 7/25/23 - Nyagi
          new ItemInfo("soil_sample", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Sturdy Box added 7/25/23 - Nyagi
          new ItemInfo("sturdy_box", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Sealed Pouch added 7/25/23 - Nyagi
          new ItemInfo("sealed_pouch", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Salt Water added 7/25/23 - Nyagi
          new ItemInfo("bucket_of_salt_water", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Torn Wool Ball added 7/25/23 - Nyagi
          new ItemInfo("torn_wool_ball", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Etched Redstone Plate added 8/10/23 - Nyagi
          new ItemInfo("etched_redstone_plate", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Crude Silicon Boule added 8/10/23 - Nyagi
          new ItemInfo("crude_silicon_boule", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Diamond Shard added 8/10/23 - Nyagi
          new ItemInfo("diamond_shard", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Logic Dud added 8/10/23 - Nyagi
          new ItemInfo("logic_dud", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Incomplete Logic Dud added 2/21/24 - Nyagi
          new ItemInfo("incomplete_logic_dud", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Calculation Dud added 8/10/23 - Nyagi
          new ItemInfo("calculation_dud", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Incomplete Calculation Dud added 2/21/24 - Nyagi
          new ItemInfo("incomplete_calculation_dud", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Engineering Dud added 8/10/23 - Nyagi
          new ItemInfo("engineering_dud", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Incomplete Engineering Dud added 2/21/24 - Nyagi
          new ItemInfo("incomplete_engineering_dud", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Bottle of Anthocyanin added 8/27/23 - Nyagi
          new ItemInfo("bottle_of_anthocyanin", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Bottle of Malic & Citric Acid added 8/27/23 - Nyagi
          new ItemInfo("bottle_of_malic_and_citric_acid", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Chemistry Rack added 8/27/23 - Nyagi
          new ItemInfo("chemistry_rack", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Basic Composite Material added 8/27/23 - Nyagi
          new ItemInfo("basic_composite_material", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Basic Composite Plate added 8/27/23 - Nyagi
          new ItemInfo("basic_composite_plate", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Compacted Soil added 3/17/24 - Nyagi
          new ItemInfo("compacted_soil", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Tough Bag added 3/17/24 - Nyagi
          new ItemInfo("tough_bag", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Empty Petri Dish added 3/20/24 - Nyagi
          new ItemInfo("petri_dish_empty", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Agar-Gel added 3/25/24 - Nyagi
          new ItemInfo("agar_gel", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Agar-Flakes added 3/25/24 - Nyagi
          new ItemInfo("agar_flakes", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Agar-Powder added 3/25/24 - Nyagi
          new ItemInfo("agar_powder", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Agar-Agar added 3/20/24 - Nyagi
          new ItemInfo("agar_agar", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Agar-Agar Petri Dish added 3/20/24 - Nyagi
          new ItemInfo("petri_dish_agar_agar", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Sponged Steel added 3/25/24 - Nyagi
          new ItemInfo("sponged_steel", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Sodium Polyacrylate added 3/26/24 - Nyagi
          new ItemInfo("sodium_polyacrylate", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Endoflame Mush added 3/26/24 - Nyagi
          new ItemInfo("endoflame_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Hydroangeas Mush added 7/20/24 - Nyagi
          new ItemInfo("hydroangeas_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Gourmaryllis Mush added 7/20/24 - Nyagi
          new ItemInfo("gourmaryllis_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Thermalily Mush added 7/20/24 - Nyagi
          new ItemInfo("thermalily_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Entropinnyum Mush added 7/20/24 - Nyagi
          new ItemInfo("entropinnyum_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Munchdew Mush added 7/20/24 - Nyagi
          new ItemInfo("munchdew_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Narslimmus Mush added 7/20/24 - Nyagi
          new ItemInfo("narslimmus_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Rosa Arcana Mush added 7/20/24 - Nyagi
          new ItemInfo("rosa_arcana_mush", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Manasteel Lattice added 3/26/24 - Nyagi
          new ItemInfo("manasteel_lattice", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Rune Binder added 3/26/24 - Nyagi
          new ItemInfo("rune_binder", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Rubberized Cable added 4/10/24 - Nyagi
          new ItemInfo("rubberized_cable", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Ceramic added 4/10/24 - Nyagi
          new ItemInfo("ceramic", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Activated Charcoal added 4/10/24 - Nyagi
          new ItemInfo("activated_charcoal", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Sturdy Tray added 4/10/24 - Nyagi
          new ItemInfo("sturdy_tray", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Beaker added 4/10/24 - Nyagi
          new ItemInfo("beaker", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Round Bottom Flask added 4/10/24 - Nyagi
          new ItemInfo("round_bottom_flask", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Distillation Column added 4/10/24 - Nyagi
          new ItemInfo("distillation_column", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Inlet added 4/10/24 - Nyagi
          new ItemInfo("inlet", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Burette added 4/10/24 - Nyagi
          new ItemInfo("burette", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Sterilized Quartz Glass added 4/10/24 - Nyagi
          new ItemInfo("sterilized_quartz_glass", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // pH Strip added 4/10/24 - Nyagi
          new ItemInfo("ph_strip", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Bottle of Vinegar added 4/10/24 - Nyagi
          new ItemInfo("bottle_of_vinegar", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Low Grade Coke added 4/21/24 - Nyagi
          new ItemInfo("low_grade_coke", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Industrial Grade Coke added 4/21/24 - Nyagi
          new ItemInfo("industrial_grade_coke", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Wrought Ball Bearing added 4/21/24 - Nyagi
          new ItemInfo("wrought_ball_bearing", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Wrought Tiny Spring added 4/21/24 - Nyagi
          new ItemInfo("wrought_tiny_spring", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Wrought Iron Rod added 4/21/24 - Nyagi
          new ItemInfo("wrought_iron_rod", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Mixed Seeds added 4/21/24 - Nyagi
          new ItemInfo("mixed_seeds", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Hard Hat added 4/21/24 - Nyagi
          new ItemInfo("hard_hat", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Protective Eye-wear added 5/1/24 - Nyagi
          new ItemInfo("protective_eye_wear", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Fire Extinguisher added 5/1/24 - Nyagi
          new ItemInfo("fire_extinguisher", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Organic Vapor Respirator added 5/1/24 - Nyagi
          new ItemInfo("organic_vapor_respirator", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Hardened Mechanical Bearing added 5/1/24 - Nyagi
          new ItemInfo("hardened_mechanical_bearing", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Fasteners added 5/1/24 - Nyagi
          new ItemInfo("fasteners", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Synchronous Electric Motor added 5/1/24 - Nyagi
          new ItemInfo("synchronous_electric_motor", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Industrial Gear added 5/1/24 - Nyagi
          new ItemInfo("industrial_gear", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Dampener added 5/1/24 - Nyagi
          new ItemInfo("dampener", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Reinforced Gearbox added 5/1/24 - Nyagi
          new ItemInfo("reinforced_gearbox", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // V-Belt added 5/1/24 - Nyagi
          new ItemInfo("v_belt", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Solenoid Component added 5/1/24 - Nyagi
          new ItemInfo("solenoid_component", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Flux Mixture added 5/8/24 - Nyagi
          new ItemInfo("flux_mixture", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Damascus Steel added 5/13/24 - Nyagi
          new ItemInfo("steel_damascus", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // High Carbon Steel - 1080 added 5/13/24 - Nyagi
          new ItemInfo("steel_high_carbon_1080", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // High Carbon Steel - 15N20 added 5/13/24 - Nyagi
          new ItemInfo("steel_high_carbon_15n20", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Stainless Steel added 5/13/24 - Nyagi
          new ItemInfo("steel_stainless", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Aluminum Trichloride added 5/16/24 - Nyagi
          new ItemInfo("aluminum_trichloride", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Toluene added 5/16/24 - Nyagi
          new ItemInfo("toluene", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Mononitrotoluene added 5/16/24 - Nyagi
          new ItemInfo("mononitrotoluene", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Dinitrotoluene added 5/16/24 - Nyagi
          new ItemInfo("dinitrotoluene", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // 2-4-6 Trinitrotoluene added 5/16/24 - Nyagi
          new ItemInfo("trinitrotoluene", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Methyl Chloride added 5/16/24 - Nyagi
          new ItemInfo("methyl_chloride", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Oleum added 5/16/24 - Nyagi
          new ItemInfo("oleum", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Chromium Trioxide added 5/22/24 - Nyagi
          new ItemInfo("chromium_trioxide", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Ethylene Oxide added 5/22/24 - Nyagi
          new ItemInfo("ethylene_oxide", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Benzyl Alcohol added 5/22/24 - Nyagi
          new ItemInfo("benzyl_alcohol", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // 2-Phenoxyethanol added 5/22/24 - Nyagi
          new ItemInfo("2_phenoxyethanol", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Low Voltage Capacitor added 6/5/24 - Nyagi
          new ItemInfo("low_voltage_capacitor", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Threaded Composite Leather added 6/5/24 - Nyagi
          new ItemInfo("threaded_composite_leather", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Industrial Composite Plate added 6/5/24 - Nyagi
          new ItemInfo("industrial_composite_plate", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Lead-Acid Cell added 6/5/24 - Nyagi
          new ItemInfo("lead_acid_cell", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Heavy Plating added 6/5/24 - Nyagi
          new ItemInfo("heavy_plating", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Soldering Iron added 6/5/24 - Nyagi
          new ItemInfo("soldering_iron", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Low Temperature Solder added 6/5/24 - Nyagi
          new ItemInfo("low_temperature_solder", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Ceramic Encased Copper added 6/5/24 - Nyagi
          new ItemInfo("ceramic_encased_copper", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Hydraulic Hammer added 6/5/24 - Nyagi
          new ItemInfo("hydraulic_hammer", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Tempered Glass added 6/5/24 - Nyagi
          new ItemInfo("tempered_glass", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Annealed Glass added 6/5/24 - Nyagi
          new ItemInfo("annealed_glass", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Tungsten Wire added 6/5/24 - Nyagi
          new ItemInfo("tungsten_wire", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Woven Cloth added 6/5/24 - Nyagi
          new ItemInfo("woven_cloth", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Solder Wire added 6/8/24 - Nyagi
          new ItemInfo("solder_wire", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Fluorophlogopite added 6/28/24 - Nyagi
          new ItemInfo("fluorophlogopite", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Synthetic Mica added 6/28/24 - Nyagi
          new ItemInfo("synthetic_mica", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // TPV Cell added 6/28/24 - Nyagi
          new ItemInfo("tpv_cell", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Polycrystalline Silicon Carbide added 6/28/24 - Nyagi
          new ItemInfo("polycrystalline_silicon_carbide", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Zinc-Gallium-Antimony Alloy added 6/28/24 - Nyagi
          new ItemInfo("zinc_gallium_antimony_alloy", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Ash added 7/15/24 - Nyagi
          new ItemInfo("ash", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Potash added 7/15/24 - Nyagi
          new ItemInfo("potash", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Wood Ash added 7/15/24 - Nyagi
          new ItemInfo("wood_ash", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Metamorphic Alloy added 7/15/24 - Nyagi
          new ItemInfo("metamorphic_alloy", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Ore Extraction Plate added 7/15/24 - Nyagi
          new ItemInfo("ore_extraction_plate", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Chromatic Compound added 8/3/24 - Barza
          new ItemInfo("chromatic_compound", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Refined Radiance added 8/3/24 - Barza
          new ItemInfo("refined_radiance", Type.LEVITATING, Tab.ITEMS),
          // Shadow Steel added 8/3/24 - Barza
          new ItemInfo("shadow_steel", Type.LEVITATING, Tab.ITEMS),
          // Ae2 Assembly added 8/10/23 - Nyagi
          new ItemInfo("ae2_assembly", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Crystal Harmonizer added 8/10/23 - Nyagi
          new ItemInfo("crystal_harmonizer", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Processor Stack added 8/10/23 - Nyagi
          new ItemInfo("processor_stack", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Energized Frame added 8/10/23 - Nyagi
          new ItemInfo("energized_frame", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Energized Wires added 8/10/23 - Nyagi
          new ItemInfo("energized_wires", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Skystone Shielding added 8/10/23 - Nyagi
          new ItemInfo("skystone_shielding", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Matter Converters added 8/10/23 - Nyagi
          new ItemInfo("matter_converters", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Decorative Paneling added 8/10/23 - Nyagi
          new ItemInfo("decorative_paneling", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // MicroTools added 8/10/23 - Nyagi
          new ItemInfo("micro_tools", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Botania Assembly added 3/17/24 - Nyagi
          new ItemInfo("botania_assembly", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Semi-organic Substrate added 3/17/24 - Nyagi
          new ItemInfo("semi_organic_substrate", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Soil Conditioner added 3/17/24 - Nyagi
          new ItemInfo("soil_conditioner", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Living Frame added 3/17/24 - Nyagi
          new ItemInfo("living_frame", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Terrarium added 3/17/24 - Nyagi
          new ItemInfo("terrarium", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Organic Pseudo Logic added 3/17/24 - Nyagi
          new ItemInfo("organic_pseudo_logic", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Sealant added 3/17/24 - Nyagi
          new ItemInfo("sealant", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Magnetic Hematite added 3/17/24 - Nyagi
          new ItemInfo("magnetic_hematite", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Mystic Fertilizer added 3/17/24 - Nyagi
          new ItemInfo("mystic_fertilizer", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Alchemistry Assembly added 4/6/24 - Nyagi
          new ItemInfo("alchemistry_assembly", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Electrolytic Core added 4/6/24 - Nyagi
          new ItemInfo("electrolytic_core", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Desiccation Powder added 4/6/24 - Nyagi
          new ItemInfo("desiccation_powder", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Chemical Grade Glassware added 4/6/24 - Nyagi
          new ItemInfo("chemical_grade_glassware", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Fume Fan added 4/6/24 - Nyagi
          new ItemInfo("fume_fan", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Chemically Inert Wood added 4/6/24 - Nyagi
          new ItemInfo("chemically_inert_wood", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // pH Strips added 4/6/24 - Nyagi
          new ItemInfo("ph_strips", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Chromatography Kit added 4/6/24 - Nyagi
          new ItemInfo("chromatography_kit", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Bunsen Burner added 4/6/24 - Nyagi
          new ItemInfo("bunsen_burner", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Immersive Assembly added 4/25/24 - Nyagi
          new ItemInfo("immersive_assembly", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // High Temperature Heat Exchanger added 4/25/24 - Nyagi
          new ItemInfo("high_temperature_heat_exchanger", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Duct Tape added 4/25/24 - Nyagi
          new ItemInfo("duct_tape", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // WD40 added 4/25/24 - Nyagi
          new ItemInfo("wd_40", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // 79" x 28" TRIPLE-BAY 4s SERIES TOOLBOX added 4/25/24 - Nyagi
          new ItemInfo("triple_bay_4s_series_toolbox", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Acetylene Tank added 4/25/24 - Nyagi
          new ItemInfo("acetylene_tank", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // OSHA Approved Gear added 4/25/24 - Nyagi
          new ItemInfo("osha_approved_gear", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Crate Of Industrial Components added 4/25/24 - Nyagi
          new ItemInfo("crate_of_industrial_components", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // High Strength Concrete added 4/25/24 - Nyagi
          new ItemInfo("high_strength_concrete", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Smectite Clay added 10/27/24 - Nyagi
          new ItemInfo("smectite_clay", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Sodium Hypochlorite added 10/27/24 - Nyagi
          new ItemInfo("sodium_hypochlorite", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Volcanic Pumice added 10/27/24 - Nyagi
          new ItemInfo("volcanic_pumice", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Dense Slag added 10/27/24 - Nyagi
          new ItemInfo("dense_slag", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Skystone Encrusted Boule added 10/27/24 - Nyagi
          new ItemInfo("skystone_encrusted_boule", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Botanical Core added 10/27/24 - Nyagi
          new ItemInfo("botanical_core", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Everburn Tar added 10/27/24 - Nyagi
          new ItemInfo("everburn_tar", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Mercury Thermometer added 10/27/24 - Nyagi
          new ItemInfo("mercury_thermometer", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // High Strength Ratio Reducer added 10/27/24 - Nyagi
          new ItemInfo("high_strength_ratio_reducer", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Precise Crystal Harmonizer added 10/27/24 - Nyagi
          new ItemInfo("precise_crystal_harmonizer", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Mini Faraday Cage added 10/27/24 - Nyagi
          new ItemInfo("mini_faraday_cage", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Pile of Basic Mechanical Parts added 10/27/24 - Nyagi
          new ItemInfo("pile_of_basic_mechanical_parts", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Gypsum added 11/21/24 - Nyagi
          new ItemInfo("gypsum", Type.CUSTOM_TOOLTIP, Tab.ITEMS),

          //Custom Botania Runes
          // Blank Rune added 3/8/24 - Nyagi
          new ItemInfo("rune_blank", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Optical Rune added 3/8/24 - Nyagi
          new ItemInfo("rune_optical", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Velocity Rune added 3/8/24 - Nyagi
          new ItemInfo("rune_velocity", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Inertia Rune added 3/8/24 - Nyagi
          new ItemInfo("rune_inertia", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Thermodynamic Rune added 3/8/24 - Nyagi
          new ItemInfo("rune_thermodynamic", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Magnetic Rune added 3/8/24 - Nyagi
          new ItemInfo("rune_magnetic", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Catalytic Rune added 3/8/24 - Nyagi
          new ItemInfo("rune_catalytic", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Computational Rune added 3/8/24 - Nyagi
          new ItemInfo("rune_computational", Type.CUSTOM_TOOLTIP, Tab.ITEMS),

          //Create Sequenced Assembly Intermediates
          // Incomplete Controller added 2/20/24 - Nyagi
          new ItemInfo("incomplete_controller", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Cell Workbench added 2/20/24 - Nyagi
          new ItemInfo("incomplete_cell_workbench", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Item Cell Housing added 2/20/24 - Nyagi
          new ItemInfo("incomplete_me_item_cell_housing", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Charged Quartz Fixture added 2/20/24 - Nyagi
          new ItemInfo("incomplete_charged_quartz_fixture", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Skystone Tank added 2/20/24 - Nyagi
          new ItemInfo("incomplete_skystone_tank", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Interface added 2/20/24 - Nyagi
          new ItemInfo("incomplete_me_interface", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Charger added 2/20/24 - Nyagi
          new ItemInfo("incomplete_charger", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete 1k ME Storage Component added 2/20/24 - Nyagi
          new ItemInfo("incomplete_onek_me_storage_component", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Inscriber added 2/20/24 - Nyagi
          new ItemInfo("incomplete_inscriber", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Fluix ME Glass Cable added 2/20/24 - Nyagi
          new ItemInfo("incomplete_fluix_me_glass_cable", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Fluix ME Smart Cable added 2/20/24 - Nyagi
          new ItemInfo("incomplete_fluix_me_smart_cable", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Fluix ME Dense Smart Cable added 2/20/24 - Nyagi
          new ItemInfo("incomplete_fluix_me_dense_smart_cable", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Drive added 2/20/24 - Nyagi
          new ItemInfo("incomplete_me_drive", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Chest added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_chest", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Vibration Chamber added 2/21/24 - Nyagi
          new ItemInfo("incomplete_vibration_chamber", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Light Detecting Fixture added 2/21/24 - Nyagi
          new ItemInfo("incomplete_light_detecting_fixture", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Illuminated Panel added 2/21/24 - Nyagi
          new ItemInfo("incomplete_illuminated_panel", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Storage Bus added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_storage_bus", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Import Bus added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_import_bus", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Export Bus added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_export_bus", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Level Emitter added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_level_emitter", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Energy Level Emitter added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_energy_level_emitter", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Annihilation Plane added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_annihilation_plane", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Formation Plane added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_formation_plane", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Terminal added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_terminal", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Crafting Terminal added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_crafting_terminal", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME p2p Tunnel added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_ptwop_tunnel", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Security Terminal added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_security_terminal", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME IO Port added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_io_port", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Energy Cell added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_energy_cell", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Storage Monitor added 2/21/24 - Nyagi
          new ItemInfo("incomplete_me_storage_monitor", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Color Applicator added 2/21/24 - Nyagi
          new ItemInfo("incomplete_color_applicator", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Logic Processor added 2/22/24 - Nyagi
          new ItemInfo("incomplete_logic_processor", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Calculation Processor added 2/22/24 - Nyagi
          new ItemInfo("incomplete_calculation_processor", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Engineering Processor added 2/22/24 - Nyagi
          new ItemInfo("incomplete_engineering_processor", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete ME Fluid Cell Housing added 2/22/24 - Nyagi
          new ItemInfo("incomplete_me_fluid_cell_housing", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),
          // Incomplete Energy Acceptor added 2/22/24 - Nyagi
          new ItemInfo("incomplete_energy_acceptor", Type.CUSTOM_TOOLTIP, Tab.SEQUENCE),


      /*
        SCIENCE ITEMS REGISTRATION
      */

          // Crude Compression Test added 7/18/23 - Nyagi
          new ItemInfo("crude_compression_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Used Crude Compression Test added 7/18/23 - Nyagi
          new ItemInfo("used_crude_compression_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Crude Statics Test added 7/18/23 - Nyagi
          new ItemInfo("crude_statics_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Used Crude Statics Test added 7/18/23 - Nyagi
          new ItemInfo("used_crude_statics_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Crude Entropy Test added 7/18/23 - Nyagi
          new ItemInfo("crude_entropy_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Used Crude Entropy Test added 7/18/23 - Nyagi
          new ItemInfo("used_crude_entropy_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Crude Acidics Test added 8/27/23 - Nyagi
          new ItemInfo("crude_acidics_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Used Crude Acidics Test added 8/27/23 - Nyagi
          new ItemInfo("used_crude_acidics_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Crude Natural Arcana Test added 8/27/23 - Nyagi
          new ItemInfo("crude_natural_arcana_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Used Crude Natural Arcana Test added 8/27/23 - Nyagi
          new ItemInfo("used_crude_natural_arcana_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Crude Material Properties Test added 8/27/23 - Nyagi
          new ItemInfo("crude_material_properties_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Used Crude Material Properties Test added 8/27/23 - Nyagi
          new ItemInfo("used_crude_material_properties_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Mana Bomb-Calorimeter added 10/27/24 - Nyagi
          new ItemInfo("mana_bomb_calorimeter", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Used Mana Bomb-Calorimeter added 11/21/24 - Nyagi
          new ItemInfo("used_mana_bomb_calorimeter", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Single Use Mana-Ablatives Demonstration added 10/27/24 - Nyagi
          new ItemInfo("single_use_mana_ablatives_demonstration", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Used Single Use Mana-Ablatives Demonstration added 11/21/24 - Nyagi
          new ItemInfo("used_single_use_mana_ablatives_demonstration", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Basic Material Properties Test added 10/27/24 - Nyagi
          new ItemInfo("basic_material_properties_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Used Basic Material Properties Test added 10/27/24 - Nyagi
          new ItemInfo("used_basic_material_properties_test", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),

      /*
         SCIENCE DATA STORAGE
       */

          // Lab Notebook added 8/10/23 - Nyagi
          new ItemInfo("lab_notebook", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Lab Notebook With Crude Compression Data added 8/10/23 - Nyagi
          new ItemInfo("lab_notebook_with_crude_compression_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Lab Notebook With Crude Statics Data added 8/10/23 - Nyagi
          new ItemInfo("lab_notebook_with_crude_statics_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Lab Notebook With Crude Entropy Data added 8/10/23 - Nyagi
          new ItemInfo("lab_notebook_with_crude_entropy_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Lab Notebook With Crude Acidics Data added 8/27/23 - Nyagi
          new ItemInfo("lab_notebook_with_crude_acidics_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Lab Notebook With Crude Natural Arcana Data added 8/27/23 - Nyagi
          new ItemInfo("lab_notebook_with_crude_natural_arcana_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Lab Notebook With Crude Material Properties Data added 8/27/23 - Nyagi
          new ItemInfo("lab_notebook_with_crude_material_properties_data", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Lexicon added 10/27/24 - Nyagi
          new ItemInfo("lexicon", Type.CUSTOM_TOOLTIP, Tab.SCIENCE),
          // Pen added 8/10/23 - Nyagi
          new ItemInfo("pen", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Pen Assembly added 8/10/23 - Nyagi
          new ItemInfo("pen_assembly", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Ball Bearing added 8/10/23 - Nyagi
          new ItemInfo("ball_bearing", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Thin Casing added 8/10/23 - Nyagi
          new ItemInfo("thin_casing", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Tiny Spring added 8/10/23 - Nyagi
          new ItemInfo("tiny_spring", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Ink Cartridge added 8/10/23 - Nyagi
          new ItemInfo("ink_cartridge", Type.CUSTOM_TOOLTIP, Tab.ITEMS),
          // Ink added 8/10/23 - Nyagi
          new ItemInfo("ink", Type.CUSTOM_TOOLTIP, Tab.ITEMS),

      /*
         SCHEMATICS
       */

          // Blank Blueprint added 8/27/23 - Nyagi
          new ItemInfo("blank_blueprint", Type.CUSTOM_TOOLTIP, Tab.SCHEMATICS),
          // Ae2 Schematic added 8/27/23 - Nyagi
          new ItemInfo("ae2_schematic", Type.CUSTOM_TOOLTIP, Tab.SCHEMATICS),
          // Botania Schematic added 8/27/23 - Nyagi
          new ItemInfo("botania_schematic", Type.CUSTOM_TOOLTIP, Tab.SCHEMATICS),
          // Immersive Engineering Schematic added 8/27/23 - Nyagi
          new ItemInfo("immersive_engineering_schematic", Type.CUSTOM_TOOLTIP, Tab.SCHEMATICS),
          // Alchemistry Schematic added 8/27/23 - Nyagi
          new ItemInfo("alchemistry_schematic", Type.CUSTOM_TOOLTIP, Tab.SCHEMATICS),

      /*
        ORE ITEMS
      */
          //Iron
          // Raw Limonite added 9/29/23 - Nyagi
          new ItemInfo("raw_limonite", Type.CUSTOM_ORE, Tab.MINERALS),
          // Raw Hematite added 9/29/23 - Nyagi
          new ItemInfo("raw_hematite", Type.CUSTOM_ORE, Tab.MINERALS),
          // Raw Magnetite added 9/29/23 - Nyagi
          new ItemInfo("raw_magnetite", Type.CUSTOM_ORE, Tab.MINERALS),
          // Raw Pyrite added 9/29/23 - Nyagi
          new ItemInfo("raw_pyrite", Type.CUSTOM_ORE, Tab.MINERALS),
          // Raw Siderite added 9/29/23 - Nyagi
          new ItemInfo("raw_siderite", Type.CUSTOM_ORE, Tab.MINERALS),
          // Raw Banded Iron added 9/29/23 - Nyagi
          new ItemInfo("raw_banded_iron", Type.CUSTOM_ORE, Tab.MINERALS),
          // Raw Bog Iron added 9/29/23 - Nyagi
          new ItemInfo("raw_bog_iron", Type.CUSTOM_ORE, Tab.MINERALS),
          // Raw Meteoric Iron added 9/29/23 - Nyagi
          new ItemInfo("raw_meteoric_iron", Type.CUSTOM_ORE, Tab.MINERALS),

          //Copper
          // Raw Chalcopyrite added 10/1/23 - Nyagi
          new ItemInfo("raw_chalcopyrite", Type.ITEM, Tab.MINERALS),
          // Raw Malachite added 10/1/23 - Nyagi
          new ItemInfo("raw_malachite", Type.ITEM, Tab.MINERALS),
          // Raw Azurite added 10/1/23 - Nyagi
          new ItemInfo("raw_azurite", Type.ITEM, Tab.MINERALS),
          // Raw Tetrahedrite added 10/1/23 - Nyagi
          new ItemInfo("raw_tetrahedrite", Type.ITEM, Tab.MINERALS),
          // Raw Enargite added 10/1/23 - Nyagi
          new ItemInfo("raw_enargite", Type.ITEM, Tab.MINERALS),
          // Raw Chrysocolla added 10/1/23 - Nyagi
          new ItemInfo("raw_chrysocolla", Type.ITEM, Tab.MINERALS),
          // Raw Tennanite added 10/1/23 - Nyagi
          new ItemInfo("raw_tennanite", Type.ITEM, Tab.MINERALS),
          // Raw Dioptase added 10/1/23 - Nyagi
          new ItemInfo("raw_dioptase", Type.ITEM, Tab.MINERALS),

          //Coal
          // Raw Lignite added 10/1/23 - Nyagi
          new ItemInfo("raw_lignite", Type.ITEM, Tab.MINERALS),
          // Raw Bituminous added 10/1/23 - Nyagi
          new ItemInfo("raw_bituminous", Type.ITEM, Tab.MINERALS),
          // Raw Subbituminous added 10/1/23 - Nyagi
          new ItemInfo("raw_subbituminous", Type.ITEM, Tab.MINERALS),
          // Raw Anthracite added 10/1/23 - Nyagi
          new ItemInfo("raw_anthracite", Type.ITEM, Tab.MINERALS),
          // Raw Cannel Coal added 10/1/23 - Nyagi
          new ItemInfo("raw_cannel_coal", Type.ITEM, Tab.MINERALS),
          // Raw Jet added 10/1/23 - Nyagi
          new ItemInfo("raw_jet", Type.ITEM, Tab.MINERALS),
          // Raw Peat added 10/1/23 - Nyagi
          new ItemInfo("raw_peat", Type.ITEM, Tab.MINERALS),
          // Raw Graphite added 10/1/23 - Nyagi
          new ItemInfo("raw_graphite", Type.ITEM, Tab.MINERALS),

          //Gold and Silver
          // Alluvial Slush added 10/1/23 - Nyagi
          new ItemInfo("alluvial_slush", Type.ITEM, Tab.MINERALS),
          // Native Cluster added 10/1/23 - Nyagi
          new ItemInfo("native_cluster", Type.ITEM, Tab.MINERALS),
          // Raw Argentite added 10/1/23 - Nyagi
          new ItemInfo("raw_argentite", Type.ITEM, Tab.MINERALS),
          // Raw Chlorargyrite added 10/1/23 - Nyagi
          new ItemInfo("raw_chlorargyrite", Type.ITEM, Tab.MINERALS),
          // Raw Polybasite added 10/1/23 - Nyagi
          new ItemInfo("raw_polybasite", Type.ITEM, Tab.MINERALS),
          // Raw Proustite added 10/1/23 - Nyagi
          new ItemInfo("raw_proustite", Type.ITEM, Tab.MINERALS),
          // Raw Electrum added 10/1/23 - Nyagi
          new ItemInfo("raw_electrum", Type.ITEM, Tab.MINERALS),
          // Raw Kustelite Electrum added 10/1/23 - Nyagi
          new ItemInfo("raw_kustelite_electrum", Type.ITEM, Tab.MINERALS),

          //Redstone and Mercury
          // Raw Cinnabar added 10/9/23 - Nyagi
          new ItemInfo("raw_cinnabar", Type.ITEM, Tab.MINERALS),
          // Raw Metacinnabar added 10/9/23 - Nyagi
          new ItemInfo("raw_metacinnabar", Type.ITEM, Tab.MINERALS),
          // Raw Corderoite added 10/9/23 - Nyagi
          new ItemInfo("raw_corderoite", Type.ITEM, Tab.MINERALS),
          // Raw Basaltic Powder added 10/9/23 - Nyagi
          new ItemInfo("raw_basaltic_powder", Type.ITEM, Tab.MINERALS),
          // Raw Calomel added 10/9/23 - Nyagi
          new ItemInfo("raw_calomel", Type.ITEM, Tab.MINERALS),
          // Raw Native Mercury Spherules added 10/9/23 - Nyagi
          new ItemInfo("raw_native_mercury_spherules", Type.ITEM, Tab.MINERALS),
          // Raw Montroydite added 10/9/23 - Nyagi
          new ItemInfo("raw_montroydite", Type.ITEM, Tab.MINERALS),
          // Raw Granulated Obsidian added 10/9/23 - Nyagi
          new ItemInfo("raw_granulated_obsidian", Type.ITEM, Tab.MINERALS),

          //Crystals and Minerals
          // Raw Kimberlite added 10/9/23 - Nyagi
          new ItemInfo("raw_kimberlite", Type.ITEM, Tab.MINERALS),
          // Raw Lamproite added 10/9/23 - Nyagi
          new ItemInfo("raw_lamproite", Type.ITEM, Tab.MINERALS),
          // Raw Lazurite added 10/9/23 - Nyagi
          new ItemInfo("raw_lazurite", Type.ITEM, Tab.MINERALS),
          // Raw Lapis Lazuli added 10/9/23 - Nyagi
          new ItemInfo("raw_lapis_lazuli", Type.ITEM, Tab.MINERALS),
          // Raw Prime Beryllic Cluster added 10/9/23 - Nyagi
          new ItemInfo("raw_prime_beryllic_cluster", Type.ITEM, Tab.MINERALS),
          // Raw Fluorite added 10/9/23 - Nyagi
          new ItemInfo("raw_fluorite", Type.ITEM, Tab.MINERALS),
          // Raw Chalcogenide Crystal Cluster added 10/9/23 - Nyagi
          new ItemInfo("raw_chalcogenide_crystal_cluster", Type.ITEM, Tab.MINERALS),
          // Raw Salt Cluster added 10/9/23 - Nyagi
          new ItemInfo("raw_salt_cluster", Type.ITEM, Tab.MINERALS),
          // Raw Herkimer Diamond added 10/13/23 - Nyagi

          //Quartz
          new ItemInfo("raw_herkimer_diamond", Type.ITEM, Tab.MINERALS),
          // Raw Dendritic Agate added 10/13/23 - Nyagi
          new ItemInfo("raw_dendritic_agate", Type.ITEM, Tab.MINERALS),
          // Raw Chalcedony added 10/13/23 - Nyagi
          new ItemInfo("raw_chalcedony", Type.ITEM, Tab.MINERALS),
          // Raw Rutilated Quartz added 10/13/23 - Nyagi
          new ItemInfo("raw_rutilated_quartz", Type.ITEM, Tab.MINERALS),
          // Raw Ametrine added 10/13/23 - Nyagi
          new ItemInfo("raw_ametrine", Type.ITEM, Tab.MINERALS),
          // Raw Rose Quartz added 10/13/23 - Nyagi
          new ItemInfo("raw_rose_quartz", Type.ITEM, Tab.MINERALS),
          // Raw Prasiolite added 10/13/23 - Nyagi
          new ItemInfo("raw_prasiolite", Type.ITEM, Tab.MINERALS),
          // Raw Meteoric Certus added 10/13/23 - Nyagi
          new ItemInfo("raw_meteoric_certus", Type.ITEM, Tab.MINERALS),
          // Raw Zinc Carbonate added 10/13/23 - Nyagi

          //Zinc
          new ItemInfo("raw_zinc_carbonate", Type.ITEM, Tab.MINERALS),
          // Raw Sphalerite added 10/13/23 - Nyagi
          new ItemInfo("raw_sphalerite", Type.ITEM, Tab.MINERALS),
          // Raw Smithsonite added 10/13/23 - Nyagi
          new ItemInfo("raw_smithsonite", Type.ITEM, Tab.MINERALS),
          // Raw Hemimorphite added 10/13/23 - Nyagi
          new ItemInfo("raw_hemimorphite", Type.ITEM, Tab.MINERALS),
          // Raw Wurtzite added 10/13/23 - Nyagi
          new ItemInfo("raw_wurtzite", Type.ITEM, Tab.MINERALS),
          // Raw Hydrozincite added 10/13/23 - Nyagi
          new ItemInfo("raw_hydrozincite", Type.ITEM, Tab.MINERALS),
          // Raw Willemite added 10/13/23 - Nyagi
          new ItemInfo("raw_willemite", Type.ITEM, Tab.MINERALS),
          // Raw Franklinite added 10/13/23 - Nyagi
          new ItemInfo("raw_franklinite", Type.ITEM, Tab.MINERALS),

          //Aluminium
          // Raw Bauxite added 10/13/23 - Nyagi
          new ItemInfo("raw_bauxite", Type.ITEM, Tab.MINERALS),
          // Raw Feldspar added 10/13/23 - Nyagi
          new ItemInfo("raw_feldspar", Type.ITEM, Tab.MINERALS),
          // Raw Clustered Beryl added 10/13/23 - Nyagi
          new ItemInfo("raw_clustered_beryl", Type.ITEM, Tab.MINERALS),
          // Raw Cryolite added 10/13/23 - Nyagi
          new ItemInfo("raw_cryolite", Type.ITEM, Tab.MINERALS),
          // Raw Spinel added 10/13/23 - Nyagi
          new ItemInfo("raw_spinel", Type.ITEM, Tab.MINERALS),
          // Raw Turquoise added 10/13/23 - Nyagi
          new ItemInfo("raw_turquoise", Type.ITEM, Tab.MINERALS),
          // Raw Garnet Slush added 10/13/23 - Nyagi
          new ItemInfo("raw_garnet_slush", Type.ITEM, Tab.MINERALS),
          // Raw Native Aluminum added 10/13/23 - Nyagi
          new ItemInfo("raw_native_aluminum", Type.ITEM, Tab.MINERALS),

          //Lead
          //Galena added 10/20/23 - Nyagi
          new ItemInfo("raw_galena", Type.ITEM, Tab.MINERALS),
          //Lead Sulphide added 10/20/23 - Nyagi
          new ItemInfo("raw_lead_sulphide", Type.ITEM, Tab.MINERALS),
          //Pyromorphite added 10/20/23 - Nyagi
          new ItemInfo("raw_pyromorphite", Type.ITEM, Tab.MINERALS),
          //Cerussite added 10/20/23 - Nyagi
          new ItemInfo("raw_cerussite", Type.ITEM, Tab.MINERALS),
          //Anglesite added 10/20/23 - Nyagi
          new ItemInfo("raw_anglesite", Type.ITEM, Tab.MINERALS),
          //Wulfenite added 10/20/23 - Nyagi
          new ItemInfo("raw_wulfenite", Type.ITEM, Tab.MINERALS),
          //Vanadinite added 10/20/23 - Nyagi
          new ItemInfo("raw_vanadinite", Type.ITEM, Tab.MINERALS),
          //Mimetite added 10/20/23 - Nyagi
          new ItemInfo("raw_mimetite", Type.ITEM, Tab.MINERALS),

          //Nickel
          //Pentlandite added 10/27/23 - Nyagi
          new ItemInfo("raw_pentlandite", Type.ITEM, Tab.MINERALS),
          //Garnierite added 10/27/23 - Nyagi
          new ItemInfo("raw_garnierite", Type.ITEM, Tab.MINERALS),
          //Saprolite added 10/27/23 - Nyagi
          new ItemInfo("raw_saprolite", Type.ITEM, Tab.MINERALS),
          //Hardened Sulfide Flow added 10/27/23 - Nyagi
          new ItemInfo("raw_hardened_sulfide_flow", Type.ITEM, Tab.MINERALS),
          //Millerite added 10/27/23 - Nyagi
          new ItemInfo("raw_millerite", Type.ITEM, Tab.MINERALS),
          //Nickeline added 10/27/23 - Nyagi
          new ItemInfo("raw_nickeline", Type.ITEM, Tab.MINERALS),
          //Meteoric Taenite added 10/27/23 - Nyagi
          new ItemInfo("raw_meteoric_taenite", Type.ITEM, Tab.MINERALS),
          //Meteoric Kamacite added 10/27/23 - Nyagi
          new ItemInfo("raw_meteoric_kamacite", Type.ITEM, Tab.MINERALS),

          //Uranium & Thorium
          //Pitchblende added 10/27/23 - Nyagi
          new ItemInfo("raw_pitchblende", Type.ITEM, Tab.MINERALS),
          //Carnotite added 10/27/23 - Nyagi
          new ItemInfo("raw_carnotite", Type.ITEM, Tab.MINERALS),
          //Tyuyamunite added 10/27/23 - Nyagi
          new ItemInfo("raw_tyuyamunite", Type.ITEM, Tab.MINERALS),
          //Torbernite added 10/27/23 - Nyagi
          new ItemInfo("raw_torbernite", Type.ITEM, Tab.MINERALS),
          //Autunite added 10/27/23 - Nyagi
          new ItemInfo("raw_autunite", Type.ITEM, Tab.MINERALS),
          //Thorite added 10/27/23 - Nyagi
          new ItemInfo("raw_thorite", Type.ITEM, Tab.MINERALS),
          //Uranothorite added 10/27/23 - Nyagi
          new ItemInfo("raw_uranothorite", Type.ITEM, Tab.MINERALS),
          //Thorianite added 10/27/23 - Nyagi
          new ItemInfo("raw_thorianite", Type.ITEM, Tab.MINERALS),

          //Tin
          //Cassiterite added 11/3/23 - Nyagi
          new ItemInfo("raw_cassiterite", Type.ITEM, Tab.MINERALS),
          //Stannite added 11/3/23 - Nyagi
          new ItemInfo("raw_stannite", Type.ITEM, Tab.MINERALS),
          //Cylindrite added 11/3/23 - Nyagi
          new ItemInfo("raw_cylindrite", Type.ITEM, Tab.MINERALS),
          //Franckeite added 11/3/23 - Nyagi
          new ItemInfo("raw_franckeite", Type.ITEM, Tab.MINERALS),
          //Canfieldite added 11/3/23 - Nyagi
          new ItemInfo("raw_canfieldite", Type.ITEM, Tab.MINERALS),
          //Teallite added 11/3/23 - Nyagi
          new ItemInfo("raw_teallite", Type.ITEM, Tab.MINERALS),
          //Brannerite added 11/3/23 - Nyagi
          new ItemInfo("raw_brannerite", Type.ITEM, Tab.MINERALS),
          //Orthoclase added 11/3/23 - Nyagi
          new ItemInfo("raw_orthoclase", Type.ITEM, Tab.MINERALS),

          //Misc Processing Ores
          //Saltpeter added 11/3/23 - Nyagi
          new ItemInfo("raw_saltpeter", Type.ITEM, Tab.MINERALS),
          //Borax added 11/3/23 - Nyagi
          new ItemInfo("raw_borax", Type.ITEM, Tab.MINERALS),
          //Compacted Limestone added 11/3/23 - Nyagi
          new ItemInfo("raw_compacted_limestone", Type.ITEM, Tab.MINERALS),
          //Volcanic Sulfur added 11/3/23 - Nyagi
          new ItemInfo("raw_volcanic_sulfur", Type.ITEM, Tab.MINERALS),
          //Rainbow Obsidian added 11/3/23 - Nyagi
          new ItemInfo("raw_rainbow_obsidian", Type.ITEM, Tab.MINERALS),
          //Petrified Wood added 11/3/23 - Nyagi
          new ItemInfo("raw_petrified_wood", Type.ITEM, Tab.MINERALS),
          //Chalk added 11/3/23 - Nyagi
          new ItemInfo("raw_chalk", Type.ITEM, Tab.MINERALS),
          //Trona Ore (Baking Soda) added 11/3/23 - Nyagi
          new ItemInfo("raw_trona", Type.ITEM, Tab.MINERALS),

          //Ore-related drops
          //TODO: Find missing date
          //Sapphire
          new ItemInfo("sapphire", Type.ITEM, Tab.MINERALS),
          //Sapphire Dust
          new ItemInfo("sapphire_dust", Type.ITEM, Tab.MINERALS),
          //Ruby
          new ItemInfo("ruby", Type.ITEM, Tab.MINERALS),
          //Ruby Dust
          new ItemInfo("ruby_dust", Type.ITEM, Tab.MINERALS),
          //Aquamarine
          new ItemInfo("aquamarine", Type.ITEM, Tab.MINERALS),
          //Aquamarine Dust
          new ItemInfo("aquamarine_dust", Type.ITEM, Tab.MINERALS),
          //Morganite
          new ItemInfo("morganite", Type.ITEM, Tab.MINERALS),
          //Morganite Dust
          new ItemInfo("morganite_dust", Type.ITEM, Tab.MINERALS),
          //Heliodor
          new ItemInfo("heliodor", Type.ITEM, Tab.MINERALS),
          //Heliodor Dust
          new ItemInfo("heliodor_dust", Type.ITEM, Tab.MINERALS),
          //Goshenite
          new ItemInfo("goshenite", Type.ITEM, Tab.MINERALS),
          //Goshenite Dust
          new ItemInfo("goshenite_dust", Type.ITEM, Tab.MINERALS),
          //Bixbite
          new ItemInfo("bixbite", Type.ITEM, Tab.MINERALS),
          //Bixbite Dust
          new ItemInfo("bixbite_dust", Type.ITEM, Tab.MINERALS),
          //Pezzottaite
          new ItemInfo("pezzottaite", Type.ITEM, Tab.MINERALS),
          //Pezzottaite Dust
          new ItemInfo("pezzottaite_dust", Type.ITEM, Tab.MINERALS),

          //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
          // Sintered/Polished Tier 1 Items
          //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

          //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
          // FLUID-ITEMS BELOW
          //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
          // Hydrocarbon Tar - Added 6/25/24
          new ItemInfo.Bucket("bucket_of_hydrocarbon_tar", () -> Utils.fetchFluid(Utils.NBNB("hydrocarbon_tar_fluid"))),
          new ItemInfo.Bucket("bucket_of_raw_wood_vinegar", () -> Utils.fetchFluid(Utils.NBNB("raw_wood_vinegar_fluid"))),
          new ItemInfo.Bucket("bucket_of_pyroligneous_acid", () -> Utils.fetchFluid(Utils.NBNB("pyroligneous_acid_fluid"))),
          new ItemInfo.Bucket("bucket_of_acetone", () -> Utils.fetchFluid(Utils.NBNB("acetone_fluid"))),
          new ItemInfo.Bucket("bucket_of_gemstone_polish", () -> Utils.fetchFluid(Utils.NBNB("gemstone_polish_fluid"))),
          new ItemInfo.Bucket("bucket_of_molten_skystone", () -> Utils.fetchFluid(Utils.NBNB("molten_skystone_fluid")))

  );

  //This goes through the items and runs the method in ItemInfo to then register them.
  static{
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
