package studio.aroundhub.codeground.reactor.buffer;

import java.time.Duration;

import reactor.core.publisher.Flux;

public class BufferSizeAndDurationSample {
  public static void main(String[] args) throws InterruptedException {
    // 100ms마다 데이터를 방출하는 Flux
    Flux<Long> fastPublisher = Flux.interval(Duration.ofMillis(100)).take(10); // 10개의 데이터만 방출

    // 1초마다 또는 3개씩 데이터를 버퍼링
    fastPublisher
        .bufferTimeout(3, Duration.ofSeconds(1))
        .subscribe(
            bufferedData -> {
              System.out.println("Buffered data: " + bufferedData);
            });

    // Flux가 끝날 때까지 대기
    Thread.sleep(3000); // 3초 대기
  }
}
