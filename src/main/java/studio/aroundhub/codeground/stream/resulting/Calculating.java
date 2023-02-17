package studio.aroundhub.codeground.stream.resulting;

import java.util.stream.IntStream;

public class Calculating {

    public Calculating(){
        // 다양한 계산 메소드를 통해 결과를 만들 수 있습니다.
        System.out.println(IntStream.of(1,2,3,4,5).count());
        System.out.println(IntStream.of(1,2,3,4,5).sum());
        System.out.println(IntStream.of().sum()); // 0을 출력

        // 결과값이 OptionalInt 가 사용됩니다.
        System.out.println(IntStream.of(1,2,3,4,5).min());
        System.out.println(IntStream.of(1,2,3,4,5).max());
        System.out.println(IntStream.of(1,2,3,4,5).max().getAsInt());
        System.out.println(IntStream.of().max());
    }

    public static void main(String[] args){
        new Calculating();
    }

}
