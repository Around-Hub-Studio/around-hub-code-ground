package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1157 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] array = new int[26];

    String s = sc.next();

    for (int i = 0; i < s.length(); i++) {

      if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 알파벳이 대문자인지 체크
        array[s.charAt(i) - 'A']++;

      } else { // 그 밖의 상황 (소문자)
        array[s.charAt(i) - 'a']++;
      }
    }

    int max = 0;
    char result = '?';

    for (int i = 0; i < 26; i++) {
      if (array[i] > max) {
        max = array[i];
        result = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
      } else if (array[i] == max) {
        result = '?';
      }
    }

    System.out.print(result);
  }
}
