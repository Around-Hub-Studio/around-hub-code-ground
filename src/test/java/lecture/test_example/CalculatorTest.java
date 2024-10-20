package lecture.test_example;

import org.junit.Test;

import studio.aroundhub.codeground.lecture.test_example.Calculator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
  private Calculator calculator = new Calculator();

  @Test
  public void addTest() {
    int actual = calculator.add(1, 2);
    int expected = 3;

    assertThat(actual, is(expected));
  }

  @Test
  public void multipleTest() {
    int actual = calculator.multiple(1, 2);
    int expected = 2;

    assertThat(actual, is(expected));
  }
}
