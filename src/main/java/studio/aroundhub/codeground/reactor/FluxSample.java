package studio.aroundhub.codeground.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxSample {
  public static void main(String[] args) {
    Flux.just(6, 9, 13)
        .map(i -> i % 2)
        .subscribe(System.out::println);

    Flux.fromArray(new Integer[]{3, 4, 5, 6})
        .filter(num -> num > 4)
        .map(num -> num * 2)
        .subscribe(System.out::println);

    Flux<String> flux = Mono.justOrEmpty("data 1")
        .concatWith(Mono.justOrEmpty("data 2"));
    flux.subscribe(System.out::println);

    Flux.concat(
            Flux.just("data 1", "data 2", "data 3"),
            Flux.just("data 4", "data 5", "data 6"),
            Flux.just("data 7", "data 8", "data 9")
        ).collectList()
        .subscribe(System.out::println);
  }
}
