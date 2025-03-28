package patterns.observer.step3;

import patterns.observer.step2.*;

import java.util.Observer;

public class WeatherStationTest {
    public static void main(String[] args) {
        WeatherData3 weatherData = new WeatherData3();

        // 각 디스플레이 항목
        Observer observer = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
