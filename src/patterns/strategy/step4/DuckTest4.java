package patterns.strategy.step4;

import patterns.strategy.step3.fly.FlyRocketPowered;

public class DuckTest4 {
    public static void main(String[] args) {
        Duck4 modelDuck = new ModelDuck4();
        System.out.println("나는 방법 : " + modelDuck.performFly());
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        System.out.println("나는 방법 : " + modelDuck.performFly());
    }
}
