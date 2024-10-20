package studio.aroundhub.codeground.reactor.take;

import java.time.Duration;

import reactor.core.publisher.Flux;

public class TakeUntilOtherSample {
  public static void main(String[] args) throws InterruptedException {
    // 100ms마다 데이터를 방출하는 Flux
    Flux<Long> flux = Flux.interval(Duration.ofMillis(100));

    // 1초 후에 종료 신호를 방출하는 Flux
    Flux<Long> other = Flux.interval(Duration.ofSeconds(1)).take(1);

    // 종료 신호가 올 때까지 데이터 방출
    flux.takeUntilOther(other).subscribe(data -> System.out.println("Received: " + data));

    // Flux가 끝날 때까지 대기
    Thread.sleep(2000); // 2초 대기
  }
}
