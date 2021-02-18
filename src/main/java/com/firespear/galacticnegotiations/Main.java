package com.firespear.galacticnegotiations;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;

import com.firespear.galacticnegotiations.render.DisplayHelper;
import com.firespear.galacticnegotiations.util.Reference;

/**
 * This class is used as the main class of the game. This class contains the
 * main method which starts running the startup commands and is registered to
 * the <i>build.gradle</i> configuration file.
 * 
 * @author aggelos
 *
 */
public final class Main {

	/**
	 * This method is used to start every necessary command for the game to start
	 * properly.
	 * 
	 * @param args - Parameters entered at the console while executing.
	 * @throws Throwable Suppresses all exceptions thrown by any method called by
	 *                   this method.
	 */
	public static void main(String[] args) throws Throwable {
		Reference.getLogger().info("Starting game...");
		Main.startMainGameLoop();
		Reference.getLogger().info("Stopping game...");
	}

	/**
	 * This method is used to start and manage the main loop of the game.
	 * 
	 * @throws LWJGLException Suppresses all the <b>LWJGL</b> exceptions.
	 */
	private static void startMainGameLoop() throws LWJGLException {
		Reference.getLogger().debug("Creating display...");
		DisplayHelper.createDisplay();
		while (!Display.isCloseRequested()) {
			DisplayHelper.updateDisplay();
		}
		Reference.getLogger().debug("Closing display...");
		DisplayHelper.closeDisplay();
	}

}
