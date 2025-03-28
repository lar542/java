package patterns.observer.step2;

// 주제 인터페이스 : 옵저버를 등록/삭제할 때 이 인터페이스의 메소드를 이용한다.
public interface Subject {

    void registerObserver(Observer o); // 옵저버 등록
    void removeObserver(Observer o); // 옵저버 제거
    void notifyObservers(); // 상태가 바뀔 때마다 모든 옵저버들에게 연락하기 위한 메소드
}
