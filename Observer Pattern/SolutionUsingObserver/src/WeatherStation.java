import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    List<Observer> observers = new ArrayList<>();
    float humidity;
    float temperature;
    @Override
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(temperature, humidity);
        }
    }

    public void setWeatherData(float temperature, float humidity){
        this.humidity = humidity;
        this.temperature = temperature;
        notifyObservers();
    }
}
