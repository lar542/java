package patterns.strategy.step4;

import patterns.strategy.step3.fly.FlyBehavior;
import patterns.strategy.step3.quack.QuackBehavior;

// 수퍼 클래스 오리
public abstract class Duck4 {

    // 헤엄
    void swim() {}

    abstract String display(); // 오리 모양

    QuackBehavior quackBehavior; // '꽥꽥거리다' 행동 인터페이스
    FlyBehavior flyBehavior; // '날다' 행동 인터페이스

    // 꽥꽥거리다
    public String performQuack() {
        return quackBehavior.quack(); // 행동 클래스에 위임
    }

    // 날다
    public String performFly() {
        return flyBehavior.fly(); // 행동 클래스에 위임
    }

    // 오리의 행동 방식을 바꾸고 싶을 때 호출
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    // 각 행동 인터페이스와 그 구현체로 캡슐화 됨
}
