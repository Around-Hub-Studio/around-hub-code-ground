package studio.aroundhub.codeground.reactor.schedulers;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class ImmediateSchedulerSample {
  public static void main(String[] args) {
    Flux.range(1, 5)
            .map(i -> {
              System.out.println("Processing value: " + i + " on thread: " + Thread.currentThread().getName());
              return i;
            })
            .subscribeOn(Schedulers.immediate())  // 현재 스레드에서 실행
            .subscribe(i -> System.out.println("Received value: " + i + " on thread: " + Thread.currentThread().getName()));
  }
}
