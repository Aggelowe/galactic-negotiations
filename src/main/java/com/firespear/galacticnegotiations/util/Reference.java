package com.firespear.galacticnegotiations.util;

import org.lwjgl.opengl.DisplayMode;

import eu.margaritis.aggelowe.utils.logger.Level;
import eu.margaritis.aggelowe.utils.logger.Logger;

/**
 * This class contains a lot of mandatory variables for the game to work.
 * 
 * <p>
 * <b>Warning:</b>These variables should not be changed unless necessary.
 * </p>
 * 
 * @author Aggelos
 *
 */
public final class Reference {

	private static final String NAME = "Galactic Negotiations";
	private static final String VERSION = "0.1 Alpha";
	private static final Logger LOGGER = new Logger(NAME, Level.DEBUG);

	private static final int DEFAULT_WIDTH = 1280;
	private static final int DEFAULT_HEIGHT = 720;
	private static final int DEFAULT_FPS_LIMIT = 120;

	public static String getName() {
		return NAME;
	}

	public static String getVersion() {
		return VERSION;
	}
	
	public static String getFullName() {
		return NAME + " - " + VERSION;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	public static int getDefaultWidth() {
		return DEFAULT_WIDTH;
	}

	public static int getDefaultHeight() {
		return DEFAULT_HEIGHT;
	}
	
	public static DisplayMode getDefaultDimensionsAsDisplayMode() {
		return new DisplayMode(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}

	public static int getDefaultFpsLimit() {
		return DEFAULT_FPS_LIMIT;
	}

}
