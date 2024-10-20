package studio.aroundhub.codeground.reactor.exception;

import reactor.core.publisher.Flux;

public class OnErrorContinueSample {
  // 에러가 발생해도 해당 에러만 무시하고 다음 데이터 처리로 이어지도록 하는 방식
  public static void main(String[] args) {
    Flux.just(1, 2, 0, 3)
        .map(i -> 10 / i)
        .onErrorContinue((e, o) -> System.out.println("Error occurred on: " + o))
        .subscribe(System.out::println, System.err::println, () -> System.out.println("Done!"));
  }
}
