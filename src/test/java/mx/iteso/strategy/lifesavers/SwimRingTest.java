package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floatable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwimRingTest {

	@Test
	public void testSwimRing(){
        SwimRing swimRing = new SwimRing(new Deflatable(), new Floatable() );
		assertEquals("I'm a Swim ring", swimRing.display());
        assertEquals("I'm inflating!", swimRing.inflating());
        assertEquals("I'm deflating!", swimRing.deflating());
        assertEquals("I'm floating on the water!", swimRing.floating());
	}
}
