package studio.aroundhub.codeground.reactor.exception;

import reactor.core.publisher.Flux;

public class RetrySample {
  // 에러 발생 시 정해진 횟수만큼 재시작
  public static void main(String[] args) {
    Flux.just(1, 2, 0, 3)
            .map(i -> 10 / i)
            .retry(2)
            .subscribe(System.out::println, System.err::println,
                    () -> System.out.println("Done!"));
  }
}
