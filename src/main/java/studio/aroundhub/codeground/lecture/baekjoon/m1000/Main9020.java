package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

/*
1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다.
예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다.
이러한 수를 골드바흐 수라고 한다.
또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다.
예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다.
10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오.
만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
 */

public class Main9020 {

  // 에라토스테네스의 체 알고리즘을 통해 소수 판별을 하기 위한 배열
  static boolean[] arr;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 최대 크기가 10000이기 때문에 아래와 같이 설정
    arr = new boolean[10001];

    // 테스트 케이스를 진행하기 전에 에라토스테네스의 체 알고리즘을 수행하여 값 도출을 미리 진행
    cal(10000);

    int t = sc.nextInt();

    for (int T = 0; T < t; T++) {

      // 짝수 값 입력
      int input = sc.nextInt();

      int half = input / 2;
      int left = half, right = half;

      // 골드바흐 파티션이 여러 개 존재하는 경우에 두 값의 차이가 작은 것을 출력하기 때문에 중간값부터 조회
      while (true) {
        if (!arr[left] && !arr[right]) {
          System.out.println(left + " " + right);
          break;
        }
        left--;
        right++;
      }
    }
  }

  // 에라토스테네스의 체
  public static void cal(int max) {
    arr[0] = true;
    arr[1] = true;

    if (max < 2) {
      return;
    }
    for (int i = 2; i < Math.sqrt(arr.length); i++) {

      if (arr[i]) {
        continue;
      }

      for (int j = i * i; j < max + 1; j = j + i) {
        arr[j] = true;
      }
    }
  }
}
