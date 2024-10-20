package studio.aroundhub.codeground.lecture.middle_java.inheritance;

/**
 * 상속 예시코드
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class Child extends Parent {

  public Child() {
    System.out.println("Child Constructor");
  }

  @Override
  public void printName() {
    System.out.println("Child Print");
    super.printName();
  }
}
