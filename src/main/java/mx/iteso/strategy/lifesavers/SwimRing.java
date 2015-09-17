package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;

public class SwimRing extends Lifesaver{
    public SwimRing(DeflateBehavior DeflateImplementation, FloatBehavior FloatImplementation) {
    	super(DeflateImplementation, FloatImplementation);
        type = "Swim ring";
    }
}
