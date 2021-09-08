package lecture.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        /*
        1 1
        2 3
        3 4
        9 8
        5 2
        0 0
         */

        while(true){

            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a==0 && b==0){
                break;
            }

            sb.append(a+b).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
