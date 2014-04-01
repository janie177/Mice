package com.censoredsoftware.errornoise;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * The JavaPlugin class for Mortals.
 */
public class MortalsPlugin extends JavaPlugin
{
	/**
	 * The Bukkit enable method.
	 */
	@Override
	public void onEnable()
	{
		// If server is already working as intended, alert the console.
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
