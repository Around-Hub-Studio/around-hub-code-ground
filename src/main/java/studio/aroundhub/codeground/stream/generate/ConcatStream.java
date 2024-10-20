package studio.aroundhub.codeground.stream.generate;

import java.util.stream.Stream;

public class ConcatStream {

  public ConcatStream() {
    Stream<Integer> stream1 = Stream.of(1, 2, 3);
    Stream<Integer> stream2 = Stream.of(4, 5, 6);
    Stream<Integer> concat = Stream.concat(stream1, stream2);

    concat.forEach(System.out::println);
  }

  public static void main(String[] args) {
    new ConcatStream();
  }
}
