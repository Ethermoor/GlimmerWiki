package com.ethermoor.glimmer.animation;

import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.Location;

import java.util.List;

public interface GlimmerAnimation {

    List<PacketContainer> tick(Location location, int entityId);

    GlimmerAnimation copy();

}
