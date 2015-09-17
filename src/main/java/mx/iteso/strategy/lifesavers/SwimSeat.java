package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;

public class SwimSeat extends Lifesaver {
    public SwimSeat(DeflateBehavior DeflateImplementation, FloatBehavior FloatImplementation) {
    	super(DeflateImplementation, FloatImplementation);
        type = "Swim seat";
    }
}
