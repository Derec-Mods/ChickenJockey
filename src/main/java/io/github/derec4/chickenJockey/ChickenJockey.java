package io.github.derec4.chickenJockey;

import io.github.derec4.chickenJockey.entity.ChickenJockeyOnDeath;
import io.github.derec4.chickenJockey.entity.ChickenJockeyOnSpawn;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChickenJockey extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new ChickenJockeyOnSpawn(), this);
        Bukkit.getPluginManager().registerEvents(new ChickenJockeyOnDeath(), this);

        Bukkit.getLogger().info("");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "  |_______|                             " +
                "  ");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "  | Derex |     CHICKEN JOCKEY v1.1.0");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "  |_______|     Running on " + Bukkit.getName() + " - " + Bukkit.getVersion());
        Bukkit.getLogger().info("");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info(ChatColor.RED + "CHICKEN JOCKEY");
    }
}
