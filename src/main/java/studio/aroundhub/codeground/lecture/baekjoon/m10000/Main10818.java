package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.io.*;
import java.util.StringTokenizer;

public class Main10818 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int num = Integer.parseInt(br.readLine());

    st = new StringTokenizer(br.readLine());
    int min = 0, max = 0;
    for (int i = 0; i < num; i++) {
      int can = Integer.parseInt(st.nextToken());
      if (i == 0) {
        min = can;
        max = can;
        continue;
      }
      if (can < min) {
        min = can;
      }
      if (can > max) {
        max = can;
      }
    }

    System.out.println(min + " " + max);
  }
}
