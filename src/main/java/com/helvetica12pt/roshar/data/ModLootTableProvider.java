package com.helvetica12pt.roshar.data;

import com.google.common.collect.ImmutableList;
import com.helvetica12pt.roshar.setup.ModBlocks;
import com.helvetica12pt.roshar.setup.ModItems;
import com.helvetica12pt.roshar.setup.Registration;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
                Pair.of(ModBlockLootTables::new, LootParameterSets.BLOCK)
        );
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((p_218436_2_, p_218436_3_) -> LootTableManager.validate(validationtracker, p_218436_2_, p_218436_3_));
//        super.validate(map, validationtracker);
    }

    public static class ModBlockLootTables extends BlockLootTables {
        @Override
        protected void addTables() {
            addGemTables();
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }

        private void addGemTables() {
            dropSelf(ModBlocks.AMETHYST_BLOCK.get());
            add(ModBlocks.AMETHYST_ORE.get(), (s) -> {
                return createOreDrop(s, ModItems.AMETHYST.get());
            });

            dropSelf(ModBlocks.HELIODOR_BLOCK.get());
            add(ModBlocks.HELIODOR_ORE.get(), (s) -> {
                return createOreDrop(s, ModItems.HELIODOR.get());
            });

            dropSelf(ModBlocks.RUBY_BLOCK.get());
            add(ModBlocks.RUBY_ORE.get(), (s) -> {
                return createOreDrop(s, ModItems.RUBY.get());
            });

            dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
            add(ModBlocks.SAPPHIRE_ORE.get(), (s) -> {
                return createOreDrop(s, ModItems.SAPPHIRE.get());
            });

            dropSelf(ModBlocks.SMOKESTONE_BLOCK.get());
            add(ModBlocks.SMOKESTONE_ORE.get(), (s) -> {
                return createOreDrop(s, ModItems.SMOKESTONE.get());
            });

            dropSelf(ModBlocks.TOPAZ_BLOCK.get());
            add(ModBlocks.TOPAZ_ORE.get(), (s) -> {
                return createOreDrop(s, ModItems.TOPAZ.get());
            });
        }
    }


}
