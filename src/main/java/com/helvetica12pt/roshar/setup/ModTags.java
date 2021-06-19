package com.helvetica12pt.roshar.setup;

import com.helvetica12pt.roshar.RosharMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> ORES_AMETHYST = forge("ores/amethyst");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_AMETHYST = forge("storage_blocks/amethyst");
        public static final ITag.INamedTag<Block> ORES_HELIODOR = forge("ores/heliodor");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_HELIODOR = forge("storage_blocks/heliodor");
        public static final ITag.INamedTag<Block> ORES_RUBY = forge("ores/ruby");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_RUBY = forge("storage_blocks/ruby");
        public static final ITag.INamedTag<Block> ORES_SAPPHIRE = forge("ores/sapphire");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_SAPPHIRE = forge("storage_blocks/sapphire");
        public static final ITag.INamedTag<Block> ORES_SMOKESTONE = forge("ores/smokestone");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_SMOKESTONE = forge("storage_blocks/smokestone");
        public static final ITag.INamedTag<Block> ORES_TOPAZ = forge("ores/topaz");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_TOPAZ = forge("storage_blocks/topaz");


        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.bind(new ResourceLocation(RosharMod.MOD_ID, path).toString());
        }
    }

    public static final class Items {
        public static final ITag.INamedTag<Item> ORES_AMETHYST = forge("ores/amethyst");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_AMETHYST = forge("storage_blocks/amethyst");
        public static final ITag.INamedTag<Item> GEMS_AMETHYST = forge("gems/amethyst");
        public static final ITag.INamedTag<Item> ORES_HELIODOR = forge("ores/heliodor");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_HELIODOR = forge("storage_blocks/heliodor");
        public static final ITag.INamedTag<Item> GEMS_HELIODOR = forge("gems/heliodor");
        public static final ITag.INamedTag<Item> ORES_RUBY = forge("ores/ruby");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_RUBY = forge("storage_blocks/ruby");
        public static final ITag.INamedTag<Item> GEMS_RUBY = forge("gems/ruby");
        public static final ITag.INamedTag<Item> ORES_SAPPHIRE = forge("ores/sapphire");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_SAPPHIRE = forge("storage_blocks/sapphire");
        public static final ITag.INamedTag<Item> GEMS_SAPPHIRE = forge("gems/sapphire");
        public static final ITag.INamedTag<Item> ORES_SMOKESTONE = forge("ores/smokestone");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_SMOKESTONE = forge("storage_blocks/smokestone");
        public static final ITag.INamedTag<Item> GEMS_SMOKESTONE = forge("gems/smokestone");
        public static final ITag.INamedTag<Item> ORES_TOPAZ = forge("ores/topaz");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_TOPAZ = forge("storage_blocks/topaz");
        public static final ITag.INamedTag<Item> GEMS_TOPAZ = forge("gems/topaz");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.bind(new ResourceLocation(RosharMod.MOD_ID, path).toString());
        }
    }
}
