package patterns.strategy.step1;

public class DecoyDuck1 extends Duck1 {

    @Override
    String display() {
        return "나무로 조각된 오리 장식품";
    }

    // 문제 : 나무 오리는 아무 소리를 내지 않기 때문에 오버라이드
    @Override
    String quack() {
        return null;
    }

    // 문제 : 나무 오리도 날지 않는다. 아무것도 하지 않도록 오버라이드
    @Override
    String fly() {
        return null;
    }
}
