package studio.aroundhub.codeground.reactor.exception;

import reactor.core.publisher.Flux;

public class OnErrorMapSample {
  // 예외를 다른 예외로 변환하여 전달
  public static void main(String[] args) {
    Flux.just(1, 2, 0, 3)
        .map(i -> 10 / i)
        .onErrorMap(
            e -> {
              System.out.println(e);
              return new RuntimeException("Custom Error occurred", e);
            })
        .subscribe(System.out::println, System.err::println, () -> System.out.println("Done!"));
  }
}
