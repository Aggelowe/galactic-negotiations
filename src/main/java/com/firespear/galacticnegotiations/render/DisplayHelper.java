package com.firespear.galacticnegotiations.render;

import java.util.Properties;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

import com.firespear.galacticnegotiations.util.Reference;

/**
 * This class is used to define what should happen to the renderer on the start,
 * on the exit and on every update of the game.
 * 
 * @author aggelos
 *
 */
public class DisplayHelper {

	/**
	 * This method is used to handle what happens on the beginning of the game.
	 * 
	 * @throws LWJGLException The general {@link Exception} of <b>LWJGL</b> and <b>OpenGL</b>
	 */
	public static void createDisplay() throws LWJGLException {
		final ContextAttribs attributes = new ContextAttribs(3, 2);
		attributes.withForwardCompatible(true);
		attributes.withProfileCore(true);
		Display.setDisplayMode(Reference.getDefaultDimensionsAsDisplayMode());
		Display.create(new PixelFormat(), attributes);
		Display.setTitle(Reference.getFullName());
		GL11.glViewport(0, 0, Reference.getDefaultWidth(), Reference.getDefaultHeight());
	}

	/**
	 * This method is used to handle what happens on any update of the game.
	 */
	public static void updateDisplay() {
		Display.sync(Reference.getDefaultFpsLimit());
		Display.update();
	}

	/**
	 * This method is used to handle what happens on the closing of the game.
	 */
	public static void closeDisplay() {
		Display.destroy();
	}

}
