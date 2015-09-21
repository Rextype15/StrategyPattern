package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.Sinkable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwimSeatTest {

	@Test
	public void testSwimSeat(){
        SwimSeat swimSeat = new SwimSeat(new NotDeflatable(), new Sinkable());
		assertEquals("I'm a Swim seat", swimSeat.display());
        assertEquals("I can't inflate!", swimSeat.inflating());
        assertEquals("I can't deflate!", swimSeat.deflating());
        assertEquals("I'm Sinking in the water", swimSeat.floating());
	}
}
