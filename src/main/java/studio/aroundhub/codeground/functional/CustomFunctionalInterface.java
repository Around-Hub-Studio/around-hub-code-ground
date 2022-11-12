package studio.aroundhub.codeground.functional;

@FunctionalInterface // 함수형 인터페이스 요건에 맞지 않으면 에러가 발생
public interface CustomFunctionalInterface {

    void called(String message);

    default void printHello() {
        System.out.println("Hello Around Hub!");
    }
}
