package studio.aroundhub.codeground.lecture.basic_java;

/**
 * Object Code 2
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class Object2 {

    public static void main(String[] args) {

        Object1 class1222 = new Object1();

        System.out.println(class1222.getName());

        // int, double, char, boolean
        // 데이터타입 이름 = 값;
        int a = 0;
        double b;
        char c;
        boolean d;

        // 초기화

        b = 1.1;
        c = 'a'; // String -> 문자열 사용가능 -- "" 사용
        d = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        b = a; // 묵시적 변환

        System.out.println(b);

        b = 1.1;
        a = (int) b; // 명시적 변환

        System.out.println(a);

        System.out.println("=========================================");

        int aa = 1;
        int bb = 3;

        System.out.println(aa * bb);

        int cc = aa * bb;

        System.out.println(cc);

        System.out.println(aa - bb);
        cc = aa - bb;
        System.out.println(cc);

        System.out.println(aa / bb);
        System.out.println(aa % bb);

        double dd = 6.6;
        double ff = 5.5;

        System.out.println(dd / ff);
        System.out.println(dd % ff);

        System.out.println("=========================================");

        int abc = 1;
        int abd = 2;
        int bbc = 1;

        System.out.println(abc > abd);
        System.out.println(abc < abd);
        System.out.println(abc < bbc);

        System.out.println("---------------");

        System.out.println(abc <= bbc);
        System.out.println(abc >= abd);

        System.out.println("---------------");

        System.out.println(abc == bbc);
        System.out.println(abc == abd);
        System.out.println(abc != bbc);
        System.out.println(abc != abd);

        System.out.println("=========================================");

        boolean ttrue = true;
        boolean ffalse = false;

        System.out.println(ttrue && ttrue);
        System.out.println(ttrue && ffalse);

        System.out.println(ttrue || ttrue);
        System.out.println(ttrue || ffalse);

        System.out.println(ttrue ^ ttrue);
        System.out.println(ttrue ^ ffalse);
        System.out.println(ffalse ^ ffalse);

        System.out.println(!ttrue);
        System.out.println(!ffalse);

    }

}
