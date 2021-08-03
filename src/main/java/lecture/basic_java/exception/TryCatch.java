package lecture.basic_java.exception;

import java.util.Scanner;

/**
 * 예외처리 예시
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class TryCatch {

    public TryCatch() {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        try {
            int changedInput = Integer.parseInt(input);

            System.out.println("숫자 : " + changedInput);
        } catch (NumberFormatException e) {
            System.out.println("변경되지 못한 값 : " + input);
        } finally {
            System.out.println("finally 구문");
        }

    }

    public static void main(String[] args) {
        new TryCatch();
    }

}
