package strategy;

public class App {

    /**
     * Define a family of algorithms, encapsulate each one, and make them interchangeable.
     * Strategy lets the algorithm vary independently from the clients that use it.
     * Capture the abstraction in an interface, bury implementation details in derived classes.
     */
    public static void main(String[] args) {

        CityDuck myCityDuck = new CityDuck(new SimpleQuack(), new SimpleFly());
        System.out.println(myCityDuck.quack());
        System.out.println(myCityDuck.fly());
    }

}
