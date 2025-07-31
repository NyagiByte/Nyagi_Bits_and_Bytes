# A guide to adding content to Nyagi's Bits & Bytes
## A few notes before you start registering stuff
### Datagen
Basic item models and texture remapping are handled by datagen.  
Any time content is added, or models/textures are moved around, datagen must be run before building.  
To do it, in your gradle runs, go to forgegradle runs and do runData.
It might report as failed, but as long as it says `Execution finished 'runData'`, it will be fine.
### Signing new additions
Add a comment above each addition saying when it was added, and who added it.  
Since an american set the standard, most dates are in the MM/DD/YY format. Example:  
`//Slushy Ice added 5/16/24 - Nyagi`
### Naming Conventions
Chemlib-style items should follow the naming conventions set in place to help them blend in with the also renamed chemlib items.  
Chemical items (So beakers/flasks) should be named "Sample of <chemical name>" and have the id of "sample_<chemical_name>"  
Dusts follow a similar convention, although it might not be perfectly consistent.

## Items
### Things that should not be registered
Buckets and the item form of blocks are handled elsewhere. Do not register them here.
### Registering the item
To add an item, head to the ModItems class.  
There, add a new entry to the list like this.  
`new ItemInfo("item_id", Type.CUSTOM_TOOLTIP, Tab.ITEMS),`  
The item id must be in the format of minecraft item ids, without the namespace. This would create an item with id nyagibits_bytes:item_id.  
Type is an enum used by the helper class to register the correct type of items. You will mostly use CUSTOM_TOOLTIP, ITEM, and occasionally CUSTOM_ORE.  
The types are:  
- ITEM: A simple item with no other properties. Rarely used outside of stuff like incomplete assembly items.
- CUSTOM_TOOLTIP: This is the most common type in use. This item will show a custom tooltip defined in lang. More on this later.
- CUSTOM_ORE: This is like CUSTOM_TOOLTIP, but you can press shift to show a secondary tooltip. Used for conglomerate ore drops to show the yield for each tier.
- CURIO: This one is special and takes on more parameters to register the item as a curio. Only used for god hearts.
- LEVITATING: Like CUSTOM_TOOLTIP, but with gravity disabled. Used by shadow steel and refined radiance.

The Tab parameter is shorthand for a creative mode tab. Autocomplete will show the available ones.  

A 4th parameter can be added if the item should look like something else. It should be the id of an existing model. Example:  
`new ItemInfo("incomplete_me_drive", Type.ITEM, Tab.SEQUENCE, "incomplete_ae2_assembly"),`

### Lang
Open en_us.json and add these entries
- `"item.nyagibits_bytes.item_id": "The Name of the Item",`
- `"item.nyagibits_bytes.item_id.desc": "The item's tooltip",`  
The tooltip can be broken up in more lines by embedding \n in the text. This is not standard tooltip behaviour and is custom logic, do not attempt elsewhere.  
Additionally, items of type CUSTOM_ORE should have an entry for the yields.  
"item.nyagibits_bytes.item_id.yield": "Tier 0: Something\nTier 1: Something Else"

### Assets
Remember to run datagen afterwards
#### Simple items
For basic, flat texture items, just drop the texture anywhere within assets/nyagibits_bytes/textures/item/dev/  
There are folders to keep things sorted. Datagen will handle the texture association.    
**For this case, the texture's filename must be the item id. So item_id.png**  
If there's a .mcmeta file for animated texture, put it in the same location as the png.
#### Custom Modelled Items
Go to assets/nyagibits_bytes/models/item and drop the model's json in any of the subfolders.  
**DO NOT put the model in the models/item folder, it MUST be in a subfolder.**  
Then take the textures and put them in the same place as basic textures.

## Blocks
### Things that should not be registered
Do not register new sets of conglomerate ores one by one. Add them to the list of boulders and a whole set will be added.  
### Registering the block
Go to ModBlocks.java and add a new entry to the list.  
`new BlockInfo("block_id",Material.STONE, 1f, true, Tab.BLOCKS),`  
The block id works the same as the item one. The material will set some properties, such as sounds. Autocomplete should work fine.  
The third float parameter is strength, how tough the block is to break. Don't go overboard, unless it's intentional, then go crazy.  
The 4th parameter dictates whether it needs a tool to break.  
Finally, Tab is again shorthand for a creative mode tab.
### Lang
Blocks don't have tooltips, so only the lang for its name is needed.
`"block.nyagibits_bytes.block_id": "Name of the Block",`
### Assets
Assets work more or less the same as items, just with the block folder instead of the item folder.  
Datagen will automatically handle simple blocks with the same texture on all sides.
### Loot Tables
Datagen automatically registers basic loot tables for blocks that should just drop themselves.  
For more complex drops, add loot table jsons to data/nyagibits_bytes/loot_tables/blocks  
**Do not add conglomerate ores here.** Those are handled in datagen as well. In LootTableDatagen.java there is a list of boulders and their drops. If a new boulder is added, add a new set of loot tables like this.  
`addBoulder("zinc", List.of("raw_zinc_carbonate", "raw_sphalerite", "raw_smithsonite", "raw_hemimorphite", "raw_wurtzite", "raw_hydrozincite", "raw_willemite", "raw_franklinite"));`
### Blockstates
Blockstate jsons must be manually added for blocks with complex models or rotatable blocks. Again, look at existing ones. Simple ones are handled by datagen.
### Blocks with rotation
To register a block that can be placed in multiple orientations, add a BlockInfo.Rotatable to the list, then add the usual parameters.  
Datagen cannot handle their models, reference existing ones (like glimmering logs)

## Fluids
### Registering the fluid
To add a new fluid, go to ModFluids.java and add a new entry to the list
`new FluidInfo.Builder("fluid_id", 0xA1e7e2b2),`  
Note that a bunch of different IDs will be built out of this one.  
The second parameter is its tint and is formatted as 0x, followed by 4 hexadecimal values in the order of transparency, red, green, blue.  
You can chain more methods to the constructor to control more parameters, but for a basic fluid, this will do.  
The following IDs are registered:
- Fluid (for usage in recipes): `nyagibits_bytes:<fluid_id>_fluid`
- Bucket item: `nyagibits_bytes:bucket_of_<fluid_id>`
- Fluid Block: `nyagibits_bytes:<fluid_id>_block`
### Lang
For each fluid, three lang entries must be added:
- Fluid Type: `"fluid_type.nyagibits_bytes.<fluid_id>_fluid": "<Fluid Name>",`
- Fluid Block: `"block.nyagibits_bytes.<fluid_id>_block": "<Fluid Name>",`
- Bucket: `"item.nyagibits_bytes.bucket_of_<fluid_id>": "<Fluid Name> Bucket",`
### Assets
Add the bucket's texture in assets/nyagibits_bytes/textures/item/dev/buckets and run datagen.  
Technically not required to have the texture there, but might as well keep it somewhat organized.