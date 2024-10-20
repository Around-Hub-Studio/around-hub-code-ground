package studio.aroundhub.codeground.stream.generate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayStream {

  public ArrayStream() {
    String[] array = new String[] {"around", "hub", "studio", "flature"};
    Stream<String> stream = Arrays.stream(array);
    Stream<String> partStream = Arrays.stream(array, 1, 4);

    // 아래와 같이 스트림을 리스트로 만들 수도 있음
    List<String> list = stream.toList();
  }

  public static void main(String[] args) {
    new ArrayStream();
  }
}
