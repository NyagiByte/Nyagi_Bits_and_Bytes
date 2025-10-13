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
Update: See the lang section for chemicals,   
Chemlib-style items should follow the naming conventions set in place to help them blend in with the also renamed chemlib items.  
Chemical items (So beakers/flasks) should be named "Sample of <chemical_name>" and have the id of "sample_<chemical_name>"  
Dusts follow a similar convention, although it might not be perfectly consistent.

## Items
### Things that should not be registered
Buckets and the item form of blocks are handled elsewhere. Do not register them here.  
Chemlib-style samples and dusts are handled in their own system, keep them there.
### Registering the item
To add an item, head to the ModItems class.  
There, add a new entry to the list like this.  
`new ItemInfo("item_id", Type.CUSTOM_TOOLTIP, Tab.ITEMS),`  
The item id must be in the format of minecraft item ids, without the namespace. This would create an item with id `nyagibits_bytes:item_id`.  
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
For basic, flat texture items, just drop the texture anywhere within `assets/nyagibits_bytes/textures/item/dev/`  
There are folders to keep things sorted. Datagen will handle the texture association.    
**For this case, the texture's filename must be the item id. So item_id.png**  
If there's a .mcmeta file for animated texture, put it in the same location as the png.
#### Custom Modelled Items
Go to `assets/nyagibits_bytes/models/item` and drop the model's json in any of the subfolders.  
**DO NOT put the model in the models/item folder, it MUST be in a subfolder.**  
Then take the textures and put them in the same place as basic textures.

## Blocks
### Things that should not be registered
Do not register new sets of conglomerate ores one by one. Add them to the list of boulders and a whole set will be added.  
### Registering the block
Go to the ModBlocks class and add a new entry to the list.  
`new BlockInfo("block_id",Material.STONE, 1f, true, Tab.BLOCKS),`  
The block id works the same as the item one. The material will set some properties, such as sounds. Autocomplete should work fine.  
The third float parameter is strength, how tough the block is to break. Don't go overboard, unless it's intentional, then go crazy.  
The 4th parameter dictates whether it needs a tool to get its drop.  
Finally, Tab is again shorthand for a creative mode tab.
### Lang
Blocks don't have tooltips, so only the lang for its name is needed.
`"block.nyagibits_bytes.block_id": "Name of the Block",`
### Mining Tags
Go to `data/nyagibits_bytes/minecraft/tags/blocks`  
In the mineable folder, you will find tags for axe, hoe, pickaxe and shovel. Adding the block to these will mark the tool as "suitable for this block"  
Then there's the three "needs_X_tool.json" files. These determine mining level.
### Assets
Blocks' assets work more or less the same as items, just with the block folder instead of the item folder.  
Datagen will automatically handle simple blocks with the same texture on all sides.
### Loot Tables
Datagen automatically registers basic loot tables for blocks that should just drop themselves.  
For more complex drops, add loot table jsons to `data/nyagibits_bytes/loot_tables/blocks`  
**Do not add conglomerate ores here.** Those are handled in datagen as well. In the LootTableDatagen class, there is a list of boulders and their drops. If a new boulder is added, add a new set of loot tables like this.  
`addBoulder("zinc", List.of("raw_zinc_carbonate", "raw_sphalerite", "raw_smithsonite", "raw_hemimorphite", "raw_wurtzite", "raw_hydrozincite", "raw_willemite", "raw_franklinite"));`
### Blockstates
Blockstate jsons must be manually added for blocks with complex models or rotatable blocks. Again, look at existing ones. Simple ones are handled by datagen.
### Blocks with rotation
To register a block that can be placed in multiple orientations, add a BlockInfo.Rotatable to the list, then add the usual parameters.  
Datagen cannot handle their models, reference existing ones (like glimmering logs)

## Fluids
### Things that should not be registered
Do not register fluids that are intended to be paired with a chemlib-style sample. Use the chemical registry for that.
### Registering the fluid
To add a new fluid, go to the ModFluids class and add a new entry to the list
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
A texture for the bucket is optional, as the mod can create a basic bucket with tinted fluid with datagen.  
If a custom texture is made, add the bucket's texture in `assets/nyagibits_bytes/textures/item/dev/buckets` and run datagen.  
Technically not required to have the texture in buckets specifically, but might as well keep it somewhat organized.
## Chemicals
Chemlib-style items are registered independently of everything else.
### Registering the chemical
Go to the ModChemicals class and add a new entry.  
```add(new ChemicalInfo("glycerol", 0xA1ededed, Type.LIQUID).fluid());```  
The parameters, in order, are:
- Chemical ID: The item IDs will be generated from that. (Example: "sample_of_glycerol")
- Tint: An ARGB color used for fluids and by datagen to tint the default assets (more on that later)
- Chemical Type: Can be SOLID, LIQUID or GAS. There's also DUST, but it is for internal use only.

Additionally, other methods can be appended, here's a list of them:
- .dust(): Will also create a dust item
- .fluid(): Will register a complete fluid, with the specified tint
- .tickingFluid(): Same as fluid(), but the fluid will be randomly ticking. Used for Lychee compat.
- .compacted(): tack on a "compacted" form of the chemical that isn't a dust. Note that some datagen elements only work on dusts. Accepts either a String for an item ID or a full ItemInfo to denote a correlation, but bypass any defaults.

### Registered things
Each entry will register the following things.  
"chemical" fills in for the specified chemical id
- sample_of_chemical The basic sample item, always registred.
- If .dust() was appended:
  - chemical_dust: The dust item, registered if .dust() is appended.  
- If .fluid() or .tickingFluid() was appended:
  - bucket_of_chemical: The bucket item belonging to the fluid
  - chemical_fluid: The fluid itself, this is the format used in recipes.
  - chemical_block: The fluid block, needs to be present, but rarely interacted with.
- If .compacted() was appended:
  - Whatever was its parameter

### Lang
Chemical items have a lot of datagen around them, including for english lang.  
**Remember to runData after making changes**  
For each chemical, these are the lang entries:
- `"chemical.nyagibits_bytes.(chemical_id).name": "(Chemical's Name)`: Technically optional, but heavily recommended, if omitted, you'll need to add item name entries for the other items.  
  If not added, must add these ones instead:
  - `"item.nyagibits_bytes.sample_of_(chemical_id)": "Sample of (Chemical's Name)"`
  - `"item.nyagibits_bytes.(chemical_id)_dust": "(Chemical's Name) Dust"`(.dust() Only)
  - `"fluid_type.nyagibits_bytes.(chemical_id)_fluid", "(Chemical's Name)` (Fluid Only)
  - `"block.nyagibits_bytes.(chemical_id)_block", "(Chemical's Name)"`(Fluid Onlt)
  - `"item.nyagibits_bytes.bucket_of_"+chem.getFluid().id, "(Chemical's Name) Bucket"`(Fluid Only)
- `"chemical.nyagibits_bytes.(chemical_id).desc": "(Generic tooltip for the chemical)`: Optional: This allows for a single tooltip to be applied to a chemical across sample, dust or bucket. If omitted, item specific tooltips should be added as seen in Item Lang  
- If a custom .compacted() item was defined, follow normal item lang rules for it.
                        
### Assets
Chemical items's textures work like normal item ones, but with some caveats.
If the texture is missing, datagen will kick in and assign it a default texture, which is then tinted.  
**Remember to runData after making changes**  
The texture used for samples is determined by the Type parameter (SOLID, LIQUID or GAS), and the tint is also from the parameters.  
This is fine for simpler items, although if any visual flair is needed, a full texture must be made.  
The tinting is applied to layer1, so when making custom textures, stick to either just layer0 or skip layer1 if needed.  
Texture datagen can handle samples, dusts and fluid buckets. **It cannot handle items tacked on with .compacted(), give those full textures**

### Chemical Items, Rules & Design  
**This section is mostly about the established design standards, a lot of this has been taken care of by datagen**  
Chemicals fall into 3 main groups: **Solids, Liquids, and Gasses**

Solid-type chemicals must be registered with a dust or other "full unit" of itself as well as a "sample_of" version of itself.  
Example: `"nyagibits_bytes:aluminum_trichloride_dust"` & `"nyagibits_bytes:sample_aluminum_trichloride"`

Exceptions can be made if the full-unit of the chemical makes less sense as a dust item, see: Dry Ice  

- Sample_Of items must be in the beaker-type of item. The actual pile of material inside can vary for visual flare.   
- Alternative visual styles for the beakers of solid material is fine so long as it makes sense within the context of the beaker, see: Dry Ice & White Phosphorus having a glass dish above & a slight hue to indicate volatility 


Liquid-type chemicals must be registered with a bucket of itself as well as a "sample_of" version of itself.  
Example: `"nyagibits_bytes:bucket_of_solution_chitosan"` & `"nyagibits_bytes:sample_solution_chitosan"`

- Sample_Of items must be in the flask-type of item. The actual liquid material inside can vary for visual flare.   
- Alternative visual styles for the flasks of liquid material is fine so long as it makes sense within the context of the flasks, see: t-Butyllithium having a rubber stopper and hazard diamond, or, Oleum sending up fumes

Gas-type chemicals must be registered with a bucket of itself as well as a "sample_of" version of itself.  
Example: `"nyagibits_bytes:bucket_of_methyl_chloride"` & `"nyagibits_bytes:sample_methyl_chloride"`

- Sample_Of items must be in the ampoule-type of item. The actual liquid material inside can vary for visual flare.   
- Alternative visual styles for the ampoule of liquid material is fine so long as it makes sense within the context of the ampoule

*Color of chemicals* should rarely follow real world counterparts as they tend to be white, yellow, gray, or clear, which is boring to look at & confusing to look at  
Resulting compounds should be either a combination of colors associated to ChemLib or something entirely new  
Compounds related to sequences or chains to eachother should have gradients, see: Hydrogen Peroxide Concentrations   
Worth noting: Compounds are allowed to be white, yellow, gray, or clear, just not all of them