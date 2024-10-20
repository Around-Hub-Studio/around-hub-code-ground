package studio.aroundhub.codeground.reactor.schedulers;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class SubscribeOnAndPublishOnSample {
  public static void main(String[] args) throws InterruptedException {
    Flux.range(1, 5)
        .map(
            i -> {
              System.out.println("map1: " + i + " on thread: " + Thread.currentThread().getName());
              return i;
            })
        .subscribeOn(Schedulers.boundedElastic()) // 상류 작업은 boundedElastic 스레드에서 실행
        .publishOn(Schedulers.parallel()) // 하류 작업은 parallel 스레드에서 실행
        .map(
            i -> {
              System.out.println("map2: " + i + " on thread: " + Thread.currentThread().getName());
              return i;
            })
        .subscribe(
            i ->
                System.out.println(
                    "Received value: " + i + " on thread: " + Thread.currentThread().getName()));
    Thread.sleep(3000);
  }
}
