package studio.aroundhub.codeground.lecture.eratosthenes;

public class SieveOfEratosthenes {

  public static void main(String[] args) {

    // 구하고자 하는 수의 범위
    int N = 50;

    // 소수인지 체크하기 위한 배열
    boolean primeNumbers[] = new boolean[N + 1];

    // 범위에 지정되지 않는 기본 소수 체크
    primeNumbers[0] = true;
    primeNumbers[1] = true;

    // 2부터 소수 체크
    for (int i = 2; i < Math.sqrt(primeNumbers.length); i++) {
      // 해당 인덱스의 수가 소수라면
      if (!primeNumbers[i]) {

        // 해당 인덱스의 배수를 체크하여 소수가 아니라고 표시
        for (int j = i * i; j <= N; j += i) {
          // 여기서 초기 값을 i*i로 잡을 수 있는 이유는 i*i 이하의 값은 이미 이전 작업에서 처리되었기 때문
          primeNumbers[j] = true;
        }
      }
    }

    for (int i = 0; i < primeNumbers.length; i++) {
      if (!primeNumbers[i]) {
        System.out.println(i);
      }
    }
  }
}
