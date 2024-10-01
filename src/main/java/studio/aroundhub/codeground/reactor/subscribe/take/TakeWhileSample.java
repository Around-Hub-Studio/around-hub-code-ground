package studio.aroundhub.codeground.reactor.subscribe.take;

import reactor.core.publisher.Flux;

public class TakeWhileSample {
  public static void main(String[] args) {
    Flux<Integer> flux = Flux.range(1, 10);

    // 값이 5 미만일 때까지 데이터 방출
    flux.takeWhile(i -> i < 5)
            .subscribe(data -> System.out.println("Received: " + data));
  }
}
