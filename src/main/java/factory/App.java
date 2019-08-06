package factory;

/**
 * @author Georgi Trendafilov
 */
public class App {

    /**
     * In object-oriented programming (OOP),
     * a factory is an object for creating other objects – formally a factory is a function or method that returns objects of a varying prototype or class from some method call,
     * which is assumed to be "new".
     * More broadly, a subroutine that returns a "new" object may be referred to as a "factory", as in factory method or factory function.
     */
    public static void main(String[] args) {

        BalancedAnimalFactory balancedAnimalFactory = new BalancedAnimalFactory();
        RandomAnimalFactory randomAnimalFactory = new RandomAnimalFactory();

        for (int i = 0; i < 30; i++) {
            System.out.println(balancedAnimalFactory.createAnimal().getClass().getSimpleName());
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(randomAnimalFactory.createAnimal().getClass().getSimpleName());
        }
    }
}
