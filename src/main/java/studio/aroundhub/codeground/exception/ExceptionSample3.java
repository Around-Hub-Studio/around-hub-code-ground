package studio.aroundhub.codeground.exception;

public class ExceptionSample3 {

  public ExceptionSample3() {
    try {
      getException();
    } catch (RuntimeException e) {
      throw new CustomException(1);
    }
  }

  private int getException() {
    throw new RuntimeException();
  }

  public static void main(String[] args) {
    try {
      new ExceptionSample3();
    } catch (CustomException e) {
      System.out.println("exception id : " + e.getId());
    }
  }
}
