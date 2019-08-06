package factory;

/**
 * @author Georgi Trendafilov
 */
public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving");
    }
}
