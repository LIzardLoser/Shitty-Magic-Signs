package me.lizard.shittymagicsigns;

import me.lizard.shittymagicsigns.Commands.HelpCommand;
import me.lizard.shittymagicsigns.Events.SignEvent;
import me.lizard.shittymagicsigns.Events.TreeDecayEvent;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShittyMagicSigns extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic

        this.getLogger().info("Plugin Started");

        FileConfiguration config  = getConfig();
        config.options().copyDefaults();
        saveDefaultConfig();


        getServer().getPluginManager().registerEvents(new SignEvent(), this);
        getServer().getPluginManager().registerEvents(new TreeDecayEvent(), this);

        getCommand("sms").setExecutor(new HelpCommand());



    }
    
}
