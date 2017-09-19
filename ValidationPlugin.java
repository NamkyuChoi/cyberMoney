/*
 * Licensed Materials - Use restricted, please refer to the "Samples Gallery" terms
 * and conditions in the IBM International Program License Agreement.
 *
 * Copyright IBM Corporation 2003, 2007. All Rights Reserved. 
 */
package com.ibm.xtools.modeler.ui.pde.examples.validation;

import org.eclipse.core.runtime.Plugin;


/**
 * The main plugin class to be used in the desktop.
 */
public class ValidationPlugin
	extends Plugin {

	/**
	 * The shared plug-in instance
	 */
	private static ValidationPlugin plugin;

	/**
	 * Standard plug-in constructor.
	 * 
	 * @param descriptor my descriptor
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#AbstractUIPlugin()
	 */
	public ValidationPlugin() {
		super();
		
		plugin = this;
	}

	/**
	 * Returns the shared instance.
	 * 
	 * @param the plug-in instance
	 */
	public static ValidationPlugin getDefault() {
		return plugin;
	}
}
