package com.firespear.galacticnegotiations.util;

import eu.margaritis.aggelowe.utils.logger.Level;
import eu.margaritis.aggelowe.utils.logger.Logger;

/**
 * This class contains a lot of mandatory variables for the game to work. 
 * 
 * <p><b>Warning:</b>These variables should not be changed unless necessary.</p>
 * 
 * @author Aggelos
 *
 */
public final class Reference {

	private static final String NAME = "Galactic Negotiations";
	private static final String VERSION = "0.1 Alpha";
	private static final Logger LOGGER = new Logger(NAME, Level.DEBUG);

	public static String getName() {
		return NAME;
	}

	public static String getVersion() {
		return VERSION;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

}
