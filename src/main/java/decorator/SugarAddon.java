package decorator;

public class SugarAddon extends AddonDecorator {

    private Beverage beverage;

    public SugarAddon(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " With sugar";
    }

    public Double getCost() {
        return beverage.getCost() + 0.2;
    }
}
