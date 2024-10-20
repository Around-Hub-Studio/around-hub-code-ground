package studio.aroundhub.codeground.stream.processing;

import java.util.List;
import java.util.stream.Stream;

import studio.aroundhub.codeground.stream.vo.StringVo;

public class Filtering {

  public Filtering() {
    List<String> list = List.of("around", "hub", "studio");

    // filter 는 스트림 내 요소들을 하나씩 확인하는 작업입니다.
    // filter 메소드가 받는 인자는 Predicate 입니다.
    // Predicate 는 boolean 타입을 리턴하는 함수형 인터페이스입니다.
    Stream<String> stream = list.stream().filter(word -> word.contains("h"));
    stream.forEach(System.out::println);
    example1();
  }

  private void example1() {
    List<StringVo> list =
        List.of(new StringVo(), new StringVo("kim flature", "saemsuung", "url123"));

    list.stream()
        .filter((vo) -> vo.getName().contains("flature"))
        .findFirst()
        .ifPresent(System.out::println);

    list.stream().filter((vo) -> vo.getName().contains("flature")).forEach(System.out::println);
  }

  public static void main(String[] args) {
    new Filtering();
  }
}
