package lecture.baekjoon;

import java.util.Scanner;

public class Main1934 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();

        for (int test = 0; test < test_case; test++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = 0;
            int i = 1;
            int j = 1;
            while (true) {

                if (a * i > b * j) {
                    j++;
                    continue;
                } else if (a * i < b * j) {
                    i++;
                    continue;
                } else {
                    c = a * i;
                    break;
                }
            }
            System.out.println(c);
        }

    }

}
