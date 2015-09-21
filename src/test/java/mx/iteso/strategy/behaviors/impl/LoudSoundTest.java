package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoudSoundTest {
    @Test
    public void testLoudSound() {
        LoudSound loudSound = new LoudSound();
        assertEquals("I'm making a loud sound!", loudSound.sound());
    }
}
