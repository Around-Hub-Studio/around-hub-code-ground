package studio.aroundhub.codeground.stream.generate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

    public ParallelStream() {
        List<String> list = List.of("around", "hub", "studio");
        // parallelStream 메소드를 사용하면 병렬로 처리할 수 있습니다.
        Stream<String> stream = list.parallelStream();

        System.out.println(stream.isParallel());

        // 배열은 아래와 같이 만들 수 있습니다.
        String[] array = new String[]{"around", "hub", "studio"};
        Stream<String> stringStream = Arrays.stream(array).parallel();

        boolean isTrue = stringStream.map(String::toUpperCase)
                .anyMatch(upper -> upper.length() > 2);
        System.out.println(isTrue);

        // 만약 parallel 설정을 돌리고 싶다면 아래와 같이 입력합니다.
        Stream<String> sequentialStream = stringStream.sequential();
        System.out.println(sequentialStream.isParallel());
    }

}
