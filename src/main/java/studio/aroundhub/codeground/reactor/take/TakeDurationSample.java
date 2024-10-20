package studio.aroundhub.codeground.reactor.take;

import java.time.Duration;

import reactor.core.publisher.Flux;

public class TakeDurationSample {
  public static void main(String[] args) throws InterruptedException {
    // 500ms마다 데이터를 방출하는 Flux
    Flux<Long> flux = Flux.interval(Duration.ofMillis(500));

    // 2초 동안 데이터 방출
    flux.take(Duration.ofSeconds(2)).subscribe(data -> System.out.println("Received: " + data));

    // Flux가 끝날 때까지 대기
    Thread.sleep(3000); // 3초 대기
  }
}
