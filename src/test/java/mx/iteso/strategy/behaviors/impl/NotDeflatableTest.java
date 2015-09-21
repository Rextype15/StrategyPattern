package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotDeflatableTest {
    @Test
    public void testNotDefletableInflate() {
        NotDeflatable notDeflatable = new NotDeflatable();
        assertEquals("I can't inflate!", notDeflatable.inflate());
    }

    @Test
    public void testNotDefletableDeflate() {
        NotDeflatable notDeflatable = new NotDeflatable();
        assertEquals("I can't deflate!", notDeflatable.deflate());
    }
}
