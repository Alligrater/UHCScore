package io.github.Alligrater;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class UHCScore extends JavaPlugin{
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new UHCScoreboard(), this);
	}

	public void onDisable() {
		
	}
}
