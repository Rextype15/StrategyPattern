package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.Sinkable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LifeSaverCandyTest {

	@Test
	public void testLifeSaverCandy(){
        LifeSaverCandy lifeSaverCandy = new LifeSaverCandy(new NotDeflatable(), new Sinkable());
		assertEquals("I'm a Life Saver candy", lifeSaverCandy.display());
        assertEquals("I can't inflate!", lifeSaverCandy.inflating());
        assertEquals("I can't deflate!", lifeSaverCandy.deflating());
        assertEquals("I'm Sinking in the water", lifeSaverCandy.floating());
	}
}
