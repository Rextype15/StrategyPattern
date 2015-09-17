package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;

public class RugbyBall extends Ball {
    public RugbyBall() {
        bounceBehavior =  new IrregularBounce();
        deflateBehavior = new Deflatable();
        type = "Rugby ball";
    }
}
