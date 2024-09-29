package studio.aroundhub.codeground.reactor.publisher;

import reactor.core.publisher.Mono;

public class MonoSample {
  public static void main(String[] args){
    Mono<String> mono = Mono.just("Hello");

    mono.subscribe(
            data -> System.out.println("Data: " + data), // onNext
            error -> System.err.println("Error: " + error), // onError
            () -> System.out.println("Process complete.") // onComplete
    );
  }
}
