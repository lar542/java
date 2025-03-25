package patterns.strategy.step1;

public class RubberDuck1 extends Duck1 {

    @Override
    String display() {
        return "노란색 고무 장난감";
    }

    // 문제 : 고무 오리는 꽥꽥 소리를 내지 않기 때문에 오버라이드
    @Override
    String quack() {
        return "삑삑";
    }

    // 문제 : 고무 오리는 날지 않는다. 아무것도 하지 않도록 오버라이드
    @Override
    String fly() {
        return null;
    }
}
