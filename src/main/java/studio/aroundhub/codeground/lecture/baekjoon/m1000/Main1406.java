package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main1406 {

  public Main1406() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    Stack<Character> left = new Stack<>();
    Stack<Character> right = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      left.push(s.charAt(i));
    }

    int commandLine = Integer.parseInt(br.readLine());
    for (int i = 0; i < commandLine; i++) {
      String[] line = br.readLine().split(" ");
      char command = line[0].charAt(0);
      if (command == 'L') {
        if (!left.empty()) {
          right.push(left.pop());
        }
      } else if (command == 'D') {
        if (!right.empty()) {
          left.push(right.pop());
        }
      } else if (command == 'B') {
        if (!left.empty()) {
          left.pop();
        }
      } else {
        left.push(line[1].charAt(0));
      }
    }
    StringBuilder stringBuilder = new StringBuilder();
    while (!left.empty()) {
      right.push(left.pop());
    }
    while (!right.empty()) {
      stringBuilder.append(right.pop());
    }
    System.out.println(stringBuilder);
  }

  public static void main(String[] args) throws IOException {
    new Main1406();
  }
}
