package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main5543 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int burgerMin = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int input = sc.nextInt();
            if (burgerMin > input) {
                burgerMin = input;
            }
        }

        int drinkMin = Integer.MAX_VALUE;
        for (int i = 0; i < 2; i++) {
            int input = sc.nextInt();
            if (drinkMin > input) {
                drinkMin = input;
            }
        }

        System.out.println(burgerMin + drinkMin - 50);

    }

}
