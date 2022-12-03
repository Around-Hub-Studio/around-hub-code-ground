package studio.aroundhub.codeground.stream.generate;

import java.util.stream.Stream;

public class StreamGenerator {

    public StreamGenerator() {
        // generate 메소드를 눌러 코드를 확인하세요
        // generate 메소드는 supplier 를 파라미터로 받습니다.
        Stream<String> generatedStream = Stream.generate(() ->
                "around hub studio").limit(5);

        // 위 코드에는 'around hub studio' 가 5개 추가됩니다.
        generatedStream.forEach(System.out::println);
    }

    public static void main(String[] args){
        new StreamGenerator();
    }
}
