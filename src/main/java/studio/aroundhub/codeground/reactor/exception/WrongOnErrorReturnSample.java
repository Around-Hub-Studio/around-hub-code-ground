package studio.aroundhub.codeground.reactor.exception;

import java.util.Random;

import reactor.core.publisher.Flux;

public class WrongOnErrorReturnSample {
  // 값이 없거나 에러가 발생했을 때 기본값으로 대체
  public static void main(String[] args) {
    Flux.just(1, 2, 3)
        .map(i -> 10 / i)
        .onErrorReturn(ArithmeticException.class, randomValue())
        .subscribe(System.out::println, System.err::println, () -> System.out.println("Done!"));
  }

  private static int randomValue() {
    Random random = new Random();
    System.out.println("randomValue occurred");
    return random.nextInt(100);
  }
}
