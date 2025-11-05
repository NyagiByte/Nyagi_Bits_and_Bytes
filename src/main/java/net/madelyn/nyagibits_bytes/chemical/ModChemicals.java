package net.madelyn.nyagibits_bytes.chemical;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.chemical.ChemicalInfo.Type;
import net.madelyn.nyagibits_bytes.fluid.FluidInfo;
import net.madelyn.nyagibits_bytes.fluid.ModFluids;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.madelyn.nyagibits_bytes.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class ModChemicals {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, NyagiBits_Bytes.MOD_ID);
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, NyagiBits_Bytes.MOD_ID);


    public static final List<ChemicalInfo> CHEM_LIST = new ArrayList<>();

    public static void add(ChemicalInfo info){
        CHEM_LIST.add(info);
    }

    public static void populateList(){

        //  Impure Methanol added 08/26/25 - JJ
        add(new ChemicalInfo("impure_methanol", 0xA19e64a3, Type.LIQUID).fluid());
        //  Impure Acetone added 08/26/25 - JJ
        add(new ChemicalInfo("impure_acetone", 0xA19c9b97, Type.LIQUID).fluid());
        //  Acetone added 08/26/25 - JJ
        add(new ChemicalInfo("acetone", 0xA1bbb9b2, Type.LIQUID).fluid());
        //  Screened Water added 08/26/25 - JJ
        add(new ChemicalInfo("screened_water", 0xA10c6ac8, Type.LIQUID).fluid());
        //  Flocculated Water added 08/26/25 - JJ
        add(new ChemicalInfo("flocculated_water", 0xA10e6fd0, Type.LIQUID).fluid());
        //  Settled Water added 08/26/25 - JJ
        add(new ChemicalInfo("settled_water", 0xA11073d7, Type.LIQUID).fluid());
        //  Clarified Water added 08/26/25 - JJ
        add(new ChemicalInfo("clarified_water", 0xA11278df, Type.LIQUID).fluid());
        //  Sand Filtered Water added 08/26/25 - JJ
        add(new ChemicalInfo("sand_filtered_water", 0xA1137ae2, Type.LIQUID).fluid());
        //  Filtered Water added 08/26/25 - JJ
        add(new ChemicalInfo("filtered_water", 0xA12c88e4, Type.LIQUID).fluid());
        //  Contaminated Water added 08/26/25 - JJ
        add(new ChemicalInfo("contaminated_water", 0xA16aa49b, Type.LIQUID).fluid());
        //  Deionised Water added 08/26/25 - JJ
        add(new ChemicalInfo("deionised_water", 0xA14599ee, Type.LIQUID).fluid());
        //  Disinfected Water added 08/26/25 - JJ
        add(new ChemicalInfo("disinfected_water", 0xA15aa4f0, Type.LIQUID).fluid());
        //  Distilled Water added 08/26/25 - JJ
        add(new ChemicalInfo("distilled_water", 0xA172b1f2, Type.LIQUID).fluid());
        //  Type 3 Water added 08/26/25 - JJ
        add(new ChemicalInfo("type3_water", 0xA178b3f0, Type.LIQUID).fluid());
        //  Type 2 Water added 08/26/25 - JJ
        add(new ChemicalInfo("type2_water", 0xA186b9ee, Type.LIQUID).fluid());
        //  Type 1 Water added 08/26/25 - JJ
        add(new ChemicalInfo("type1_water", 0xA195bfeb, Type.LIQUID).fluid());
        //  Wet Methanol added 08/26/25 - JJ
        add(new ChemicalInfo("wet_methanol", 0xA1e9b8f5, Type.LIQUID).fluid());
        //  Crude Biodiesel added 08/26/25 - JJ
        add(new ChemicalInfo("crude_biodiesel", 0xA14f4d0a, Type.LIQUID).fluid());
        //  Crude Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("crude_glycerol", 0xA1472b19, Type.LIQUID).fluid());
        //  Alkaline Technical Grade Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("alkaline_technical_grade_glycerol", 0xA1804d2e, Type.LIQUID).fluid());
        //  Technical Grade Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("technical_grade_glycerol", 0xA1a36e4e, Type.LIQUID).fluid());
        //  Colorless Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("colorless_glycerol", 0xA1ccc3be, Type.LIQUID).fluid());
        //  Odourless Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("odourless_glycerol", 0xA1dbd1cc, Type.LIQUID).fluid());
        //  Distilled Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("distilled_glycerol", 0xA1f5e9e4, Type.LIQUID).fluid());
        //  Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("glycerol", 0xA1ededed, Type.LIQUID).fluid());
        //  Wet Biodiesel added 08/26/25 - JJ
        add(new ChemicalInfo("wet_biodiesel", 0xA1706e1a, Type.LIQUID).fluid());
        //  Crude Plant Oil added 08/26/25 - JJ
        add(new ChemicalInfo("crude_plant_oil", 0xA17d824d, Type.LIQUID).fluid());
        //  Chlorine Dioxide added 08/26/25 - JJ
        add(new ChemicalInfo("chlorine_dioxide", 0xA1d1e614, Type.LIQUID).fluid());
        // Methyl Chloride - Added 04/23/25(f) - 5/16/24(s) - Nyagi
        add(new ChemicalInfo("methyl_chloride", 0xA19acdad, Type.LIQUID).fluid());
        // Ethylene Oxide - Added 04/23/25(f) - 5/22/24(s) - Nyagi
        add(new ChemicalInfo("ethylene_oxide", 0xA198b1b6, Type.LIQUID).fluid());
        //Heptafluoropropane - Added 11/29/24 - Nyagi
        add(new ChemicalInfo("heptafluoropropane", 0xA145ff64, Type.LIQUID).fluid());
        //  Sample of Methanol added 02/13/25 - JJ
        add(new ChemicalInfo("methanol", 0x50B37AC4, Type.LIQUID));
        // Cyclohexanone - Added 02/20/25(f) - 02/19/25(s) - Nyagi
        add(new ChemicalInfo("cyclohexanone", 0xA1aad5cb, Type.LIQUID).fluid());
        //  Aluminum Trichloride added 5/16/24(s) - 04/22/25(d) - Nyagi
        add(new ChemicalInfo("aluminum_trichloride", Type.SOLID).dust());
        // Toluene - Added 04/23/25(f) - 5/16/24(s) - Nyagi
        add(new ChemicalInfo("toluene", 0xA1965517, Type.LIQUID).fluid());
        // Mononitrotoluene - Added 04/23/25(f) - 5/16/24(s) - Nyagi
        add(new ChemicalInfo("mononitrotoluene", 0xA1b9b890, Type.LIQUID).fluid());
        // Dinitrotoluene - Added 04/23/25(f) - 5/16/24(s) - Nyagi
        add(new ChemicalInfo("dinitrotoluene", 0xA1c6b097, Type.LIQUID).fluid());
        // Trinitrotoluene - Added 04/23/25(f) - 5/16/24(s) - Nyagi
        add(new ChemicalInfo("trinitrotoluene", 0xA1e7dd7a, Type.LIQUID).fluid());
        // Oleum - Added 04/23/25(f) - 5/16/24(s) - Nyagi
        add(new ChemicalInfo("oleum", 0xA1e7e2b2, Type.LIQUID).fluid());
        // Chromium Trioxide added 5/22/24(s) - 04/22/25 (d) - Nyagi
        add(new ChemicalInfo("chromium_trioxide", Type.SOLID).dust());
        // Benzyl Alcohol - Added 04/23/25(f) - 5/22/24(s) - Nyagi
        add(new ChemicalInfo("benzyl_alcohol", 0xA1839367, Type.LIQUID).fluid());
        // 2-Phenoxyethanol - Added 04/23/25(f) - 5/22/24(s) - Nyagi
        add(new ChemicalInfo("2_phenoxyethanol", 0xA1918c58, Type.LIQUID).fluid());
        // Methylethyl Ketone - Added 02/20/25 - Nyagi
        add(new ChemicalInfo("methylethyl_ketone", 0xA15e9e8f, Type.LIQUID).fluid());
        // Ketone Mixture - Added 02/20/25 - Nyagi
        add(new ChemicalInfo("ketone_mixture", 0xA1b0c484, Type.LIQUID).fluid());
        // Lithium Carboxylate - Added 02/20/25 - Nyagi
        add(new ChemicalInfo("lithium_carboxylate", 0xA1c3b0bb, Type.LIQUID).fluid());
        // Tert-Butyl Lithium added 02/20/25 - Nyagi FIXME: discrepancy in sample id and fluid id
        add(new ChemicalInfo("tertbutyl_lithium", 0xA18c80ae, Type.LIQUID).fluid(new FluidInfo.Builder("tert_butyl_lithium", 0xA18c80ae)));
        // Tert-Butyl Chloride added 02/20/25 - Nyagi FIXME: discrepancy in sample id and fluid id
        add(new ChemicalInfo("tertbutyl_chloride", 0xA178aa99, Type.LIQUID).fluid(new FluidInfo.Builder("tert_butyl_chloride", 0xA178aa99)));
        // Tert-Butyl Alcohol added 02/20/25 - Nyagi FIXME: discrepancy in sample id and dust id
        add(new ChemicalInfo("tertbutyl_alcohol", Type.SOLID).compacted("tert_butyl_alcohol_dust"));
        // Methylmagnesium Chloride Solution - Added 02/20/25 - Nyagi
        add(new ChemicalInfo("methylmagnesium_chloride_solution", 0xA1c7d9cd, Type.LIQUID).fluid());
        // Tetrahydrofuran - Added 02/20/25 - Nyagi
        add(new ChemicalInfo("tetrahydrofuran", 0xA1e3c3af, Type.LIQUID).fluid());
        // Formaldehyde - Added 02/20/25 - Nyagi
        add(new ChemicalInfo("formaldehyde", 0xA1d7933a, Type.LIQUID).fluid());
        // Methylmagnesium Chloride added 02/20/25 - Nyagi
        add(new ChemicalInfo("methylmagnesium_chloride", Type.SOLID).dust());
        // Cadmium Oxide added 05/27/25 - Nyagi
        add(new ChemicalInfo("cadmium_oxide", Type.SOLID).dust());
        // Nickel(II) Hydroxide added 05/27/25 - Nyagi
        add(new ChemicalInfo("nickel_ii_hydroxide", Type.SOLID).dust());
        // Nickel(III) Oxy-Hydroxide added 05/29/25 - Nyagi
        add(new ChemicalInfo("nickel_iii_oxy_hydroxide", Type.SOLID).dust());
        // Nickel Sulfate Solution - Added 05/29/25 - Nyagi FIXME: Inverted IDs
        add(new ChemicalInfo("nickel_sulfate_solution", 0xA14b7f30, Type.LIQUID).fluid(new FluidInfo.Builder("solution_nickel_sulfate", 0xA14b7f30)));
        // Diluted Sulfuric Acid - Added 05/29/25 - Nyagi
        add(new ChemicalInfo("diluted_sulfuric_acid", 0xA1c9c682, Type.LIQUID).fluid());
        // Potassium Bromide added 05/29/25 - Nyagi
        add(new ChemicalInfo("potassium_bromide", Type.SOLID).dust());
        // Commercial Grade Hydrogen Peroxide (3%) - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("hydrogen_peroxide_003", 0xA10d5e8b, Type.LIQUID).fluid());
        // Concentrated Hydrogen Peroxide (15%) - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("hydrogen_peroxide_015", 0xA116869c, Type.LIQUID).fluid());
        // Industrial Grade Hydrogen Peroxide (32%) - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("hydrogen_peroxide_032", 0xA11ea69f, Type.LIQUID).fluid());
        // Explosives Grade Hydrogen Peroxide (32%) - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("hydrogen_peroxide_075", 0xA129b38f, Type.LIQUID).fluid());
        // Anhydrous Hydrogen Peroxide (~99.9%) - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("hydrogen_peroxide_100", 0xA149ca99, Type.LIQUID).fluid());
        // Sulfate added 06/14/25 - Nyagi
        add(new ChemicalInfo("sulfate", Type.SOLID).dust());
        // Unbleached Chitin Solution - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("solution_unbleached_chitin", 0xA19e8948, Type.LIQUID).fluid());
        // Decolorized Chitin Solution - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("solution_decolorized_chitin", Type.LIQUID).fluid());
        // Chitosan Solution - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("solution_chitosan", Type.LIQUID).fluid());
        // Chitosan added 06/14/25 - Nyagi
        add(new ChemicalInfo("chitosan", Type.SOLID).dust());
        // Hydroquinone - Added 07/06/25 - Nyagi
        add(new ChemicalInfo("hydroquinone", 0xA18a67ac, Type.LIQUID).fluid());
        // 1,4-Napthoquinone - Added 07/06/25 - Nyagi
        add(new ChemicalInfo("1_4_napthoquinone", 0xA13e4ab5, Type.LIQUID).fluid());
        // 9,10-Anthraquinone - Added 07/06/25 - Nyagi
        add(new ChemicalInfo("9_10_anthraquinone", 0xA1b03e74, Type.LIQUID).fluid());
        // Bubbled Pre-Peroxide - Added 07/06/25 - Nyagi
        add(new ChemicalInfo("bubbled_pre_peroxide", 0xA16081a1, Type.LIQUID).fluid());
        // Mixed Peroxide Product - Added 07/06/25
        add(new ChemicalInfo("mixed_peroxide_product", 0xA1909b9c, Type.LIQUID).fluid());
        // Phosphorus Pentoxide added 07/05/25 - Nyagi
        add(new ChemicalInfo("phosphorus_pentoxide", Type.SOLID).dust());
        // 1,3-Butadiene - Added 07/06/25 - Nyagi
        add(new ChemicalInfo("1_3_butadiene", 0xA1868453, Type.LIQUID).fluid());
        // Steam Cracked Ethylene - Added 07/06/25
        add(new ChemicalInfo("steam_cracked_ethylene", 0xA178987e, Type.LIQUID).fluid());
        // White Phosphorus added 07/05/25 - Nyagi
        add(new ChemicalInfo("white_phosphorus", Type.SOLID).dust());
        // Calcium Phosphate added 07/05/25 - Nyagi
        add(new ChemicalInfo("calcium_phosphate", Type.SOLID).dust());
        // HPA-4 added 07/05/25 - Nyagi
        add(new ChemicalInfo("hpa_4", Type.SOLID).dust());
        // Wet HPA-4 - Added 07/06/25 - Nyagi
        add(new ChemicalInfo("wet_hpa_4", 0xA15b859e, Type.LIQUID).fluid());
        // HPA-4 Precursor #3 - Added 07/06/25
        add(new ChemicalInfo("precursor_3_hpa_4", 0xA1787f87, Type.LIQUID).fluid());
        // HPA-4 Precursor #2 - Added 07/06/25
        add(new ChemicalInfo("precursor_2_hpa_4", 0xA152807c, Type.LIQUID).fluid());
        // HPA-4 Precursor #1 - Added 07/06/25
        add(new ChemicalInfo("precursor_1_hpa_4", 0xA185997c, Type.LIQUID).fluid());
        // Diethyl Ether - Added 07/06/25
        add(new ChemicalInfo("diethyl_ether", 0xA1ab8339, Type.LIQUID).fluid());
        // Sodium Molybdate Dihydrate added 07/05/25 - Nyagi
        add(new ChemicalInfo("sodium_molybdate_dihydrate", Type.SOLID).dust());
        // Molybdenum Trioxide added 07/05/25 - Nyagi
        add(new ChemicalInfo("molybdenum_trioxide", Type.SOLID).dust());
        // Molybdenum Disulfide added 07/05/25 - Nyagi
        add(new ChemicalInfo("molybdenum_disulfide", Type.SOLID).dust());
        // Sodium Metavanadate added 07/05/25 - Nyagi
        add(new ChemicalInfo("sodium_metavanadate", Type.SOLID).dust());
        // Vanadium Pentoxide added 07/05/25 - Nyagi
        add(new ChemicalInfo("vanadium_pentoxide", Type.SOLID).dust());
        // DSP added 07/05/25 - Nyagi
        add(new ChemicalInfo("dsp", Type.SOLID).dust());
        // Dry Ice added 07/05/25 - Nyagi
        add(new ChemicalInfo("dry_ice", Type.SOLID).compacted("dry_ice_slab"));
        // Calcium Silicate added 07/24/25 - Nyagi
        add(new ChemicalInfo("calcium_silicate", Type.SOLID).dust());
        // Iron(III) Chloride added 07/25/25 - JJ
        add(new ChemicalInfo("iron_iii_chloride", 0xf8ce49, Type.SOLID).dust());
        // Iron Hydroxide added 07/25/25 - JJ
        add(new ChemicalInfo("iron_iii_hydroxide", 0xaf3746, Type.SOLID).dust());
        // Hydrogen Bromide - Added 08/18/25 - Nyagi
        add(new ChemicalInfo("hydrogen_bromide", 0xA1812626, Type.LIQUID).fluid());
        // Seawater - Added 08/18/25 - Nyagi
        add(new ChemicalInfo("seawater", 0xA1bfcbed, Type.LIQUID).fluid());
        // Evaporated Brine added 08/18/25 - Nyagi FIXME: should it be _dust?
        add(new ChemicalInfo("evaporated_brine", Type.SOLID).compacted("evaporated_brine"));
        // Residue Brine Product added 08/18/25 - Nyagi FIXME: should it be _dust?
        add(new ChemicalInfo("residue_brine_product", Type.SOLID).compacted("residue_brine_product"));
        // Wet Hydrazine - Added 08/19/25 - Nyagi
        add(new ChemicalInfo("wet_hydrazine", 0xA1101065, Type.LIQUID).fluid());
        // Hydrazine - Added 08/19/25 - Nyagi
        add(new ChemicalInfo("hydrazine", 0xA1312b75, Type.LIQUID).fluid());
        // Hydrogen Iodide - Added 08/19/25 - Nyagi
        add(new ChemicalInfo("hydrogen_iodide", 0xA187336c, Type.LIQUID).fluid());
        // Iodomethane - Added 08/19/25 - Nyagi
        add(new ChemicalInfo("iodomethane", 0xA1b46ec7, Type.LIQUID).fluid());
        // DMSO - Added 08/19/25
        add(new ChemicalInfo("dmso", 0xA18eb960, Type.LIQUID).fluid());
        // DMS - Added 08/19/25
        add(new ChemicalInfo("dms", 0xA1d8cb63, Type.LIQUID).fluid());
        // 1,4-Dimethoxybenzene added 08/19/25
        add(new ChemicalInfo("1_4_dimethoxybenzene", Type.SOLID).dust());
        // Chloropropane - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("chloropropane", 0xA15d3137, Type.LIQUID).fluid());
        // Chlorooctane - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("chlorooctane", 0xA17f5377, Type.LIQUID).fluid());
        // Bromooctane - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("bromooctane", 0xA1512415, Type.LIQUID).fluid());
        // CHC 68 - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("chc_68", 0xA145301f, Type.LIQUID).fluid());
        // Anhydrous Toluene - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("anhydrous_toluene", 0xA14e2f12, Type.LIQUID).fluid());
        // Octane - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("octane", 0xA147124e, Type.LIQUID).fluid());
        // Mixed Pre-Dimethoxybenzoic Acid Product - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("mixed_pre_dimethoxybenzoic_acid_product", 0xA13d7081, Type.LIQUID).fluid());
        // Mixed Dimethoxybenzoic Acid Product - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("mixed_dimethoxybenzoic_acid_product", 0xA1627397, Type.LIQUID).fluid());
        // Impure 2,5-Dimethoxybenzoic Acid - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("impure_2_5_dimethoxybenzoic_acid", 0xA13e3c70, Type.LIQUID).tickingFluid());
        // Impure 2,5-Dimethoxy-1,4-Benzenedicarboxylic Acid - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("impure_2_5_dimethoxy_1_4_benzenedicarboxylic_acid", 0xA1a9c8c6, Type.LIQUID).tickingFluid());
        // 2,5-Dimethoxybenzoic Acid Solution - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("2_5_dimethoxybenzoic_acid_solution", 0xA19274a4, Type.LIQUID).fluid());
        // 2,5-Dimethoxy-1,4-Benzenedicarboxylic Acid Solution - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("2_5_dimethoxy_1_4_benzenedicarboxylic_acid_solution", 0xA1a4749d, Type.LIQUID).fluid());
        // 2,5-Dimethoxybenzoic Acid added 08/27/25 - Nyagi NOTE: This is correct. The "dust" is actually a crystal.
        add(new ChemicalInfo("2_5_dimethoxybenzoic_acid", Type.SOLID)
                .compacted("2_5_dimethoxybenzoic_acid_dust"));
        // 2,5-Dimethoxy-1,4-Benzenedicarboxylic Acid added 08/27/25 - Nyagi
        add(new ChemicalInfo("2_5_dimethoxy_1_4_benzenedicarboxylic_acid", Type.SOLID)
                .compacted("2_5_dimethoxy_1_4_benzenedicarboxylic_acid_dust"));
        // Ascorbic Acid added 09/30/25 - Toda
        add(new ChemicalInfo("ascorbic_acid", Type.SOLID).dust());
        // Copper Iodide added 10/16/25 - Toda
        add(new ChemicalInfo("copper_iodide", Type.SOLID).dust());
        // Copper Iodide Solution added 10/16/25 - Toda
        add(new ChemicalInfo("copper_iodide_solution", 0xA1c87eaa, Type.LIQUID).fluid());
        // Acidified Agar Solution added 10/16/25 - Toda
        add(new ChemicalInfo("acidified_agar_solution", 0xA1c5cd9d, Type.LIQUID).fluid());
        // Filtered Agar Solution added 10/16/25 - Toda
        add(new ChemicalInfo("filtered_agar_solution", 0xA1deddcb, Type.LIQUID).fluid());
        // Lead Acetate added 10/16/25 - Toda
        add(new ChemicalInfo("lead_acetate", Type.SOLID).dust());
        // Impure Ascorbic Acid added 10/16/25 - Toda
        add(new ChemicalInfo("impure_ascorbic_acid", Type.SOLID).dust());
        // 1,4-Butynediol added 10/19/25 - Nyagi
        add(new ChemicalInfo("1_4_butynediol", 0xA1bab72e, Type.LIQUID).fluid());
        // 1,4-Butanediol added 10/19/25 - Nyagi
        add(new ChemicalInfo("1_4_butanediol", 0xA196ba2e, Type.LIQUID).fluid());
        // Sodium Aluminum Hydride added 08/19/25
        add(new ChemicalInfo("sodium_aluminum_hydride", Type.SOLID).dust());
        // Lithium Aluminum Hydride added 08/19/25
        add(new ChemicalInfo("lithium_aluminum_hydride", Type.SOLID).dust());
        // Lithium Aluminum Hydride Solution added 10/19/25 - Nyagi
        add(new ChemicalInfo("lithium_aluminum_hydride_solution", 0xA18d4343, Type.LIQUID).fluid());
        // α-Cresol added 10/19/25 - Nyagi
        add(new ChemicalInfo("a_cresol", 0xA15436a1, Type.LIQUID).fluid());
        // DCM added 10/19/25 - Nyagi
        add(new ChemicalInfo("dcm", 0xA14fb9ae, Type.LIQUID).fluid());
        // Carbon Tetrachloride added 10/19/25 - Nyagi
        add(new ChemicalInfo("carbon_tetrachloride", 0xA1a8cac6, Type.LIQUID).fluid());
        // Aluminum Bromide added 10/19/25
        add(new ChemicalInfo("aluminum_bromide", Type.SOLID).dust());
        // Carbon Tetrabromide added 10/19/25
        add(new ChemicalInfo("carbon_tetrabromide", Type.SOLID).dust());
        // Bromobenzene added 10/19/25
        add(new ChemicalInfo("bromobenzene", 0xA1452f2f, Type.LIQUID).fluid());
        // Phenylmagnesium Bromide added 10/19/25
        add(new ChemicalInfo("phenylmagnesium_bromide", 0xA1704a44, Type.LIQUID).fluid());
        // Phenylmagnesium Bromide Solution added 10/19/25
        add(new ChemicalInfo("phenylmagnesium_bromide_solution", 0xA1945f57, Type.LIQUID).fluid());
        // Phosphorus Trichloride added 10/19/25
        add(new ChemicalInfo("phosphorus_trichloride", Type.SOLID).dust());
        // Triphenylphosphene added 10/19/25
        add(new ChemicalInfo("triphenylphosphene", Type.SOLID).dust());
        // Hydroxymethyl Bromide added 10/19/25
        add(new ChemicalInfo("hydroxymethyl_bromide", Type.SOLID).dust());
        // Methyl Isobutyl Ketone added 10/26/25
        add(new ChemicalInfo("methyl_isobutyl_ketone", 0xA1b4e6ff, Type.LIQUID).fluid());
        // Lithium Amide added 10/19/25
        add(new ChemicalInfo("lithium_amide", Type.SOLID).dust());
        // 1-Aminomethyl-3,5-Dimethoxybenzene added 10/26/25
        add(new ChemicalInfo("1_aminomethyl_3_5_dimethoxybenzene", 0xA172cdc1, Type.LIQUID).fluid());
        // 1-Aminomethyl-3,5-Dimethoxy-2,5-Cyclohexadiene added 10/26/25
        add(new ChemicalInfo("1_aminomethyl_3_5_dimethoxy_2_5_cyclohexadiene", 0xA12f8551, Type.LIQUID).fluid());
        // 1-Aminomethyl-3,5-Cyclohexanedione added 10/26/25
        add(new ChemicalInfo("1_aminomethyl_3_5_cyclohexanedione", 0xA123561c, Type.LIQUID).fluid());
        // HCl Solution added 10/26/25
        add(new ChemicalInfo("hcl_solution", 0xA1414794, Type.LIQUID).fluid());
        // OPA 1214 added 10/26/25
        add(new ChemicalInfo("opa_1214", 0xA1382711, Type.LIQUID).fluid());

    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        FLUIDS.register(eventBus);
        FLUID_TYPES.register(eventBus);
    }

    static{
        populateList();
        for(ChemicalInfo chem : CHEM_LIST){
            ItemInfo item = chem.getSample();
            RegistryObject<Item> registeredSample = ITEMS.register(item.getId(), item::registerItem);
            if(chem.getCompacted() != null){
                ItemInfo cmp = chem.getCompacted();
                if(cmp instanceof ItemInfo.Chem dust) {
                    RegistryObject<Item> registeredCompacted = ITEMS.register(cmp.getId(), dust::registerItem);
                }
                else{ //If this is not a ChemicalItem, send it off to ModItems, otherwise, it will interfere with tinting.
                    RegistryObject<Item> registeredCompacted = ModItems.ITEMS.register(cmp.getId(), cmp::registerItem);
                }
            }
            if(chem.getFluid() != null){
                FluidInfo.Builder builder = chem.getFluid();
                FluidInfo info = builder.build();
                FLUIDS.register(info.getSourceId(), info.getSourceFluid());
                FLUIDS.register(info.getFlowingId(), info.getFlowingFluid());
                FLUID_TYPES.register(info.getFluidTypeId(), info.getFluidType());
                ItemInfo.Bucket bucket = info.createBucket().chemical(chem.getId());
                ModFluids.buckets.add(bucket); //This is to datagen the item models.
                ModFluids.ITEMS.register(bucket.getId(), bucket::registerItem);
                ModBlocks.BLOCKS.register(info.getBlockId(), info.createBlock());
            }
        }
    }


}
