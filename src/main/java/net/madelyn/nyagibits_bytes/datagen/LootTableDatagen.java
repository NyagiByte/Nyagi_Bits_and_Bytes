package net.madelyn.nyagibits_bytes.datagen;

import com.mojang.datafixers.util.Pair;
import net.madelyn.nyagibits_bytes.block.BlockInfo;
import net.madelyn.nyagibits_bytes.block.ModBlocks;
import net.madelyn.nyagibits_bytes.misc.Utils;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static net.madelyn.nyagibits_bytes.misc.Utils.*;

public class LootTableDatagen extends LootTableProvider {

    private ExistingFileHelper existingFileHelper = null;

    public LootTableDatagen(DataGenerator generator, ExistingFileHelper helper) {
        super(generator);
        this.existingFileHelper = helper;
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables(){
        return List.of(
                Pair.of(NBNB_BlockLoot::new, LootContextParamSets.BLOCK)
        );
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationtracker) {
        map.forEach((location, lootTable) -> LootTables.validate(validationtracker, location, lootTable));
    }

    public class NBNB_BlockLoot extends BlockLoot {
        @Override
        //Right. I do not like this.
        //You HAVE to more or less declare in advance what you're going to datagen.
        //Declare too much? It will break if you don't actually datagen all of that.
        //Declare too little? It will break if you datagen a single undeclared loot table
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(block -> !(block instanceof LiquidBlock)) //filter out fluid blocks
                .filter(block -> { //And filter out blocks that already have a defined loot table outside datagen.
                String path = ForgeRegistries.BLOCKS.getKey(block).getPath();
                return !assetExists("loot_tables/blocks/"+path+".json");
            }).toList();
        }

        @Override
        protected void addTables() {
            for(BlockInfo block : ModBlocks.BLOCKS_LIST){
                //Don't handle conglomerates or items with more unique loot tables
                if(!(block instanceof BlockInfo.Ore) && (!assetExists("loot_tables/blocks/"+block.getId()+".json"))){
                    dropSelf( fetchBlock(NBNB(block.getId())) );
                }

            }
            //I HOPE I didn't mess any of these up. That would be bad.
            addBoulder("bauxite", List.of("raw_bauxite", "raw_feldspar", "raw_clustered_beryl", "raw_cryolite", "raw_spinel", "raw_turquoise", "raw_garnet_slush", "raw_native_aluminum"));
            addBoulder("coal", List.of("raw_lignite", "raw_bituminous", "raw_subbituminous", "raw_anthracite", "raw_cannel_coal", "raw_jet", "raw_peat", "raw_graphite"));
            addBoulder("copper", List.of("raw_chalcopyrite", "raw_malachite", "raw_azurite", "raw_tetrahedrite", "raw_enargite", "raw_chrysocolla", "raw_tennanite", "raw_dioptase"));
            addBoulder("electrum", List.of("alluvial_slush", "native_cluster", "raw_argentite", "raw_chlorargyrite", "raw_polybasite", "raw_proustite", "raw_electrum", "raw_kustelite_electrum"));
            addBoulder("gemstones", List.of("raw_kimberlite", "raw_lamproite", "raw_lazurite", "raw_lapis_lazuli", "raw_prime_beryllic_cluster", "raw_fluorite", "raw_chalcogenide_crystal_cluster", "raw_salt_cluster"));
            addBoulder("iron", List.of("raw_limonite", "raw_hematite", "raw_magnetite", "raw_pyrite", "raw_siderite", "raw_banded_iron", "raw_bog_iron", "raw_meteoric_iron"));
            addBoulder("lead", List.of("raw_galena", "raw_lead_sulphide", "raw_pyromorphite", "raw_cerussite", "raw_anglesite", "raw_wulfenite", "raw_vanadinite", "raw_mimetite"));
            addBoulder("migmamite", List.of("raw_saltpeter", "raw_borax", "raw_compacted_limestone", "raw_volcanic_sulfur", "raw_rainbow_obsidian", "raw_petrified_wood", "raw_chalk", "raw_trona"));
            addBoulder("nickel", List.of("raw_pentlandite", "raw_garnierite", "raw_saprolite", "raw_hardened_sulfide_flow", "raw_millerite", "raw_nickeline", "raw_meteoric_taenite", "raw_meteoric_kamacite"));
            addBoulder("quartz", List.of("raw_herkimer_diamond", "raw_dendritic_agate", "raw_chalcedony", "raw_rutilated_quartz", "raw_ametrine", "raw_rose_quartz", "raw_prasiolite", "raw_meteoric_certus"));
            addBoulder("redstone", List.of("raw_cinnabar", "raw_metacinnabar", "raw_corderoite", "raw_basaltic_powder", "raw_calomel", "raw_native_mercury_spherules", "raw_montroydite", "raw_granulated_obsidian"));
            addBoulder("tin", List.of("raw_cassiterite", "raw_stannite", "raw_cylindrite", "raw_franckeite", "raw_canfieldite", "raw_teallite", "raw_brannerite", "raw_orthoclase"));
            addBoulder("uranium", List.of("raw_pitchblende", "raw_carnotite", "raw_tyuyamunite", "raw_torbernite", "raw_autunite", "raw_thorite", "raw_uranothorite", "raw_thorianite"));
            addBoulder("zinc", List.of("raw_zinc_carbonate", "raw_sphalerite", "raw_smithsonite", "raw_hemimorphite", "raw_wurtzite", "raw_hydrozincite", "raw_willemite", "raw_franklinite"));
        }

        private void addBoulder(String type, List<String> ores){
            addConglomerate("conglomerate_"+type+"_ore", ores, 4);
            addConglomerate("dense_conglomerate_"+type+"_ore", ores, 16);
            addConglomerate("hyper_conglomerate_"+type+"_ore", ores, 64);
            addConglomerate("tectonic_conglomerate_"+type+"_ore", ores, 256);
            add(fetchBlock(NBNB("core_conglomerate_"+type+"_ore")), block -> LootTable.lootTable().withPool(
                    LootPool.lootPool().setRolls(ConstantValue.exactly(64))
                    .add(LootItem.lootTableItem(fetchItem(NBNB("tectonic_conglomerate_"+type+"_ore"))))));
        }

        private void addConglomerate(String id, List<String> ores, int rolls){
            add(fetchBlock(NBNB(id)), (block -> {
                LootPool.Builder loot = LootPool.lootPool().setRolls(ConstantValue.exactly(rolls));
                for(String ore : ores) loot.add(LootItem.lootTableItem(fetchItem(NBNB(ore))));
                return LootTable.lootTable().withPool(loot);
            }));
        }
    }

    public boolean assetExists(String path){
        return existingFileHelper.exists(
                Utils.NBNB(path),
                PackType.SERVER_DATA
        );
    }

}
