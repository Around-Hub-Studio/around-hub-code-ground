package studio.aroundhub.codeground.lecture.middle_java.encapsulation;

/**
 * 캡슐화 예시코드
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class School {
    public static void main(String[] args){
        Student student = new Student();
        student.setName("홍길동");
        student.setAge(14);

        System.out.println("이름 : " + student.getName());
        System.out.println("나이 : " + student.getAge());
    }
}
