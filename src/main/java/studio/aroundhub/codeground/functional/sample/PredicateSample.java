package studio.aroundhub.codeground.functional.sample;

import java.util.function.Predicate;

public class PredicateSample {

    public static void main(String[] args) {
        Predicate<Integer> equalsCount = (count) -> count.equals(50);
        System.out.println(equalsCount.test(50));
        System.out.println(equalsCount.test(20));
    }

}
