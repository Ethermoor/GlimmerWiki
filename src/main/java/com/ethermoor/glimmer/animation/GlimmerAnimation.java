package com.ethermoor.glimmer.animation;

import com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Location;

import java.util.List;

public interface GlimmerAnimation {

    List<PacketWrapper<?>> tick(Location location, int entityId);

    GlimmerAnimation copy();

}
