package observer;

public class PhoneDisplay implements Observer {

    private Observable observable;
    private int temperature;
    private int humidity;

    public PhoneDisplay(Observable observable) {
        this.observable = observable;
    }

    public void update() {
        temperature = ((WeatherStation) observable).getTemperature();
        humidity = ((WeatherStation) observable).getHumidity();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
