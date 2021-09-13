package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1541 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        String[] num = input.split("-");

        int sum = 0;

        for (int i = 0; i < num.length; i++) {

            if (i == 0) {
                String[] a = num[i].split("\\+");
                for(int j = 0 ; j < a.length ;j++){
                    sum += Integer.parseInt(a[j]);
                }
            }else {

                int temp = 0;
                String[] a = num[i].split("\\+");
                for(int j = 0 ; j < a.length ;j++){
                    temp += Integer.parseInt(a[j]);
                }
                sum -= temp;

            }
        }

        System.out.println(sum);

    }

}
