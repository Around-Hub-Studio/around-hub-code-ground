package studio.aroundhub.codeground.stream.resulting;

import studio.aroundhub.codeground.stream.vo.IntegerVo;
import studio.aroundhub.codeground.stream.vo.StringVo;

import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Collecting {

    public Collecting() {
        // collect 메소드는 Collector 타입의 인자를 받아 처리합니다.
        List<StringVo> stringVoList = List.of(
                new StringVo(),
                new StringVo(),
                new StringVo()
        );

        List<String> list = stringVoList.stream()
                .map(StringVo::getName)
                .collect(Collectors.toList());
        list.forEach(System.out::println);

        Object[] array = stringVoList.stream()
                .map(StringVo::getName)
                .toArray();

        String result = stringVoList.stream()
                .map(StringVo::getName)
                .collect(Collectors.joining());
        System.out.println(result);

        result = stringVoList.stream()
                .map(StringVo::getName)
                .collect(Collectors.joining(",", "<", ">"));
        System.out.println(result);

        List<IntegerVo> integerVoList = List.of(
                new IntegerVo(10, 20, 30),
                new IntegerVo(40, 50, 60),
                new IntegerVo(70, 80, 90)
        );

        Double average = integerVoList.stream()
                .collect(Collectors.averagingInt(IntegerVo::getNumber1));
        System.out.println(average);

        int summing = integerVoList.stream()
                .collect(Collectors.summingInt(IntegerVo::getNumber2));
        System.out.println(summing);

        IntSummaryStatistics intSummaryStatistics =
                integerVoList.stream()
                        .collect(Collectors.summarizingInt(IntegerVo::getNumber3));
        System.out.println(intSummaryStatistics);

        // 필요에 따라 Collector.of 를 통해 필요한 로직을 만들 수 있습니다.
        Collector<StringVo, ?, LinkedList<StringVo>> toLinkedList =
                Collector.of(LinkedList::new, // new collector 생성
                        LinkedList::add, // 두 값을 가지고 계산
                        (first, second) -> { // 계산한 결과를 수집
                            first.addAll(second);
                            return first;
                        });

        LinkedList<StringVo> stringVoLinkedList =
                stringVoList.stream()
                        .collect(toLinkedList);
        stringVoLinkedList.forEach(stringVo -> System.out.println(stringVo.toString()));
    }

    public static void main(String[] args){
        new Collecting();
    }

}
