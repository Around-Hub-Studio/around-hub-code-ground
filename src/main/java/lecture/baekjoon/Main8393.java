package lecture.baekjoon;

import java.util.Scanner;

public class Main8393 {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 0;
        for(int i = 1 ; i<a+1;i++){
            b += i;
        }

        System.out.println(b);
    }

}
