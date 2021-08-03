package lecture.baekjoon;

import java.util.Scanner;

public class Main2588 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();

        String bb = Integer.toString(b);
        String[] bbb = bb.split("");
        int[] bbbb = new int[bbb.length];
        for(int i = 0 ; i < bbb.length;i++){
            bbbb[i] = Integer.parseInt(bbb[i]);
        }

        System.out.println(a*bbbb[2]);
        System.out.println(a*bbbb[1]);
        System.out.println(a*bbbb[0]);
        System.out.println(a*b);

    }

}
