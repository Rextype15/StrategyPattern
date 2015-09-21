package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class StoneBallTest {
    @Test
    public void testAmericanFootballBall() {
        StoneBall stoneBall = new StoneBall();
        assertEquals("I crashed!! I can't bounce", stoneBall.performBounce());
        assertEquals("I can't deflate!", stoneBall.performDeflate());
        assertEquals("I can't inflate!", stoneBall.performInflate());
        assertEquals("Stone ball is rolling!", stoneBall.roll());
        assertEquals("I'm making a quiet sound!", stoneBall.performSound());
    }
}
