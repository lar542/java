package patterns.strategy.step3;

import patterns.strategy.step3.fly.FlyWithWings;
import patterns.strategy.step3.quack.Quack;

public class MallardDuck3 extends Duck3 {

    public MallardDuck3() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    String display() {
        return "머리가 청록 빛이 돈다";
    }
}
