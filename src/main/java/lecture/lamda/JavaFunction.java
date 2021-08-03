package lecture.lamda;

import java.util.function.BinaryOperator;
import java.util.function.IntFunction;

public class JavaFunction {

    public static void main(String[] args){

        // int 값을 매개변수로 받아 함수를 생성
        IntFunction intSum = (a) -> a + 10;

        System.out.println(intSum.apply(5));

        // 동일한 타입의 두 값을 받아 연산을 처리
        BinaryOperator binarySum = (a, b) -> a + " " + b;

        System.out.println(binarySum.apply(1, 2));
        System.out.println(binarySum.apply("어라운드 허브", "스튜디오"));

    }
}
