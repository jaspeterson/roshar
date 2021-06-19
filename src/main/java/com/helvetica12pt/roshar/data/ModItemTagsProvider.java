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
        copy(ModTags.Blocks.ORES_SAPPHIRE, ModTags.Items.ORES_SAPPHIRE);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(ModTags.Blocks.STORAGE_BLOCKS_SAPPHIRE, ModTags.Items.STORAGE_BLOCKS_SAPPHIRE);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        tag(ModTags.Items.GEMS_SAPPHIRE).add(ModItems.SAPPHIRE.get());
        tag(Tags.Items.GEMS).addTag(ModTags.Items.GEMS_SAPPHIRE);
    }
}
