package lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main10809 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int[] array = new int[26];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }

        for (int i = 0; i < input.length(); i++) {

            int a = input.charAt(i) - 97;

            if (array[a] == -1) {
                array[a] = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }

        }

    }
}
