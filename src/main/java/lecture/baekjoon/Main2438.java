package lecture.baekjoon;

import java.util.Scanner;

public class Main2438 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i < N + 1; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
