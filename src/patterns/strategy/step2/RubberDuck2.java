package patterns.strategy.step2;

public class RubberDuck2 extends Duck2 implements Flyable {

    @Override
    String display() {
        return "노란색 고무 장난감";
    }

    @Override
    public String fly() {
        return "삑삑";
    }
}
