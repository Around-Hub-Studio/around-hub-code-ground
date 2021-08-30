package lecture.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            st = new StringTokenizer(line, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());


            sb.append("Case #").append(i+1).append(": ").append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");

        }
        bw.write(sb.toString());
        bw.flush();
    }
}
