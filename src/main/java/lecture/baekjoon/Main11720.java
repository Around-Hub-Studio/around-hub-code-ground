package lecture.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Main11720 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String input = sc.next();

        int sum = 0;
        for(int i =0 ; i<N;i++){
            sum += Integer.parseInt(String.valueOf(input.charAt(i)));
        }

        System.out.println(sum);

    }

}
