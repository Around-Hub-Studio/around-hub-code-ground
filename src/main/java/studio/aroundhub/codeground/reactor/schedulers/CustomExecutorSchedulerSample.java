package studio.aroundhub.codeground.reactor.schedulers;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomExecutorSchedulerSample {
  public static void main(String[] args) {
    // 사용자 정의 ExecutorService 생성
    ExecutorService executorService = Executors.newFixedThreadPool(2);

    Flux.range(1, 5)
            .map(i -> {
              System.out.println("Processing value: " + i + " on thread: " + Thread.currentThread().getName());
              return i;
            })
            .publishOn(Schedulers.fromExecutorService(executorService))  // 사용자 정의 스레드 풀 사용
            .subscribe(i -> System.out.println("Received value: " + i + " on thread: " + Thread.currentThread().getName()));

    // ExecutorService 종료
    executorService.shutdown();
  }
}
