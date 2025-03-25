package patterns.strategy.step3.fly;

// '날다' 행동 인터페이스의 구현체 즉, 어떻게 나는가?
public class FlyNoWay implements FlyBehavior {

    // 날지 않는다
    @Override
    public String fly() {
        return null;
    }
}
