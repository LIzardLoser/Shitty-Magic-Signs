package me.lizard.shittymagicsigns;

import me.lizard.shittymagicsigns.Events.SignEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShittyMagicSigns extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().info("Plugin Started");

        getServer().getPluginManager().registerEvents(new SignEvent(), this);

    }
    
}