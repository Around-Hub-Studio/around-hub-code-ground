package studio.aroundhub.codeground.stream.generate;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStream {

  public PrimitiveStream() {
    // 아래 작업들을 수행할 때, 오토박싱에 주의합니다.
    // 이런 타입의 스트림도 제공됩니다. 제네릭을 사용하지 않아 오토박싱이 발생하지 않습니다.
    IntStream intStream = IntStream.range(1, 5);
    LongStream longStream = LongStream.rangeClosed(1, 5);

    // 위 메소드마다 범위가 차이가 있습니다.
    intStream.forEach(System.out::println);
    longStream.forEach(System.out::println);

    // 필요한 경우 아래와 같이 박싱할 수 있습니다.
    Stream<Integer> boxedStream = IntStream.range(1, 5).boxed();

    // 난수 3개 생성
    DoubleStream doubleStream = new Random().doubles(3);
    doubleStream.forEach(System.out::println);
  }

  public static void main(String[] args) {
    new PrimitiveStream();
  }
}
