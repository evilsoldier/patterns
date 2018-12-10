package observer;

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
