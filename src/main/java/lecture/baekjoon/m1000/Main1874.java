package lecture.baekjoon.m1000;

import java.util.Scanner;
import java.util.Stack;

public class Main1874 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int count = 1;

        for (int i = 0; i < n; i++) {

            while (arr[i] >= count) {
                sb.append("+").append("\n");
                stack.push(count++);
            }

            if (arr[i] == stack.peek()) {
                sb.append("-").append("\n");
                stack.pop();
            } else {
                sb = new StringBuilder("NO");
                break;
            }
        }

        System.out.println(sb);


    }

}
