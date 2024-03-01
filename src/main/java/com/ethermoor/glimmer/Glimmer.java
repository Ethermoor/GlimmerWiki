package com.ethermoor.glimmer;

import com.ethermoor.glimmer.blueprint.GlimmerBlueprint;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;


public interface Glimmer {

    int getEntityId();
    long getSpawnTime();
    void tick(GlimmerManager manager);
    void destroy();
    boolean isDestroyed();

    abstract class GlimmerBuilder {
        private final GlimmerBlueprint bp;
        protected GlimmerBuilder(GlimmerBlueprint bp) {
            this.bp = bp;
        }

        public GlimmerBlueprint getBlueprint() {
            return bp;
        }

        public abstract Glimmer build(List<Player> observers, Location origin, Location location);
    }


}
