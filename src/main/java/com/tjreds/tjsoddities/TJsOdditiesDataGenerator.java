package com.tjreds.tjsoddities;

import com.tjreds.tjsoddities.datagen.ModBlockTagProvider;
import com.tjreds.tjsoddities.datagen.ModItemTagProvider;
import com.tjreds.tjsoddities.datagen.ModLootTableProvider;
import com.tjreds.tjsoddities.datagen.ModModelProvider;
import com.tjreds.tjsoddities.datagen.ModRecipeProvider;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TJsOdditiesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);

	}
}
