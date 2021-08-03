package lecture.baekjoon;

import java.util.Scanner;

public class Main9012 {

    public Main9012() {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            String ans = check(sc.next());
            System.out.println(ans);
        }

    }

    private String check(String line) {
        line = line.trim();
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                count += 1;
            } else {
                count -= 1;
            }
            if (count < 0) {
                return "NO";
            }
        }
        if (count == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        new Main9012();
    }

}
