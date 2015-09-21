package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.QuietSound;

public class PingPongBall extends Ball {
    public PingPongBall() {
        bounceBehavior =  new NormalBounce();
        deflateBehavior = new NotDeflatable();
        soundBehavior = new QuietSound();
        type = "Ping Pong ball";
    }
}
