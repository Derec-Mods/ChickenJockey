package io.github.derec4.chickenJockey.entity;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ChickenJockeyOnDeath implements Listener {
    private static final List<String> DEATH_MESSAGES = Arrays.asList(
            "I... am Steve.",
            "You were supposed to be the hero, Brian!",
            "As a child, I yearned for the mines...",
            "THIS is a CRAFTING TABLE!",
            "The Overworld!",
            "Flint and STEEEL!",
            "An ENDER PEARL!",
            "CHICKEN JOCKEY!",
            "First we mine, then we craft. Let's MINECRAFT!",
            "Water bucket... RELEASE",
            "The NETHER"
    );

    private final Random random = new Random();

    @EventHandler
    public void onChickenJockeyDeath(EntityDeathEvent event) {
        Entity entity = event.getEntity();
        Entity vehicle = entity.getVehicle();

        if (vehicle instanceof Chicken chicken && chicken.getCustomName() != null && entity.getCustomName().equals("CHICKEN JOCKEY")) {
            if (event.getEntity().getKiller() instanceof Player player) {
                String message = DEATH_MESSAGES.get(random.nextInt(DEATH_MESSAGES.size()));
                player.sendMessage(ChatColor.RED + message);
            }
        }
    }
}