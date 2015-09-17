package mx.iteso.strategy;

public class Lifesaver {
    public DeflateBehavior deflateBehavior;
    public FloatBehavior floatBehavior;
    public String type;

    public Lifesaver(DeflateBehavior DeflateImplementation, FloatBehavior FloatImplementation) {
        this.floatBehavior = FloatImplementation;
        this.deflateBehavior = DeflateImplementation;
    }

    public String inflating() {
        return deflateBehavior.inflate();
    }

    public String deflating() {
        return deflateBehavior.defleate();
    }

    public String floating() {
        return floatBehavior.floating();
    }

    public String display() {
        return "I'm a " + type;
    }
}
