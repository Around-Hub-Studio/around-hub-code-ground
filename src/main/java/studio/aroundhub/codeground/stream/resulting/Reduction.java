package studio.aroundhub.codeground.stream.resulting;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduction {

    public Reduction() {
        // reduce 메소드를 통해 결과를 생성할 수 있습니다.
        // reduce 메소드의 파라미터는 총 3가지를 받을 수 있습니다.
        // - accumulator : 각 요소를 처리하는 계산 로직. 요소가 올때마다 중간 결과를 생성 (인자 1개일 경우)
        // - identity : 계산을 위한 초기값으로 스트림이 비어서 계산할 내용이 없더라도 리턴 (인자 2개일 경우 추가됨)
        // - combiner : 병렬 스트림에서 나눠 계산한 결과를 하나로 합칠때 사용 (인자 3개일 경우 추가됨)

        // 인자 1개일 경우
        OptionalInt reduced =
                IntStream.range(1, 5)
                        .reduce(Integer::sum);
        System.out.println(reduced);

        // 인자 2개일 경우
        int reducedWithTwoParams =
                IntStream.range(1, 4)
                        .reduce(5, Integer::sum);
        System.out.println(reducedWithTwoParams);

        System.out.println("=====separator=====");

        // 인자 3개일 경우 (sequential 은 combiner 구문 실행되지 않음)
        int sum = Stream.of(1, 2, 3, 4, 5)
                .reduce(55,
                        Integer::sum,
                        (a, b) -> {
                            System.out.println("combiner");
                            return a + b;
                        });
        System.out.println(sum);

        System.out.println("=====separator=====");

        // 인자 3개일 경우 (parallel 은 combiner 구문 실행됨)
        sum = Stream.of(1, 2, 3, 4, 5).parallel()
                .reduce(1,
                        Integer::sum,
                        (a, b) -> {
                            System.out.println("combiner");
                            return a + b;
                        });
        System.out.println(sum);
    }

}
