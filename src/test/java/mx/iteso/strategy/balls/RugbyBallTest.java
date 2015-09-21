package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RugbyBallTest {
    @Test
    public void testAmericanFootballBall() {
        RugbyBall rugbyBall= new RugbyBall();
        assertEquals("I'm bouncing irregularly!", rugbyBall.performBounce());
        assertEquals("I'm deflating!", rugbyBall.performDeflate());
        assertEquals("I'm inflating!", rugbyBall.performInflate());
        assertEquals("Rugby ball is rolling!", rugbyBall.roll());
        assertEquals("I'm making a loud sound!", rugbyBall.performSound());
    }
}
