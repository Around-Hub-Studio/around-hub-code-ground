package studio.aroundhub.codeground.lecture.exception;

public class exception1 {

  public static void main(String[] args) {
    int a = 1;
    String b = "a";

    try {
      System.out.println(a + Integer.parseInt(b));
    } catch (NumberFormatException e) {
      throw new NumberFormatException("숫자가 아닙니다.");
    }
  }
}
