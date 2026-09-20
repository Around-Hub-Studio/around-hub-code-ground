package studio.aroundhub.codeground.lecture.chatgpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
문제 6 — 달리기 순위표 (정렬)

N명의 참가자 번호와 달리기 기록이 주어집니다.
기록이 작은 참가자부터 순위를 매기세요.
기록이 같으면 참가자 번호가 작은 사람이 먼저입니다.

입력
첫째 줄에 참가자 수 N이 주어집니다.
다음 N개의 줄에 참가자 번호와 기록이 공백으로 구분되어 주어집니다.

제한
1 ≤ N ≤ 100,000
1 ≤ 참가자 번호, 기록 ≤ 1,000,000
참가자 번호는 모두 다릅니다.

출력
순위 순서대로 참가자 번호를 한 줄에 하나씩 출력합니다.

예제 1
입력
4
3 15
1 12
4 12
2 20

출력
1
4
3
2

예제 2
입력
1
7 100

출력
7
 */
public class Practice06Sort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        Arrays.sort(arr, (a, b) -> {
            if(a[1]==b[1]) {
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });

        for(int[] o : arr) {
            System.out.println(o[0]);
        }

    }
}

