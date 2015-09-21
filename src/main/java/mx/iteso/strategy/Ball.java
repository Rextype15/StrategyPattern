package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.SoundBehavior;

public abstract class Ball {

    public BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public SoundBehavior soundBehavior;
    public String type;

    public Ball() {
    }

    public Ball(BounceBehavior BounceImplementation) {
        this.bounceBehavior = BounceImplementation;
    }

    public String roll() {
        return type + " is rolling!";
    }

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

    public String performSound(){
        return  soundBehavior.sound();
    }

    public void SetBounceBehavior(BounceBehavior BounceImplementation) {
        this.bounceBehavior = BounceImplementation;
    }

}
