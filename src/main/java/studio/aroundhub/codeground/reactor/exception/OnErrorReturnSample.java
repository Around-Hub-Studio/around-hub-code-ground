package studio.aroundhub.codeground.reactor.exception;

import reactor.core.publisher.Flux;

public class OnErrorReturnSample {
  // 값이 없거나 에러가 발생했을 때 기본값으로 대체
  public static void main(String[] args) {
    Flux.just(1, 2, 0, 3)
        .map(i -> 10 / i)
        .onErrorReturn(ArithmeticException.class, -1)
        .subscribe(System.out::println, System.err::println, () -> System.out.println("Done!"));
  }
}
