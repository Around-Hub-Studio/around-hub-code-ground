package studio.aroundhub.codeground.reactor.schedulers;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

@Slf4j
public class NewSingleSchedulerSample {
  public static void main(String[] args) {
    Flux.range(1, 5)
        .map(
            i -> {
              System.out.println(
                  "Processing value: " + i + " on thread: " + Thread.currentThread().getName());
              return i;
            })
        .publishOn(Schedulers.newSingle("custom-single-thread")) // 지정된 이름의 단일 스레드 사용
        .subscribe(
            i ->
                System.out.println(
                    "Received value: " + i + " on thread: " + Thread.currentThread().getName()));
  }
}
