package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2920 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        String ans = "";
        for (int i = 0; i < 7; i++) {
            int temp = sc.nextInt();
            if (temp - input == 1) {
                if (ans.equals("")) {
                    ans = "ascending";
                    input = temp;
                } else {
                    if (!ans.equals("ascending")) {
                        System.out.println("mixed");
                        return;
                    }else{
                        input = temp;
                    }
                }
            } else if (temp - input == -1) {
                if (ans.equals("")) {
                    ans = "descending";
                    input = temp;
                } else {
                    if (!ans.equals("descending")) {
                        System.out.println("mixed");
                        return;
                    }else{
                        input = temp;
                    }
                }
            } else{
                System.out.println("mixed");
                return;
            }
        }

        System.out.println(ans);

    }

}
