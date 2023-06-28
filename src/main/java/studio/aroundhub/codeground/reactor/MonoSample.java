package studio.aroundhub.codeground.reactor;

import reactor.core.publisher.Mono;

public class MonoSample {

  public static void main(String[] args){
    Mono.just("Around Hub Studio")
        .subscribe(System.out::println);

    Mono.empty()
        .subscribe(
            none -> System.out.println("emitted onNext signal"),
            error -> {},
            () -> System.out.println("emitted onComplete signal")
        );
  }
}
