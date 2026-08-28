package net.madelyn.nyagibits_bytes.registry.categories;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.registry.helpers.FluidInfo;
import net.madelyn.nyagibits_bytes.registry.ModRegistries;
import net.madelyn.nyagibits_bytes.registry.helpers.ChemicalInfo;

import static net.madelyn.nyagibits_bytes.registry.helpers.ItemInfo.ChemType;

public class ModChemicals {


    public static void add(ChemicalInfo info){
        ModRegistries.CHEM_LIST.add(info);
    }

    public static void populateList(){

        //  Impure Methanol added 08/26/25 - JJ
        add(new ChemicalInfo("impure_methanol", 0xA19e64a3, ChemType.LIQUID).fluid());
        //  Impure Acetone added 08/26/25 - JJ
        add(new ChemicalInfo("impure_acetone", 0xA19c9b97, ChemType.LIQUID).fluid());
        //  Acetone added 08/26/25 - JJ
        add(new ChemicalInfo("acetone", 0xA1bbb9b2, ChemType.LIQUID).fluid());
        //  Screened Water added 08/26/25 - JJ
        add(new ChemicalInfo("screened_water", 0xA10c6ac8, ChemType.LIQUID).fluid());
        //  Flocculated Water added 08/26/25 - JJ
        add(new ChemicalInfo("flocculated_water", 0xA10e6fd0, ChemType.LIQUID).fluid());
        //  Settled Water added 08/26/25 - JJ
        add(new ChemicalInfo("settled_water", 0xA11073d7, ChemType.LIQUID).fluid());
        //  Clarified Water added 08/26/25 - JJ
        add(new ChemicalInfo("clarified_water", 0xA11278df, ChemType.LIQUID).fluid());
        //  Sand Filtered Water added 08/26/25 - JJ
        add(new ChemicalInfo("sand_filtered_water", 0xA1137ae2, ChemType.LIQUID).fluid());
        //  Filtered Water added 08/26/25 - JJ
        add(new ChemicalInfo("filtered_water", 0xA12c88e4, ChemType.LIQUID).fluid());
        //  Contaminated Water added 08/26/25 - JJ
        add(new ChemicalInfo("contaminated_water", 0xA16aa49b, ChemType.LIQUID).fluid());
        //  Deionised Water added 08/26/25 - JJ
        add(new ChemicalInfo("deionised_water", 0xA14599ee, ChemType.LIQUID).fluid());
        //  Disinfected Water added 08/26/25 - JJ
        add(new ChemicalInfo("disinfected_water", 0xA15aa4f0, ChemType.LIQUID).fluid());
        //  Distilled Water added 08/26/25 - JJ
        add(new ChemicalInfo("distilled_water", 0xA172b1f2, ChemType.LIQUID).fluid());
        //  Type 3 Water added 08/26/25 - JJ
        add(new ChemicalInfo("type3_water", 0xA178b3f0, ChemType.LIQUID).fluid());
        //  Type 2 Water added 08/26/25 - JJ
        add(new ChemicalInfo("type2_water", 0xA186b9ee, ChemType.LIQUID).fluid());
        //  Type 1 Water added 08/26/25 - JJ
        add(new ChemicalInfo("type1_water", 0xA195bfeb, ChemType.LIQUID).fluid());
        //  Wet Methanol added 08/26/25 - JJ
        add(new ChemicalInfo("wet_methanol", 0xA1e9b8f5, ChemType.LIQUID).fluid());
        //  Crude Biodiesel added 08/26/25 - JJ
        add(new ChemicalInfo("crude_biodiesel", 0xA14f4d0a, ChemType.LIQUID).fluid());
        //  Crude Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("crude_glycerol", 0xA1472b19, ChemType.LIQUID).fluid());
        //  Alkaline Technical Grade Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("alkaline_technical_grade_glycerol", 0xA1804d2e, ChemType.LIQUID).fluid());
        //  Technical Grade Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("technical_grade_glycerol", 0xA1a36e4e, ChemType.LIQUID).fluid());
        //  Colorless Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("colorless_glycerol", 0xA1ccc3be, ChemType.LIQUID).fluid());
        //  Odourless Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("odourless_glycerol", 0xA1dbd1cc, ChemType.LIQUID).fluid());
        //  Distilled Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("distilled_glycerol", 0xA1f5e9e4, ChemType.LIQUID).fluid());
        //  Glycerol added 08/26/25 - JJ
        add(new ChemicalInfo("glycerol", 0xA1ededed, ChemType.LIQUID).fluid());
        //  Wet Biodiesel added 08/26/25 - JJ
        add(new ChemicalInfo("wet_biodiesel", 0xA1706e1a, ChemType.LIQUID).fluid());
        //  Crude Plant Oil added 08/26/25 - JJ
        add(new ChemicalInfo("crude_plant_oil", 0xA17d824d, ChemType.LIQUID).fluid());
        //  Chlorine Dioxide added 08/26/25 - JJ
        add(new ChemicalInfo("chlorine_dioxide", 0xA1d1e614, ChemType.LIQUID).fluid());
        // Methyl Chloride - Added 04/23/25(f) - 5/16/24(s) - Nyagi
        add(new ChemicalInfo("methyl_chloride", 0xA19acdad, ChemType.LIQUID).fluid());
        // Ethylene Oxide - Added 04/23/25(f) - 5/22/24(s) - Nyagi
        add(new ChemicalInfo("ethylene_oxide", 0xA198b1b6, ChemType.LIQUID).fluid());
        //Heptafluoropropane - Added 11/29/24 - Nyagi
        add(new ChemicalInfo("heptafluoropropane", 0xA145ff64, ChemType.LIQUID).fluid());
        //  Sample of Methanol added 02/13/25 - JJ
        add(new ChemicalInfo("methanol", 0x50B37AC4, ChemType.LIQUID));
        // Cyclohexanone - Added 02/20/25(f) - 02/19/25(s) - Nyagi
        add(new ChemicalInfo("cyclohexanone", 0xA1aad5cb, ChemType.LIQUID).fluid());
        //  Aluminum Trichloride added 5/16/24(s) - 04/22/25(d) - Nyagi
        add(new ChemicalInfo("aluminum_trichloride", ChemType.SOLID).dust());
        // Toluene - Added 04/23/25(f) - 5/16/24(s) - Nyagi
        add(new ChemicalInfo("toluene", 0xA1965517, ChemType.LIQUID).fluid());
        // Mononitrotoluene - Added 04/23/25(f) - 5/16/24(s) - Nyagi
        add(new ChemicalInfo("mononitrotoluene", 0xA1b9b890, ChemType.LIQUID).fluid());
        // Dinitrotoluene - Added 04/23/25(f) - 5/16/24(s) - Nyagi
        add(new ChemicalInfo("dinitrotoluene", 0xA1c6b097, ChemType.LIQUID).fluid());
        // Trinitrotoluene - Added 04/23/25(f) - 5/16/24(s) - Nyagi
        add(new ChemicalInfo("trinitrotoluene", 0xA1e7dd7a, ChemType.LIQUID).fluid());
        // Oleum - Added 04/23/25(f) - 5/16/24(s) - Nyagi
        add(new ChemicalInfo("oleum", 0xA1e7e2b2, ChemType.LIQUID).fluid());
        // Chromium Trioxide added 5/22/24(s) - 04/22/25 (d) - Nyagi
        add(new ChemicalInfo("chromium_trioxide", ChemType.SOLID).dust());
        // Benzyl Alcohol - Added 04/23/25(f) - 5/22/24(s) - Nyagi
        add(new ChemicalInfo("benzyl_alcohol", 0xA1839367, ChemType.LIQUID).fluid());
        // 2-Phenoxyethanol - Added 04/23/25(f) - 5/22/24(s) - Nyagi
        add(new ChemicalInfo("2_phenoxyethanol", 0xA1918c58, ChemType.LIQUID).fluid());
        // Methylethyl Ketone - Added 02/20/25 - Nyagi
        add(new ChemicalInfo("methylethyl_ketone", 0xA15e9e8f, ChemType.LIQUID).fluid());
        // Ketone Mixture - Added 02/20/25 - Nyagi
        add(new ChemicalInfo("ketone_mixture", 0xA1b0c484, ChemType.LIQUID).fluid());
        // Lithium Carboxylate - Added 02/20/25 - Nyagi
        add(new ChemicalInfo("lithium_carboxylate", 0xA1c3b0bb, ChemType.LIQUID).fluid());
        // Tert-Butyl Lithium added 02/20/25 - Nyagi FIXME: discrepancy in sample id and fluid id
        add(new ChemicalInfo("tertbutyl_lithium", 0xA18c80ae, ChemType.LIQUID).fluid(new FluidInfo.Builder("tert_butyl_lithium", 0xA18c80ae).setChemical("tertbutyl_lithium")));
        // Tert-Butyl Chloride added 02/20/25 - Nyagi FIXME: discrepancy in sample id and fluid id
        add(new ChemicalInfo("tertbutyl_chloride", 0xA178aa99, ChemType.LIQUID).fluid(new FluidInfo.Builder("tert_butyl_chloride", 0xA178aa99).setChemical("tertbutyl_chloride")));
        // Tert-Butyl Alcohol added 02/20/25 - Nyagi FIXME: discrepancy in sample id and dust id
        add(new ChemicalInfo("tertbutyl_alcohol", ChemType.SOLID).compacted("tert_butyl_alcohol_dust"));
        // Methylmagnesium Chloride Solution - Added 02/20/25 - Nyagi
        add(new ChemicalInfo("methylmagnesium_chloride_solution", 0xA1c7d9cd, ChemType.LIQUID).fluid());
        // Tetrahydrofuran - Added 02/20/25 - Nyagi
        add(new ChemicalInfo("tetrahydrofuran", 0xA1e3c3af, ChemType.LIQUID).fluid());
        // Formaldehyde - Added 02/20/25 - Nyagi
        add(new ChemicalInfo("formaldehyde", 0xA1d7933a, ChemType.LIQUID).fluid());
        // Methylmagnesium Chloride added 02/20/25 - Nyagi
        add(new ChemicalInfo("methylmagnesium_chloride", ChemType.SOLID).dust());
        // Cadmium Oxide added 05/27/25 - Nyagi
        add(new ChemicalInfo("cadmium_oxide", ChemType.SOLID).dust());
        // Nickel(II) Hydroxide added 05/27/25 - Nyagi
        add(new ChemicalInfo("nickel_ii_hydroxide", ChemType.SOLID).dust());
        // Nickel(III) Oxy-Hydroxide added 05/29/25 - Nyagi
        add(new ChemicalInfo("nickel_iii_oxy_hydroxide", ChemType.SOLID).dust());
        // Nickel Sulfate Solution - Added 05/29/25 - Nyagi FIXME: Inverted IDs
        add(new ChemicalInfo("nickel_sulfate_solution", 0xA14b7f30, ChemType.LIQUID).fluid(new FluidInfo.Builder("solution_nickel_sulfate", 0xA14b7f30).setChemical("nickel_sulfate_solution")));
        // Diluted Sulfuric Acid - Added 05/29/25 - Nyagi
        add(new ChemicalInfo("diluted_sulfuric_acid", 0xA1c9c682, ChemType.LIQUID).fluid());
        // Potassium Bromide added 05/29/25 - Nyagi
        add(new ChemicalInfo("potassium_bromide", ChemType.SOLID).dust());
        // Commercial Grade Hydrogen Peroxide (3%) - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("hydrogen_peroxide_003", 0xA10d5e8b, ChemType.LIQUID).fluid());
        // Concentrated Hydrogen Peroxide (15%) - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("hydrogen_peroxide_015", 0xA116869c, ChemType.LIQUID).fluid());
        // Industrial Grade Hydrogen Peroxide (32%) - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("hydrogen_peroxide_032", 0xA11ea69f, ChemType.LIQUID).fluid());
        // Explosives Grade Hydrogen Peroxide (32%) - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("hydrogen_peroxide_075", 0xA129b38f, ChemType.LIQUID).fluid());
        // Anhydrous Hydrogen Peroxide (~99.9%) - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("hydrogen_peroxide_100", 0xA149ca99, ChemType.LIQUID).fluid());
        // Sulfate added 06/14/25 - Nyagi
        add(new ChemicalInfo("sulfate", ChemType.SOLID).dust());
        // Unbleached Chitin Solution - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("solution_unbleached_chitin", 0xA19e8948, ChemType.LIQUID).fluid());
        // Decolorized Chitin Solution - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("solution_decolorized_chitin", ChemType.LIQUID).fluid());
        // Chitosan Solution - Added 06/15/25 - Nyagi
        add(new ChemicalInfo("solution_chitosan", ChemType.LIQUID).fluid());
        // Chitosan added 06/14/25 - Nyagi
        add(new ChemicalInfo("chitosan", ChemType.SOLID).dust());
        // Hydroquinone - Added 07/06/25 - Nyagi
        add(new ChemicalInfo("hydroquinone", 0xA18a67ac, ChemType.LIQUID).fluid());
        // 1,4-Napthoquinone - Added 07/06/25 - Nyagi
        add(new ChemicalInfo("1_4_napthoquinone", 0xA13e4ab5, ChemType.LIQUID).fluid());
        // 9,10-Anthraquinone - Added 07/06/25 - Nyagi
        add(new ChemicalInfo("9_10_anthraquinone", 0xA1b03e74, ChemType.LIQUID).fluid());
        // Bubbled Pre-Peroxide - Added 07/06/25 - Nyagi
        add(new ChemicalInfo("bubbled_pre_peroxide", 0xA16081a1, ChemType.LIQUID).fluid());
        // Mixed Peroxide Product - Added 07/06/25
        add(new ChemicalInfo("mixed_peroxide_product", 0xA1909b9c, ChemType.LIQUID).fluid());
        // Phosphorus Pentoxide added 07/05/25 - Nyagi
        add(new ChemicalInfo("phosphorus_pentoxide", ChemType.SOLID).dust());
        // 1,3-Butadiene - Added 07/06/25 - Nyagi
        add(new ChemicalInfo("1_3_butadiene", 0xA1868453, ChemType.LIQUID).fluid());
        // Steam Cracked Ethylene - Added 07/06/25
        add(new ChemicalInfo("steam_cracked_ethylene", 0xA178987e, ChemType.LIQUID).fluid());
        // White Phosphorus added 07/05/25 - Nyagi
        add(new ChemicalInfo("white_phosphorus", ChemType.SOLID).dust());
        // Calcium Phosphate added 07/05/25 - Nyagi
        add(new ChemicalInfo("calcium_phosphate", ChemType.SOLID).dust());
        // HPA-4 added 07/05/25 - Nyagi
        add(new ChemicalInfo("hpa_4", ChemType.SOLID).dust());
        // Wet HPA-4 - Added 07/06/25 - Nyagi
        add(new ChemicalInfo("wet_hpa_4", 0xA15b859e, ChemType.LIQUID).fluid());
        // HPA-4 Precursor #3 - Added 07/06/25
        add(new ChemicalInfo("precursor_3_hpa_4", 0xA1787f87, ChemType.LIQUID).fluid());
        // HPA-4 Precursor #2 - Added 07/06/25
        add(new ChemicalInfo("precursor_2_hpa_4", 0xA152807c, ChemType.LIQUID).fluid());
        // HPA-4 Precursor #1 - Added 07/06/25
        add(new ChemicalInfo("precursor_1_hpa_4", 0xA185997c, ChemType.LIQUID).fluid());
        // Diethyl Ether - Added 07/06/25
        add(new ChemicalInfo("diethyl_ether", 0xA1ab8339, ChemType.LIQUID).fluid());
        // Sodium Molybdate Dihydrate added 07/05/25 - Nyagi
        add(new ChemicalInfo("sodium_molybdate_dihydrate", ChemType.SOLID).dust());
        // Molybdenum Trioxide added 07/05/25 - Nyagi
        add(new ChemicalInfo("molybdenum_trioxide", ChemType.SOLID).dust());
        // Molybdenum Disulfide added 07/05/25 - Nyagi
        add(new ChemicalInfo("molybdenum_disulfide", ChemType.SOLID).dust());
        // Sodium Metavanadate added 07/05/25 - Nyagi
        add(new ChemicalInfo("sodium_metavanadate", ChemType.SOLID).dust());
        // Vanadium Pentoxide added 07/05/25 - Nyagi
        add(new ChemicalInfo("vanadium_pentoxide", ChemType.SOLID).dust());
        // DSP added 07/05/25 - Nyagi
        add(new ChemicalInfo("dsp", ChemType.SOLID).dust());
        // Dry Ice added 07/05/25 - Nyagi
        add(new ChemicalInfo("dry_ice", ChemType.SOLID).compacted("dry_ice_slab"));
        // Calcium Silicate added 07/24/25 - Nyagi
        add(new ChemicalInfo("calcium_silicate", ChemType.SOLID).dust());
        // Iron(III) Chloride added 07/25/25 - JJ
        add(new ChemicalInfo("iron_iii_chloride", 0xf8ce49, ChemType.SOLID).dust());
        // Iron Hydroxide added 07/25/25 - JJ
        add(new ChemicalInfo("iron_iii_hydroxide", 0xaf3746, ChemType.SOLID).dust());
        // Hydrogen Bromide - Added 08/18/25 - Nyagi
        add(new ChemicalInfo("hydrogen_bromide", 0xA1812626, ChemType.LIQUID).fluid());
        // Seawater - Added 08/18/25 - Nyagi
        add(new ChemicalInfo("seawater", 0xA1bfcbed, ChemType.LIQUID).fluid());
        // Evaporated Brine added 08/18/25 - Nyagi FIXME: should it be _dust?
        add(new ChemicalInfo("evaporated_brine", ChemType.SOLID).compacted("evaporated_brine"));
        // Residue Brine Product added 08/18/25 - Nyagi FIXME: should it be _dust?
        add(new ChemicalInfo("residue_brine_product", ChemType.SOLID).compacted("residue_brine_product"));
        // Wet Hydrazine - Added 08/19/25 - Nyagi
        add(new ChemicalInfo("wet_hydrazine", 0xA1101065, ChemType.LIQUID).fluid());
        // Hydrazine - Added 08/19/25 - Nyagi
        add(new ChemicalInfo("hydrazine", 0xA1312b75, ChemType.LIQUID).fluid());
        // Hydrogen Iodide - Added 08/19/25 - Nyagi
        add(new ChemicalInfo("hydrogen_iodide", 0xA187336c, ChemType.LIQUID).fluid());
        // Iodomethane - Added 08/19/25 - Nyagi
        add(new ChemicalInfo("iodomethane", 0xA1b46ec7, ChemType.LIQUID).fluid());
        // DMSO - Added 08/19/25
        add(new ChemicalInfo("dmso", 0xA18eb960, ChemType.LIQUID).fluid());
        // DMS - Added 08/19/25
        add(new ChemicalInfo("dms", 0xA1d8cb63, ChemType.LIQUID).fluid());
        // 1,4-Dimethoxybenzene added 08/19/25
        add(new ChemicalInfo("1_4_dimethoxybenzene", ChemType.SOLID).dust());
        // Chloropropane - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("chloropropane", 0xA15d3137, ChemType.LIQUID).fluid());
        // Chlorooctane - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("chlorooctane", 0xA17f5377, ChemType.LIQUID).fluid());
        // Bromooctane - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("bromooctane", 0xA1512415, ChemType.LIQUID).fluid());
        // CHC 68 - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("chc_68", 0xA145301f, ChemType.LIQUID).fluid());
        // Anhydrous Toluene - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("anhydrous_toluene", 0xA14e2f12, ChemType.LIQUID).fluid());
        // Octane - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("octane", 0xA147124e, ChemType.LIQUID).fluid());
        // Mixed Pre-Dimethoxybenzoic Acid Product - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("mixed_pre_dimethoxybenzoic_acid_product", 0xA13d7081, ChemType.LIQUID).fluid());
        // Mixed Dimethoxybenzoic Acid Product - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("mixed_dimethoxybenzoic_acid_product", 0xA1627397, ChemType.LIQUID).fluid());
        // Impure 2,5-Dimethoxybenzoic Acid - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("impure_2_5_dimethoxybenzoic_acid", 0xA13e3c70, ChemType.LIQUID).tickingFluid());
        // Impure 2,5-Dimethoxy-1,4-Benzenedicarboxylic Acid - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("impure_2_5_dimethoxy_1_4_benzenedicarboxylic_acid", 0xA1a9c8c6, ChemType.LIQUID).tickingFluid());
        // 2,5-Dimethoxybenzoic Acid Solution - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("2_5_dimethoxybenzoic_acid_solution", 0xA19274a4, ChemType.LIQUID).fluid());
        // 2,5-Dimethoxy-1,4-Benzenedicarboxylic Acid Solution - Added 08/27/25 - Nyagi
        add(new ChemicalInfo("2_5_dimethoxy_1_4_benzenedicarboxylic_acid_solution", 0xA1a4749d, ChemType.LIQUID).fluid());
        // 2,5-Dimethoxybenzoic Acid added 08/27/25 - Nyagi NOTE: This is correct. The "dust" is actually a crystal.
        add(new ChemicalInfo("2_5_dimethoxybenzoic_acid", ChemType.SOLID)
                .compacted("2_5_dimethoxybenzoic_acid_dust"));
        // 2,5-Dimethoxy-1,4-Benzenedicarboxylic Acid added 08/27/25 - Nyagi
        add(new ChemicalInfo("2_5_dimethoxy_1_4_benzenedicarboxylic_acid", ChemType.SOLID)
                .compacted("2_5_dimethoxy_1_4_benzenedicarboxylic_acid_dust"));
        // Ascorbic Acid added 09/30/25 - Toda
        add(new ChemicalInfo("ascorbic_acid", ChemType.SOLID).dust());
        // Copper Iodide added 10/16/25 - Toda
        add(new ChemicalInfo("copper_iodide", ChemType.SOLID).dust());
        // Copper Iodide Solution added 10/16/25 - Toda
        add(new ChemicalInfo("copper_iodide_solution", 0xA1c87eaa, ChemType.LIQUID).fluid());
        // Acidified Agar Solution added 10/16/25 - Toda
        add(new ChemicalInfo("acidified_agar_solution", 0xA1c5cd9d, ChemType.LIQUID).fluid());
        // Filtered Agar Solution added 10/16/25 - Toda
        add(new ChemicalInfo("filtered_agar_solution", 0xA1deddcb, ChemType.LIQUID).fluid());
        // Lead Acetate added 10/16/25 - Toda
        add(new ChemicalInfo("lead_acetate", ChemType.SOLID).dust());
        // Impure Ascorbic Acid added 10/16/25 - Toda
        add(new ChemicalInfo("impure_ascorbic_acid", ChemType.SOLID).dust());
        // 1,4-Butynediol added 10/19/25 - Nyagi
        add(new ChemicalInfo("1_4_butynediol", 0xA1bab72e, ChemType.LIQUID).fluid());
        // 1,4-Butanediol added 10/19/25 - Nyagi
        add(new ChemicalInfo("1_4_butanediol", 0xA196ba2e, ChemType.LIQUID).fluid());
        // Sodium Aluminum Hydride added 08/19/25
        add(new ChemicalInfo("sodium_aluminum_hydride", ChemType.SOLID).dust());
        // Lithium Aluminum Hydride added 08/19/25
        add(new ChemicalInfo("lithium_aluminum_hydride", ChemType.SOLID).dust());
        // Lithium Aluminum Hydride Solution added 10/19/25 - Nyagi
        add(new ChemicalInfo("lithium_aluminum_hydride_solution", 0xA18d4343, ChemType.LIQUID).fluid());
        // α-Cresol added 10/19/25 - Nyagi
        add(new ChemicalInfo("a_cresol", 0xA15436a1, ChemType.LIQUID).fluid());
        // DCM added 10/19/25 - Nyagi
        add(new ChemicalInfo("dcm", 0xA14fb9ae, ChemType.LIQUID).fluid());
        // Carbon Tetrachloride added 10/19/25 - Nyagi
        add(new ChemicalInfo("carbon_tetrachloride", 0xA1a8cac6, ChemType.LIQUID).fluid());
        // Aluminum Bromide added 10/19/25
        add(new ChemicalInfo("aluminum_bromide", ChemType.SOLID).dust());
        // Carbon Tetrabromide added 10/19/25
        add(new ChemicalInfo("carbon_tetrabromide", ChemType.SOLID).dust());
        // Bromobenzene added 10/19/25
        add(new ChemicalInfo("bromobenzene", 0xA1452f2f, ChemType.LIQUID).fluid());
        // Phenylmagnesium Bromide added 10/19/25
        add(new ChemicalInfo("phenylmagnesium_bromide", 0xA1704a44, ChemType.LIQUID).fluid());
        // Phenylmagnesium Bromide Solution added 10/19/25
        add(new ChemicalInfo("phenylmagnesium_bromide_solution", 0xA1945f57, ChemType.LIQUID).fluid());
        // Phosphorus Trichloride added 10/19/25
        add(new ChemicalInfo("phosphorus_trichloride", ChemType.SOLID).dust());
        // Triphenylphosphene added 10/19/25
        add(new ChemicalInfo("triphenylphosphene", ChemType.SOLID).dust());
        // Hydroxymethyl Bromide added 10/19/25
        add(new ChemicalInfo("hydroxymethyl_bromide", ChemType.SOLID).dust());
        // Methyl Isobutyl Ketone added 10/26/25
        add(new ChemicalInfo("methyl_isobutyl_ketone", 0xA1b4e6ff, ChemType.LIQUID).fluid());
        // Lithium Amide added 10/19/25
        add(new ChemicalInfo("lithium_amide", ChemType.SOLID).dust());
        // 1-Aminomethyl-3,5-Dimethoxybenzene added 10/26/25
        add(new ChemicalInfo("1_aminomethyl_3_5_dimethoxybenzene", 0xA172cdc1, ChemType.LIQUID).fluid());
        // 1-Aminomethyl-3,5-Dimethoxy-2,5-Cyclohexadiene added 10/26/25
        add(new ChemicalInfo("1_aminomethyl_3_5_dimethoxy_2_5_cyclohexadiene", 0xA12f8551, ChemType.LIQUID).fluid());
        // 1-Aminomethyl-3,5-Cyclohexanedione added 10/26/25
        add(new ChemicalInfo("1_aminomethyl_3_5_cyclohexanedione", 0xA123561c, ChemType.LIQUID).fluid());
        // HCl Solution added 10/26/25
        add(new ChemicalInfo("hcl_solution", 0xA1414794, ChemType.LIQUID).fluid());
        // OPA 1214 added 10/26/25
        add(new ChemicalInfo("opa_1214", 0xA1382711, ChemType.LIQUID).fluid());
        // Geraniol added 12/29/25
        add(new ChemicalInfo("geraniol", 0xA1eb95c0, ChemType.LIQUID).fluid());
        // α-Terpineol added 12/29/25
        add(new ChemicalInfo("a_terpineol", 0xA1e57325, ChemType.LIQUID).fluid());
        // Camphor Solution added 12/29/25
        add(new ChemicalInfo("camphor_solution", 0xA186dae6, ChemType.LIQUID).fluid());
        // Linalool added 12/29/25
        add(new ChemicalInfo("linalool", 0xA1aa67e2, ChemType.LIQUID).fluid());
        // Polyacrylamide added 12/30/25
        add(new ChemicalInfo("polyacrylamide", 0xA18ba4a3, ChemType.LIQUID).fluid());
        // Polydiallyldimethylammonium Chloride added 12/30/25
        add(new ChemicalInfo("polydadmac", 0xA180b830, ChemType.LIQUID).fluid());
        // Polydimethylsiloxane  added 12/30/25
        add(new ChemicalInfo("polydimethylsiloxane", 0xA1dac092, ChemType.LIQUID).fluid());
        // DOWSIL 102F Additive  added 12/30/25
        add(new ChemicalInfo("dowsil_102f_additive", 0xA113c632, ChemType.LIQUID).fluid());
        // 1,4-Dioxane  added 12/30/25
        add(new ChemicalInfo("1_4_dioxane", 0xA1dc7c93, ChemType.LIQUID).fluid());
        // Glutaraldehyde  added 12/30/25
        add(new ChemicalInfo("glutaraldehyde", 0xA187804e, ChemType.LIQUID).fluid());
        // AMeX Solution  added 12/30/25
        add(new ChemicalInfo("amex_solution", 0xA13b9ead, ChemType.LIQUID).fluid());
        // Benzene  added 1/7/26
        add(new ChemicalInfo("benzene", 0xA1313131, ChemType.LIQUID).fluid());
        // Ethylene  added 1/7/26
        add(new ChemicalInfo("ethylene", 0xA1c780cc, ChemType.LIQUID).fluid());
        // Raw Gasoline Additives  added 1/7/26
        add(new ChemicalInfo("gasoline_additives_raw", 0xA1a98d4f, ChemType.LIQUID).fluid());
        // Processed Gasoline Additives  added 1/7/26
        add(new ChemicalInfo("gasoline_additives_processed", 0xA1cccb88, ChemType.LIQUID).fluid());
        // Cracked Lubricant  added 1/7/26
        add(new ChemicalInfo("lubricant_cracked", 0xA1c5c21c, ChemType.LIQUID).fluid());
        // Cracked Naphtha  added 1/7/26
        add(new ChemicalInfo("naphtha_cracked", 0xA1994856, ChemType.LIQUID).fluid());
        // Propylene  added 1/7/26
        add(new ChemicalInfo("propylene", 0xA1a6b365, ChemType.LIQUID).fluid());
        // Piranha Solution  added 6/14/26
        add(new ChemicalInfo("solution_piranha", 0xA1fefdd6, ChemType.LIQUID).fluid());
        // Sodium Pyrosulfate  added 6/14/26
        add(new ChemicalInfo("sodium_pyrosulfate", 0xA1b06f37, ChemType.SOLID).dust());
        // Sodium Sulfide  added 6/14/26
        add(new ChemicalInfo("sodium_sulfide", 0xA1b09b37, ChemType.SOLID).dust());

    }

    public static void init(){
        NyagiBits_Bytes.LOGGER.info("Registering Chemical Groups");
        populateList();
    }


}
