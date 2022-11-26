package studio.aroundhub.codeground.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalGenerationSample {

    public OptionalGenerationSample() {
        // 객체의 선언
        Optional<SampleObject> sampleObject;
        Optional<String> optionalText;

        // 객체 생성
        Optional<String> emptyObject = Optional.empty(); // null 값으로 초기화
        Optional<String> textObject1 = Optional.of("Text"); // null이 아닌 경우
        Optional<String> textObject2 = Optional.ofNullable(getText()); // null 또는 객체가 있을 수 있는 경우
    }

    private String getText() {
        Random random = new Random();
        int point = random.nextInt(3);
        if (point < 2) {
            return "Text";
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        new OptionalGenerationSample();
    }
}
