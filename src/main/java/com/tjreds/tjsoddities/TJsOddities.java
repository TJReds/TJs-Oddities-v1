package com.tjreds.tjsoddities;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tjreds.tjsoddities.block.ModBlocks;
import com.tjreds.tjsoddities.item.ModItemGroups;
import com.tjreds.tjsoddities.item.ModItems;

public class TJsOddities implements ModInitializer {
	public static final String MOD_ID = "tjsoddities";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
	}
}