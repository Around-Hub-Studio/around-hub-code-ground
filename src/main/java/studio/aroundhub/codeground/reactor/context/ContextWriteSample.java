package studio.aroundhub.codeground.reactor.context;

import reactor.core.publisher.Mono;
import reactor.util.context.Context;

public class ContextWriteSample {
  public static void main(String[] args) {
    Mono<String> result =
        Mono.just("Hello")
            .flatMap(
                message ->
                    Mono.deferContextual(
                        contextView -> {
                          String initial = contextView.getOrDefault("key", "default");
                          String another = contextView.getOrDefault("anotherKey", "default");
                          System.out.println("#1 : " + initial + ", " + another);
                          return Mono.just("Mono : " + initial + ", " + another);
                        }))
            .contextWrite(Context.of("key", "InitialValue"))
            .contextWrite(context -> context.put("anotherKey", "NewValue"))
            .flatMap(
                message ->
                    Mono.deferContextual(
                        contextView -> {
                          String initial = contextView.getOrDefault("key", "default");
                          String another = contextView.getOrDefault("anotherKey", "default");
                          System.out.println("#2 : " + initial + ", " + another);
                          return Mono.just("Mono : " + initial + ", " + another);
                        }));

    result.subscribe(System.out::println);
  }
}
