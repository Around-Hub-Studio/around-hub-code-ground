package studio.aroundhub.codeground.record;

import java.util.Objects;

public class EqualClass {
  private final int x;
  private final String y;

  EqualClass(int x, String y) {
    this.x = x;
    this.y = y;
  }

  public int x() {
    return x;
  }

  public String y() {
    return y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EqualClass that = (EqualClass) o;
    return x == that.x && Objects.equals(y, that.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public String toString() {
    return "EqualClass{" + "x=" + x + ", y='" + y + '\'' + '}';
  }
}
