package patterns.strategy.step1;

// 수퍼 클래스 오리
public abstract class Duck1 {

    // 헤엄
    void swim() {}

    abstract String display(); // 오리 모양

    // 꽥꽥거리다
    String quack() {
        return "꽥꽥";
    }

    // 날다
    String fly() {
        return "퍼덕퍼덕";
    }
}
