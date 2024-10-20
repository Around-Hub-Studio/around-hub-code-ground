package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main4949 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String input = br.readLine();
      if (input.charAt(0) == '.') {
        break;
      }
      check(input);
    }
  }

  public static void check(String sentence) {

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < sentence.length(); i++) {

      if (sentence.charAt(i) == '(') {
        stack.add('(');
      } else if (sentence.charAt(i) == ')') {
        try {
          if (stack.peek() == '(') {
            stack.pop();
          } else {
            System.out.println("no");
            return;
          }
        } catch (EmptyStackException e) {
          System.out.println("no");
          return;
        }

      } else if (sentence.charAt(i) == '[') {
        stack.add('[');

      } else if (sentence.charAt(i) == ']') {
        try {
          if (stack.peek() == '[') {
            stack.pop();
          } else {
            System.out.println("no");
            return;
          }
        } catch (EmptyStackException e) {
          System.out.println("no");
          return;
        }
      }
    }

    if (stack.size() == 0) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}
