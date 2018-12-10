package sngleton;

public class Car {

    private String brand;
    private String color;
    private double speed;
    private static Car car;

    private Car(String brand, String color, double speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public static Car getInstance() {

        if (car == null) {
            return new Car("VW", "Red", 100);
        }
        return car;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
