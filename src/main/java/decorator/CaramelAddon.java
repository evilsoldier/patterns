package decorator;

public class CaramelAddon extends AddonDecorator {

    private Beverage beverage;

    public CaramelAddon(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " With Caramel";
    }

    public Double getCost() {
        return beverage.getCost() + 1;
    }
}
