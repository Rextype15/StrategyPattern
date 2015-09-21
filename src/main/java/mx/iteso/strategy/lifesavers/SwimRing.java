package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FloatBehavior;

public class SwimRing extends Lifesaver{
    public SwimRing(DeflateBehavior DeflateImplementation, FloatBehavior FloatImplementation) {
    	super(DeflateImplementation, FloatImplementation);
        type = "Swim ring";
    }
}
