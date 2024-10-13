package studio.aroundhub.codeground.reactor.take;

import reactor.core.publisher.Flux;

public class TakeUntilSample {
  public static void main(String[] args) {
    Flux<Integer> flux = Flux.range(1, 10);

    // 값이 5가 될 때까지 데이터 방출
    flux.takeUntil(i -> i == 5)
            .subscribe(data -> System.out.println("Received: " + data));
  }
}
