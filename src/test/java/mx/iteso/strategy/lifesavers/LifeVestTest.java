package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Floatable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LifeVestTest {

	@Test
	public void testLifeVest(){
        LifeVest lifeVest = new LifeVest(new NotDeflatable(), new Floatable());
		assertEquals("I'm a Life vest", lifeVest.display());
        assertEquals("I can't inflate!", lifeVest.inflating());
        assertEquals("I can't deflate!", lifeVest.deflating());
        assertEquals("I'm floating on the water!", lifeVest.floating());
	}
}
