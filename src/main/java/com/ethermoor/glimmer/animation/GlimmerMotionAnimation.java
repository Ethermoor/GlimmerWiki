package com.ethermoor.glimmer.animation;

import com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Location;

import java.util.List;

public abstract class GlimmerMotionAnimation implements GlimmerAnimation {

    public abstract List<PacketWrapper<?>> tick(Location location, int entityId);


}
