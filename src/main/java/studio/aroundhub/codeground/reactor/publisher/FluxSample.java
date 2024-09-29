package studio.aroundhub.codeground.reactor.publisher;

import reactor.core.publisher.Flux;

public class FluxSample {
  public static void main(String[] args){
    Flux<String> flux = Flux.just("Hello", "Flux", "World");

    flux.doOnNext(data -> System.out.println("Data: " + data)).subscribe();

    System.out.println("-------");

    flux.subscribe(
            data -> System.out.println("Data: " + data),
            error -> System.err.println("Error: " + error),
            () -> System.out.println("Process complete.")
    );
  }
}
