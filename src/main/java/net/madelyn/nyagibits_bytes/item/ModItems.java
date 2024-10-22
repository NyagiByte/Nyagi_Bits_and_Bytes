package net.madelyn.nyagibits_bytes.item;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.fluid.ModFluids;
import net.madelyn.nyagibits_bytes.item.custom.*;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, NyagiBits_Bytes.MOD_ID);

  // For our dynamic item registration
  public static final Map<String, RegistryObject<Item>> ITEM_MAP =
      new HashMap<>();

  /*
   * SUPPLIERS
   */

  // We don't want to repeat instantiation logic: if you copy/paste then it's
  // not the way to go A Supplier takes in no argument and produces something
  private static final Supplier<Item> curio = ()
      -> new CuriosRingItem(
          new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS));

  private static final Supplier<Item> customTooltip = ()
      -> new CustomTooltipItem(
          new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS));

  private static final Supplier<Item> basicItem = ()
      -> new Item(
          new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS));

  private static final Supplier<Item> incompleteItem = ()
      -> new Item(new Item.Properties().tab(
          ModCreativeModeTab.NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS));

  private static final Supplier<Item> science = ()
      -> new Item(new Item.Properties().tab(
          ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE));

  private static final Supplier<Item> schematics = ()
      -> new Item(new Item.Properties().tab(
          ModCreativeModeTab.NYAGIBITS_BYTES_SCHEMATICS));

  private static final Supplier<Item> minerals = ()
      -> new Item(new Item.Properties().tab(
          ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS));

  private static final Supplier<Item> levitatingItem = ()
      -> new Item(
          new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS));

  private static final Supplier<Item> customOre = ()
      -> new CustomOreItem(new Item.Properties().tab(
          ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS));

  // Prepends "SOURCE_" to the fluid name to dynamically generate source names
  private static Supplier<Item> bucket(String fluidName) {
    try {
      return () -> {
        try {
          return new BucketItem(
              (Fluid)ModFluids
                  .class.getDeclaredField("SOURCE_" + fluidName.toUpperCase())
                  .get(null),
              new Item.Properties()
                  .tab(ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS)
                  .craftRemainder(Items.BUCKET)
                  .stacksTo(1));
        } catch (IllegalAccessException e) {
          throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
          throw new RuntimeException(e);
        }
      };
    } catch (Exception e) {
      throw new RuntimeException("Error creating bucket for: " + fluidName, e);
    }
  }

  private static final CreativeModeTab items =
      ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS;
  private static final CreativeModeTab fluids =
      ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS;

  /*
   * HELPERS
   */

  // Just calls ITEMS.register on our supplied item, filling in whichever
  // creative tab we want
  private static RegistryObject<Item>
  registerItem(String name, Supplier<Item> itemSupplier, CreativeModeTab tab) {
    RegistryObject<Item> registeredItem =
        ITEMS.register(name, () -> itemSupplier.get());
    ITEM_MAP.put(name, registeredItem);
    return registeredItem;
  }

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

  private static final List<String[]> ITEMS_LIST = List.of(
      /*
        GENERIC ITEMS
      */

      // Inert God Heart 10/14/24 - Nyagi
      new String[] {"inert_god_heart", "curio", "items"},
      // Tier 0 Strawberry added 2/21/23 - Nyagi
      new String[] {"tier_zero_strawberry", "customTooltip", "items"},
      // Tier 0 Golden Strawberry added 2/21/23 - Nyagi
      new String[] {"golden_tier_zero_strawberry", "customTooltip", "items"},
      // Tier 1 Strawberry added 2/21/23 - Nyagi
      new String[] {"tier_one_strawberry", "customTooltip", "items"},
      // Tier 1 Golden Strawberry added 2/21/23 - Nyagi
      new String[] {"golden_tier_one_strawberry", "customTooltip", "items"},
      // Tier 2 Strawberry added 5/16/23 - Nyagi
      new String[] {"tier_two_strawberry", "customTooltip", "items"},
      // Tier 2 Golden Strawberry added 5/16/23 - Nyagi
      new String[] {"golden_tier_two_strawberry", "customTooltip", "items"},
      // Livisite Alloy added 7/11/23 - Nyagi
      new String[] {"livisite_alloy", "customTooltip", "items"},
      // Livisite Slate added 7/11/23 - Nyagi
      new String[] {"livisite_slate", "customTooltip", "items"},
      // Crude Abrasive added 7/11/23 - Nyagi
      new String[] {"crude_abrasive", "customTooltip", "items"},
      // Pile of Cogs added 7/11/23 - Nyagi
      new String[] {"pile_of_cogs", "customTooltip", "items"},
      // Pile of Crude Mechanical Parts added 7/11/23 - Nyagi
      new String[] {"pile_of_crude_mechanical_parts", "customTooltip", "items"},
      // Soil Sample added 7/25/23 - Nyagi
      new String[] {"soil_sample", "customTooltip", "items"},
      // Sturdy Box added 7/25/23 - Nyagi
      new String[] {"sturdy_box", "customTooltip", "items"},
      // Sealed Pouch added 7/25/23 - Nyagi
      new String[] {"sealed_pouch", "customTooltip", "items"},
      // Salt Water added 7/25/23 - Nyagi
      new String[] {"bucket_of_salt_water", "customTooltip", "items"},
      // Torn Wool Ball added 7/25/23 - Nyagi
      new String[] {"torn_wool_ball", "customTooltip", "items"},
      // Etched Redstone Plate added 8/10/23 - Nyagi
      new String[] {"etched_redstone_plate", "customTooltip", "items"},
      // Crude Silicon Boule added 8/10/23 - Nyagi
      new String[] {"crude_silicon_boule", "customTooltip", "items"},
      // Diamond Shard added 8/10/23 - Nyagi
      new String[] {"diamond_shard", "customTooltip", "items"},
      // Logic Dud added 8/10/23 - Nyagi
      new String[] {"logic_dud", "customTooltip", "items"},
      // Incomplete Logic Dud added 2/21/24 - Nyagi
      new String[] {"incomplete_logic_dud", "customTooltip", "incompleteItem"},
      // Calculation Dud added 8/10/23 - Nyagi
      new String[] {"calculation_dud", "customTooltip", "items"},
      // Incomplete Calculation Dud added 2/21/24 - Nyagi
      new String[] {"incomplete_calculation_dud", "customTooltip",
                    "incompleteItem"},
      // Engineering Dud added 8/10/23 - Nyagi
      new String[] {"engineering_dud", "customTooltip", "items"},
      // Incomplete Engineering Dud added 2/21/24 - Nyagi
      new String[] {"incomplete_engineering_dud", "customTooltip",
                    "incompleteItem"},
      // Bottle of Anthocyanin added 8/27/23 - Nyagi
      new String[] {"bottle_of_anthocyanin", "customTooltip", "items"},
      // Bottle of Malic & Citric Acid added 8/27/23 - Nyagi
      new String[] {"bottle_of_malic_and_citric_acid", "customTooltip",
                    "items"},
      // Chemistry Rack added 8/27/23 - Nyagi
      new String[] {"chemistry_rack", "customTooltip", "items"},
      // Basic Composite Material added 8/27/23 - Nyagi
      new String[] {"basic_composite_material", "customTooltip", "items"},
      // Basic Composite Plate added 8/27/23 - Nyagi
      new String[] {"basic_composite_plate", "customTooltip", "items"},
      // Compacted Soil added 3/17/24 - Nyagi
      new String[] {"compacted_soil", "customTooltip", "items"},
      // Tough Bag added 3/17/24 - Nyagi
      new String[] {"tough_bag", "customTooltip", "items"},
      // Empty Petri Dish added 3/20/24 - Nyagi
      new String[] {"petri_dish_empty", "customTooltip", "items"},
      // Agar-Gel added 3/25/24 - Nyagi
      new String[] {"agar_gel", "customTooltip", "items"},
      // Agar-Flakes added 3/25/24 - Nyagi
      new String[] {"agar_flakes", "customTooltip", "items"},
      // Agar-Powder added 3/25/24 - Nyagi
      new String[] {"agar_powder", "customTooltip", "items"},
      // Agar-Agar added 3/20/24 - Nyagi
      new String[] {"agar_agar", "customTooltip", "items"},
      // Agar-Agar Petri Dish added 3/20/24 - Nyagi
      new String[] {"petri_dish_agar_agar", "customTooltip", "items"},
      // Sponged Steel added 3/25/24 - Nyagi
      new String[] {"sponged_steel", "customTooltip", "items"},
      // Sodium Polyacrylate added 3/26/24 - Nyagi
      new String[] {"sodium_polyacrylate", "customTooltip", "items"},
      // Endoflame Mush added 3/26/24 - Nyagi
      new String[] {"endoflame_mush", "customTooltip", "items"},
      // Hydroangeas Mush added 7/20/24 - Nyagi
      new String[] {"hydroangeas_mush", "customTooltip", "items"},
      // Gourmaryllis Mush added 7/20/24 - Nyagi
      new String[] {"gourmaryllis_mush", "customTooltip", "items"},
      // Thermalily Mush added 7/20/24 - Nyagi
      new String[] {"thermalily_mush", "customTooltip", "items"},
      // Entropinnyum Mush added 7/20/24 - Nyagi
      new String[] {"entropinnyum_mush", "customTooltip", "items"},
      // Munchdew Mush added 7/20/24 - Nyagi
      new String[] {"munchdew_mush", "customTooltip", "items"},
      // Narslimmus Mush added 7/20/24 - Nyagi
      new String[] {"narslimmus_mush", "customTooltip", "items"},
      // Rosa Arcana Mush added 7/20/24 - Nyagi
      new String[] {"rosa_arcana_mush", "customTooltip", "items"},
      // Manasteel Lattice added 3/26/24 - Nyagi
      new String[] {"manasteel_lattice", "customTooltip", "items"},
      // Rune Binder added 3/26/24 - Nyagi
      new String[] {"rune_binder", "customTooltip", "items"},
      // Rubberized Cable added 4/10/24 - Nyagi
      new String[] {"rubberized_cable", "customTooltip", "items"},
      // Ceramic added 4/10/24 - Nyagi
      new String[] {"ceramic", "customTooltip", "items"},
      // Activated Charcoal added 4/10/24 - Nyagi
      new String[] {"activated_charcoal", "customTooltip", "items"},
      // Sturdy Tray added 4/10/24 - Nyagi
      new String[] {"sturdy_tray", "customTooltip", "items"},
      // Beaker added 4/10/24 - Nyagi
      new String[] {"beaker", "customTooltip", "items"},
      // Round Bottom Flask added 4/10/24 - Nyagi
      new String[] {"round_bottom_flask", "customTooltip", "items"},
      // Distillation Column added 4/10/24 - Nyagi
      new String[] {"distillation_column", "customTooltip", "items"},
      // Inlet added 4/10/24 - Nyagi
      new String[] {"inlet", "customTooltip", "items"},
      // Burette added 4/10/24 - Nyagi
      new String[] {"burette", "customTooltip", "items"},
      // Sterilized Quartz Glass added 4/10/24 - Nyagi
      new String[] {"sterilized_quartz_glass", "customTooltip", "items"},
      // pH Strip added 4/10/24 - Nyagi
      new String[] {"ph_strip", "customTooltip", "items"},
      // Bottle of Vinegar added 4/10/24 - Nyagi
      new String[] {"bottle_of_vinegar", "customTooltip", "items"},
      // Low Grade Coke added 4/21/24 - Nyagi
      new String[] {"low_grade_coke", "customTooltip", "items"},
      // Industrial Grade Coke added 4/21/24 - Nyagi
      new String[] {"industrial_grade_coke", "customTooltip", "items"},
      // Wrought Ball Bearing added 4/21/24 - Nyagi
      new String[] {"wrought_ball_bearing", "customTooltip", "items"},
      // Wrought Tiny Spring added 4/21/24 - Nyagi
      new String[] {"wrought_tiny_spring", "customTooltip", "items"},
      // Wrought Iron Rod added 4/21/24 - Nyagi
      new String[] {"wrought_iron_rod", "customTooltip", "items"},
      // Mixed Seeds added 4/21/24 - Nyagi
      new String[] {"mixed_seeds", "customTooltip", "items"},
      // Hard Hat added 4/21/24 - Nyagi
      new String[] {"hard_hat", "customTooltip", "items"},
      // Protective Eye-wear added 5/1/24 - Nyagi
      new String[] {"protective_eye_wear", "customTooltip", "items"},
      // Fire Extinguisher added 5/1/24 - Nyagi
      new String[] {"fire_extinguisher", "customTooltip", "items"},
      // Organic Vapor Respirator added 5/1/24 - Nyagi
      new String[] {"organic_vapor_respirator", "customTooltip", "items"},
      // Hardened Mechanical Bearing added 5/1/24 - Nyagi
      new String[] {"hardened_mechanical_bearing", "customTooltip", "items"},
      // Fasteners added 5/1/24 - Nyagi
      new String[] {"fasteners", "customTooltip", "items"},
      // Synchronous Electric Motor added 5/1/24 - Nyagi
      new String[] {"synchronous_electric_motor", "customTooltip", "items"},
      // Industrial Gear added 5/1/24 - Nyagi
      new String[] {"industrial_gear", "customTooltip", "items"},
      // Dampener added 5/1/24 - Nyagi
      new String[] {"dampener", "customTooltip", "items"},
      // Reinforced Gearbox added 5/1/24 - Nyagi
      new String[] {"reinforced_gearbox", "customTooltip", "items"},
      // V-Belt added 5/1/24 - Nyagi
      new String[] {"v_belt", "customTooltip", "items"},
      // Solenoid Component added 5/1/24 - Nyagi
      new String[] {"solenoid_component", "customTooltip", "items"},
      // Flux Mixture added 5/8/24 - Nyagi
      new String[] {"flux_mixture", "customTooltip", "items"},
      // Damascus Steel added 5/13/24 - Nyagi
      new String[] {"steel_damascus", "customTooltip", "items"},
      // High Carbon Steel - 1080 added 5/13/24 - Nyagi
      new String[] {"steel_high_carbon_1080", "customTooltip", "items"},
      // High Carbon Steel - 15N20 added 5/13/24 - Nyagi
      new String[] {"steel_high_carbon_15n20", "customTooltip", "items"},
      // Stainless Steel added 5/13/24 - Nyagi
      new String[] {"steel_stainless", "customTooltip", "items"},
      // Aluminum Trichloride added 5/16/24 - Nyagi
      new String[] {"aluminum_trichloride", "customTooltip", "items"},
      // Toluene added 5/16/24 - Nyagi
      new String[] {"toluene", "customTooltip", "items"},
      // Mononitrotoluene added 5/16/24 - Nyagi
      new String[] {"mononitrotoluene", "customTooltip", "items"},
      // Dinitrotoluene added 5/16/24 - Nyagi
      new String[] {"dinitrotoluene", "customTooltip", "items"},
      // 2-4-6 Trinitrotoluene added 5/16/24 - Nyagi
      new String[] {"trinitrotoluene", "customTooltip", "items"},
      // Methyl Chloride added 5/16/24 - Nyagi
      new String[] {"methyl_chloride", "customTooltip", "items"},
      // Oleum added 5/16/24 - Nyagi
      new String[] {"oleum", "customTooltip", "items"},
      // Chromium Trioxide added 5/22/24 - Nyagi
      new String[] {"chromium_trioxide", "customTooltip", "items"},
      // Ethylene Oxide added 5/22/24 - Nyagi
      new String[] {"ethylene_oxide", "customTooltip", "items"},
      // Benzyl Alcohol added 5/22/24 - Nyagi
      new String[] {"benzyl_alcohol", "customTooltip", "items"},
      // 2-Phenoxyethanol added 5/22/24 - Nyagi
      new String[] {"2_phenoxyethanol", "customTooltip", "items"},
      // Low Voltage Capacitor added 6/5/24 - Nyagi
      new String[] {"low_voltage_capacitor", "customTooltip", "items"},
      // Threaded Composite Leather added 6/5/24 - Nyagi
      new String[] {"threaded_composite_leather", "customTooltip", "items"},
      // Industrial Composite Plate added 6/5/24 - Nyagi
      new String[] {"industrial_composite_plate", "customTooltip", "items"},
      // Lead-Acid Cell added 6/5/24 - Nyagi
      new String[] {"lead_acid_cell", "customTooltip", "items"},
      // Heavy Plating added 6/5/24 - Nyagi
      new String[] {"heavy_plating", "customTooltip", "items"},
      // Soldering Iron added 6/5/24 - Nyagi
      new String[] {"soldering_iron", "customTooltip", "items"},
      // Low Temperature Solder added 6/5/24 - Nyagi
      new String[] {"low_temperature_solder", "customTooltip", "items"},
      // Ceramic Encased Copper added 6/5/24 - Nyagi
      new String[] {"ceramic_encased_copper", "customTooltip", "items"},
      // Hydraulic Hammer added 6/5/24 - Nyagi
      new String[] {"hydraulic_hammer", "customTooltip", "items"},
      // Tempered Glass added 6/5/24 - Nyagi
      new String[] {"tempered_glass", "customTooltip", "items"},
      // Annealed Glass added 6/5/24 - Nyagi
      new String[] {"annealed_glass", "customTooltip", "items"},
      // Tungsten Wire added 6/5/24 - Nyagi
      new String[] {"tungsten_wire", "customTooltip", "items"},
      // Woven Cloth added 6/5/24 - Nyagi
      new String[] {"woven_cloth", "customTooltip", "items"},
      // Solder Wire added 6/8/24 - Nyagi
      new String[] {"solder_wire", "customTooltip", "items"},
      // Fluorophlogopite added 6/28/24 - Nyagi
      new String[] {"fluorophlogopite", "customTooltip", "items"},
      // Synthetic Mica added 6/28/24 - Nyagi
      new String[] {"synthetic_mica", "customTooltip", "items"},
      // TPV Cell added 6/28/24 - Nyagi
      new String[] {"tpv_cell", "customTooltip", "items"},
      // Polycrystalline Silicon Carbide added 6/28/24 - Nyagi
      new String[] {"polycrystalline_silicon_carbide", "customTooltip",
                    "items"},
      // Zinc-Gallium-Antimony Alloy added 6/28/24 - Nyagi
      new String[] {"zinc_gallium_antimony_alloy", "customTooltip", "items"},
      // Ash added 7/15/24 - Nyagi
      new String[] {"ash", "customTooltip", "items"},
      // Potash added 7/15/24 - Nyagi
      new String[] {"potash", "customTooltip", "items"},
      // Wood Ash added 7/15/24 - Nyagi
      new String[] {"wood_ash", "customTooltip", "items"},
      // Metamorphic Alloy added 7/15/24 - Nyagi
      new String[] {"metamorphic_alloy", "customTooltip", "items"},
      // Ore Extraction Plate added 7/15/24 - Nyagi
      new String[] {"ore_extraction_plate", "customTooltip", "items"},
      // Chromatic Compound added 8/3/24 - Barza
      new String[] {"chromatic_compound", "customTooltip", "items"},
      // Refined Radiance added 8/3/24 - Barza
      new String[] {"refined_radiance", "levitatingItem", "items"},
      // Shadow Steel added 8/3/24 - Barza
      new String[] {"shadow_steel", "levitatingItem", "items"},
      // Ae2 Assembly added 8/10/23 - Nyagi
      new String[] {"ae2_assembly", "customTooltip", "items"},
      // Crystal Harmonizer added 8/10/23 - Nyagi
      new String[] {"crystal_harmonizer", "customTooltip", "items"},
      // Processor Stack added 8/10/23 - Nyagi
      new String[] {"processor_stack", "customTooltip", "items"},
      // Energized Frame added 8/10/23 - Nyagi
      new String[] {"energized_frame", "customTooltip", "items"},
      // Energized Wires added 8/10/23 - Nyagi
      new String[] {"energized_wires", "customTooltip", "items"},
      // Skystone Shielding added 8/10/23 - Nyagi
      new String[] {"skystone_shielding", "customTooltip", "items"},
      // Matter Converters added 8/10/23 - Nyagi
      new String[] {"matter_converters", "customTooltip", "items"},
      // Decorative Paneling added 8/10/23 - Nyagi
      new String[] {"decorative_paneling", "customTooltip", "items"},
      // MicroTools added 8/10/23 - Nyagi
      new String[] {"micro_tools", "customTooltip", "items"},
      // Incomplete Controller added 2/20/24 - Nyagi
      new String[] {"incomplete_controller", "customTooltip", "incompleteItem"},
      // Incomplete Cell Workbench added 2/20/24 - Nyagi
      new String[] {"incomplete_cell_workbench", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Item Cell Housing added 2/20/24 - Nyagi
      new String[] {"incomplete_me_item_cell_housing", "customTooltip",
                    "incompleteItem"},
      // Incomplete Charged Quartz Fixture added 2/20/24 - Nyagi
      new String[] {"incomplete_charged_quartz_fixture", "customTooltip",
                    "incompleteItem"},
      // Incomplete Skystone Tank added 2/20/24 - Nyagi
      new String[] {"incomplete_skystone_tank", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Interface added 2/20/24 - Nyagi
      new String[] {"incomplete_me_interface", "customTooltip",
                    "incompleteItem"},
      // Incomplete Charger added 2/20/24 - Nyagi
      new String[] {"incomplete_charger", "customTooltip", "incompleteItem"},
      // Incomplete 1k ME Storage Component added 2/20/24 - Nyagi
      new String[] {"incomplete_onek_me_storage_component", "customTooltip",
                    "incompleteItem"},
      // Incomplete Inscriber added 2/20/24 - Nyagi
      new String[] {"incomplete_inscriber", "customTooltip", "incompleteItem"},
      // Incomplete Fluix ME Glass Cable added 2/20/24 - Nyagi
      new String[] {"incomplete_fluix_me_glass_cable", "customTooltip",
                    "incompleteItem"},
      // Incomplete Fluix ME Smart Cable added 2/20/24 - Nyagi
      new String[] {"incomplete_fluix_me_smart_cable", "customTooltip",
                    "incompleteItem"},
      // Incomplete Fluix ME Dense Smart Cable added 2/20/24 - Nyagi
      new String[] {"incomplete_fluix_me_dense_smart_cable", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Drive added 2/20/24 - Nyagi
      new String[] {"incomplete_me_drive", "customTooltip", "incompleteItem"},
      // Incomplete ME Chest added 2/21/24 - Nyagi
      new String[] {"incomplete_me_chest", "customTooltip", "incompleteItem"},
      // Incomplete Vibration Chamber added 2/21/24 - Nyagi
      new String[] {"incomplete_vibration_chamber", "customTooltip",
                    "incompleteItem"},
      // Incomplete Light Detecting Fixture added 2/21/24 - Nyagi
      new String[] {"incomplete_light_detecting_fixture", "customTooltip",
                    "incompleteItem"},
      // Incomplete Illuminated Panel added 2/21/24 - Nyagi
      new String[] {"incomplete_illuminated_panel", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Storage Bus added 2/21/24 - Nyagi
      new String[] {"incomplete_me_storage_bus", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Import Bus added 2/21/24 - Nyagi
      new String[] {"incomplete_me_import_bus", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Export Bus added 2/21/24 - Nyagi
      new String[] {"incomplete_me_export_bus", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Level Emitter added 2/21/24 - Nyagi
      new String[] {"incomplete_me_level_emitter", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Energy Level Emitter added 2/21/24 - Nyagi
      new String[] {"incomplete_me_energy_level_emitter", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Annihilation Plane added 2/21/24 - Nyagi
      new String[] {"incomplete_me_annihilation_plane", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Formation Plane added 2/21/24 - Nyagi
      new String[] {"incomplete_me_formation_plane", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Terminal added 2/21/24 - Nyagi
      new String[] {"incomplete_me_terminal", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Crafting Terminal added 2/21/24 - Nyagi
      new String[] {"incomplete_me_crafting_terminal", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME p2p Tunnel added 2/21/24 - Nyagi
      new String[] {"incomplete_me_ptwop_tunnel", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Security Terminal added 2/21/24 - Nyagi
      new String[] {"incomplete_me_security_terminal", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME IO Port added 2/21/24 - Nyagi
      new String[] {"incomplete_me_io_port", "customTooltip", "incompleteItem"},
      // Incomplete ME Energy Cell added 2/21/24 - Nyagi
      new String[] {"incomplete_me_energy_cell", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Storage Monitor added 2/21/24 - Nyagi
      new String[] {"incomplete_me_storage_monitor", "customTooltip",
                    "incompleteItem"},
      // Incomplete Color Applicator added 2/21/24 - Nyagi
      new String[] {"incomplete_color_applicator", "customTooltip",
                    "incompleteItem"},
      // Incomplete Logic Processor added 2/22/24 - Nyagi
      new String[] {"incomplete_logic_processor", "customTooltip",
                    "incompleteItem"},
      // Incomplete Calculation Processor added 2/22/24 - Nyagi
      new String[] {"incomplete_calculation_processor", "customTooltip",
                    "incompleteItem"},
      // Incomplete Engineering Processor added 2/22/24 - Nyagi
      new String[] {"incomplete_engineering_processor", "customTooltip",
                    "incompleteItem"},
      // Incomplete ME Fluid Cell Housing added 2/22/24 - Nyagi
      new String[] {"incomplete_me_fluid_cell_housing", "customTooltip",
                    "incompleteItem"},
      // Incomplete Energy Acceptor added 2/22/24 - Nyagi
      new String[] {"incomplete_energy_acceptor", "customTooltip",
                    "incompleteItem"},
      // Botania Assembly added 3/17/24 - Nyagi
      new String[] {"botania_assembly", "customTooltip", "items"},
      // Semi-organic Substrate added 3/17/24 - Nyagi
      new String[] {"semi_organic_substrate", "customTooltip", "items"},
      // Soil Conditioner added 3/17/24 - Nyagi
      new String[] {"soil_conditioner", "customTooltip", "items"},
      // Living Frame added 3/17/24 - Nyagi
      new String[] {"living_frame", "customTooltip", "items"},
      // Terrarium added 3/17/24 - Nyagi
      new String[] {"terrarium", "customTooltip", "items"},
      // Organic Pseudo Logic added 3/17/24 - Nyagi
      new String[] {"organic_pseudo_logic", "customTooltip", "items"},
      // Sealant added 3/17/24 - Nyagi
      new String[] {"sealant", "customTooltip", "items"},
      // Magnetic Hematite added 3/17/24 - Nyagi
      new String[] {"magnetic_hematite", "customTooltip", "items"},
      // Mystic Fertilizer added 3/17/24 - Nyagi
      new String[] {"mystic_fertilizer", "customTooltip", "items"},
      // Alchemistry Assembly added 4/6/24 - Nyagi
      new String[] {"alchemistry_assembly", "customTooltip", "items"},
      // Electrolytic Core added 4/6/24 - Nyagi
      new String[] {"electrolytic_core", "customTooltip", "items"},
      // Desiccation Powder added 4/6/24 - Nyagi
      new String[] {"desiccation_powder", "customTooltip", "items"},
      // Chemical Grade Glassware added 4/6/24 - Nyagi
      new String[] {"chemical_grade_glassware", "customTooltip", "items"},
      // Fume Fan added 4/6/24 - Nyagi
      new String[] {"fume_fan", "customTooltip", "items"},
      // Chemically Inert Wood added 4/6/24 - Nyagi
      new String[] {"chemically_inert_wood", "customTooltip", "items"},
      // pH Strips added 4/6/24 - Nyagi
      new String[] {"ph_strips", "customTooltip", "items"},
      // Chromatography Kit added 4/6/24 - Nyagi
      new String[] {"chromatography_kit", "customTooltip", "items"},
      // Bunsen Burner added 4/6/24 - Nyagi
      new String[] {"bunsen_burner", "customTooltip", "items"},
      // Immersive Assembly added 4/25/24 - Nyagi
      new String[] {"immersive_assembly", "customTooltip", "items"},
      // High Temperature Heat Exchanger added 4/25/24 - Nyagi
      new String[] {"high_temperature_heat_exchanger", "customTooltip",
                    "items"},
      // Duct Tape added 4/25/24 - Nyagi
      new String[] {"duct_tape", "customTooltip", "items"},
      // WD40 added 4/25/24 - Nyagi
      new String[] {"wd_40", "customTooltip", "items"},
      // 79" x 28" TRIPLE-BAY 4s SERIES TOOLBOX added 4/25/24 - Nyagi
      new String[] {"triple_bay_4s_series_toolbox", "customTooltip", "items"},
      // Acetylene Tank added 4/25/24 - Nyagi
      new String[] {"acetylene_tank", "customTooltip", "items"},
      // OSHA Approved Gear added 4/25/24 - Nyagi
      new String[] {"osha_approved_gear", "customTooltip", "items"},
      // Crate Of Industrial Components added 4/25/24 - Nyagi
      new String[] {"crate_of_industrial_components", "customTooltip", "items"},
      // High Strength Concrete added 4/25/24 - Nyagi
      new String[] {"high_strength_concrete", "customTooltip", "items"},
      // Blank Rune added 3/8/24 - Nyagi
      new String[] {"rune_blank", "customTooltip", "items"},
      // Optical Rune added 3/8/24 - Nyagi
      new String[] {"rune_optical", "customTooltip", "items"},
      // Velocity Rune added 3/8/24 - Nyagi
      new String[] {"rune_velocity", "customTooltip", "items"},
      // Inertia Rune added 3/8/24 - Nyagi
      new String[] {"rune_inertia", "customTooltip", "items"},
      // Thermodynamic Rune added 3/8/24 - Nyagi
      new String[] {"rune_thermodynamic", "customTooltip", "items"},
      // Magnetic Rune added 3/8/24 - Nyagi
      new String[] {"rune_magnetic", "customTooltip", "items"},
      // Catalytic Rune added 3/8/24 - Nyagi
      new String[] {"rune_catalytic", "customTooltip", "items"},
      // Computational Rune added 3/8/24 - Nyagi
      new String[] {"rune_computational", "customTooltip", "items"},

      /*
        SCIENCE ITEMS REGISTRATION
      */

      // Crude Compression Test added 7/18/23 - Nyagi
      new String[] {"crude_compression_test", "customTooltip", "science"},
      // Used Crude Compression Test added 7/18/23 - Nyagi
      new String[] {"used_crude_compression_test", "customTooltip", "science"},
      // Crude Statics Test added 7/18/23 - Nyagi
      new String[] {"crude_statics_test", "customTooltip", "science"},
      // Used Crude Statics Test added 7/18/23 - Nyagi
      new String[] {"used_crude_statics_test", "customTooltip", "science"},
      // Crude Entropy Test added 7/18/23 - Nyagi
      new String[] {"crude_entropy_test", "customTooltip", "science"},
      // Used Crude Entropy Test added 7/18/23 - Nyagi
      new String[] {"used_crude_entropy_test", "customTooltip", "science"},
      // Crude Acidics Test added 8/27/23 - Nyagi
      new String[] {"crude_acidics_test", "customTooltip", "science"},
      // Used Crude Acidics Test added 8/27/23 - Nyagi
      new String[] {"used_crude_acidics_test", "customTooltip", "science"},
      // Crude Natural Arcana Test added 8/27/23 - Nyagi
      new String[] {"crude_natural_arcana_test", "customTooltip", "science"},
      // Used Crude Natural Arcana Test added 8/27/23 - Nyagi
      new String[] {"used_crude_natural_arcana_test", "customTooltip",
                    "science"},
      // Crude Material Properties Test added 8/27/23 - Nyagi
      new String[] {"crude_material_properties_test", "customTooltip",
                    "science"},
      // Used Crude Material Properties Test added 8/27/23 - Nyagi
      new String[] {"used_crude_material_properties_test", "customTooltip",
                    "science"},

      /*
         SCIENCE DATA STORAGE
       */

      // Lab Notebook added 8/10/23 - Nyagi
      new String[] {"lab_notebook", "customTooltip", "science"},
      // Lab Notebook With Crude Compression Data added 8/10/23 - Nyagi
      new String[] {"lab_notebook_with_crude_compression_data", "customTooltip",
                    "science"},
      // Lab Notebook With Crude Statics Data added 8/10/23 - Nyagi
      new String[] {"lab_notebook_with_crude_statics_data", "customTooltip",
                    "science"},
      // Lab Notebook With Crude Entropy Data added 8/10/23 - Nyagi
      new String[] {"lab_notebook_with_crude_entropy_data", "customTooltip",
                    "science"},
      // Lab Notebook With Crude Acidics Data added 8/27/23 - Nyagi
      new String[] {"lab_notebook_with_crude_acidics_data", "customTooltip",
                    "science"},
      // Lab Notebook With Crude Natural Arcana Data added 8/27/23 - Nyagi
      new String[] {"lab_notebook_with_crude_natural_arcana_data",
                    "customTooltip", "science"},
      // Lab Notebook With Crude Material Properties Data added 8/27/23 - Nyagi
      new String[] {"lab_notebook_with_crude_material_properties_data",
                    "customTooltip", "science"},
      // Pen added 8/10/23 - Nyagi
      new String[] {"pen", "customTooltip", "items"},
      // Pen Assembly added 8/10/23 - Nyagi
      new String[] {"pen_assembly", "customTooltip", "items"},
      // Ball Bearing added 8/10/23 - Nyagi
      new String[] {"ball_bearing", "customTooltip", "items"},
      // Thin Casing added 8/10/23 - Nyagi
      new String[] {"thin_casing", "customTooltip", "items"},
      // Tiny Spring added 8/10/23 - Nyagi
      new String[] {"tiny_spring", "customTooltip", "items"},
      // Ink Cartridge added 8/10/23 - Nyagi
      new String[] {"ink_cartridge", "customTooltip", "items"},
      // Ink added 8/10/23 - Nyagi
      new String[] {"ink", "customTooltip", "items"},

      /*
         SCHEMATICS
       */

      // Blank Blueprint added 8/27/23 - Nyagi
      new String[] {"blank_blueprint", "customTooltip", "schematics"},
      // Ae2 Schematic added 8/27/23 - Nyagi
      new String[] {"ae2_schematic", "customTooltip", "schematics"},
      // Botania Schematic added 8/27/23 - Nyagi
      new String[] {"botania_schematic", "customTooltip", "schematics"},
      // Immersive Engineering Schematic added 8/27/23 - Nyagi
      new String[] {"immersive_engineering_schematic", "customTooltip",
                    "schematics"},
      // Alchemistry Schematic added 8/27/23 - Nyagi
      new String[] {"alchemistry_schematic", "customTooltip", "schematics"},

      /*
        ORE ITEMS
      */

      // Raw Limonite added 9/29/23 - Nyagi
      new String[] {"raw_limonite", "customOre", "minerals"},
      // Raw Hematite added 9/29/23 - Nyagi
      new String[] {"raw_hematite", "customOre", "minerals"},
      // Raw Magnetite added 9/29/23 - Nyagi
      new String[] {"raw_magnetite", "customOre", "minerals"},
      // Raw Pyrite added 9/29/23 - Nyagi
      new String[] {"raw_pyrite", "customOre", "minerals"},
      // Raw Siderite added 9/29/23 - Nyagi
      new String[] {"raw_siderite", "customOre", "minerals"},
      // Raw Banded Iron added 9/29/23 - Nyagi
      new String[] {"raw_banded_iron", "customOre", "minerals"},
      // Raw Bog Iron added 9/29/23 - Nyagi
      new String[] {"raw_bog_iron", "customOre", "minerals"},
      // Raw Meteoric Iron added 9/29/23 - Nyagi
      new String[] {"raw_meteoric_iron", "customOre", "minerals"},
      // Raw Chalcopyrite added 10/1/23 - Nyagi
      new String[] {"raw_chalcopyrite", "item", "minerals"},
      // Raw Malachite added 10/1/23 - Nyagi
      new String[] {"raw_malachite", "item", "minerals"},
      // Raw Azurite added 10/1/23 - Nyagi
      new String[] {"raw_azurite", "item", "minerals"},
      // Raw Tetrahedrite added 10/1/23 - Nyagi
      new String[] {"raw_tetrahedrite", "item", "minerals"},
      // Raw Enargite added 10/1/23 - Nyagi
      new String[] {"raw_enargite", "item", "minerals"},
      // Raw Chrysocolla added 10/1/23 - Nyagi
      new String[] {"raw_chrysocolla", "item", "minerals"},
      // Raw Tennanite added 10/1/23 - Nyagi
      new String[] {"raw_tennanite", "item", "minerals"},
      // Raw Dioptase added 10/1/23 - Nyagi
      new String[] {"raw_dioptase", "item", "minerals"},
      // Raw Lignite added 10/1/23 - Nyagi
      new String[] {"raw_lignite", "item", "minerals"},
      // Raw Bituminous added 10/1/23 - Nyagi
      new String[] {"raw_bituminous", "item", "minerals"},
      // Raw Subbituminous added 10/1/23 - Nyagi
      new String[] {"raw_subbituminous", "item", "minerals"},
      // Raw Anthracite added 10/1/23 - Nyagi
      new String[] {"raw_anthracite", "item", "minerals"},
      // Raw Cannel Coal added 10/1/23 - Nyagi
      new String[] {"raw_cannel_coal", "item", "minerals"},
      // Raw Jet added 10/1/23 - Nyagi
      new String[] {"raw_jet", "item", "minerals"},
      // Raw Peat added 10/1/23 - Nyagi
      new String[] {"raw_peat", "item", "minerals"},
      // Raw Graphite added 10/1/23 - Nyagi
      new String[] {"raw_graphite", "item", "minerals"},
      // Alluvial Slush added 10/1/23 - Nyagi
      new String[] {"alluvial_slush", "item", "minerals"},
      // Native Cluster added 10/1/23 - Nyagi
      new String[] {"native_cluster", "item", "minerals"},
      // Raw Argentite added 10/1/23 - Nyagi
      new String[] {"raw_argentite", "item", "minerals"},
      // Raw Chlorargyrite added 10/1/23 - Nyagi
      new String[] {"raw_chlorargyrite", "item", "minerals"},
      // Raw Polybasite added 10/1/23 - Nyagi
      new String[] {"raw_polybasite", "item", "minerals"},
      // Raw Proustite added 10/1/23 - Nyagi
      new String[] {"raw_proustite", "item", "minerals"},
      // Raw Electrum added 10/1/23 - Nyagi
      new String[] {"raw_electrum", "item", "minerals"},
      // Raw Kustelite Electrum added 10/1/23 - Nyagi
      new String[] {"raw_kustelite_electrum", "item", "minerals"},
      // Raw Cinnabar added 10/9/23 - Nyagi
      new String[] {"raw_cinnabar", "item", "minerals"},
      // Raw Metacinnabar added 10/9/23 - Nyagi
      new String[] {"raw_metacinnabar", "item", "minerals"},
      // Raw Corderoite added 10/9/23 - Nyagi
      new String[] {"raw_corderoite", "item", "minerals"},
      // Raw Basaltic Powder added 10/9/23 - Nyagi
      new String[] {"raw_basaltic_powder", "item", "minerals"},
      // Raw Calomel added 10/9/23 - Nyagi
      new String[] {"raw_calomel", "item", "minerals"},
      // Raw Native Mercury Spherules added 10/9/23 - Nyagi
      new String[] {"raw_native_mercury_spherules", "item", "minerals"},
      // Raw Montroydite added 10/9/23 - Nyagi
      new String[] {"raw_montroydite", "item", "minerals"},
      // Raw Granulated Obsidian added 10/9/23 - Nyagi
      new String[] {"raw_granulated_obsidian", "item", "minerals"},
      // Raw Kimberlite added 10/9/23 - Nyagi
      new String[] {"raw_kimberlite", "item", "minerals"},
      // Raw Lamproite added 10/9/23 - Nyagi
      new String[] {"raw_lamproite", "item", "minerals"},
      // Raw Lazurite added 10/9/23 - Nyagi
      new String[] {"raw_lazurite", "item", "minerals"},
      // Raw Lapis Lazuli added 10/9/23 - Nyagi
      new String[] {"raw_lapis_lazuli", "item", "minerals"},
      // Raw Prime Beryllic Cluster added 10/9/23 - Nyagi
      new String[] {"raw_prime_beryllic_cluster", "item", "minerals"},
      // Raw Fluorite added 10/9/23 - Nyagi
      new String[] {"raw_fluorite", "item", "minerals"},
      // Raw Chalcogenide Crystal Cluster added 10/9/23 - Nyagi
      new String[] {"raw_chalcogenide_crystal_cluster", "item", "minerals"},
      // Raw Salt Cluster added 10/9/23 - Nyagi
      new String[] {"raw_salt_cluster", "item", "minerals"},
      // Raw Herkimer Diamond added 10/13/23 - Nyagi
      new String[] {"raw_herkimer_diamond", "item", "minerals"},
      // Raw Dendritic Agate added 10/13/23 - Nyagi
      new String[] {"raw_dendritic_agate", "item", "minerals"},
      // Raw Chalcedony added 10/13/23 - Nyagi
      new String[] {"raw_chalcedony", "item", "minerals"},
      // Raw Rutilated Quartz added 10/13/23 - Nyagi
      new String[] {"raw_rutilated_quartz", "item", "minerals"},
      // Raw Ametrine added 10/13/23 - Nyagi
      new String[] {"raw_ametrine", "item", "minerals"},
      // Raw Rose Quartz added 10/13/23 - Nyagi
      new String[] {"raw_rose_quartz", "item", "minerals"},
      // Raw Prasiolite added 10/13/23 - Nyagi
      new String[] {"raw_prasiolite", "item", "minerals"},
      // Raw Meteoric Certus added 10/13/23 - Nyagi
      new String[] {"raw_meteoric_certus", "item", "minerals"},
      // Raw Zinc Carbonate added 10/13/23 - Nyagi
      new String[] {"raw_zinc_carbonate", "item", "minerals"},
      // Raw Sphalerite added 10/13/23 - Nyagi
      new String[] {"raw_sphalerite", "item", "minerals"},
      // Raw Smithsonite added 10/13/23 - Nyagi
      new String[] {"raw_smithsonite", "item", "minerals"},
      // Raw Hemimorphite added 10/13/23 - Nyagi
      new String[] {"raw_hemimorphite", "item", "minerals"},
      // Raw Wurtzite added 10/13/23 - Nyagi
      new String[] {"raw_wurtzite", "item", "minerals"},
      // Raw Hydrozincite added 10/13/23 - Nyagi
      new String[] {"raw_hydrozincite", "item", "minerals"},
      // Raw Willemite added 10/13/23 - Nyagi
      new String[] {"raw_willemite", "item", "minerals"},
      // Raw Franklinite added 10/13/23 - Nyagi
      new String[] {"raw_franklinite", "item", "minerals"},
      // Raw Bauxite added 10/13/23 - Nyagi
      new String[] {"raw_bauxite", "item", "minerals"},
      // Raw Feldspar added 10/13/23 - Nyagi
      new String[] {"raw_feldspar", "item", "minerals"},
      // Raw Clustered Beryl added 10/13/23 - Nyagi
      new String[] {"raw_clustered_beryl", "item", "minerals"},
      // Raw Cryolite added 10/13/23 - Nyagi
      new String[] {"raw_cryolite", "item", "minerals"},
      // Raw Spinel added 10/13/23 - Nyagi
      new String[] {"raw_spinel", "item", "minerals"},
      // Raw Turquoise added 10/13/23 - Nyagi
      new String[] {"raw_turquoise", "item", "minerals"},
      // Raw Garnet Slush added 10/13/23 - Nyagi
      new String[] {"raw_garnet_slush", "item", "minerals"},
      // Raw Native Aluminum added 10/13/23 - Nyagi
      new String[] {"raw_native_aluminum", "item", "minerals"});

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Sintered/Polished Tier 1 Items
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // FLUID-ITEMS BELOW
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Hydrocarbon Tar - Added 6/25/24
  public static final RegistryObject<Item> HYDROCARBON_TAR_BUCKET =
      ITEMS.register("bucket_of_hydrocarbon_tar",
                     ()
                         -> new BucketItem(
                             ModFluids.SOURCE_HYDROCARBON_TAR.get(),
                             new Item.Properties()
                                 .tab(ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS)
                                 .craftRemainder(Items.BUCKET)
                                 .stacksTo(1)));

  public static final RegistryObject<Item> RAW_WOOD_VINEGAR_BUCKET =
      ITEMS.register("bucket_of_raw_wood_vinegar",
                     ()
                         -> new BucketItem(
                             ModFluids.SOURCE_RAW_WOOD_VINEGAR.get(),
                             new Item.Properties()
                                 .tab(ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS)
                                 .craftRemainder(Items.BUCKET)
                                 .stacksTo(1)));

  public static final RegistryObject<Item> PYROLIGNEOUS_ACID_BUCKET =
      ITEMS.register("bucket_of_pyroligneous_acid",
                     ()
                         -> new BucketItem(
                             ModFluids.SOURCE_PYROLIGNEOUS_ACID.get(),
                             new Item.Properties()
                                 .tab(ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS)
                                 .craftRemainder(Items.BUCKET)
                                 .stacksTo(1)));

  public static final RegistryObject<Item> ACETONE_BUCKET = ITEMS.register(
      "bucket_of_acetone",
      ()
          -> new BucketItem(ModFluids.SOURCE_ACETONE.get(),
                            new Item.Properties()
                                .tab(ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS)
                                .craftRemainder(Items.BUCKET)
                                .stacksTo(1)));

  /*
    GENERATOR
  */

  // For each string, and oh boy there are a lot of strings, we grab the name,
  // supplier, and tab and then register each item We also do some weird Java
  // error checking to see that actually everything worked, and panic if it
  // doesn't
  static {
    for (String[] itemInfo : ITEMS_LIST) {
      String snakeCaseName = itemInfo[0];
      Supplier<Item> supplier;
      try {
        supplier = switch (itemInfo[1]) {
              case "item" -> basicItem;
              case "curio" -> curio;
              case "customTooltip" -> customTooltip;
              case "basicItem" -> basicItem;
              case "incompleteItem" -> incompleteItem;
              case "levitatingItem" -> levitatingItem;
              case "science" -> science;
              case "schematics" -> schematics;
              case "minerals" -> minerals;
              case "customOre" -> customOre;
              case "bucket" -> bucket(snakeCaseName.replace("_bucket", ""));
              default -> throw new IllegalStateException("Unexpected value in item generator itemInfo[1]: " + itemInfo[1] + " for item " + Arrays.toString(itemInfo));
          };
      } catch (Exception e) {
          throw new RuntimeException("Error while determining supplier for item: " + Arrays.toString(itemInfo), e);
      }

      CreativeModeTab tab;
      try {
          switch (itemInfo[2]) {
              case "items":
                tab = ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS;
                break;
              case "fluids":
                tab = ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS;
                break;
              case "minerals":
                tab = ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS;
                break;
              case "incompleteItem":
                tab = ModCreativeModeTab
                          .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS;
                break;
              case "levitatingItem":
                tab = ModCreativeModeTab
                          .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS;
                break;
              case "science":
                tab = ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE;
                break;
              case "schematics":
                tab = ModCreativeModeTab.NYAGIBITS_BYTES_SCHEMATICS;
                break;
              default:
                throw new IllegalStateException(
                    "Unexpected value in item generator itemInfo[2]: " +
                    itemInfo[2] + " for item " + Arrays.toString(itemInfo));
              }
      } catch (Exception e) {
        throw new RuntimeException("Error while determining tab for item: " +
                                       Arrays.toString(itemInfo),
                                   e);
      }

      registerItem(snakeCaseName, supplier, tab);
    }
  }

  // Finally, we commit our items
  public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
