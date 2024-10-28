package net.madelyn.nyagibits_bytes.misc;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_MANASTEEL_TOOL = tag("needs_manasteel_tool");
        public static final TagKey<Block> NEEDS_ELEMENTIUM_TOOL = tag("needs_elementium_tool");
        public static final TagKey<Block> NEEDS_TERRASTEEL_TOOL = tag("needs_terrasteel_tool");
        public static final TagKey<Block> NEEDS_ALFSTEEL_TOOL = tag("needs_alfsteel_tool");
        public static final TagKey<Block> NEEDS_FLAKE_TOOL = tag("needs_flake_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(Utils.NBNB(name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
