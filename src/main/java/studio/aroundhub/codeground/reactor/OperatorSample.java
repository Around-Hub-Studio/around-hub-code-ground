package studio.aroundhub.codeground.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.scheduler.Schedulers;

import java.util.stream.IntStream;

public class OperatorSample {
  public static void main(String[] args) throws InterruptedException {
    int tasks = 6;
    Flux.create((FluxSink<String> fluxSink) -> {
          IntStream.range(1, tasks)
              .forEach(n -> fluxSink.next(doTasks(n)));
        })
        .subscribeOn(Schedulers.boundedElastic())
        .doOnNext(n -> System.out.println("[" + Thread.currentThread().getName() + "][create] " + n))
        .publishOn(Schedulers.parallel())
        .map(value -> value + " success!")
        .doOnNext(n -> System.out.println("[" + Thread.currentThread().getName() + "][map] " + n))
        .publishOn(Schedulers.parallel())
        .subscribe(data -> System.out.println("[" + Thread.currentThread().getName() + "][onNext] " + data));

    Thread.sleep(500);
  }

  private static String doTasks(int taskNumber) {
    return "task " + taskNumber + " result";
  }
}
