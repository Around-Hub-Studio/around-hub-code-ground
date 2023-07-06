package studio.aroundhub.codeground.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Hooks;
import reactor.core.scheduler.Schedulers;

import java.util.HashMap;
import java.util.Map;

public class DebugSample {
  public DebugSample() throws InterruptedException {
    Map<String, String> fruits = new HashMap<>();
    fruits.put("banana", "바나나");
    fruits.put("apple", "사과");
    fruits.put("pear", "배");
    fruits.put("grape", "포도");

    Flux.fromArray(new String[]{"BANANAS", "APPLES", "PEARS", "MELONS"})
        .subscribeOn(Schedulers.boundedElastic())
        .publishOn(Schedulers.parallel())
        .map(String::toLowerCase)
        .map(fruit -> fruit.substring(0, fruit.length() -1))
        .map(fruits::get)
        .map(translated -> "맛있는 " + translated)
        .subscribe(System.out::println, Throwable::printStackTrace);

    Thread.sleep(100L);
  }

  public static void main(String[] args) throws InterruptedException {
    Hooks.onOperatorDebug(); // Enable debug mode

    new DebugSample();
  }
}
