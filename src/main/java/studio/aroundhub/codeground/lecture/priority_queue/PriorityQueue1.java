package studio.aroundhub.codeground.lecture.priority_queue;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Priority Queue Code
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class PriorityQueue1 {

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

  public static void main(String[] args) {

    // 우선순위 큐의 선언

    PriorityQueue<Person> priorityQueue = new PriorityQueue<>();

    PriorityQueue<Person> reversePriorityQueue = new PriorityQueue<>(Collections.reverseOrder());

    // 우선순위 큐의 값 추가
    priorityQueue.add(new Person("김민수", 25));
    priorityQueue.add(new Person("이민아", 30));
    priorityQueue.add(new Person("홍길동", 27));

    // 우선순위 큐의 값 제거
    System.out.println(
        "이름 : " + priorityQueue.peek().getName() + ", 나이 : " + priorityQueue.poll().getAge());
    System.out.println(
        "이름 : " + priorityQueue.peek().getName() + ", 나이 : " + priorityQueue.poll().getAge());
    System.out.println(
        "이름 : " + priorityQueue.peek().getName() + ", 나이 : " + priorityQueue.poll().getAge());
  }
}
