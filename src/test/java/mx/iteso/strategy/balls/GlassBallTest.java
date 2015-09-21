package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GlassBallTest {
    @Test
    public void testAmericanFootballBall() {
        GlassBall glassBallBall = new GlassBall();
        assertEquals("I crashed!! I can't bounce", glassBallBall.performBounce());
        assertEquals("I can't deflate!", glassBallBall.performDeflate());
        assertEquals("I can't inflate!", glassBallBall.performInflate());
        assertEquals("Glass ball is rolling!", glassBallBall.roll());
        assertEquals("I'm making a loud sound!", glassBallBall.performSound());
    }
}
