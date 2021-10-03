package lecture.baekjoon.m1000;

import java.util.*;

public class Main1764 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            hashMap.put(sc.next(), 1);
        }

        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String input = sc.next();
            if (hashMap.containsKey(input)) {
                arr.add(input);
            }
        }

        Collections.sort(arr);

        System.out.println(arr.size());
        for (String a : arr) {
            System.out.println(a);
        }

    }

}
