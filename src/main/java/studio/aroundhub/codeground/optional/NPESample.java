package studio.aroundhub.codeground.optional;

import java.util.Scanner;

public class NPESample {

  private Scanner scanner;

  public NPESample() {
    try {
      int a = scanner.nextInt();
    } catch (NullPointerException e) {
      System.out.println("NPE 발생");
    }
  }

  public static void main(String[] args) {
    new NPESample();
  }
}
