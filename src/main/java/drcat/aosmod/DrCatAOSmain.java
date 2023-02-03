package drcat.aosmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DrCatAOSmain implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("DrCat's AOS");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//remove line below when mod is stable
		LOGGER.warn("DrCat's AOS is in a very unfinished state, continue with some caution.");

		//boot logger
		LOGGER.info("DrCat's AOS is waking up from a cat nap! Time to make coffee!");

		//insert code here


		//"boot" finish logger
		LOGGER.info("DrCat's AOS has returned with coffee and is ready to start a day!");
	}
}