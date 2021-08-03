package lecture.baekjoon;

import java.util.Scanner;

public class Main2775 {

    static int Answer;

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {

            int k = sc.nextInt();
            int n = sc.nextInt();

            if (k == 1 && n == 1) {
                Answer = 1;
            } else {
                int[][] arr = new int[k + 1][n + 1];

                for (int i = 1; i < arr[0].length; i++) {
                    arr[0][i] = i;
                }

                for (int i = 1; i < k + 1; i++) {
                    for (int j = 1; j < n + 1; j++) {
                        int sum = 0;
                        for (int z = 1; z <= j; z++) {
                            sum += arr[i - 1][z];
                        }
                        arr[i][j] = sum;

                    }

                }

                Answer = arr[k][n];
            }

            //System.out.println("#testcase" + (test_case + 1));
            System.out.println(Answer);
        }
    }

}
