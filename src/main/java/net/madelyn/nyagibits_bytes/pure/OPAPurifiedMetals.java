package net.madelyn.nyagibits_bytes.pure;

import net.madelyn.nyagibits_bytes.block.BlockInfo;
import net.madelyn.nyagibits_bytes.fluid.FluidInfo;
import net.madelyn.nyagibits_bytes.item.ItemInfo;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.world.level.block.SoundType;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static net.madelyn.nyagibits_bytes.chemical.ChemicalInfo.Type;

public class OPAPurifiedMetals {
    //This is gonna be a bit different, instead of building another abstraction layer, we're going to
    //experiment with building the collection of data right here..


    public static final List<Utils.OPAPureMetal> PURE_METALS = new ArrayList<>();
    public static final List<ItemInfo.Chem> ITEM_LIST = new ArrayList<>();
    public static final List<FluidInfo.Builder> FLUID_LIST = new ArrayList<>();
    public static final List<BlockInfo> BLOCK_LIST = new ArrayList<>();

    public static void populateList(){
        addOPAMetal("aluminum", 0xA1342d25, 0xA1504732);
        addOPAMetal("scandium", 0xA1594f20, 0xA1736d3b);
        addOPAMetal("titanium", 0xA129232b, 0xA1554e4d);
        addOPAMetal("vanadium", 0xA1332b1f, 0xA1514d3e);
        addOPAMetal("chromium", 0xA1271e17, 0xA14f4639);
        addOPAMetal("manganese", 0xA1392b1c, 0xA164563d);
        addOPAMetal("iron", 0xA11c150d, 0xA13a3427);
        addOPAMetal("cobalt", 0xA139325f, 0xA16d6586);
        addOPAMetal("nickel", 0xA130301c, 0xA1646243);
        addOPAMetal("copper", 0xA1412d1f, 0xA1756046);
        addOPAMetal("zinc", 0xA14d4432, 0xA1796f53);
        addOPAMetal("gallium", 0xA145403f, 0xA1797367);
        addOPAMetal("yttrium", 0xA14a2d40, 0xA17e5f68);
        addOPAMetal("zirconium", 0xA1534631, 0xA1877958);
        addOPAMetal("niobium", 0xA133221e, 0xA15b4e39);
        addOPAMetal("molybdenum", 0xA1313133, 0xA16a675c);
        addOPAMetal("ruthenium", 0xA1322822, 0xA16b5e4b);
        addOPAMetal("rhodium", 0xA1372e24, 0xA170644d);
        addOPAMetal("palladium", 0xA1342121, 0xA16c5749);
        addOPAMetal("silver", 0xA14a4640, 0xA1827c69);
        addOPAMetal("cadmium", 0xA13e2019, 0xA1775642);
        addOPAMetal("indium", 0xA138322a, 0xA1716853);
        addOPAMetal("tin", 0xA1262019, 0xA15e5642);
        addOPAMetal("hafnium", 0xA1252024, 0xA15e564d);
        addOPAMetal("tantalum", 0xA143201a, 0xA17c5642);
        addOPAMetal("tungsten", 0xA11e1812, 0xA1564e3b);
        addOPAMetal("rhenium", 0xA117120c, 0xA1514832);
        addOPAMetal("osmium", 0xA13a4148, 0xA1727771);
        addOPAMetal("iridium", 0xA125284c, 0xA15e5e75);
        addOPAMetal("platinum", 0xA14f4a44, 0xA188806d);
        addOPAMetal("gold", 0xA14e3e19, 0xA1867442);
        addOPAMetal("thallium", 0xA135251a, 0xA16d5a43);
        addOPAMetal("lead", 0xA125201f, 0xA15d5648);
        addOPAMetal("bismuth", 0xA125362c, 0xA15d6c55);
        addOPAMetal("polonium", 0xA117120c, 0xA1504834);
    }


    static {
        populateList();
        PURE_METALS.forEach(opaMetal -> {
            String id = opaMetal.id();
            int opaTint = opaMetal.opaTint();
            int frothTint = opaMetal.frothTint();
            int metalTint = opaMetal.metalTint();

            FLUID_LIST.add(new FluidInfo.Builder("opa_"+id, opaTint));
            FLUID_LIST.add(new FluidInfo.Builder("froth_opa_"+id, frothTint));
            ITEM_LIST.add(new ItemInfo.Chem("sample_pure_"+id, Utils.Tab.ELEMENTS, metalTint, Type.SOLID, "pure_"+id));
            ITEM_LIST.add(new ItemInfo.Chem("pure_"+id+"_dust", Utils.Tab.ELEMENTS, metalTint, Type.DUST, "pure_"+id));
            ITEM_LIST.add(new ItemInfo.Chem("float_separated_"+id+"_dust", Utils.Tab.ELEMENTS, metalTint, Type.DUST, "opa_float_"+id));
            ITEM_LIST.add(new ItemInfo.Chem("pure_"+id+"_ingot", Utils.Tab.ELEMENTS, metalTint, Type.INGOT, "pure_"+id));
            ITEM_LIST.add(new ItemInfo.Chem("pure_"+id+"_plate", Utils.Tab.ELEMENTS, metalTint, Type.PLATE, "pure_"+id));
            BlockInfo block = new BlockInfo("pure_"+id+"_block", SoundType.METAL, 4f, true, Utils.Tab.ELEMENTS);
            BLOCK_LIST.add(block.tint(metalTint));
        });
    }

    private static void addOPAMetal(String id, int opaTint, int frothTint, int metalTint){
        PURE_METALS.add(new Utils.OPAPureMetal(id, opaTint, frothTint, metalTint));
    }

    private static void addOPAMetal(String id, int opaTint, int frothTint){
        Color rgb = new Color(opaTint);
        float[] hsb = Color.RGBtoHSB(rgb.getRed(), rgb.getGreen(), rgb.getBlue(), null);
        int metalTint = Color.HSBtoRGB(hsb[0], hsb[1]*1.6f, hsb[2]*1.6f);
        addOPAMetal(id, opaTint, frothTint, metalTint);
    }



}
