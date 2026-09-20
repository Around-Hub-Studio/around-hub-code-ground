package studio.aroundhub.codeground.lecture.chatgpt;

import java.util.*;

/*
문제 7 — 상품 번호 찾기 (이분 탐색)

창고에 있는 상품 번호 N개와 조회할 상품 번호 M개가 주어집니다.
각 조회 번호가 창고에 존재하는지 확인하세요.
창고의 상품 번호는 정렬되어 있지 않을 수 있습니다.
정렬 후 이분 탐색을 사용하는 방식으로 연습해 보세요.

입력
첫째 줄에 N이 주어집니다.
둘째 줄에 창고의 상품 번호 N개가 주어집니다.
셋째 줄에 M이 주어집니다.
넷째 줄에 조회할 상품 번호 M개가 주어집니다.

제한
1 ≤ N, M ≤ 100,000
1 ≤ 상품 번호 ≤ 1,000,000,000
창고와 조회 목록 모두 같은 번호가 여러 번 등장할 수 있습니다.

출력
조회 순서대로, 존재하면 1을, 존재하지 않으면 0을 한 줄에 하나씩 출력합니다.

예제 1
입력
5
8 3 5 3 10
4
3 4 10 1

출력
1
0
1
0

예제 2
입력
1
7
2
7 8

출력
1
0
 */
public class Practice07BinarySearch {

    static List<Integer> list = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }

        Collections.sort(list);

        for (int i : list2) {
            int result = binarySearch(i, 0, list.size() - 1);
            System.out.println(result);
        }

    }

    static int binarySearch(int key, int low, int high) {
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;

            if (key == list.get(mid)) {
                return 1;
            } else if (key < list.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }
}

