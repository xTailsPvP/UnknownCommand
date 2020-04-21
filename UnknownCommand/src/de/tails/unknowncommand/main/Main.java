package de.tails.unknowncommand.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.tails.unknowncommand.unknowncommand.Config;
import de.tails.unknowncommand.unknowncommand.MainListener;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		Config.createFile();
		Bukkit.getPluginManager().registerEvents(new MainListener(), this);
		Bukkit.getConsoleSender().sendMessage("§aUnknownCommand is activated!");
		Bukkit.getConsoleSender().sendMessage("§6Plugin by DyePlugins: https://dyeplugins.net");
		Bukkit.getConsoleSender()
				.sendMessage("§6Source Code: https://github.com/xTailsPvP/UnknownCommand");
	}

	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§cUnknownCommand is deactivated!");
		Bukkit.getConsoleSender().sendMessage("§6Plugin by DyePlugins: https://dyeplugins.net");
		Bukkit.getConsoleSender()
				.sendMessage("§6Source Code: https://github.com/xTailsPvP/UnknownCommand");
	}
}
