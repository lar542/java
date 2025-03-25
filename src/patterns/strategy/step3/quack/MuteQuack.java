package patterns.strategy.step3.quack;

// '꽥꽥거린다' 행동 인터페이스의 구현체 즉, 어떻게 우는가?
public class MuteQuack implements QuackBehavior {

    // 아무 소리도 내지 않는다.
    @Override
    public String quack() {
        return null;
    }
}
