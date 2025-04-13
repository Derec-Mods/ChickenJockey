package io.github.derec4.chickenJockey.event;

import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ChickenJockeySpawnEvent extends Event {
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final Entity jockey;
    private final Chicken chicken;

    public ChickenJockeySpawnEvent(Entity jockey, Chicken chicken) {
        this.jockey = jockey;
        this.chicken = chicken;
    }

    public Entity getJockey() {
        return jockey;
    }

    public Chicken getChicken() {
        return chicken;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }
}
