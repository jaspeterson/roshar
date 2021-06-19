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
        addGemTags();
    }

    private void addGemTags() {
        tag(ModTags.Blocks.ORES_AMETHYST).add(ModBlocks.AMETHYST_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_AMETHYST);
        tag(ModTags.Blocks.STORAGE_BLOCKS_AMETHYST).add(ModBlocks.AMETHYST_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_AMETHYST);

        tag(ModTags.Blocks.ORES_HELIODOR).add(ModBlocks.HELIODOR_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_HELIODOR);
        tag(ModTags.Blocks.STORAGE_BLOCKS_HELIODOR).add(ModBlocks.HELIODOR_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_HELIODOR);

        tag(ModTags.Blocks.ORES_RUBY).add(ModBlocks.RUBY_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_RUBY);
        tag(ModTags.Blocks.STORAGE_BLOCKS_RUBY).add(ModBlocks.RUBY_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_RUBY);

        tag(ModTags.Blocks.ORES_SAPPHIRE).add(ModBlocks.SAPPHIRE_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_SAPPHIRE);
        tag(ModTags.Blocks.STORAGE_BLOCKS_SAPPHIRE).add(ModBlocks.SAPPHIRE_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_SAPPHIRE);

        tag(ModTags.Blocks.ORES_SMOKESTONE).add(ModBlocks.SMOKESTONE_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_SMOKESTONE);
        tag(ModTags.Blocks.STORAGE_BLOCKS_SMOKESTONE).add(ModBlocks.SMOKESTONE_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_SMOKESTONE);

        tag(ModTags.Blocks.ORES_TOPAZ).add(ModBlocks.TOPAZ_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_TOPAZ);
        tag(ModTags.Blocks.STORAGE_BLOCKS_TOPAZ).add(ModBlocks.TOPAZ_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_TOPAZ);
    }
}
