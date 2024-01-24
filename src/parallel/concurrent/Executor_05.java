package parallel.concurrent;

import java.util.concurrent.TimeUnit;

public class Executor_05 {
    public static void main(String[] args) {
        try {
            System.out.println("START!");
            // 특정 밀리초 동안 스레드의 동작을 멈춘다. (밀리초 단위)
            Thread.sleep(2000); // 2000밀리초 동안 대기

            System.out.println("START!");
            // TimeUnit 으로 열거형으로 단위를 지정해 가독성을 높이고 혼동될 만한 부분을 제거
            TimeUnit.SECONDS.sleep(2); // 2초 동안 대기
            System.out.println("START!");
            TimeUnit.MILLISECONDS.sleep(1000); // 1000밀리초 동안 대기

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
