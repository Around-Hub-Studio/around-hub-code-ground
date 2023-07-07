package studio.aroundhub.codeground.reactor;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import reactor.test.StepVerifierOptions;
import reactor.test.scheduler.VirtualTimeScheduler;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuples;

import java.time.Duration;

/**
 * expectSubscription() : 구독이 이루어졌는지 확인
 * expectNext(T t) : onNext 시그널을 통해 전달되는 값이 파라미터로 전달된 값과 같은지 확인
 * expectComplete() : onComplete 시그널이 전송되는지 확인
 * expectError() : onError 시그널이 발생하는지 확인
 * expectNextCount(long count) : 구독 시점 또는 그 이전에 expectNext()를 통해 기대값이 평가된 데이터 이후부터 emit된 수 확인
 * expectNoEvent(Duration duration) : 주어진 시간 동안 시그널이 발생하지 않음을 확인
 * expectAccessibleContext() : 구독 시점 이후에 Context가 전파되었는지 확인
 * expectNextSequence(Iterable <? extends T> iterable) : emit된 데이터들이 파라미터로 전달된 iterable의 요소와 매치되는지 확인
 * <p>
 * verify() : 검증 트리거
 * verifyComplete() : 검증 트리거 및 onComplete 시그널 확인
 * verifyError() : 검증 트리거 및 onError 시그널 확인
 * verifyTimeout(Duration duration) : 검증 트리거 및 주어진 시간이 초과되어도 publisher가 종료되지 않았는지 확인
 */
public class TestSample {
  @Test
  public void sayHelloReactorTest() {
    // 테스트 대상 시퀀스 생성
    StepVerifier.create(Mono.just("Hello Reactor"))
        // emit된 데이터 기대값 평가
        .expectNext("Hello Reactor")
        // onComplete 시그널 평가
        .expectComplete()
        // 검증 실행
        .verify();
  }

  @Test
  public void sayHelloTest() {
    StepVerifier.create(TestTargetClass.sayHello())
        .expectSubscription()
        .as("# expect subscription") // 이전 expect 메소드에 대해 설명을 추가할 수 있음
        .expectNext("Hi") // 실패 >> Hello로 변경하면 통과
        .as("# expect Hi")
        .expectNext("Reactor")
        .as(" expect Reactor")
        .verifyComplete();
  }

  @Test
  public void divideByTwoTest() {
    Flux<Integer> source = Flux.just(2, 4, 6, 8, 10);
    StepVerifier.create(TestTargetClass.divideByTwo(source))
        .expectSubscription()
        .expectNext(1)
        .expectNext(2)
        .expectNext(3)
        .expectNext(4)
        //.expectNext(1, 2, 3, 4)
        .expectError()
        .verify();
  }

  @Test
  public void takeNumberTest() {
    Flux<Integer> source = Flux.range(0, 1000);
    StepVerifier.create(TestTargetClass.takeNumber(source, 500),
            StepVerifierOptions.create().scenarioName("Verify from 0 to 499"))
        .expectSubscription()
        .expectNext(0)
        .expectNextCount(498)
        .expectNext(499)
        .expectComplete()
        .verify();
  }

  private Flux<Tuple2<String, Integer>> getCOVID19Count(Flux<Long> source) {
    return source.flatMap(notUse -> Flux.just(
        Tuples.of("서울", 10),
        Tuples.of("경기도", 5),
        Tuples.of("강원도", 3),
        Tuples.of("충청도", 6),
        Tuples.of("경상도", 5),
        Tuples.of("전라도", 8),
        Tuples.of("인천", 2),
        Tuples.of("대전", 1),
        Tuples.of("대구", 2),
        Tuples.of("부산", 3),
        Tuples.of("제주도", 0)
    ));
  }

  private Flux<Tuple2<String, Integer>> getVoteCount(Flux<Long> source) {
    return source
        .zipWith(Flux.just(
            Tuples.of("중구", 15400),
            Tuples.of("서초구", 20020),
            Tuples.of("강서구", 32040),
            Tuples.of("강동구", 14506),
            Tuples.of("서대문구", 35650)
        )).map(Tuple2::getT2);
  }

  @Test
  public void timeBasedTest1() {
    StepVerifier.withVirtualTime(() ->
            getCOVID19Count(Flux.interval(Duration.ofHours(1)).take(1))
        ).expectSubscription()
        .then(() -> VirtualTimeScheduler.get().advanceTimeBy(Duration.ofHours(1)))
        .expectNextCount(11)
        .expectComplete()
        .verify();
  }

  @Test
  public void timeBasedTest2() {
    StepVerifier.withVirtualTime(() -> // withVirtualTime: VirtualTimeScheduler 의 제어를 받게 해주는 메소드
            getCOVID19Count(Flux.interval(Duration.ofHours(1)).take(1))
        ).expectSubscription()
        .then(() -> VirtualTimeScheduler.get().advanceTimeBy(Duration.ofHours(1))) // 가상으로 1시간을 시간을 댕겨줌
        .expectNextCount(11)
        .expectComplete()
        .verify();
  }

  @Test
  public void timeBasedTest3() {
    StepVerifier.withVirtualTime(() ->
            getCOVID19Count(Flux.interval(Duration.ofMinutes(1)).take(1))
        ).expectSubscription()
        .expectNextCount(11)
        .expectComplete()
        .verify(Duration.ofSeconds(3));
  }

  @Test
  public void timeBasedTest4() {
    StepVerifier.withVirtualTime(() ->
            getVoteCount(Flux.interval(Duration.ofMinutes(1)))
        ).expectSubscription()
        .expectNoEvent(Duration.ofMinutes(1)) // 지정한 시간 동안 이벤트가 발생하지 않는 것을 확인하면서 지정한 시간만큼 스킵함
        .expectNoEvent(Duration.ofMinutes(1))
        .expectNoEvent(Duration.ofMinutes(1))
        .expectNoEvent(Duration.ofMinutes(1))
        .expectNoEvent(Duration.ofMinutes(1))
        .expectNextCount(5)
        .expectComplete()
        .verify();
  }
}
