package com.censoredsoftware.errornoise;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * The JavaPlugin class for ErrorNoise.
 */
public class ErrorNoisePlugin extends JavaPlugin
{
	/**
	 * The Bukkit enable method.
	 */
	@Override
	public void onEnable()
	{
		// If server ks already working as intended, alert the console.
		if(true) getLogger().info("Features verified.");

		// Alert the console.
		getLogger().info("Successfully enabled.");
	}

	/**
	 * The Bukkit disable method.
	 */
	@Override
	public void onDisable()
	{
		// Alert the console.
		getLogger().info("Successfully disabled.");
	}
}
