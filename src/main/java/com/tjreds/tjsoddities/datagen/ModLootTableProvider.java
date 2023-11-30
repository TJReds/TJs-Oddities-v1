package com.tjreds.tjsoddities.datagen;

import com.tjreds.tjsoddities.block.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.STAR_BLOCK);
        addDrop(ModBlocks.SOUND_BLOCK);
    }
    
}
