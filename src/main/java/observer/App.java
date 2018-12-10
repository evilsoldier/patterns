package observer;


/**
 *
 * Define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 * Encapsulate the core (or common or engine) components in a Subject abstraction,
 * and the variable (or optional or user interface) components in an Observer hierarchy.
 * The "View" part of Model-View-Controller.
 *
 */
public class App {

    public static void main(String[] args) {

        WeatherStation myWeatherStation = new WeatherStation();
        myWeatherStation.setHumidity(75);
        myWeatherStation.setTemperature(20);

        PhoneDisplay myPhoneDisplay = new PhoneDisplay(myWeatherStation);
        WindowDispaly myWindowDisplay = new WindowDispaly(myWeatherStation);

        myWeatherStation.addObserver(myPhoneDisplay);
        myWeatherStation.addObserver(myWindowDisplay);

        System.out.println(myPhoneDisplay.getTemperature());
        System.out.println(myPhoneDisplay.getHumidity());
        System.out.println(myWindowDisplay.getTemperature());

        myWeatherStation.notifyObservers();

        System.out.println(myPhoneDisplay.getTemperature());
        System.out.println(myPhoneDisplay.getHumidity());
        System.out.println(myWindowDisplay.getTemperature());

        myWeatherStation.setHumidity(99);
        myWeatherStation.notifyObservers();

        System.out.println(myPhoneDisplay.getHumidity());

    }
}
