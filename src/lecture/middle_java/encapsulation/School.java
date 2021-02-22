package lecture.middle_java.encapsulation;

public class School {
    public static void main(String[] args){
        Student student = new Student();
        student.setName("홍길동");
        student.setAge(14);

        System.out.println("이름 : " + student.getName());
        System.out.println("나이 : " + student.getAge());
    }
}
