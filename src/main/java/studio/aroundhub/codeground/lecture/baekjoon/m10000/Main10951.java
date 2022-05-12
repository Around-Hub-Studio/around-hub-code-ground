package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main10951 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                int a = sc.nextInt();
                int b = sc.nextInt();

                System.out.println(a + b);
            } catch (NoSuchElementException e) {
                break;
            }
        }
    }
}
