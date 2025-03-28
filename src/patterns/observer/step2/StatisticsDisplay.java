package patterns.observer.step2;

// 기상 통계
public class StatisticsDisplay implements Observer, DisplayElement {
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.display();
    }

    @Override
    public void display() {
        System.out.println("기상 통계");
    }
}
