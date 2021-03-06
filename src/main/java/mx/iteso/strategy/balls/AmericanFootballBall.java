package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.LoudSound;

public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        bounceBehavior =  new IrregularBounce();
        deflateBehavior = new Deflatable();
        soundBehavior = new LoudSound();
        type = "American Football ball";
    }
}
