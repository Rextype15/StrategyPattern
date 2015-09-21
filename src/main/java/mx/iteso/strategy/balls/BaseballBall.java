package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.QuietSound;

public class BaseballBall extends Ball {
    public BaseballBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        soundBehavior = new QuietSound();
        type = "Baseball ball";
    }
}
