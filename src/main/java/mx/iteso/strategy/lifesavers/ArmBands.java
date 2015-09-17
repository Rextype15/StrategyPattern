package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;

public class ArmBands extends Lifesaver{
    public ArmBands(DeflateBehavior DeflateImplementation, FloatBehavior FloatImplementation) {
    	super(DeflateImplementation, FloatImplementation);
        type = "Arm bands";
    }
}
