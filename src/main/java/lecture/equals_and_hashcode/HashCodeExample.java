package lecture.equals_and_hashcode;

public class HashCodeExample {

    public static void main(String[] args) {

        ExamObject1 examObject1 = new ExamObject1("김가영");
        ExamObject1 examObject2 = new ExamObject1("김준수");
        ExamObject1 examObject3 = new ExamObject1("김준수");

        System.out.println(examObject1.hashCode());
        System.out.println(examObject2.hashCode());
        System.out.println(examObject3.hashCode());

        System.out.println("-----------");

        System.out.println(examObject1.equals(examObject2));
        System.out.println(examObject1.equals(examObject3));
        System.out.println(examObject2.equals(examObject3));

        System.out.println("-----------");

        ExamObject2 examObject4 = new ExamObject2("박진수");
        ExamObject2 examObject5 = new ExamObject2("김준수");
        ExamObject2 examObject6 = new ExamObject2("김준수");

        System.out.println(examObject4.hashCode());
        System.out.println(examObject5.hashCode());
        System.out.println(examObject6.hashCode());

        System.out.println("-----------");

        System.out.println(examObject4.equals(examObject5));
        System.out.println(examObject4.equals(examObject6));
        System.out.println(examObject5.equals(examObject6));

        System.out.println("-----------");

        ExamObject3 examObject7 = new ExamObject3("박진수");
        ExamObject3 examObject8 = new ExamObject3("김준수");
        ExamObject3 examObject9 = new ExamObject3("김준수");

        System.out.println(examObject7.hashCode());
        System.out.println(examObject8.hashCode());
        System.out.println(examObject9.hashCode());

        System.out.println("-----------");

        System.out.println(examObject7.equals(examObject8));
        System.out.println(examObject7.equals(examObject9));
        System.out.println(examObject8.equals(examObject9));


    }

}
