package lecture.basic_java.exception;

public class ThrowThrows {

    public ThrowThrows() {
        try {
            test1();
        } catch (Exception e) {
            System.out.println("test 메소드에서 에러 발생");
        }

        try {
            test2();
        } catch (Exception e) {
            System.out.println("내부에서 에러 처리");
        }
    }

    private void test1() throws Exception {
        throw new Exception();
    }

    private void test2() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("test2 에러 처리");
        }
    }

    public static void main(String[] args) {
        new ThrowThrows();
    }

}
