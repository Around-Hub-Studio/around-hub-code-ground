package studio.aroundhub.codeground.reactor.schedulers;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class SingleSchedulerSample {
  public static void main(String[] args) {
    Flux.range(1, 5)
        .map(
            i -> {
              System.out.println(
                  "Processing value: " + i + " on thread: " + Thread.currentThread().getName());
              return i;
            })
        .publishOn(Schedulers.single()) // 하나의 스레드에서 순차적으로 처리
        .subscribe(
            i ->
                System.out.println(
                    "Received value: " + i + " on thread: " + Thread.currentThread().getName()));
  }
}
