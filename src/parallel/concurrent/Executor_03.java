package parallel.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// ExecutorService 인터페이스는 Executor 인터페이스를 상속하는 하위 인터페이스이다.
// 스레드를 생성하고 관리하고 위한 메서드를 추가 정의했다.
// 컨커런트 API를 사용한다는 것은 이 인터페이스를 사용하는 것이 일반적이다.
public class Executor_03 {
    // 컨커런트 API에는 많은 사용할 것 같은 기능을 정의해놓았고 이를 바탕으로 객체를 생성할 수 있는 Executors 클래스를 유틸리티 형태로 제공한다.
    // Executors 클래스는 Executor, ExecutorService, ScheduledExecutorService, ThreadFactory, Callable 클래스를 위한 팩터리와 유틸리티 메서드를 제공한다.
    // 그리고 ExecutorService 객체를 생성할 수 있는 메서드를 5개 제공한다.

    // ExecutorService 사용 예
    public static void main(String[] args) {
        // ExecutorService 객체를 생성

        // 오직 하나의 스레드만 처리될 수 있도록 스레드 풀을 생성한다.
        // newSingleThreadExecutor 메서드를 통해 생성한 ExecutorService 에
        // 여러 개의 태스크를 등록하면 병렬 처리되지 않고 순차 처리 된다.
//        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // 스레드 풀이 2개인 ExecutorService 생성
        // 2개의 스레드가 동시 실행되도록 스레드 풀을 만든다.
        // 등록된 스레드가 2개 이상이기 때문에 2개는 동시 처리되고 1개는 종료될 때까지 대기한 후 앞의 스레드가 종료한 다음 실행된다.
        // newFixedThreadPool 을 이용하면 동시 실행되는 스레드 개수를 제어할 수 있다.
//        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // 캐싱 스레드 풀을 생성
        // 여러 스레드를 병렬 처리한다는 점에서 newFixedThreadPool 과 유사하지만,
        // 실행하는 스레드 수에 제한 없이 등록한 모든 스레드를 동시 처리한다는 점이 다르다.
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Thread 생성하고 실행
        executorService.execute(new MyTask("TODO 1"));
        executorService.execute(new MyTask("TODO 2"));
        executorService.execute(new MyTask("TODO 3"));
        // ExecutorService 종료
        executorService.shutdown();
    }
}

class MyTask implements Runnable {
    private String id;

    public MyTask(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Task ID : " + id + ", running ... " + i);
            try {
                // 컨커런트 API에 추가된 시간 관련 클래스
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
