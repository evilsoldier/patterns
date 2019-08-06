package factory;

/**
 * @author Georgi Trendafilov
 */
public class Rabbit implements Animal {

    @Override
    public void eat() {
        System.out.println("Rabbit is eating");
    }

    @Override
    public void move() {
        System.out.println("Rabbit is moving");
    }
}
