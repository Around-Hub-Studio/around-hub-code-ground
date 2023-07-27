package studio.aroundhub.codeground.reactor;

import org.junit.Test;
import reactor.test.StepVerifier;
import reactor.test.publisher.TestPublisher;

public class TestPublisherSample {
  @Test
  public void testPublisherTest() {
    TestPublisher<Integer> source = TestPublisher.create();

    StepVerifier
        .create(TestTargetClass.divideByTwo(source.flux()))
        .expectSubscription()
        .then(() -> source.emit(2, 4, 6, 8, 10))
        .expectNext(1, 2, 3, 4)
        .expectError()
        .verify();
  }
}
