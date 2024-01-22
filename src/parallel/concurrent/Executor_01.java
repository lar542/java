package parallel.concurrent;

import java.util.concurrent.Executor;

// Executor 인터페이스는 execute 메서드 하나만 제공한다.
// 따라서 Executor 인터페이스 역시 함수형 인터페이스에 속하며, Runnable 인터페이스가 run 메서드 하나만 있는 것과 유사하다.
public class Executor_01 {

    // 예를 들어 스레드를 실행시킬 때 주로 다음과 같이 코딩했다.
    private void threadTest() {
        // Thread 와 Runnable 인터페이스를 이용한 구현
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        thread.start();
    }

    // 컨커런트 API의 Executor 인터페이스를 이용하면 다음과 같이 수정하면 된다.
    private void executorTest() {
        // Executor 와 Runnable 인터페이스를 이용한 구현
        Executor executor = new Executor() {
            @Override
            public void execute(Runnable command) {

            }
        };
        executor.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
