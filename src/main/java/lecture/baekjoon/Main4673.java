package lecture.baekjoon;

public class Main4673 {

    static int[] array = new int[10001];

    public static void main(String[] args) {

        for (int i = 1; i < array.length; i++) {
            if (array[i] != -1) {
                cal(i);
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] != -1) {
                System.out.println(i);
            }
        }
    }

    // 이 부분의 로직은 String 배열을 활용하는 방법 말고도 나누기와 나머지로도 처리 가능함
    private static void cal(int n) {
        String[] split = Integer.toString(n).split("");

        int sum = n;
        for (String s : split) {
            sum += Integer.parseInt(s);
        }
        if (sum <= 10000) {
            array[sum] = -1;
            cal(sum);
        }
    }
}
