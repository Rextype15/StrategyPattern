package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floatable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmBandsTest {

	@Test
	public void testArmBands(){
        ArmBands armBands = new ArmBands(new Deflatable(), new Floatable());
		assertEquals("I'm a Arm bands", armBands.display());
        assertEquals("I'm inflating!", armBands.inflating());
        assertEquals("I'm deflating!", armBands.deflating());
        assertEquals("I'm floating on the water!", armBands.floating());
	}
}

