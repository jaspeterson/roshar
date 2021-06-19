package com.helvetica12pt.roshar.data.client;

import com.helvetica12pt.roshar.RosharMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, RosharMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile iGen = getExistingFile(mcLoc("item/generated"));

        buildGemstones(iGen);
    }

    private ItemModelBuilder builder(ModelFile iGen, String name) {
        return getBuilder(name).parent(iGen).texture("layer0", "item/" + name);
    }

    private void buildGemstones(ModelFile mf) {
        builder(mf, "sapphire");
        builder(mf, "ruby");
    }
}
