package studio.aroundhub.codeground.functional.sample;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionSample {

    public static void main(String[] args){
        Function<String, String> function = (message) -> "Message : " + message;
        System.out.println(function.apply("Around Hub Studio!"));

        BiFunction<String, Integer, String> biFunction = (message, count) -> {
            int resultCount = count + 10;
            return "Message : " + message + ", Count : " + resultCount;
        };

        System.out.println(biFunction.apply("Around Hub Studio!", 5));
    }

}