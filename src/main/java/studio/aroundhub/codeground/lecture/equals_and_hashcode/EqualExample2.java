package studio.aroundhub.codeground.lecture.equals_and_hashcode;

public class EqualExample2 {

    public static void main(String[] args) {

        String a = "값1";
        String b = a;
        String c = "값1";
        String d = new String("값1");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println("-------------");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());

        System.out.println("-------------");
        // 동일성 .. 참조변수(주소값) 비교
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(b == c);
        System.out.println(b == d);
        System.out.println(c == d);
        System.out.println("-------------");
        // 동등성 .. 객체의 값 비교
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(b.equals(c));
        System.out.println(b.equals(d));
        System.out.println(c.equals(d));


    }
}
