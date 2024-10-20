package studio.aroundhub.codeground.lecture.basic_java;

/**
 * Multiple Table Code
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class MultiplicationTable {

  public static void main(String[] args) {

    // 1 부터 10까지의 합을 출력하기

    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    int e = 5;
    int f = 6;
    int g = 7;
    int h = 8;
    int i = 9;
    int j = 10;

    System.out.println(a + b + c + d + e + f + g + h + i + j);
    System.out.println(
        a
            + " + "
            + b
            + " + "
            + c
            + " + "
            + d
            + " + "
            + e
            + " + "
            + f
            + " + "
            + g
            + " + "
            + h
            + " + "
            + i
            + " + "
            + j
            + " = "
            + (a + b + c + d + e + f + g + h + i + j));

    int[] array = new int[10];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    array[4] = 5;
    array[5] = 6;
    array[6] = 7;
    array[7] = 8;
    array[8] = 9;
    array[9] = 10;

    System.out.println(
        array[0]
            + " + "
            + array[1]
            + " + "
            + array[2]
            + " + "
            + array[3]
            + " + "
            + array[4]
            + " + "
            + array[5]
            + " + "
            + array[6]
            + " + "
            + array[7]
            + " + "
            + array[8]
            + " + "
            + array[9]
            + " = "
            + (array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7]
                + array[8] + array[9]));

    int sum = 0;
    for (int z = 0; z < 10; z++) {
      if (z <= 8) {
        System.out.print(array[z] + " + ");
      } else {
        System.out.print(array[z]);
      }
      sum = sum + array[z];
    }
    System.out.println(" = " + sum);

    // 구구단 출력하기
    /**
     * 1 x 1 = 1    1 x 2 = 2 ...
     * .......
     * ...........................................9 x 9 = 81
     */
    int leftValue = 1;
    for (int zz = 0; zz < 9; zz++) {
      int rightValue = 1;
      for (int z = 0; z < 9; z++) {
        System.out.print(leftValue + " x " + rightValue + " = " + (leftValue * rightValue) + "\t");
        rightValue++;
        // rightValue += 1;
        // rightValue = rightValue + 1;
      }
      leftValue++;
      System.out.println();
    }
  }
}
