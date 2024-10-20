package studio.aroundhub.codeground.lecture.middle_java.overloading;

public class OverloadingClass {

  public OverloadingClass() {

    getName();
    getName("김동식");
    getName("김동식", 12);
  }

  public void getName() {
    System.out.println("이름 : 홍길동");
    System.out.println();
  }

  public void getName(String name) {
    System.out.println("이름 : " + name);
    System.out.println();
  }

  public void getName(String name, int age) {
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println();
  }

  public static void main(String[] args) {
    new OverloadingClass();
  }
}
