package studio.aroundhub.codeground.reactor;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

/**
 * Reactor Scheduler : 비동기 프로그래밍을 위해 사용되는 스레드를 관리
 * 대표적인 Scheduler 전용 Operator : subscribeOn(), publishOn(), parallel()
 */
public class SchedulerSample {

  public SchedulerSample() throws InterruptedException {
    //subscribeOnSample();
    //publishOnSample();
    //parallelSample();
    //schedulersImmediateSample();
    //schedulersSingleSample();
    schedulersNewSingleSample();
  }

  private void subscribeOnSample() throws InterruptedException {
    /*
    subscribeOn()
    - 구독이 발생한 직후 실행될 스레드를 지정
    */
    Flux.fromArray(new Integer[]{1, 2, 3, 4})
        .subscribeOn(Schedulers.boundedElastic())
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", Thread : " + Thread.currentThread().getName()))
        .doOnSubscribe(subscription -> System.out.println("[doOnSubscribe] " + subscription + ", Thread : " + Thread.currentThread().getName()))
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));

    Thread.sleep(5000);
  }

  private void publishOnSample() throws InterruptedException {
    /*
    publishOn()
    - 다운스트림으로 시그널을 전송할 때 실행되는 스레드를 제어하
    */
    Flux.fromArray(new Integer[]{5, 6, 7, 8})
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", Thread : " + Thread.currentThread().getName()))
        .doOnSubscribe(subscription -> System.out.println("[doOnSubscribe] " + subscription + ", Thread : " + Thread.currentThread().getName()))
        .publishOn(Schedulers.parallel())
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));

    Thread.sleep(5000);
  }

  private void parallelSample() throws InterruptedException {
    /*
    parallel()
     */
    Flux.fromArray(new Integer[]{9, 10, 11, 12, 9, 10, 11, 12, 9, 10, 11, 12, 9, 10, 11, 12})
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", Thread : " + Thread.currentThread().getName()))
        .parallel()
        .runOn(Schedulers.parallel())
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));

    Flux.fromArray(new Integer[]{13, 14, 15, 16, 13, 14, 15, 16, 13, 14, 15, 16, 13, 14, 15, 16})
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", Thread : " + Thread.currentThread().getName()))
        .parallel(4)
        .runOn(Schedulers.parallel())
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));

    Thread.sleep(5000);
  }

  private void schedulersImmediateSample() throws InterruptedException {
    // Schedulers.immediate() : 별도의 스레드를 추가로 생성하지 않고 현재 스레드에서 작업을 처리하고자 할 때 사용
    Flux.fromArray(new Integer[]{1, 3, 5, 7})
        .publishOn(Schedulers.parallel())
        .filter(data -> data > 3)
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", Thread : " + Thread.currentThread().getName()))
        .publishOn(Schedulers.immediate())
        .map(data -> data * 10)
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", Thread : " + Thread.currentThread().getName()))
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));

    Thread.sleep(5000);
  }

  private void schedulersSingleSample() throws InterruptedException {
    // Schedulers.single() : 스레드를 하나만 생성하여 스케줄러가 제거되기 전까지 재사용
    doTaskWithSingle("task1")
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));

    doTaskWithSingle("task2")
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));
    Thread.sleep(5000);
  }

  private static Flux<Integer> doTaskWithSingle(String taskName) {
    return Flux.fromArray(new Integer[]{1, 3, 5, 7})
        .publishOn(Schedulers.single())
        .filter(data -> data > 3)
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", task Name : " + taskName + ", Thread : " + Thread.currentThread().getName()))
        .map(data -> data * 10)
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", task Name : " + taskName + ", Thread : " + Thread.currentThread().getName()));
  }

  private void schedulersNewSingleSample() throws InterruptedException {
    // Schedulers.newSingle() : 호출할 때마다 매번 새로운 스레드 하나를 생성
    doTaskWithNewSingle("task1")
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));

    doTaskWithNewSingle("task2")
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));
    Thread.sleep(5000);
  }

  private static Flux<Integer> doTaskWithNewSingle(String taskName) {
    // daemon thread : 보조 스레드라고도 불리는 데몬 스레드는 주 스레드가 종료되면 자동으로 종료되는 특성이 있음
    // 이 예제에서는 main 스레드가 종료되면 자동으로 종료됨
    return Flux.fromArray(new Integer[]{1, 3, 5, 7})
        .publishOn(Schedulers.newSingle("new-single", true)) // name : 스레드 이름, daemon : 데몬 스레드로 동작할지 결정
        .filter(data -> data > 3)
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", task Name : " + taskName + ", Thread : " + Thread.currentThread().getName()))
        .map(data -> data * 10)
        .doOnNext(value -> System.out.println("[doOnNext] " + value + ", task Name : " + taskName + ", Thread : " + Thread.currentThread().getName()));
  }

  private void schedulersBoundedElasticSample() throws InterruptedException {
    // Schedulers.boundedElastic() : ExecutorService 기반의 스레드 풀을 생성한 후 그 안에 정해진 스레드 개수를 사용하여 작업을 처리
    // 기본적으로 CPU 코어 수 * 10 만큼의 스레드를 생성
    // 이용 가능한 스레드가 생길 때까지 100,000개의 작업 큐를 대기할 수 있음
    // 보통 Blocking I/O를 사용해야할 경우 유용함
    doTaskWithNewSingle("task1")
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));

    doTaskWithNewSingle("task2")
        .subscribe(value -> System.out.println("[onNext] " + value + ", Thread : " + Thread.currentThread().getName()));
    Thread.sleep(5000);
  }

  /*
  그 외 상둉할 수 있는 스케줄러
  - parallel()
  - fromExecutorService()
  - newXXX() : 위 예제에 사용된 스케줄러들을 커스텀하게 설정하기 위해 newXXX 메소드를 사용할 수 있음
   */

  public static void main(String[] args) throws InterruptedException {
    new SchedulerSample();
  }
}
