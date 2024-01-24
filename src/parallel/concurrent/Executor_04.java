package parallel.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// ScheduledExecutorService 인터페이스는 ExecutorService 인터페이스를 상속하는 하위 인터페이스
// Callable, Runnable 태스크를 특정 시간 이후에 실행할 수 있는 기능 추가 정의
// scheduleAtFixedRate, scheduleWithFixedDelay 메서드로 태스크를 주기적으로 실행할 수 있다.
// 따라서 주기적으로 태스크를 실행시키거나 특정 시간에 태스크가 실행되도록 예약하는 기능을 구현할 때 주로 이용한다.
public class Executor_04 {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    // ScheduledExecutorService 사용 예
    private static void test1() {
        // ScheduledExecutorService 객체 생성
        // 오직 하나의 스레드만 실행, 스레드를 예약해서 실행
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        // 태스크를 등록할 때 정책을 설정할 수 있다.

        // 첫번째 파라미터로 지정한 Runnable 클래스를 delay 시간만큼 후에 실행한다.
        // 한 번만 실행되며 반복 호출하지 않는다.
        scheduledExecutorService.schedule(() -> System.out.println("TODO 1"), 1, TimeUnit.SECONDS);

        // 첫번째 파라미터로 지정한 Callable 클래스를 delay 시간만큼 후에 실행한다.
        // 한 번만 실행되며 반복 호출하지 않는다.
        scheduledExecutorService.schedule(() -> "TODO 2", 2, TimeUnit.SECONDS);

        // 첫번째 파라미터로 지정한 Runnable 클래스를 두 번째 파라미터인 initialDelay 값만큼 대기했다가 실행한다.
        // 종료되면 다시 세번째 파라미터인 delay 만큼 대기했다가 실행하는 것을 반복한다.
        // 마지막 TimeUnit 은 initialDelay, delay 에서 사용할 시간 단위를 의미한다. (주로 시, 분, 초)
        scheduledExecutorService.scheduleWithFixedDelay(() -> System.out.println("TODO 3"), 1, 1, TimeUnit.SECONDS);

        // 첫번째 파라미터로 지정한 Runnable 클래스를 두 번째 파라미터인 initialDelay 값만큼 대기했다가 실행하고
        // 종료 여부와 상관 없이 다시 세 번째 파라미터인 period 값 주기로 반복해서 실행한다.
        // scheduleWithFixedDelay 와 다른 점은 스레드 종료 여부와는 상관 없이 period 값만큼 반복한다는 점이다.
        scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("TODO 4"), 1, 1, TimeUnit.SECONDS);
    }

    // 일정 시간 간격으로 스레드를 실행하는 예
    private static void test2() {
        // 스레드 풀 2개로 생성
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        // 3개의 스레드 등록
        // 스레드 풀이 2개 이므로 동시에 실행되는 태스트는 최대 2개
        scheduledExecutorService.scheduleWithFixedDelay(() -> System.out.println("delay"), 5, 10, TimeUnit.SECONDS); // 5초 후 실행, 종료 후 10초 대기 후 반복
        scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("rate 1"), 5, 10, TimeUnit.SECONDS); // 5초 후 실행, 10초 주기로 반복
        scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("rate 2"), 5, 10, TimeUnit.SECONDS); // 5초 후 실행, 10초 주기로 반복
    }
}
