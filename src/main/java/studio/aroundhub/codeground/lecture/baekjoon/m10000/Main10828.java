package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int last = 0;
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.contains("push")) {

                String[] split = input.split(" ");
                stack.add(Integer.parseInt(split[1]));
                last = Integer.parseInt(split[1]);

            } else if (input.contains("pop")) {
                try {
                    int a = stack.pop();
                    sb.append(a).append("\n");
                } catch (EmptyStackException e) {
                    sb.append(-1).append("\n");
                }

            } else if (input.contains("size")) {

                sb.append(stack.size()).append("\n");

            } else if (input.contains("empty")) {

                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }

            } else if (input.contains("top")) {

                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }

            }
        }

        System.out.println(sb);

    }

}
