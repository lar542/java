package patterns.observer.step3;

import patterns.observer.step2.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this); // 옵저버로 등록
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData3) {
            WeatherData3 weatherData3 = (WeatherData3) o;
            this.temperature = weatherData3.getTemperature();
            this.humidity = weatherData3.getHumidity();
            this.display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
