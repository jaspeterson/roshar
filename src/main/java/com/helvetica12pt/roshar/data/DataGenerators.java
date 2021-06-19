package com.helvetica12pt.roshar.data;

import com.helvetica12pt.roshar.RosharMod;
import com.helvetica12pt.roshar.data.client.ModBlockStateProvider;
import com.helvetica12pt.roshar.data.client.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = RosharMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper eFH = event.getExistingFileHelper();

        //add providers
        gen.addProvider(new ModItemModelProvider(gen, eFH));
        gen.addProvider(new ModBlockStateProvider(gen, eFH));

        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, eFH);
        gen.addProvider(blockTags);
        gen.addProvider(new ModItemTagsProvider(gen, blockTags, eFH));

        gen.addProvider(new ModLootTableProvider(gen));
        gen.addProvider(new ModRecipeProvider(gen));
    }
}
