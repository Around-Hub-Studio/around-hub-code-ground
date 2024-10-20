package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.io.*;
import java.util.StringTokenizer;

public class Main11021 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      String line = br.readLine();
      st = new StringTokenizer(line, " ");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      int result = a + b;
      String c = "Case #" + (i + 1) + ": ";
      bw.write(c);
      bw.write(String.valueOf(result));
      bw.newLine();
    }
    bw.flush();
  }
}
