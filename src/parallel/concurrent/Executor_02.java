package parallel.concurrent;

import java.util.concurrent.Executor;

// Executor 인터페이스를 이용한 스레드 프로그래밍 예제
// Executor 인터페이스를 컨커런트 API의 최상위 인터페이스
// 실제로 컨터런트 API를 사용할 때 해당 인터페이스를 직접 상속하고 정의할 일은 거의 없다.
// 아래 예시와 같이 스레드를 생성하는 것으로 끝나기 때문이다.
public class Executor_02 implements Executor {
    // 전달받은 Runnable 객체를 어떻게 처리할 것인지
    @Override
    public void execute(Runnable command) {
        // 방법 1. Runnable 인터페이스를 직접 실행
        command.run();

        // 방법 2. Thread 를 생성해서 실행
        new Thread(command).start();
    }

    // Executor 사용 예
    public static void main(String[] args) {
        // Executor 인터페이스를 구현한 구현체
        Executor executor = new Executor_02();
        // 이를 실행시키기 위해 Runnable 인터페이스를 정의한 람다 표현식을 전달
        executor.execute(() -> System.out.println("Hello, Executor!!"));
    }
}
