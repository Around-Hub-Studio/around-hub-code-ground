package lecture.collection;

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {

        System.out.println("-------------------------------↓↓↓ Queue ↓↓↓--------------------------");

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(3);
        queue.offer(2);
        queue.offer(7);
        System.out.println(queue.offer(5));

        System.out.println("--------------------------");

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.remove());

        System.out.println("--------------------------");

        Iterator<Integer> iterator = queue.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("-------------------------------↑↑↑ Queue ↑↑↑--------------------------");
        System.out.println("-------------------------------↓↓↓ PriorityQueue ↓↓↓--------------------------");

        PriorityQueue<Person> priorityQueue = new PriorityQueue<>();

        //PriorityQueue<Person> reversePriorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        // 우선순위 큐의 값 추가
        priorityQueue.add(new Person("김민수", 25));
        priorityQueue.add(new Person("황진이", 30));
        priorityQueue.add(new Person("이민아", 30));
        priorityQueue.add(new Person("홍길동", 27));

        // 우선순위 큐의 값 제거
        System.out.println("이름 : " + priorityQueue.peek().getName() + ", 나이 : " + priorityQueue.poll().getAge());
        System.out.println("이름 : " + priorityQueue.peek().getName() + ", 나이 : " + priorityQueue.poll().getAge());
        System.out.println("이름 : " + priorityQueue.peek().getName() + ", 나이 : " + priorityQueue.poll().getAge());
        System.out.println("이름 : " + priorityQueue.peek().getName() + ", 나이 : " + priorityQueue.poll().getAge());

        System.out.println("-------------------------------↑↑↑ PriorityQueue ↑↑↑--------------------------");
    }

    static class Person implements Comparable<Person> {
        private String name;
        private int age;

        Person(String name, int time) {
            this.name = name;
            this.age = time;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(Person person) {
            if (this.age == person.age) {
                return this.name.compareTo(person.name);
            }
            return this.age - person.age;
        }
    }

}
