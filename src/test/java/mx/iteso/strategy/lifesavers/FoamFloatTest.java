package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Floatable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FoamFloatTest {

	@Test
	public void testFoamFloat(){
        FoamFloat foamFloat = new FoamFloat(new NotDeflatable(), new Floatable());
		assertEquals("I'm a Foam float", foamFloat.display());
        assertEquals("I can't inflate!", foamFloat.inflating());
        assertEquals("I can't deflate!", foamFloat.deflating());
        assertEquals("I'm floating on the water!", foamFloat.floating());
	}
}
