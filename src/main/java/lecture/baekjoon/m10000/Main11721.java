package lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main11721 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
