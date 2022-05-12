package studio.aroundhub.codeground.lecture.middle_java.overloading;

public class OverloadingConstructor {

    private int age;
    private String name;

    public OverloadingConstructor() {
        this.age = 12;
        this.name = "홍길동";
    }

    public OverloadingConstructor(int age) {
        this.age = age;
        this.name = "홍길동";
    }

    public OverloadingConstructor(String name) {
        this.age = 16;
        this.name = name;
    }

    public OverloadingConstructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void print() {
        System.out.println("이름은 " + name + ", 그리고 나이는 " + age);
    }

    public static void main(String[] args) {
        OverloadingConstructor overloadingConstructor = new OverloadingConstructor();
        overloadingConstructor.print();

        overloadingConstructor = new OverloadingConstructor(12);
        overloadingConstructor.print();

        overloadingConstructor = new OverloadingConstructor("김필구");
        overloadingConstructor.print();

        overloadingConstructor = new OverloadingConstructor(19, "김아름");
        overloadingConstructor.print();
    }

}
