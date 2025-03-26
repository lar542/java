package patterns.observer.step2;

// 옵저버가 될 객체는 반드시 옵저버 인터페이스를 구현해야 한다.
public interface Observer {

    void update(); // 주제의 상태가 바뀌었을 때 호출되는 메소드만 있다.
}
