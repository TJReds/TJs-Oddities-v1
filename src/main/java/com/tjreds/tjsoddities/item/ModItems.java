package com.tjreds.tjsoddities.item;

import com.tjreds.tjsoddities.TJsOddities;
import com.tjreds.tjsoddities.item.custom.MetalDetectorItem;
import com.tjreds.tjsoddities.item.custom.TomatoItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STAR_SHARD = registerItem("star_shard", new Item(new FabricItemSettings()));

    public static final Item TOMATO = registerItem("tomato", new TomatoItem(new FabricItemSettings().food(ModFoodComponents.TOMATO)));

    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));






    public static final Item STAR_PICKAXE = registerItem("star_pickaxe", new PickaxeItem(ModToolMaterial.STAR, 2, 2.0f, new FabricItemSettings()));
    public static final Item STAR_SHOVEL = registerItem("star_shovel", new ShovelItem(ModToolMaterial.STAR, 2, 2.0f, new FabricItemSettings()));
    public static final Item STAR_AXE = registerItem("star_axe", new AxeItem(ModToolMaterial.STAR, 2, 2.0f, new FabricItemSettings()));
    public static final Item STAR_HOE = registerItem("star_hoe", new HoeItem(ModToolMaterial.STAR, 2, 2.0f, new FabricItemSettings()));
    public static final Item STAR_SWORD = registerItem("star_sword", new SwordItem(ModToolMaterial.STAR, 2, 2.0f, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(STAR_SHARD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TJsOddities.MOD_ID, name), item);
        
    }

    public static void registerModItems() {

        TJsOddities.LOGGER.info("Registering Mod Items for " + TJsOddities.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);

    }
    
}
