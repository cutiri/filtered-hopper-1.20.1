package com.cutiri.filteredhopper;

import com.cutiri.filteredhopper.block.ModBlocks;
import com.cutiri.filteredhopper.item.ModItemGroups;
import com.cutiri.filteredhopper.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilteredHopper implements ModInitializer {
	public static final String MOD_ID = "filteredhopper";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//registering the ItemsGroup
		ModItemGroups.registerItemsGroup();

		//registering the Blocks
		ModBlocks.registerModBlocks();

		//registering the Items
		ModItems.registerModItems();
	}
}