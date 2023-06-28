package studio.aroundhub.codeground.reactor;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

/**
 * Reactor Scheduler : 비동기 프로그래밍을 위해 사용되는 스레드를 관리
 * 대표적인 Scheduler 전용 Operator : subscribeOn(), publishOn(), parallel()
 */
public class SchedulerSample {
  public static void main(String[] args) throws InterruptedException {
    /*
    subscribeOn()
    - 구독이 발생한 직후 실행될 스레드를 지정
     */
    Flux.fromArray(new Integer[]{1, 2, 3, 4})
        .subscribeOn(Schedulers.boundedElastic())
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", Thread : " + Thread.currentThread().getName()))
        .doOnSubscribe(subscription -> System.out.println("[doOnSubscribe] " + subscription + ", Thread : " + Thread.currentThread().getName()))
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));

    /*
    publishOn()
    - 다운스트림으로 시그널을 전송할 때 실행되는 스레드를 제어하
     */
    Flux.fromArray(new Integer[]{5, 6, 7, 8})
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", Thread : " + Thread.currentThread().getName()))
        .doOnSubscribe(subscription -> System.out.println("[doOnSubscribe] " + subscription + ", Thread : " + Thread.currentThread().getName()))
        .publishOn(Schedulers.parallel())
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));

    /*
    parallel()
     */
    Flux.fromArray(new Integer[]{9, 10, 11, 12,9, 10, 11, 12,9, 10, 11, 12,9, 10, 11, 12})
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", Thread : " + Thread.currentThread().getName()))
        .parallel()
        .runOn(Schedulers.parallel())
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));

    Flux.fromArray(new Integer[]{13, 14, 15, 16,13, 14, 15, 16,13, 14, 15, 16,13, 14, 15, 16})
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", Thread : " + Thread.currentThread().getName()))
        .parallel(4)
        .runOn(Schedulers.parallel())
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));

    Thread.sleep(5000);
  }
}
