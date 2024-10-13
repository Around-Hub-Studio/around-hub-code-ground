package studio.aroundhub.codeground.reactor.thread;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

@Slf4j
public class ThreadSample {

  public static void main(String[] args) throws InterruptedException {
    Flux<Integer> flux = Flux.range(1, 5)
            .map(i -> {
              log.info("Map 1 - Value: {}", i);
              return i * 2;
            })
            // 새로운 스레드에서 실행
            .publishOn(Schedulers.boundedElastic())
            .map(i -> {
              log.info("Map 2 - Value: {}", i);
              return i + 1;
            })
            // 다시 다른 스레드에서 실행
            .publishOn(Schedulers.parallel())
            .map(i -> {
              log.info("Map 3 - Value: {}", i);
              return i - 1;
            });

    // 구독
    flux.subscribe(i -> log.info("Subscribe - Value: {}", i));

    // 메인 스레드가 종료되지 않도록 잠시 대기
    Thread.sleep(2000);
  }
}
