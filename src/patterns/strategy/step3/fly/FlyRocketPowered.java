package patterns.strategy.step3.fly;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public String fly() {
        return "로켓 추진 발사!!";
    }
}
