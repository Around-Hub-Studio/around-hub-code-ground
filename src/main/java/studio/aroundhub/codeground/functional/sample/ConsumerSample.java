package studio.aroundhub.codeground.functional.sample;

import java.util.function.Consumer;

public class ConsumerSample {

  public static void main(String[] args) {
    Consumer<String> print = (message) -> System.out.println("Message : " + message);
    print.accept("Around Hub Studio!");
  }
}
