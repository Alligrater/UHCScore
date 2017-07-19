package io.github.Alligrater;

import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class UHCScoreboard implements Listener{
	
	 @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        for (Player all : Bukkit.getOnlinePlayers()) {
            update(all);
        }
    }
	 
	 @EventHandler
	    public void onPlayerLeave(PlayerQuitEvent e) {
	        for (Player all : Bukkit.getOnlinePlayers()) {
	        	
	            update(all);
        }
    }
	
	
	public static void update(Player p) {
		
		
		
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard scoreboard = manager.getNewScoreboard();
		
		Objective obj = scoreboard.registerNewObjective("test", "xp");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		
		obj.setDisplayName("¡ìc- UHC SCORE -");
		
		p.setScoreboard(scoreboard);
	}
}
