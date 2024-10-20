package studio.aroundhub.codeground.reactor.subscribe;

import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

public class BackPressureSample {
  public static void main(String[] args) {
    // 빠르게 데이터를 방출하는 Flux
    Flux<Integer> fastPublisher =
        Flux.range(1, 100)
            .doOnRequest(n -> System.out.println("Requesting " + n + " items")) // 요청할 때 로그 출력
            .doOnNext(i -> System.out.println("Publishing: " + i)); // 데이터가 방출될 때 로그 출력

    // BaseSubscriber를 사용하여 Backpressure 관리
    BaseSubscriber<Integer> slowSubscriber =
        new BaseSubscriber<Integer>() {
          @Override
          protected void hookOnSubscribe(Subscription subscription) {
            System.out.println("Subscribed with slow processing");
            // 처음에는 1개의 데이터만 요청
            request(1);
          }

          @Override
          protected void hookOnNext(Integer value) {
            System.out.println("Received: " + value);
            // 데이터를 천천히 처리하는 시뮬레이션 (1초 대기)
            try {
              Thread.sleep(1000); // 데이터를 처리하는 데 시간이 걸리는 시뮬레이션
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            // 하나의 데이터를 처리한 후, 다음 데이터 하나를 요청
            request(1);
          }

          @Override
          protected void hookOnError(Throwable throwable) {
            System.err.println("Error: " + throwable.getMessage());
          }

          @Override
          protected void hookOnComplete() {
            System.out.println("All data received");
          }

          @Override
          protected void hookOnCancel() {
            System.out.println("Subscription cancelled");
          }
        };

    // 느리게 처리하는 Subscriber로 구독 시작
    fastPublisher.subscribe(slowSubscriber);
  }
}
