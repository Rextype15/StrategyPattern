package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolleyBallTest {
    @Test
    public void testAmericanFootballBall() {
        VolleyBallBall volleyBall = new VolleyBallBall();
        assertEquals("I'm bouncing normally!", volleyBall.performBounce());
        assertEquals("I'm deflating!", volleyBall.performDeflate());
        assertEquals("I'm inflating!", volleyBall.performInflate());
        assertEquals("VolleyBall ball is rolling!", volleyBall.roll());
        assertEquals("I'm making a loud sound!", volleyBall.performSound());
    }
}
