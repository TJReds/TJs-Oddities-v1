package com.tjreds.tjsoddities.item.custom;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class TomatoItem extends Item{

    public TomatoItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.tjsoddities.tomato.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }

    
}
