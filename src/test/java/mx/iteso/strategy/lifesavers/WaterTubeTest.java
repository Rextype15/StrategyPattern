package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floatable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterTubeTest {

	@Test
	public void testWaterTube(){
        WaterTube waterTube = new WaterTube(new Deflatable(), new Floatable());
		assertEquals("I'm a Water tube", waterTube.display());
        assertEquals("I'm inflating!", waterTube.inflating());
        assertEquals("I'm deflating!", waterTube.deflating());
        assertEquals("I'm floating on the water!", waterTube.floating());
	}
}
