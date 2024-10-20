package studio.aroundhub.codeground.reactor.schedulers;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class PublishOnSample {
  public static void main(String[] args) throws InterruptedException {
    Flux.range(1, 5)
        .map(
            i -> {
              System.out.println("map1: " + i + " on thread: " + Thread.currentThread().getName());
              return i;
            })
        .publishOn(Schedulers.boundedElastic()) // 이 시점부터 하류 작업이 다른 스레드에서 실행됨
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
