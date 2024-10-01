package studio.aroundhub.codeground.reactor.subscribe;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

public class SubscribeWithBaseSubscriberSample {
  public static void main(String[] args) {
    Flux<String> flux = Flux.just("A", "B", "C", "D");

    // BaseSubscriber를 상속받아 Custom Subscriber 구현
    BaseSubscriber<String> customSubscriber = new BaseSubscriber<>() {
      @Override
      protected void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscribed!");
        // 처음에 한 개의 데이터만 요청
        request(1);
      }

      @Override
      protected void hookOnNext(String value) {
        System.out.println("Received: " + value);
        // 원하는 로직에 따라 추가 요청 가능
        if ("B".equals(value)) {
          System.out.println("Received 'B', requesting 2 more items");
          request(2); // B를 받았을 때 2개의 데이터를 더 요청
        } else {
          System.out.println("Requesting 1 more item");
          request(1); // 그 외의 경우에는 1개씩 요청
        }
      }

      @Override
      protected void hookOnError(Throwable throwable) {
        System.err.println("Error occurred: " + throwable.getMessage());
      }

      @Override
      protected void hookOnComplete() {
        System.out.println("Completed!");
      }

      @Override
      protected void hookOnCancel() {
        System.out.println("Subscription cancelled!");
      }
    };

    // CustomBaseSubscriber를 사용한 구독
    flux.subscribe(customSubscriber);
  }
}
