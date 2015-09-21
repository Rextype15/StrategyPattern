package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.LoudSound;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

public class VolleyBallBall extends Ball {
    public VolleyBallBall() {
        bounceBehavior =  new NormalBounce();
        deflateBehavior = new Deflatable();
        soundBehavior = new LoudSound();
        type = "VolleyBall ball";
    }
}
