package studio.aroundhub.codeground.lecture.basic_java;

/**
 * Array Code
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class Array1 {

  public static void main(String[] args) {

    int[][] array = new int[5][5];

    array[0][0] = 1;
    array[0][1] = 2;
    array[0][2] = 3;
    array[0][3] = 4;
    array[0][4] = 5;

    int a = 0;
    while (a < 5) {
      a++;
      System.out.println(a);
    }
  }
}
