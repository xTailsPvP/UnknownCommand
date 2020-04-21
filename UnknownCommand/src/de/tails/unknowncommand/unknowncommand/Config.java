package de.tails.unknowncommand.unknowncommand;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class Config {

	public static File file = new File("plugins/UnknownCommand/config.yml");
	public static YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

	public static void createFile() {
		if(!(file.exists())) {
			config.set("Message", "&c%Command% is not exists. Please use /help for Help!");
			try {
				config.save(file);
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String getMessage(String command) {
		return config.getString("Message").replace("&", "§").replace("%Command%", command);
	}
}