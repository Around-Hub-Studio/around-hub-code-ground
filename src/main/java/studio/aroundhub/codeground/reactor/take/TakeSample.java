package studio.aroundhub.codeground.reactor.take;

import reactor.core.publisher.Flux;

public class TakeSample {
  public static void main(String[] args) {
    Flux<Integer> flux = Flux.range(1, 10);

    // 처음 3개의 데이터만 방출
    flux.take(3).subscribe(data -> System.out.println("Received: " + data));
  }
}
