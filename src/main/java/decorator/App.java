package decorator;

public class App {

    /**
     * Attach additional responsibilities to an object dynamically.
     * Decorators provide a flexible alternative to subclassing for extending functionality.
     * Client-specified embellishment of a core object by recursively wrapping it.
     * Wrapping a gift, putting it in a box, and wrapping the box.
     */
    public static void main(String[] args) {

        Beverage myEspresso = new Espresso();
        myEspresso = new ChocolateAddon(new ChocolateAddon(new CaramelAddon(myEspresso)));
        myEspresso = new ChocolateAddon(myEspresso);
        myEspresso = new SugarAddon(myEspresso);

        System.out.println(myEspresso.getDescription());
        System.out.println(myEspresso.getCost().toString());

    }

}
