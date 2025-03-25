package patterns.strategy.step2;

public class RedheadDuck2 extends Duck2 implements Flyable, Quackable {

    @Override
    String display() {
        return "머리가 붉은 빛이 돈다";
    }

    @Override
    public String fly() {
        return "퍼덕퍼덕";
    }

    @Override
    public String quack() {
        return "꽥꽥";
    }
}
