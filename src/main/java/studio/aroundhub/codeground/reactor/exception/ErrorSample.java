package studio.aroundhub.codeground.reactor.exception;

import reactor.core.publisher.Flux;

public class ErrorSample {
  public static void main(String[] args) {
    Flux.create(
            fluxSink -> {
              fluxSink.error(new RuntimeException());
            })
        .subscribe();
  }
}
