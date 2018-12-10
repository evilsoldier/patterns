package sngleton;

public class App {

    /**
     *
     * Ensure a class has only one instance, and provide a global point of access to it.
     * Encapsulated "just-in-time initialization" or "initialization on first use".
     *
     */
    public static void main(String[] args) {
        Car myCar = Car.getInstance();
        System.out.println(myCar);

        myCar.setBrand("Renault");
        myCar.setColor("Green");
        myCar.setSpeed(120);
        System.out.println(myCar);

        myCar = Car.getInstance();
        System.out.println(myCar);
    }
}
