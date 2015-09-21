package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuietSoundTest {
    @Test
    public void testCrashBounce() {
        QuietSound quietSound = new QuietSound();
        assertEquals("I'm making a quiet sound!", quietSound.sound());
    }
}
