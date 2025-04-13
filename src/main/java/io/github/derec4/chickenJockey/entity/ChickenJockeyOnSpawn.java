package io.github.derec4.chickenJockey.entity;

import io.github.derec4.chickenJockey.event.ChickenJockeySpawnEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class ChickenJockeyOnSpawn implements Listener {
    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        Entity entity = event.getEntity();
        Entity vehicle = entity.getVehicle();

        if (!(vehicle instanceof Chicken chicken)) {
            return;
        }

        if (entity instanceof Zombie || entity instanceof ZombieVillager || entity instanceof Husk || entity instanceof Drowned || entity instanceof PigZombie) {
            chicken.setCustomName("CHICKEN JOCKEY");
            chicken.setCustomNameVisible(true);
            ChickenJockeySpawnEvent customEvent = new ChickenJockeySpawnEvent(entity, chicken);
            Bukkit.getPluginManager().callEvent(customEvent);
        }
    }
}
