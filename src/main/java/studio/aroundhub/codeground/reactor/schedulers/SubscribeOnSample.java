package studio.aroundhub.codeground.reactor.schedulers;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class SubscribeOnSample {
  public static void main(String[] args) throws InterruptedException {
    Flux.range(1, 5)
            .map(i -> {
              System.out.println("map1: " + i + " on thread: " + Thread.currentThread().getName());
              return i;
            })
            .map(i -> {
              System.out.println("map2: " + i + " on thread: " + Thread.currentThread().getName());
              return i;
            })
            .subscribeOn(Schedulers.boundedElastic())  // 상류 작업이 이 스레드에서 실행됨
            .subscribe(i -> System.out.println("Received value: " + i + " on thread: " + Thread.currentThread().getName()));
    Thread.sleep(3000);
  }
}
