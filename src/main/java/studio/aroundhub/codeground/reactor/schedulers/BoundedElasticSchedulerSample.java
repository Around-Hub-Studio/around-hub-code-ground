package studio.aroundhub.codeground.reactor.schedulers;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class BoundedElasticSchedulerSample {
  public static void main(String[] args) {
    Flux.range(1, 5)
            .map(i -> {
              System.out.println("Processing value: " + i + " on thread: " + Thread.currentThread().getName());
              try {
                // I/O 작업 시뮬레이션 (예: 파일 읽기/쓰기, 네트워크 호출)
                Thread.sleep(1000);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
              return i;
            })
            .publishOn(Schedulers.boundedElastic())  // I/O 바운드 작업에 적합
            .subscribe(i -> System.out.println("Received value: " + i + " on thread: " + Thread.currentThread().getName()));
  }
}
