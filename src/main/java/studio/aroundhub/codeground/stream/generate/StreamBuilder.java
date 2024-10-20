package studio.aroundhub.codeground.stream.generate;

import java.util.stream.Stream;

public class StreamBuilder {

  public StreamBuilder() {
    // builder를 통해 값을 직접 주입하여 생성할 수 있습니다.
    Stream<String> buildStream =
        Stream.<String>builder().add("around").add("hub").add("studio").build();
  }

  public static void main(String[] args) {
    new StreamBuilder();
  }
}
