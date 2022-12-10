package studio.aroundhub.codeground.stream.processing;

import studio.aroundhub.codeground.stream.vo.IntegerVo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
        System.out.println();
        sortedExample();
    }

    private void sortedExample(){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 10; i++){
            list.add(random.nextInt(50));
        }
        list.stream().sorted().forEach(System.out::println);
    }

    public static void main(String[] args){
        new Sorting();
    }

}
