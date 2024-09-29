package studio.aroundhub.codeground.reactor.publisher;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveSample {
  public static void main(String[] args) {
    Mono<String> mono = Mono.just("Mono Value");
    Flux<String> flux = Flux.just("Hello", "Flux", "World");

    flux.concatWith(mono)
      .subscribe(
          data -> System.out.println("Data: " + data), // onNext
          error -> System.err.println("Error: " + error), // onError
          () -> System.out.println("Process complete.") // onComplete
      );
  }
}
