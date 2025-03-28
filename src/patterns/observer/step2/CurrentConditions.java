package patterns.observer.step2;

// 현재 조건
public class CurrentConditions implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData; // 주제 레퍼런스를 가지고 있는 이유 : 옵저버 객체를 제거해야할 경우를 위함

    // 생성자로 주제 객체를 전달하고, 그 객체를 통해 디스플레이를 옵저버로 등록
    public CurrentConditions(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
