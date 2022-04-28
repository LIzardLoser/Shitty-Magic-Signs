package me.lizard.shittymagicsigns;

import me.lizard.shittymagicsigns.Commands.HelpCommand;
import me.lizard.shittymagicsigns.Events.ItemEnchantEvent;
import me.lizard.shittymagicsigns.Events.SignEvent;
import me.lizard.shittymagicsigns.Events.GiveSignOnNasmiWalk;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShittyMagicSigns extends JavaPlugin {

    private static ShittyMagicSigns plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;


        this.getLogger().info("Plugin Started");

        getServer().getPluginManager().registerEvents(new SignEvent(), this);
        //getServer().getPluginManager().registerEvents(new GiveSignOnNasmiWalk(), this);
        getServer().getPluginManager().registerEvents(new ItemEnchantEvent(), this);

        getCommand("helpsms").setExecutor(new HelpCommand());

    }


    public static ShittyMagicSigns getInstance(){
        return plugin;
    }


    
}
