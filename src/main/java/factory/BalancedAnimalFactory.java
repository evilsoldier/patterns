package factory;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Georgi Trendafilov
 */
public class BalancedAnimalFactory implements AnimalFactory {

    private Queue<Animal> animals = new ArrayDeque<>();

    @Override
    public Animal createAnimal() {

        if (animals.isEmpty()) {
            Dog dog = new Dog();
            animals.add(dog);
            return dog;
        }
        String aClass = animals.poll().getClass().getSimpleName();

        switch (aClass) {
            case "Dog":
                Cat cat = new Cat();
                animals.add(cat);
                return cat;
            case "Cat":
                Rabbit rabbit = new Rabbit();
                animals.add(rabbit);
                return rabbit;
            case "Rabbit":
                Dog dog = new Dog();
                animals.add(dog);
                return dog;
        }
        return null;
    }
}
