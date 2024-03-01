package com.ethermoor.glimmer.emitter;

import com.ethermoor.glimmer.Glimmer;
import com.ethermoor.glimmer.GlimmerManager;

public interface GlimmerParticleEmitter extends Glimmer {

    void emit(GlimmerManager manager);

    ParticleEmitterMode getMode();
    ParticleEmitterShape getShape();

}
