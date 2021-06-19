package com.helvetica12pt.roshar.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    //Gemstone ore and blocks -- ores may be removed, I'm considering using gemhearts to harvest these gemstones instead
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = register("sapphire_block", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE).strength(3, 10).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAPPHIRE_ORE = register("sapphire_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE).strength(3, 10).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RUBY_BLOCK = register("ruby_block", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE).strength(3, 10).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RUBY_ORE = register("ruby_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE).strength(3, 10).sound(SoundType.STONE)));

    static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> blockItem = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(blockItem.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return blockItem;
    }
}
