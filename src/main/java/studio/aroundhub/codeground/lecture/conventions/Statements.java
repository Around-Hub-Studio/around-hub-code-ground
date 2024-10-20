package studio.aroundhub.codeground.lecture.conventions;

public class Statements {

  public Statements() {

    /* 각 줄에는 최대 하나의 명령문으로 구성되어야 함 */
    int a = 1;
    a++; // 옳은 방법
    a--; // 옳은 방법
    a++;
    a--; // 옳지 않은 방법
  }

  // return 구문은 반환 값을 명확하게 만들지 않는 한 괄호 사용은 지양함
  public void returnMethod1() {
    return;
  }

  public int returnMethod2() {
    int[] arr = new int[4];
    return arr.length;
  }

  public int returnMethod3() {
    int[] arr = new int[4];
    return (arr.length == 4 ? arr.length : 4);
  }
}
