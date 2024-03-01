package com.ethermoor.glimmer;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;

public interface GlimmerManager {

        void spawnEmitter(String name, List<Player> observers, Location location);
        void spawnParticle(String name, List<Player> observers, Location origin, Location location);
}
