package patterns.observer.step2;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.display();
    }

    @Override
    public void display() {
        float heatIndex = (float) (
                -8.78469475556 +
                1.61139411 * temperature +
                2.33854883889 * humidity +
                -0.14611605 * temperature * humidity +
                -0.012308094 * temperature * temperature +
                -0.0164248277778 * humidity * humidity +
                0.002211732 * temperature * temperature * humidity +
                0.00072546 * temperature * humidity * humidity +
                -0.000003582 * temperature * temperature * humidity * humidity
        );
        System.out.println("Heat index is " + heatIndex);
    }
}
