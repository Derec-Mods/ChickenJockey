package io.github.derec4.chickenJockey;

import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class ChickenJockeyListener implements Listener {
    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        Entity entity = event.getEntity();

        if (entity instanceof Zombie || entity instanceof ZombieVillager || entity instanceof Husk || entity instanceof Drowned || entity instanceof PigZombie) {
            Entity vehicle = entity.getVehicle();

            if (vehicle instanceof Chicken chicken) {
                chicken.setCustomName("CHICKEN JOCKEY");
                chicken.setCustomNameVisible(true);
            }
        }
    }
}
