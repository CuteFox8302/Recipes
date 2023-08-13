package net.cutefox.recipes;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Recipes implements ModInitializer {
	public static final String MOD_ID = "recipes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Booting Up!");
	}
}