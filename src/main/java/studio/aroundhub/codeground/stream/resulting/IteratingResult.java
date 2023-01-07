package studio.aroundhub.codeground.stream.resulting;

import java.util.List;

public class IteratingResult {

    public IteratingResult() {
        // foreach 는 요소를 돌면서 로직을 실행합니다.
        List<String> list = List.of("around", "hub", "studio");
        list.stream().forEach(System.out::println);
        list.stream().forEach(value -> System.out.println(value + "!"));
    }

}
