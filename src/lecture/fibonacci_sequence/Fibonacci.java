package lecture.fibonacci_sequence;

public class Fibonacci {

    public Fibonacci() {
        int result = recursion(20);

        System.out.println(result);

        repeat(20);
        dp(20);
    }

    private int recursion(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return recursion(n - 1) + recursion(n - 2);
        }
    }

    private void repeat(int n) {
        int a = 1, b = 1, c = 1;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }

    private void dp(int n) {
        int[] dpArray = new int[n + 1];
        dpArray[1] = 1;
        dpArray[2] = 1;
        for (int i = 3; i <= n; i++) {
            dpArray[i] = dpArray[i - 1] + dpArray[i - 2];
        }
        System.out.println(dpArray[n]);
        System.out.println(dpArray[n - 15]);
    }

    public static void main(String[] args) {
        new Fibonacci();
    }
}
