package de.tails.unknowncommand.unknowncommand;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.help.HelpTopic;

public class ZMainListener implements Listener {

	@EventHandler(priority = EventPriority.LOWEST)
	public void onCommandPreprocess(PlayerCommandPreprocessEvent event) {
		String[] args = event.getMessage().split(" ");
		String cmd = args[0];
		HelpTopic ht = Bukkit.getServer().getHelpMap().getHelpTopic(cmd);
		if(ht == null) {
			if(!(event.isCancelled())) {
				event.getPlayer().sendMessage(Config.getMessage(cmd));
				event.setCancelled(true);
			}
		}
	}
}