package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.SoundBehavior;

public class QuietSound implements SoundBehavior {

    public String sound() {
        return "I'm making a quiet sound!";
    }
}
