package patterns.observer.step1;

// 기상 스테이션으로부터 오는 데이터를 추적하는 객체
public class WeatherData1 {
    // 최신 온도 값
    public float getTemperature() {
        return 0;
    }
    // 최신 습도 값
    public float getHumidity() {
        return 0;
    }
    // 최신 기압 값
    public float getPressure() {
        return 0;
    }

    /**
     * 기상 관측 값이 갱신될 때마다 알려주기 위한 메소드
     * = 갱신될 때마다 이 메소드가 어떤 식으로든 호출될 것이다
     */
    public void measurementsChanged() {
        // 이미 구현되어 있는 WeatherData의 게터 메소드를 통해 최신 측정 값을 가져옴
        float temp = this.getTemperature();
        float humidity = this.getHumidity();
        float pressure = this.getPressure();

        // 현재 조건, 가상 통계, 기상 예측 디스플레이 갱신
//        currentConditionsDisplay.update(temp, humidity, pressure);
//        statisticsDisplay.update(temp, humidity, pressure);
//        forecastDisplay.update(temp, humidity, pressure);
    }
}
