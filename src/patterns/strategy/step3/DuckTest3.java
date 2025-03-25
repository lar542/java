package patterns.strategy.step3;

public class DuckTest3 {
    public static void main(String[] args) {
        Duck3 mallard = new MallardDuck3();
        System.out.println(mallard.performQuack());
        System.out.println(mallard.performFly());
    }
}
