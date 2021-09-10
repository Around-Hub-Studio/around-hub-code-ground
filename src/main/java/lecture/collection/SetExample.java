package lecture.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    /**
     * HashSet : 데이터를 중복 저장할 수 없고 순서 보장x
     * TreeSet : 오름차순으로 데이터를 정렬하여 저장
     * LinkedHashSet : 입력된 순서대로 데이터를 관리
     */

    public static void main(String[] args){

        String a = "해시코드 체크";
        String b = "해시코드 체크";

        //String 클래스는 내부 hashCode 및 equals 메소드에 의해 동일한 문자열의 경우 같은 객체로 판단됨
        System.out.println(a.hashCode() + " " + b.hashCode());

        System.out.println("-------------------------------↓↓↓ HashSet ↓↓↓--------------------------");

        Set<String> hashSet = new HashSet<>();

        hashSet.add("2");
        hashSet.add("1");
        hashSet.add("3");
        hashSet.add("B");
        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("b");
        hashSet.add("a");
        hashSet.add("c");
        hashSet.add("나얼");
        hashSet.add("김범수");
        hashSet.add("플래처");

        /*
         * 중복 데이터를 체크하기 위해 내부 로직으로 검증함
         *   (1) hashCode() 메소드를 호출하여 반환된 해쉬값으로 범위 결정
         *   (2) 범위 내 요소들을 equals() 메소드로 비교
         */
        System.out.println(hashSet.add("중복데이터"));
        System.out.println(hashSet.add("중복데이터"));

        for(String input : hashSet){
            System.out.println(input);
        }

        System.out.println("hashSet Size : " + hashSet.size());

        System.out.println("-------------------------------↑↑↑ HashSet ↑↑↑--------------------------");
        System.out.println("-------------------------------↓↓↓ TreeSet ↓↓↓--------------------------");

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("2");
        treeSet.add("1");
        treeSet.add("3");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("b");
        treeSet.add("a");
        treeSet.add("c");
        treeSet.add("나얼");
        treeSet.add("김범수");
        treeSet.add("플래처");

        System.out.println(treeSet.add("중복데이터"));
        System.out.println(treeSet.add("중복데이터"));

        for(String input : treeSet){
            System.out.println(input);
        }

        System.out.println("-------------------------------↑↑↑ TreeSet ↑↑↑--------------------------");

    }

}
