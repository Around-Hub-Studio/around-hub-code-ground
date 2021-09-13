package lecture.baekjoon.m10000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main10814 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Man[] men = new Man[N];
        for (int i = 0; i < N; i++) {
            men[i] = new Man(sc.nextInt(), sc.next());
        }

        Arrays.sort(men, new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2) {
                return o1.age - o2.age;
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(men[i].age + " " + men[i].name);
        }
    }

    public static class Man {

        int age;
        String name;

        public Man(int age, String name) {
            this.age = age;
            this.name = name;
        }

    }

}
