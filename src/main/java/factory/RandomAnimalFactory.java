package factory;

import java.util.Random;

/**
 * @author Georgi Trendafilov
 */
public class RandomAnimalFactory implements AnimalFactory {

    private static Random random = new Random();

    @Override
    public Animal createAnimal() {

        int ran = random.nextInt(3);

        switch (ran) {
            case 0:
                return new Cat();
            case 1:
                return new Dog();
            case 2:
                return new Rabbit();
        }
        return null;
    }
}
