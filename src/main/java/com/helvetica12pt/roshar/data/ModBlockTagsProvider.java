package com.helvetica12pt.roshar.data;

import com.helvetica12pt.roshar.RosharMod;
import com.helvetica12pt.roshar.setup.ModBlocks;
import com.helvetica12pt.roshar.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, RosharMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(ModTags.Blocks.ORES_SAPPHIRE).add(ModBlocks.SAPPHIRE_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_SAPPHIRE);
        tag(ModTags.Blocks.STORAGE_BLOCKS_SAPPHIRE).add(ModBlocks.SAPPHIRE_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_SAPPHIRE);
    }
}
