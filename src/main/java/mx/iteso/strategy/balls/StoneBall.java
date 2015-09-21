package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.QuietSound;

public class StoneBall extends Ball {
    public StoneBall() {
        bounceBehavior =  new Crash();
        deflateBehavior = new NotDeflatable();
        soundBehavior = new QuietSound();
        type = "Stone ball";
    }
}
