package studio.aroundhub.codeground.reactor.exception;

import reactor.core.publisher.Flux;

public class OnErrorStopSample {
  // 에러가 발생했을 때 스트림을 중지하고, 이후 처리도 더이상 진행하지 않는 방식
  public static void main(String[] args) {
    Flux.just(1, 2, 0, 3)
            .map(i -> 10 / i)
            .onErrorStop()
            .subscribe(
                    data -> System.out.println("Received: " + data),
                    error -> System.err.println("Error: " + error),
                    () -> System.out.println("Done")
            );
  }
}
