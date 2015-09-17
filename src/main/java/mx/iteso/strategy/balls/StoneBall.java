package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;

public class StoneBall extends Ball {
    public StoneBall() {
        bounceBehavior =  new Crash();
        deflateBehavior = new NotDeflatable();
        type = "Stone ball";
    }
}
