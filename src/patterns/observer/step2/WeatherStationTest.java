package patterns.observer.step2;

public class WeatherStationTest {
    public static void main(String[] args) {
        WeatherData2 weatherData = new WeatherData2();

        // 각 디스플레이 항목
        Observer observer1 = new CurrentConditions(weatherData);
        Observer observer2 = new StatisticsDisplay(weatherData);
        Observer observer3 = new ForecastDisplay(weatherData);
        Observer observer4 = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
