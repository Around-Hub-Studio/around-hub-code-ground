package lecture.collection;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        System.out.println("-------------------------------↓↓↓ ArrayList ↓↓↓--------------------------");

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(400);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(600);

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        System.out.println("--------------------------");

        /*
        for(int i = 0 ; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        */

        arrayList.remove(3);

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        System.out.println("--------------------------");

        Collections.sort(arrayList); // 오름차순 정렬

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        arrayList.set(1, 500);

        System.out.println("--------------------------");

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(arrayList.size());

        System.out.println(arrayList.indexOf(500));

        System.out.println("-------------------------------↑↑↑ ArrayList ↑↑↑--------------------------");


        System.out.println("-------------------------------↓↓↓ LinkedList ↓↓↓--------------------------");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("가");
        linkedList.add("다");
        linkedList.add("나");
        linkedList.add("마");
        linkedList.add("라");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("--------------------------");

        linkedList.remove(3);

        for (String s : linkedList) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        Collections.sort(linkedList);

        for (String s : linkedList) {
            System.out.println(s);
        }

        System.out.println("-------------------------------↑↑↑ LinkedList ↑↑↑--------------------------");
        System.out.println("-------------------------------↓↓↓ Vector ↓↓↓--------------------------");

        Vector<String> vector = new Vector<>();

        System.out.println(vector.size());
        System.out.println(vector.capacity());

        System.out.println("--------------------------");

        vector.add("가");
        vector.add("다");

        System.out.println(vector.add("나"));
        System.out.println(vector.add("마"));
        System.out.println(vector.add("라"));

        System.out.println("--------------------------");

        System.out.println(vector.size());

        for (String s : vector) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        Collections.sort(vector);

        for (String s : vector) {
            System.out.println(s);
        }

        System.out.println("-------------------------------↑↑↑ Vector ↑↑↑--------------------------");
        System.out.println("-------------------------------↓↓↓ Stack ↓↓↓--------------------------");

        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.push(3);

        System.out.println(stack.add(7));
        System.out.println(stack.push(2));

        System.out.println(stack.size());

        System.out.println(stack.peek());

        System.out.println(stack.size());

        System.out.println(stack.pop());

        System.out.println(stack.size());

        System.out.println("-------------------------------↑↑↑ Stack ↑↑↑--------------------------");

    }

}
