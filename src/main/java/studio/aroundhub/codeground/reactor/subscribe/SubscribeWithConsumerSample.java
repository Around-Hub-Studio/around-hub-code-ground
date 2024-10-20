package studio.aroundhub.codeground.reactor.subscribe;

import reactor.core.publisher.Flux;
import reactor.util.context.Context;

public class SubscribeWithConsumerSample {
  public static void main(String[] args) {
    Flux<String> flux =
        Flux.just("A", "B", "C")
            .doOnNext(data -> System.out.println("Processing: " + data))
            .contextWrite(
                context -> {
                  // 리액티브 체인에서 Context를 읽어오거나 수정할 때 사용
                  if (context.hasKey("request-id")) {
                    System.out.println("Request ID found in context: " + context.get("request-id"));
                  }
                  return context;
                });

    // subscribe 메서드로 initialContext를 설정
    flux.subscribe(
        data -> System.out.println("Received: " + data),
        error -> System.err.println("Error occurred: " + error),
        () -> System.out.println("Completed!"),
        Context.of("request-id", "1234") // initialContext 설정
        );
  }
}
