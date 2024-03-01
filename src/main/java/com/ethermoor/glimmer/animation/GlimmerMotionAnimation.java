package com.ethermoor.glimmer.animation;

import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.Location;

import java.util.List;

public abstract class GlimmerMotionAnimation implements GlimmerAnimation {

    public abstract List<PacketContainer> tick(Location location, int entityId);


}
