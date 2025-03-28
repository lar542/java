package patterns.observer.step3;

import java.util.Observable;

// 기상 스테이션으로부터 오는 데이터를 추적하는 객체
public class WeatherData3 extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    // 기상 스테이션으로부터 갱신된 측정치를 받으면 모든 옵저버에게 연락
    public void measurementsChanged() {
        super.setChanged(); // 객체의 상태가 바뀌었다는 것을 알림, 플래그 값 true로 변경
        super.notifyObservers(); // 플래그 값이 true인 경우 해당 메소드에서 옵저버들에게 연락 돌림, 인자를 보내지 않기 때문에 푸시 방식(옵저버들에게 보냄)임
    }

    // 기상데이터를 가져오는 테스트용 메소드
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
