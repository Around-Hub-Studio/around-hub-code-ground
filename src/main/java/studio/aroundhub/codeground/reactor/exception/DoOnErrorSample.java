package studio.aroundhub.codeground.reactor.exception;

import reactor.core.publisher.Flux;

public class DoOnErrorSample {
  // error가 발생했을 때 logging 처리를 위해 사용
  public static void main(String[] args) {
    Flux.just(1, 2, 0, 3)
            .map(i -> 10 / i)
            .doOnError(e -> {
              System.out.println("doOnError: " + e);
            })
            .subscribe(
                    data -> System.out.println("Received: " + data),
                    error -> System.err.println("Error: " + error),
                    () -> System.out.println("Done")
            );
  }
}
