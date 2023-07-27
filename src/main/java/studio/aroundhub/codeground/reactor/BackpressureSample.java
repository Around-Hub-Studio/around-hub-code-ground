package studio.aroundhub.codeground.reactor;

import lombok.SneakyThrows;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.BufferOverflowStrategy;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;

public class BackpressureSample {

  public BackpressureSample() throws InterruptedException {
    //simpleSample();
    //usingErrorStrategy();
    usingDropStrategy();
    //usingLatestStrategy();
    //usingBufferStrategy();
  }

  private void simpleSample() {
    Flux.range(2, 5) // range : {start} 값 부터 1씩 증가시켜 총 {count}만큼 진행
        .doOnRequest(data -> System.out.println("[doOnRequest] " + data))
        .subscribe(new BaseSubscriber<Integer>() {
          /*
          hookOnSubscribe
          - 구독 시점에 request() 메소드를 호출하여 최초 데이터 요청 개수를 제어
           */
          @Override
          protected void hookOnSubscribe(Subscription subscription) {
            System.out.println("[hookOnSubscribe] Called");
            request(1);
          }

          /*
          hookOnNext
          - Publisher 에서 받은 데이터 핸들링
           */
          @SneakyThrows
          @Override
          protected void hookOnNext(Integer value) {
            Thread.sleep(1000);
            System.out.println("[hookOnNext] " + value);
            //request(2);
          }
        });
  }

  private void usingErrorStrategy() throws InterruptedException {
    Flux.interval(Duration.ofMillis(1)) // 0부터 1식 증가한 숫자를 duration에 맞춰 emit (0.001초)
        .onBackpressureError()
        .doOnNext(data -> System.out.println("[doOnNext] " + data))
        .publishOn(Schedulers.parallel())
        .subscribe(data -> {
          try {
            Thread.sleep(5); // 0.005초 (upstream과 downstream 속도 차이를 위해)
          } catch (InterruptedException ignored) {
          }
          System.out.println("[onNext] " + data);
        }, error -> System.out.println("[onError] " + error.getMessage()));

    Thread.sleep(2000);
  }

  private void usingDropStrategy() throws InterruptedException {
    Flux.interval(Duration.ofMillis(1)) // 0부터 1식 증가한 숫자를 duration에 맞춰 emit (0.001초)
        .onBackpressureDrop(droppedData -> System.out.println("[" + Thread.currentThread().getName() + "][onBackpressureDrop] " + droppedData))
        .doOnNext(data -> System.out.println("[doOnNext] " + data))
        .publishOn(Schedulers.parallel())
        .subscribe(data -> {
          try {
            Thread.sleep(5); // 0.005초 (upstream과 downstream 속도 차이를 위해)
          } catch (InterruptedException ignored) {
          }
          System.out.println("[" + Thread.currentThread().getName() + "][onNext] " + data);
        }, error -> System.out.println("[" + Thread.currentThread().getName() + "][onError] " + error.getMessage()));

    Thread.sleep(2000);
  }

  private void usingLatestStrategy() throws InterruptedException {
    Flux.interval(Duration.ofMillis(1)) // 0부터 1식 증가한 숫자를 duration에 맞춰 emit (0.001초)
        .onBackpressureLatest()
        .publishOn(Schedulers.parallel())
        .subscribe(data -> {
          try {
            Thread.sleep(5); // 0.005초 (upstream과 downstream 속도 차이를 위해)
          } catch (InterruptedException ignored) {
          }
          System.out.println("[" + Thread.currentThread().getName() + "][onNext] " + data);
        }, error -> System.out.println("[" + Thread.currentThread().getName() + "][onError] " + error.getMessage()));

    Thread.sleep(2000);
  }

  private void usingBufferStrategy() throws InterruptedException {
    Flux.interval(Duration.ofMillis(1)) // 0부터 1식 증가한 숫자를 duration에 맞춰 emit (0.001초)
        .doOnNext(data -> System.out.println("[doOnNext] Original : " + data))
        .onBackpressureBuffer(2,
            droppedData -> System.out.println("[" + Thread.currentThread().getName() + "][onBackpressureDrop] " + droppedData),
            BufferOverflowStrategy.DROP_LATEST)
        .doOnNext(data -> System.out.println("[" + Thread.currentThread().getName() + "][doOnNext] After buffered : " + data))
        .publishOn(Schedulers.parallel(), false, 1)
        .subscribe(data -> {
          try {
            Thread.sleep(1000); // 0.005초 (upstream과 downstream 속도 차이를 위해)
          } catch (InterruptedException ignored) {
          }
          System.out.println("[" + Thread.currentThread().getName() + "][onNext] " + data);
        }, error -> System.out.println("[" + Thread.currentThread().getName() + "][onError] " + error.getMessage()));

    Thread.sleep(3000);
  }

  public static void main(String[] args) throws InterruptedException {
    new BackpressureSample();
  }
}
