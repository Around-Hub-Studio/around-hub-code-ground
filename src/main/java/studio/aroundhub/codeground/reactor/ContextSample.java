package studio.aroundhub.codeground.reactor;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.util.context.Context;

/**
 * Context in Reactor API
 * - A key/value store that is propagated between components such as operators via the context protocol.
 * - Operator 같은 구성요소 간에 전파되는 key/value 형태의 저장소
 * 구독이 발생할 때마다 해당 구독과 관련된 Context가 발생한다고 보면됨
 */
public class ContextSample {
  public ContextSample() throws InterruptedException {
    //contextSample();
    //contextAPISample();
    //contextSample2();
    //contextSample3();
    contextSample4();
  }

  private void contextSample() throws InterruptedException {
    Mono.deferContextual(contextView -> // Context 데이터를 읽기 위해서는 contextView를 사용 (context x)
            Mono.just("Hi " + contextView.get("org"))
                .doOnNext(value -> System.out.println("[" + Thread.currentThread().getName() + "] " + "# just doOnNext : " + value))
        ) // deferContextual : 소스 데이터 레벨에서 Context의 데이터를 읽기 위해 사용하는 메소드
        .subscribeOn(Schedulers.boundedElastic())
        .publishOn(Schedulers.parallel())
        .transformDeferredContextual((mono, context) ->
            mono.map(value -> value + " " + context.get("name"))
        ) // transformDeferredContextual : Operator 레벨에서 Context 데이터에 접근하기 위해 사용
        .contextWrite(context -> context.put("name", "Flature")) // Context에 데이터 저장
        .contextWrite(context -> context.put("org", "Around Hub Studio"))
        .subscribe(value ->
            System.out.println("[" + Thread.currentThread().getName() + "] " + "# onNext : " + value)
        );

    Thread.sleep(100);
  }

  private void contextAPISample() throws InterruptedException {
    final String key1 = "org";
    final String key2 = "name";
    final String key3 = "phone";

    Mono.deferContextual(contextView ->
            Mono.just(contextView.get(key1) + ", "
                + contextView.getOrEmpty(key2).orElse("no name")
                + ", " + contextView.getOrDefault(key3, "no phone"))
        )
        .publishOn(Schedulers.parallel())
        .contextWrite(context ->
            context.putAll(Context.of(key2, "Flature", key3, "010-1111-2222").readOnly())
        )
        .contextWrite(context -> context.put(key1, "Around Hub Studio"))
        .subscribe(value ->
            System.out.println("[" + Thread.currentThread().getName() + "] " + "onNext : " + value));

    Thread.sleep(100);
  }

  private void contextSample2() throws InterruptedException {
    final String key1 = "org";

    Mono<String> mono = Mono.deferContextual(contextView ->
        Mono.just("Company : " + contextView.get(key1))
    ).publishOn(Schedulers.parallel());

    mono.contextWrite(context -> context.put(key1, "Around Hub"))
        .subscribe(value ->
            System.out.println("[" + Thread.currentThread().getName() + "] subscribe1 " + "onNext : " + value));

    mono.contextWrite(context -> context.put(key1, "Around Hub Studio"))
        .subscribe(value ->
            System.out.println("[" + Thread.currentThread().getName() + "] subscribe2 " + "onNext : " + value));

    Thread.sleep(100);
  }

  private void contextSample3() throws InterruptedException {
    final String key1 = "org";
    final String key2 = "name";

    Mono.deferContextual(contextView ->
            Mono.just(contextView.get(key1))
        ).publishOn(Schedulers.parallel())
        .contextWrite(context -> context.put(key2, "Flature")) // context는 윗 방향으로 전파되기 때문에 아래에서 쓰지 못함
        .transformDeferredContextual((mono, context) ->
            mono.map(value -> value + ", " + context.getOrDefault(key2, "Nell"))
        ).contextWrite(context -> context.put(key1, "Around Hub Studio"))
        .subscribe(value ->
            System.out.println("[" + Thread.currentThread().getName() + "] " + "onNext : " + value));

    Thread.sleep(100);
  }

  private void contextSample4() throws InterruptedException {
    final String key1 = "org";

    Mono.just("Flature")
       // .transformDeferredContextual((stringMono, contextView) -> contextView.get("role"))
        .flatMap(name -> Mono.deferContextual(contextView ->
                Mono.just(contextView.get(key1) + ", " + name)
                    .transformDeferredContextual((stringMono, innerContextView) ->
                        stringMono.map(data -> data + ", " + innerContextView.get("role"))
                    )
                    .contextWrite(context -> context.put("role", "CEO"))
            )
        ).publishOn(Schedulers.parallel())
        .contextWrite(context -> context.put(key1, "Around Hub Studio"))
        .subscribe(value ->
            System.out.println("[" + Thread.currentThread().getName() + "] " + "onNext : " + value));
    Thread.sleep(100);
  }

  public static void main(String[] args) throws InterruptedException {
    new ContextSample();
  }
}
