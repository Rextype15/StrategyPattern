package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;

public class PingPongBall extends Ball {
    public PingPongBall() {
        bounceBehavior =  new RegularBounce();
        deflateBehavior = new NotDeflatable();
        type = "Ping Pong ball";
    }
}
