package studio.aroundhub.codeground.reactor.exception;

import reactor.core.publisher.Flux;

public class OnErrorResumeSample {
  // 에러가 발생하면 대체 시퀀스을 제공하여 다른 Mono or Flux를 반환
  public static void main(String[] args) {
    Flux.just(1, 2, 0, 3)
        .map(i -> 10 / i)
        .onErrorResume(e -> Flux.just(100, 200, 300))
        /*            .onErrorResume(new Function<Throwable, Publisher<? extends Integer>>() {
          @Override
          public Publisher<? extends Integer> apply(Throwable throwable) {
            return Flux.just(100, 200, 300);
          }
        })*/
        .subscribe(System.out::println, System.err::println, () -> System.out.println("Done!"));
  }
}
