package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SinkableTest {
    @Test
    public void testCrashBounce() {
        Sinkable sinkable = new Sinkable();
        assertEquals("I'm Sinking in the water", sinkable.floating());
    }
}
