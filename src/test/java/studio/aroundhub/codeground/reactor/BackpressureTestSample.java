package studio.aroundhub.codeground.reactor;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.test.StepVerifier;

public class BackpressureTestSample {
  @Test
  public void generateNumberFailTest() {
    StepVerifier.create(generateNumber(), 1)
        .thenConsumeWhile(number -> number >= 1)
        .verifyComplete();
  }

  @Test
  public void generateNumberTest() {
    StepVerifier.create(generateNumber(), 1)
        .thenConsumeWhile(number -> number >= 1)
        .expectError()
        .verifyThenAssertThat()
        .hasDroppedElements();
  }

  private Flux<Integer> generateNumber() {
    return Flux.create(emitter -> {
      for (int i = 1; i <= 100; i++) {
        emitter.next(i);
      }
      emitter.complete();
    }, FluxSink.OverflowStrategy.ERROR);
  }
}
