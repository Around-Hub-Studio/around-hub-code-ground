package studio.aroundhub.codeground.stream.processing;

import studio.aroundhub.stream.sample.vo.IntegerVo;

import java.util.List;
import java.util.stream.IntStream;

public class Sorting {

    public Sorting(){
        IntegerVo integerVo1 = new IntegerVo();
        IntegerVo integerVo2 = new IntegerVo();
        IntegerVo integerVo3 = new IntegerVo();

        List<IntegerVo> integerVoList = List.of(integerVo1, integerVo2, integerVo3);
        // 정렬은 Comparator 를 사용합니다.
        integerVoList.stream().flatMapToInt(integerVo ->
                IntStream.of(integerVo.getNumber1(), integerVo.getNumber2(), integerVo.getNumber3()))
                .sorted().forEach(System.out::println);
    }

}
