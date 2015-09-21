package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Floatable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwimBeltTest {

	@Test
	public void testSwimBelt(){
        SwimBelt swimBelt = new SwimBelt(new NotDeflatable(), new Floatable());
		assertEquals("I'm a Swim belt", swimBelt.display());
        assertEquals("I can't inflate!", swimBelt.inflating());
        assertEquals("I can't deflate!", swimBelt.deflating());
        assertEquals("I'm floating on the water!", swimBelt.floating());
	}
}
