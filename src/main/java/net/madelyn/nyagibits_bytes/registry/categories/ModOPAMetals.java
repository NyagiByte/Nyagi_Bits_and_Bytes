package net.madelyn.nyagibits_bytes.registry.categories;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.madelyn.nyagibits_bytes.registry.ModRegistries;
import net.madelyn.nyagibits_bytes.registry.helpers.BlockInfo;
import net.madelyn.nyagibits_bytes.registry.helpers.FluidInfo;
import net.madelyn.nyagibits_bytes.registry.helpers.ItemInfo;
import net.minecraft.world.level.block.SoundType;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

//This metastructure creates everything needed to process elements with OPA 1214
public class ModOPAMetals {
    //Still need this for lang datagen
    public static final List<String> PURE_METALS = new ArrayList<>();

    public static void populateList(){
        addOPAMetal("aluminum", 0xA1342d25, 0xA1504732, "Al");
        addOPAMetal("scandium", 0xA1594f20, 0xA1736d3b, "Sc");
        addOPAMetal("titanium", 0xA129232b, 0xA1554e4d, "Ti");
        addOPAMetal("vanadium", 0xA1332b1f, 0xA1514d3e, "V");
        addOPAMetal("chromium", 0xA1271e17, 0xA14f4639, "Cr");
        addOPAMetal("manganese", 0xA1392b1c, 0xA164563d, "Mn");
        addOPAMetal("iron", 0xA11c150d, 0xA13a3427, "Fe");
        addOPAMetal("cobalt", 0xA139325f, 0xA16d6586, "Co");
        addOPAMetal("nickel", 0xA130301c, 0xA1646243, "Ni");
        addOPAMetal("copper", 0xA1412d1f, 0xA1756046, "Cu");
        addOPAMetal("zinc", 0xA14d4432, 0xA1796f53, "Zn");
        addOPAMetal("gallium", 0xA145403f, 0xA1797367, "Ga");
        addOPAMetal("yttrium", 0xA14a2d40, 0xA17e5f68, "Y");
        addOPAMetal("zirconium", 0xA1534631, 0xA1877958, "Zr");
        addOPAMetal("niobium", 0xA133221e, 0xA15b4e39, "Nb");
        addOPAMetal("molybdenum", 0xA1313133, 0xA16a675c, "Mo");
        addOPAMetal("ruthenium", 0xA1322822, 0xA16b5e4b, "Ru");
        addOPAMetal("rhodium", 0xA1372e24, 0xA170644d, "Rh");
        addOPAMetal("palladium", 0xA1342121, 0xA16c5749, "Pd");
        addOPAMetal("silver", 0xA14a4640, 0xA1827c69, "Ag");
        addOPAMetal("cadmium", 0xA13e2019, 0xA1775642, "Cd");
        addOPAMetal("indium", 0xA138322a, 0xA1716853, "In");
        addOPAMetal("tin", 0xA1262019, 0xA15e5642, "Sn");
        addOPAMetal("hafnium", 0xA1252024, 0xA15e564d, "Hf");
        addOPAMetal("tantalum", 0xA143201a, 0xA17c5642, "Ta");
        addOPAMetal("tungsten", 0xA11e1812, 0xA1564e3b, "W");
        addOPAMetal("rhenium", 0xA117120c, 0xA1514832, "Re");
        addOPAMetal("osmium", 0xA13a4148, 0xA1727771, "Os");
        addOPAMetal("iridium", 0xA125284c, 0xA15e5e75, "Ir");
        addOPAMetal("platinum", 0xA14f4a44, 0xA188806d, "Pt");
        addOPAMetal("gold", 0xA14e3e19, 0xA1867442, "Au");
        addOPAMetal("thallium", 0xA135251a, 0xA16d5a43, "Tl");
        addOPAMetal("lead", 0xA125201f, 0xA15d5648, "Pb");
        addOPAMetal("bismuth", 0xA125362c, 0xA15d6c55, "Bi");
        addOPAMetal("polonium", 0xA117120c, 0xA1504834, "Po");
    }


    public static void init(){
        NyagiBits_Bytes.LOGGER.info("Regisrering OPA 1214 Purified Metals");
        populateList();
    }

    private static void addOPAMetal(String id, int opaTint, int frothTint, int metalTint, String abbreviation){
        ModRegistries.FLUIDS_LIST.add(new FluidInfo.Builder("opa_"+id, opaTint));
        ModRegistries.FLUIDS_LIST.add(new FluidInfo.Builder("froth_opa_"+id, frothTint));
        ModRegistries.ITEMS_LIST.add(new ItemInfo("sample_pure_"+id, Utils.Tab.ELEMENTS).chem(ItemInfo.ChemType.SOLID, "pure_"+id).tint(metalTint).abbreviation(abbreviation));
        ModRegistries.ITEMS_LIST.add(new ItemInfo("pure_"+id+"_dust", Utils.Tab.ELEMENTS).chem(ItemInfo.ChemType.DUST, "pure_"+id).tint(metalTint).abbreviation(abbreviation));
        ModRegistries.ITEMS_LIST.add(new ItemInfo("pure_"+id+"_ingot", Utils.Tab.ELEMENTS).chem(ItemInfo.ChemType.INGOT, "pure_"+id).tint(metalTint).abbreviation(abbreviation));
        ModRegistries.ITEMS_LIST.add(new ItemInfo("pure_"+id+"_plate", Utils.Tab.ELEMENTS).chem(ItemInfo.ChemType.PLATE, "pure_"+id).tint(metalTint).abbreviation(abbreviation));
        ModRegistries.ITEMS_LIST.add(new ItemInfo("float_separated_"+id+"_dust", Utils.Tab.ELEMENTS).chem(ItemInfo.ChemType.FLOAT_DUST, "pure_"+id).tint(metalTint).abbreviation(abbreviation+"*"));

        BlockInfo block = new BlockInfo("pure_"+id+"_block", SoundType.METAL, 4f, true, Utils.Tab.ELEMENTS).abbreviation(abbreviation).tint(metalTint);
        ModRegistries.BLOCKS_LIST.add(block);
    }

    private static void addOPAMetal(String id, int opaTint, int frothTint, String abbreviation){
        PURE_METALS.add(id);
        Color rgb = new Color(opaTint);
        float[] hsb = Color.RGBtoHSB(rgb.getRed(), rgb.getGreen(), rgb.getBlue(), null);
        int metalTint = Color.HSBtoRGB(
                hsb[0],
                Math.min(hsb[1]*1.6f, 1f),
                Math.min(hsb[2]*1.6f, 1f));
        addOPAMetal(id, opaTint, frothTint, metalTint, abbreviation);
    }



}
