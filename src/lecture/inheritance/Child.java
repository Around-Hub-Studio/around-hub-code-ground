package lecture.inheritance;

public class Child extends Parent {

    public Child() {
        System.out.println("Child Constructor");
    }

    @Override
    public void printName() {
        System.out.println("Child Print");
        super.printName();
    }
}
