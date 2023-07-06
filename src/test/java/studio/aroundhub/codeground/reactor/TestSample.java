package studio.aroundhub.codeground.reactor;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

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
}
