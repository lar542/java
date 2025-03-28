package patterns.observer.step2;

// 기상 예보
public class ForecastDisplay implements Observer, DisplayElement {
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.display();
    }

    @Override
    public void display() {
        System.out.println("기상 예보");
    }
}
