package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2941 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 'c') {

                if (i + 1 < input.length()) {
                    if (input.charAt(i + 1) == '=') {
                        i++;
                        count++;
                        continue;
                    } else if (input.charAt(i + 1) == '-') {
                        i++;
                        count++;
                        continue;
                    }
                }

            } else if (input.charAt(i) == 'd') {

                if (i + 2 < input.length()) {
                    if (input.charAt(i + 1) == 'z' && input.charAt(i + 2) == '=') {
                        i += 2;
                        count++;
                        continue;
                    }
                }

                if (i + 1 < input.length()) {
                    if (input.charAt(i + 1) == '-') {
                        i++;
                        count++;
                        continue;
                    }
                }


            } else if (input.charAt(i) == 'l') {

                if (i + 1 < input.length()) {
                    if (input.charAt(i + 1) == 'j') {
                        i++;
                        count++;
                        continue;
                    }
                }


            } else if (input.charAt(i) == 'n') {

                if (i + 1 < input.length()) {
                    if (input.charAt(i + 1) == 'j') {
                        i++;
                        count++;
                        continue;
                    }
                }

            } else if (input.charAt(i) == 's') {

                if (i + 1 < input.length()) {
                    if (input.charAt(i + 1) == '=') {
                        i++;
                        count++;
                        continue;
                    }
                }

            } else if (input.charAt(i) == 'z') {

                if (i + 1 < input.length()) {
                    if (input.charAt(i + 1) == '=') {
                        i++;
                        count++;
                        continue;
                    }
                }

            }
            count++;

        }

        System.out.println(count);

    }

}
