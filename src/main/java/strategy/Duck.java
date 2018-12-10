package strategy;

public abstract class Duck {

    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public String fly() {
        return flyBehavior.fly();
    }

    public String quack() {
     return quackBehavior.quack();
    }

}
