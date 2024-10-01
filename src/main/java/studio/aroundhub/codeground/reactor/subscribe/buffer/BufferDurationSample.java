package studio.aroundhub.codeground.reactor.subscribe.buffer;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class BufferDurationSample {
  public static void main(String[] args) throws InterruptedException {
    // 100ms마다 데이터를 방출하는 Flux
    Flux<Long> fastPublisher = Flux.interval(Duration.ofMillis(100))
            .take(10); // 10개의 데이터만 방출

    // 1초마다 데이터를 버퍼링
    fastPublisher
            .buffer(Duration.ofSeconds(1))
            .subscribe(bufferedData -> {
              System.out.println("Buffered data: " + bufferedData);
            });

    // Flux가 끝날 때까지 대기
    Thread.sleep(3000); // 3초 대기
  }
}
