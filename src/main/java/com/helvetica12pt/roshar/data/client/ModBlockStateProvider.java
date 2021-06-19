package com.helvetica12pt.roshar.data.client;

import com.helvetica12pt.roshar.RosharMod;
import com.helvetica12pt.roshar.setup.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, RosharMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerGemstoneBlocks();
    }

    private void makeBlockItemFromExistingModel(Block block)
    {
        final ModelFile model = models().getExistingFile(block.getRegistryName());
        simpleBlockItem(block, model);
    }

    private void registerGemstoneBlocks() {
        simpleBlock(ModBlocks.SAPPHIRE_BLOCK.get());
        makeBlockItemFromExistingModel(ModBlocks.SAPPHIRE_BLOCK.get());
        simpleBlock(ModBlocks.SAPPHIRE_ORE.get());
        makeBlockItemFromExistingModel(ModBlocks.SAPPHIRE_ORE.get());
        simpleBlock(ModBlocks.RUBY_BLOCK.get());
        makeBlockItemFromExistingModel(ModBlocks.RUBY_BLOCK.get());
        simpleBlock(ModBlocks.RUBY_ORE.get());
        makeBlockItemFromExistingModel(ModBlocks.RUBY_ORE.get());
    }

}
