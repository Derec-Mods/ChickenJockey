package io.github.derec4.chickenJockey;

import io.github.derec4.chickenJockey.entity.ChickenJockeyOnDeath;
import io.github.derec4.chickenJockey.event.ChickenJockeySpawnEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChickenJockey extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvent(new ChickenJockeySpawnEvent(), this);
        Bukkit.getPluginManager().registerEvent(new ChickenJockeyOnDeath(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
