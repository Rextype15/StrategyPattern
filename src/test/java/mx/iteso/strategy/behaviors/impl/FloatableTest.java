package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FloatableTest {
    @Test
    public void TestFlotable() {
        Floatable floatable = new Floatable();
        assertEquals("I'm floating on the water!", floatable.floating());
    }
}
