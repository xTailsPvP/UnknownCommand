package de.tails.unknowncommand.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.tails.unknowncommand.unknowncommand.Config;
import de.tails.unknowncommand.unknowncommand.ZMainListener;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		Config.createFile();
		Bukkit.getPluginManager().registerEvents(new ZMainListener(), this);
		Bukkit.getConsoleSender().sendMessage("§aUnknownCommand is activated!");
		Bukkit.getConsoleSender().sendMessage("§6Plugin by DyeShop!");
		Bukkit.getConsoleSender()
				.sendMessage("§6Source Code: https://github.com/xTailsPvP/UnknownCommand");
	}

	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§cUnknownCommand is deactivated!");
		Bukkit.getConsoleSender().sendMessage("§6Plugin by DyeShop!");
		Bukkit.getConsoleSender()
				.sendMessage("§6Source Code: https://github.com/xTailsPvP/UnknownCommand");
	}
}
