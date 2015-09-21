package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PingPongBallTest {
    @Test
    public void testAmericanFootballBall() {
        PingPongBall pingpongBall = new PingPongBall();
        assertEquals("I'm bouncing normally!", pingpongBall.performBounce());
        assertEquals("I can't deflate!", pingpongBall.performDeflate());
        assertEquals("I can't inflate!", pingpongBall.performInflate());
        assertEquals("Ping Pong ball is rolling!", pingpongBall.roll());
        assertEquals("I'm making a quiet sound!", pingpongBall.performSound());
    }
}
