package studio.aroundhub.codeground.reactor.subscribe.buffer;

import reactor.core.publisher.Flux;

public class BufferWhileSample {
  public static void main(String[] args) throws InterruptedException {
    Flux<Integer> flux = Flux.range(1, 10);

    // Predicate가 true를 반환하는 동안에만 버퍼를 생성
    flux.bufferWhile(i -> i < 5)
            .subscribe(bufferedData -> {
              System.out.println("Buffered data: " + bufferedData);
            });
  }
}
