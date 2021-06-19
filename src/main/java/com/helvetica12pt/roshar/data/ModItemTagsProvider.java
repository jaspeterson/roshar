package com.helvetica12pt.roshar.data;

import com.helvetica12pt.roshar.RosharMod;
import com.helvetica12pt.roshar.setup.ModItems;
import com.helvetica12pt.roshar.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator gen, BlockTagsProvider prov, ExistingFileHelper existingFileHelper) {
        super(gen, prov, RosharMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        addGemTags();
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
    }

    private void addGemTags() {
        copy(ModTags.Blocks.ORES_AMETHYST, ModTags.Items.ORES_AMETHYST);
        copy(ModTags.Blocks.STORAGE_BLOCKS_AMETHYST, ModTags.Items.STORAGE_BLOCKS_AMETHYST);
        tag(ModTags.Items.GEMS_AMETHYST).add(ModItems.AMETHYST.get());
        tag(Tags.Items.GEMS).addTag(ModTags.Items.GEMS_AMETHYST);

        copy(ModTags.Blocks.ORES_HELIODOR, ModTags.Items.ORES_HELIODOR);
        copy(ModTags.Blocks.STORAGE_BLOCKS_HELIODOR, ModTags.Items.STORAGE_BLOCKS_HELIODOR);
        tag(ModTags.Items.GEMS_HELIODOR).add(ModItems.HELIODOR.get());
        tag(Tags.Items.GEMS).addTag(ModTags.Items.GEMS_HELIODOR);

        copy(ModTags.Blocks.ORES_RUBY, ModTags.Items.ORES_RUBY);
        copy(ModTags.Blocks.STORAGE_BLOCKS_RUBY, ModTags.Items.STORAGE_BLOCKS_RUBY);
        tag(ModTags.Items.GEMS_RUBY).add(ModItems.RUBY.get());
        tag(Tags.Items.GEMS).addTag(ModTags.Items.GEMS_RUBY);

        copy(ModTags.Blocks.ORES_SAPPHIRE, ModTags.Items.ORES_SAPPHIRE);
        copy(ModTags.Blocks.STORAGE_BLOCKS_SAPPHIRE, ModTags.Items.STORAGE_BLOCKS_SAPPHIRE);
        tag(ModTags.Items.GEMS_SAPPHIRE).add(ModItems.SAPPHIRE.get());
        tag(Tags.Items.GEMS).addTag(ModTags.Items.GEMS_SAPPHIRE);

        copy(ModTags.Blocks.ORES_SMOKESTONE, ModTags.Items.ORES_SMOKESTONE);
        copy(ModTags.Blocks.STORAGE_BLOCKS_SMOKESTONE, ModTags.Items.STORAGE_BLOCKS_SMOKESTONE);
        tag(ModTags.Items.GEMS_SMOKESTONE).add(ModItems.SMOKESTONE.get());
        tag(Tags.Items.GEMS).addTag(ModTags.Items.GEMS_SMOKESTONE);

        copy(ModTags.Blocks.ORES_TOPAZ, ModTags.Items.ORES_TOPAZ);
        copy(ModTags.Blocks.STORAGE_BLOCKS_TOPAZ, ModTags.Items.STORAGE_BLOCKS_TOPAZ);
        tag(ModTags.Items.GEMS_TOPAZ).add(ModItems.TOPAZ.get());
        tag(Tags.Items.GEMS).addTag(ModTags.Items.GEMS_TOPAZ);
    }
}
