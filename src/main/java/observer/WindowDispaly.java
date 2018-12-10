package observer;

public class WindowDispaly implements Observer {

    private Observable observable;
    private int temperature;

    public WindowDispaly(Observable observable) {
        this.observable = observable;
    }

    public void update() {
        temperature = ((WeatherStation) observable).getTemperature();
    }

    public Observable getObservable() {
        return observable;
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
