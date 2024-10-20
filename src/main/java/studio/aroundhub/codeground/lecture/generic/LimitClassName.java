package studio.aroundhub.codeground.lecture.generic;

public class LimitClassName<E extends Number> {

  private E element;

  public E get() {
    return element;
  }

  public void set(E element) {
    this.element = element;
  }
}
