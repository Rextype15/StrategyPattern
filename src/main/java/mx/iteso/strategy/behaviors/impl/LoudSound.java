package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.SoundBehavior;

public class LoudSound implements SoundBehavior {

    public String sound() {
        return "I'm making a loud sound!";
    }
}
