package studio.aroundhub.codeground.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;
import reactor.core.scheduler.Schedulers;

import java.util.stream.IntStream;

public class SinkSample {

  public SinkSample() throws InterruptedException {
    //simpleSinkSample();
    //sinkOneSample();
    //sinkManyUnicastSample();
    //sinkManyMulticastSample();
    sinkManyReplaySample();
  }

  private void simpleSinkSample() throws InterruptedException {
    int tasks = 6;
    Sinks.Many<String> unicastSink = Sinks.many().unicast()
        .onBackpressureBuffer();

    Flux<String> fluxView = unicastSink.asFlux();
    IntStream.range(1, tasks)
        .forEach(n -> {
          try {
            new Thread(() -> {
              unicastSink.emitNext(doTask(n), Sinks.EmitFailureHandler.FAIL_FAST); // emitNext : downstream으로 메시지 emit
              System.out.println("[" + Thread.currentThread().getName() + "][Emitted] " + n);
            }).start();
            Thread.sleep(100);
          } catch (InterruptedException e) {
            System.out.println("[" + Thread.currentThread().getName() + "] " + e.getMessage());
          }
        });

    fluxView.publishOn(Schedulers.parallel())
        .map(result -> result + " success!")
        .doOnNext(n -> System.out.println("[" + Thread.currentThread().getName() + "][map] " + n))
        .publishOn(Schedulers.parallel())
        .subscribe(data -> System.out.println("[" + Thread.currentThread().getName() + "][onNext] " + data));

    Thread.sleep(200);
  }

  /**
   * Sinks.one() : 한 건의 데이터를 전송하는 방법을 정의
   */
  private void sinkOneSample() throws InterruptedException {
    Sinks.One<String> sinkOne = Sinks.one();
    Mono<String> mono = sinkOne.asMono();

    sinkOne.emitValue("Around Hub Studio", Sinks.EmitFailureHandler.FAIL_FAST);
    sinkOne.emitValue("Flature", Sinks.EmitFailureHandler.FAIL_FAST); // Fail

    mono.subscribe(data -> System.out.println("[" + Thread.currentThread().getName() + "][Subscriber1] " + data));
    mono.subscribe(data -> System.out.println("[" + Thread.currentThread().getName() + "][Subscriber2] " + data));
  }

  /**
   * Sinks.many()은 Sinks.one()과 다르게 Sinks.Many를 리턴하지 않고 ManySpec 인터페이스를 리턴
   */
  private void sinkManyUnicastSample() {
    Sinks.Many<Integer> unicastSink = Sinks.many().unicast().onBackpressureBuffer();
    Flux<Integer> fluxView = unicastSink.asFlux();

    unicastSink.emitNext(1, Sinks.EmitFailureHandler.FAIL_FAST);
    unicastSink.emitNext(2, Sinks.EmitFailureHandler.FAIL_FAST);

    fluxView.subscribe(value -> System.out.println("[" + Thread.currentThread().getName() + "][Subscriber1] " + value));

    unicastSink.emitNext(3, Sinks.EmitFailureHandler.FAIL_FAST);

    // unicast()는 1개의 subscriber만 가질 수 있음
    // fluxView.subscribe(value -> System.out.println("[" + Thread.currentThread().getName() + "][Subscriber2] " + value));
  }

  private void sinkManyMulticastSample() {
    Sinks.Many<Integer> unicastSink = Sinks.many().multicast().onBackpressureBuffer();
    Flux<Integer> fluxView = unicastSink.asFlux();

    unicastSink.emitNext(1, Sinks.EmitFailureHandler.FAIL_FAST);
    unicastSink.emitNext(2, Sinks.EmitFailureHandler.FAIL_FAST);

    fluxView.subscribe(value -> System.out.println("[" + Thread.currentThread().getName() + "][Subscriber1] " + value));
    fluxView.subscribe(value -> System.out.println("[" + Thread.currentThread().getName() + "][Subscriber2] " + value));

    unicastSink.emitNext(3, Sinks.EmitFailureHandler.FAIL_FAST);

    fluxView.subscribe(value -> System.out.println("[" + Thread.currentThread().getName() + "][Subscriber3] " + value));
  }

  private void sinkManyReplaySample() {
    Sinks.Many<Integer> unicastSink = Sinks.many().replay().limit(2);
    Flux<Integer> fluxView = unicastSink.asFlux();

    unicastSink.emitNext(1, Sinks.EmitFailureHandler.FAIL_FAST);
    unicastSink.emitNext(2, Sinks.EmitFailureHandler.FAIL_FAST);
    unicastSink.emitNext(3, Sinks.EmitFailureHandler.FAIL_FAST);

    fluxView.subscribe(value -> System.out.println("[" + Thread.currentThread().getName() + "][Subscriber1] " + value));

    unicastSink.emitNext(4, Sinks.EmitFailureHandler.FAIL_FAST);

    fluxView.subscribe(value -> System.out.println("[" + Thread.currentThread().getName() + "][Subscriber2] " + value));
  }

  public static void main(String[] args) throws InterruptedException {
    new SinkSample();
  }

  private String doTask(int num) {
    return "task " + num + " result";
  }
}
