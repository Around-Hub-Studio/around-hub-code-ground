package studio.aroundhub.codeground.lecture.middle_java.inheritance;

/**
 * Inheritance Code
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class 상속 {
    public static void main(String[] args) {
        System.out.println("----------inheritance.A----------");
        A a = new A();
        a.aMethod(); // 본인 메소드 사용
        // a.bMethod(); // inheritance.A(부모) 객체로 inheritance.B(자식) 메소드 접근 불가
        System.out.println("----------inheritance.A----------");
        System.out.println("----------inheritance.B----------");
        B b = new B();
        b.aMethod(); // 부모 메소드 사용
        b.bMethod(); // 본인 메소드 사용
        // b.cMethod(); // inheritance.B(부모) 객체로 inheritance.C(자식) 메소드 접근 불가
        System.out.println("----------inheritance.B----------");
        System.out.println("----------inheritance.C----------");
        C c = new C();
        c.aMethod(); // 조부모 메소드 사용
        c.bMethod(); // 부모 메소드 사용
        c.cMethod(); // 본인 메소드 사용
        System.out.println("----------inheritance.C----------");
    }
}

class A {
    String aField = "클래스 inheritance.A 필드";
    public void aMethod() {
        System.out.println(aField);
        // System.out.println("inheritance.A : "+ bField); // 컴파일 에러(자식 필드 사용 불가)
    }
}

class B extends A {
    String bField = "클래스 inheritance.B 필드";
    public void bMethod() {
        System.out.println(aField); // 부모 클래스 필드 사용
        System.out.println(bField); // 본인 클래스 필드 사용
        // System.out.println("inheritance.B : "+cField); // 컴파일 에러(자식 필드 사용 불가)
    }
}

class C extends B {
    String cField = "클래스 inheritance.C 필드";
    public void cMethod() {
        System.out.println(aField); // 조부모 클래스 필드 사용
        System.out.println(bField); // 부모 클래스 필드 사용
        System.out.println(cField); // 본인 클래스 필드 사용
    }
}

