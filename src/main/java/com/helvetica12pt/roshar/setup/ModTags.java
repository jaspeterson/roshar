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
        public static final ITag.INamedTag<Block> ORES_SAPPHIRE = forge("ores/sapphire");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_SAPPHIRE = forge("storage_blocks/sapphire");


        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.bind(new ResourceLocation(RosharMod.MOD_ID, path).toString());
        }
    }

    public static final class Items {
        public static final ITag.INamedTag<Item> ORES_SAPPHIRE = forge("ores/sapphire");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_SAPPHIRE = forge("storage_blocks/sapphire");
        public static final ITag.INamedTag<Item> GEMS_SAPPHIRE = forge("gems/sapphire");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.bind(new ResourceLocation(RosharMod.MOD_ID, path).toString());
        }
    }
}
