package lecture.euclid_gcd;

/**
 * Euclid GCD(Greatest common divisor)
 * thinkGround.studio
 * YouTube : Around Hub Studio
 * @author  Flature
 */
public class EuclidGCD {

    private static int euclidGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return euclidGCD(b, a % b);
    }

    public static void main(String[] args) {
        // 전제 : a > b
        int a = 90;
        int b = 24;

        System.out.println(a + "와 " + b + "의 최대공약수 : " + euclidGCD(a, b));


        // 다른 방법
        int temp;

        while(b!=0){
            temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("위 결과와 같은지? 답 : " + a);
    }

}
