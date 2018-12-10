package decorator;

public class Espresso extends AddonDecorator implements Beverage {

    public String getDescription() {
        return "This is a Espresso";
    }

    public Double getCost() {
        return 1.00;
    }
}
