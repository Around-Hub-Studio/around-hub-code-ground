package studio.aroundhub.codeground.reactor.sample1;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    MyPublisher publisher = new MyPublisher();
    MySubscriber subscriber = new MySubscriber();

    System.out.println("Thread " + Thread.currentThread().getName() + ", check 1");
    publisher.subscribe(subscriber);

    // 데이터 발행
    System.out.println("Thread " + Thread.currentThread().getName() + ", check 2");
    publisher.notifySubscribers(new Message(0, "Initial Message"));

    Thread.sleep(200);

    System.out.println("Thread " + Thread.currentThread().getName() + ", check 3");
    publisher.close();

    // 애플리케이션이 종료가 안되는 이유 : subscription executor 가 살아있기 때문!
  }
}