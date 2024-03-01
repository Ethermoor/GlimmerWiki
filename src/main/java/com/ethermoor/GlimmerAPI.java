package com.ethermoor;

import com.ethermoor.glimmer.blueprint.BlueprintType;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;

public interface GlimmerAPI {

    boolean isBlueprintLoaded(BlueprintType type, String name);

    void emitEmitter(List<Player> observers, String blueprint, Location location, String particle, int amount);

    void spawnEmitter(List<Player> observers, String blueprint, Location location);

    void spawnParticle(List<Player> observers, String blueprint, Location origin, int count, double offsetX, double offsetY, double offsetZ);

}
