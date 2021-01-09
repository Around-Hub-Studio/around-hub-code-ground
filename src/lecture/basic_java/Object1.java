package lecture.basic_java;

public class Object1 {

    private String name;

    public Object1() {
        name = "홍길동";
    }

    public Object1(String a){
        name = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String a){
        name = a;
    }

    public static void main(String[] args){
        Object1 a = new Object1(); // name = "홍길동"
        String name = a.name; // 좋지 않은 방법
        String name2 = a.getName(); // 옳은 방법

        System.out.println(name);
        System.out.println(name2);

        Object1 b = new Object1();
        b.setName("김보라");
        String bName = b.getName();
        System.out.println(bName);

        System.out.println(name);
        System.out.println(name2);

        Object1 c = new Object1("김땡땡");
        System.out.println(c.getName());
    }

}
