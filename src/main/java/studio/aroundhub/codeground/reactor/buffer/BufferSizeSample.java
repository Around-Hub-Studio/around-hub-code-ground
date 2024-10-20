package studio.aroundhub.codeground.reactor.buffer;

import reactor.core.publisher.Flux;

public class BufferSizeSample {
  public static void main(String[] args) {
    // 빠르게 데이터를 방출하는 Flux
    Flux<Integer> fastPublisher = Flux.range(1, 10);

    // 3개씩 데이터를 묶어 버퍼링
    fastPublisher
        .buffer(3)
        .subscribe(
            bufferedData -> {
              System.out.println("Buffered data: " + bufferedData);
            });
  }
}
