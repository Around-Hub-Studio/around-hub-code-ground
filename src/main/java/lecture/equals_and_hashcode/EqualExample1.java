package lecture.equals_and_hashcode;

public class EqualExample1 {

    public static void main(String[] args){

        Integer a = new Integer(100);
        Integer b = a;
        Integer c = new Integer(100);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("-------------");
        // 동일성 .. 참조변수(주소값) 비교
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==b);
        System.out.println("-------------");
        // 동등성 .. 객체의 값 비교
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(b));

    }

}
