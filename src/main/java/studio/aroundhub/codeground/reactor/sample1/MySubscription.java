package studio.aroundhub.codeground.reactor.sample1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow;

public class MySubscription implements Flow.Subscription {
  private final MyPublisher publisher;
  private final ExecutorService executor;
  private boolean canceled = false;

  public MySubscription(MyPublisher publisher) {
    this.publisher = publisher;
    this.executor = Executors.newFixedThreadPool(2);
  }

  @Override
  public void request(long n) {
    System.out.println("Thread " + Thread.currentThread().getName() + ", " + "Called request() in MySubscription");
    if (!canceled) {
      executor.submit(() -> {
        for (int i = 0; i < n; i++) {
          if (canceled) {
            break;
          }
          publisher.notifySubscribers(new Message(i, "Message " + i));
        }
      });
    }
  }

  @Override
  public void cancel() {
    System.out.println("Called cancel() in MySubscription");
    canceled = true;
    executor.shutdown();
  }
}
