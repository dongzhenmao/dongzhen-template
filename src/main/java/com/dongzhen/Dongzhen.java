package com.dongzhen;

import com.dongzhen.item.ModItemGroups;
import com.dongzhen.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.dongzhen.block.ModBlocks.register_mod_blocks;

public class Dongzhen implements ModInitializer {
	public static final String MOD_ID = "dongzhen";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() { // run when minecraft start
		ModItems.register_MOD_Items();
		register_mod_blocks();
		ModItemGroups.register_my_group();
		LOGGER.info("Hello Fabric world!");
	}
}