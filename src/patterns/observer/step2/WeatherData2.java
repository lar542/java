package patterns.observer.step2;

import java.util.ArrayList;
import java.util.List;

// 기상 스테이션으로부터 오는 데이터를 추적하는 객체
public class WeatherData2 implements Subject {
    private List<Observer> observers = new ArrayList<>(); // 옵저버 객체들
    // 상태 값
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = this.observers.indexOf(o);
        if (i >= 0) {
            this.observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < this.observers.size(); i++) {
            Observer observer = this.observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    // 기상 스테이션으로부터 갱신된 측정치를 받으면 모든 옵저버에게 연락
    public void measurementsChanged() {
        this.notifyObservers();
    }

    // 기상데이터를 가져오는 테스트용 메소드
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }
}
