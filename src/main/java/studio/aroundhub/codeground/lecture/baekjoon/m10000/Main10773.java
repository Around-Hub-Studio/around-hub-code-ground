package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;
import java.util.Stack;

public class Main10773 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < K; i++) {
            int input = sc.nextInt();
            if (input == 0) {
                sum -= stack.pop();
            } else {
                sum += input;
                stack.add(input);
            }
        }

        System.out.println(sum);

    }

}
