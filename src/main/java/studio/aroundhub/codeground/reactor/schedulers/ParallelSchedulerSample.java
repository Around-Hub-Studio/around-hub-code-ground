package studio.aroundhub.codeground.reactor.schedulers;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class ParallelSchedulerSample {
  public static void main(String[] args) {
    Flux.range(1, 5)
        .map(
            i -> {
              System.out.println(
                  "Processing value: " + i + " on thread: " + Thread.currentThread().getName());
              // CPU 집약적인 작업 시뮬레이션 (예: 대규모 데이터 처리)
              return i * i; // 제곱 계산
            })
        .publishOn(Schedulers.parallel()) // CPU 바운드 작업에 적합
        .subscribe(
            i ->
                System.out.println(
                    "Received value: " + i + " on thread: " + Thread.currentThread().getName()));
  }
}
