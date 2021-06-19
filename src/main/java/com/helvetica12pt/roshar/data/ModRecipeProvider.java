package com.helvetica12pt.roshar.data;

import com.helvetica12pt.roshar.RosharMod;
import com.helvetica12pt.roshar.setup.ModBlocks;
import com.helvetica12pt.roshar.setup.ModItems;
import net.minecraft.data.*;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        buildGemRecipes(consumer);
    }

    private ResourceLocation modId(String path) {
        return new ResourceLocation(RosharMod.MOD_ID, path);
    }

    private void buildGemRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(ModItems.AMETHYST.get(), 9).requires(ModBlocks.AMETHYST_BLOCK.get()).unlockedBy("has_item", has(ModItems.AMETHYST.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.AMETHYST_BLOCK.get()).define('#', ModItems.AMETHYST.get()).pattern("###").pattern("###").pattern("###").unlockedBy("has_item", has(ModItems.AMETHYST.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.HELIODOR.get(), 9).requires(ModBlocks.HELIODOR_BLOCK.get()).unlockedBy("has_item", has(ModItems.HELIODOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.HELIODOR_BLOCK.get()).define('#', ModItems.HELIODOR.get()).pattern("###").pattern("###").pattern("###").unlockedBy("has_item", has(ModItems.HELIODOR.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.RUBY.get(), 9).requires(ModBlocks.RUBY_BLOCK.get()).unlockedBy("has_item", has(ModItems.RUBY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.RUBY_BLOCK.get()).define('#', ModItems.RUBY.get()).pattern("###").pattern("###").pattern("###").unlockedBy("has_item", has(ModItems.RUBY.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.SAPPHIRE.get(), 9).requires(ModBlocks.SAPPHIRE_BLOCK.get()).unlockedBy("has_item", has(ModItems.SAPPHIRE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.SAPPHIRE_BLOCK.get()).define('#', ModItems.SAPPHIRE.get()).pattern("###").pattern("###").pattern("###").unlockedBy("has_item", has(ModItems.SAPPHIRE.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.SMOKESTONE.get(), 9).requires(ModBlocks.SMOKESTONE_BLOCK.get()).unlockedBy("has_item", has(ModItems.SMOKESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.SMOKESTONE_BLOCK.get()).define('#', ModItems.SMOKESTONE.get()).pattern("###").pattern("###").pattern("###").unlockedBy("has_item", has(ModItems.SMOKESTONE.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.TOPAZ.get(), 9).requires(ModBlocks.TOPAZ_BLOCK.get()).unlockedBy("has_item", has(ModItems.TOPAZ.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.TOPAZ_BLOCK.get()).define('#', ModItems.TOPAZ.get()).pattern("###").pattern("###").pattern("###").unlockedBy("has_item", has(ModItems.TOPAZ.get())).save(consumer);
    }
}
