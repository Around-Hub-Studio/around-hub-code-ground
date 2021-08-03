package lecture.baekjoon;

import java.util.Scanner;

public class Main2441 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = a; i > 0; i--) {
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
