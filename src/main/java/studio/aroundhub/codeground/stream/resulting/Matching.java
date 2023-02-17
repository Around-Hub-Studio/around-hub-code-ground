package studio.aroundhub.codeground.stream.resulting;

import java.util.Arrays;
import java.util.List;

public class Matching {

    public Matching() {
        // 매칭은 Predicate 를 받아 해당 조건을 만족하는 요소가 있는지 체크한 결과를 리턴합니다.
        // anyMatch : 하나라도 조건을 만족하는 요소가 있는지
        // allMatch : 모두 조건을 만족하는지
        // noneMatch : 모두 조건을 만족하지 않는지
        List<String> list = Arrays.asList("around", "hub", "studio");

        boolean anyMatch = list.stream().anyMatch(value -> value.contains("a"));
        boolean allMatch = list.stream().allMatch(value -> value.contains("a"));
        boolean noneMatch = list.stream().noneMatch(value -> value.contains("a"));

        System.out.println(anyMatch);
        System.out.println(allMatch);
        System.out.println(noneMatch);
    }

    public static void main(String[] args){
        new Matching();
    }

}
