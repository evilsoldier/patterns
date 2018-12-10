package decorator;

public class ChocolateAddon extends AddonDecorator {

    private Beverage beverage;

    public ChocolateAddon(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " With Chocolate.";
    }

    public Double getCost() {
        return beverage.getCost() + 0.5;
    }
}
