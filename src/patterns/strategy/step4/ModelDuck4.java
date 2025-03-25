package patterns.strategy.step4;

import patterns.strategy.step3.fly.FlyNoWay;
import patterns.strategy.step3.quack.Quack;

public class ModelDuck4 extends Duck4 {

    public ModelDuck4() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    String display() {
        return "모형 오리";
    }
}
