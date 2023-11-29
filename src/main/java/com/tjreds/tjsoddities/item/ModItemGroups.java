package com.tjreds.tjsoddities.item;

import com.tjreds.tjsoddities.TJsOddities;
import com.tjreds.tjsoddities.block.ModBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {

    public static final ItemGroup STAR_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TJsOddities.MOD_ID, "star_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.star_group"))
                    .icon(() -> new ItemStack(ModItems.STAR_SHARD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.STAR_SHARD);
                        entries.add(ModBlocks.STAR_BLOCK);
                        entries.add(ModBlocks.SOUND_BLOCK);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.COAL_BRIQUETTE);
                        
                        entries.add(ModItems.METAL_DETECTOR);


                    }).build());


    public static void registerItemGroups() {
        TJsOddities.LOGGER.info("Registering Item Groups for " + TJsOddities.MOD_ID);
    }
    
}
