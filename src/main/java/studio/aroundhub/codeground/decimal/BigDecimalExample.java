package studio.aroundhub.codeground.decimal;

import java.math.BigDecimal;

public class BigDecimalExample {

  public static void main(String[] args) {
    BigDecimal plusBigDecimal = new BigDecimal("0");
    for (int i = 0; i < 100; i++) {
      plusBigDecimal = plusBigDecimal.add(new BigDecimal("0.1"));
    }
    BigDecimal multipleBigDecimal = new BigDecimal("10.0");

    System.out.println("plusBigDecimal : " + plusBigDecimal);
    System.out.println("multipleBigDecimal : " + multipleBigDecimal);
  }
}
