package kurs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //объект для фиксации и вывода прошедшего времени
        Duration duration = new Duration();
        //задание 4.1
        testStack(duration);
        //задание 4.2
        testQueue(duration);
        //задание 4.3
        testDeque(duration);
        //задание 4.4
        testPriorityQueue(duration);
        //задание 4.5
        System.out.println("- - - - - Задание 4.5 - - - - -");
        testMyStack(duration);
        testMyQueue(duration);
    }

    private static void testMyQueue(Duration duration) {
        System.out.println(" базовые методы MyQueue:");
        MyQueue personQueue = new MyQueue();
        personQueue.add(new Person("Николай", 45));
        Person temp = new Person("Сергей", 55);
        duration.fix();
        personQueue.add(temp);
        duration.outAndFix("  add " + temp);
        duration.outAndFix("  peek = " + personQueue.peek());
        duration.outAndFix("  element = " + personQueue.element());
        duration.outAndFix("  poll = " + personQueue.poll());
        temp = new Person("Иван", 33);
        duration.fix();
        personQueue.offer(temp);
        duration.outAndFix("  offer " + temp);
        duration.outAndFix("  remove = " + personQueue.remove());
        System.out.println(" вспомогательные методы:");
        duration.outAndFix("  isEmpty = " + personQueue.isEmpty());
        duration.outAndFix("  size = " + personQueue.size());
    }

    private static void testMyStack(Duration duration) {
        System.out.println(" базовые методы MyStack:");
        MyStack personStack = new MyStack();
        personStack.push(new Person("Иван", 33));
        personStack.push(new Person("Николай", 45));
        Person temp = new Person("Сергей", 55);
        duration.fix();
        personStack.push(temp);
        duration.outAndFix("  push " + temp);
        duration.outAndFix("  peek = " + personStack.peek());
        duration.outAndFix("  pop = " + personStack.pop());
        System.out.println(" вспомогательные методы:");
        duration.outAndFix("  isEmpty = " + personStack.isEmpty());
        duration.outAndFix("  size = " + personStack.size());
    }

    private static void testPriorityQueue(Duration duration) {
        System.out.println("- - - - - Задание 4.4 - - - - -");
        System.out.println(" базовые методы PriorityQueue:");
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(100);
        queue.add(30);
        queue.add(10);
        Integer temp = 77;
        duration.fix();
        queue.add(temp);
        duration.outAndFix("  add " + temp);
        duration.outAndFix("  peek = " + queue.peek());
        duration.outAndFix("  element = " + queue.element());
        duration.outAndFix("  poll = " + queue.poll());
        temp = 88;
        duration.fix();
        queue.offer(temp);
        duration.outAndFix("  offer " + temp);
        duration.outAndFix("  remove = " + queue.remove());
    }
    
    private static void testDeque(Duration duration) {
        System.out.println("- - - - - Задание 4.3 - - - - -");
        System.out.println(" базовые методы Deque (на ArrayDeque):");
        Deque<Person> personDeque = new ArrayDeque<>();
        Person personSerg = new Person("Сергей", 55);
        Person personNick = new Person("Николай", 45);
        Person personIvan = new Person("Иван", 33);
        duration.fix();
        personDeque.add(personIvan);
        duration.outAndFix("  add " + personIvan);
        personDeque.addFirst(personNick);
        duration.outAndFix("  addFirst " + personNick);
        personDeque.addLast(personSerg);
        duration.outAndFix("  addLast " + personSerg);
        duration.outAndFix("  peek = " + personDeque.peek());
        duration.outAndFix("  peekFirst = " + personDeque.peekFirst());
        duration.outAndFix("  peekLast = " + personDeque.peekLast());
        duration.outAndFix("  poll = " + personDeque.poll());
        duration.outAndFix("  pollFirst = " + personDeque.pollFirst());
        duration.outAndFix("  pollLast = " + personDeque.pollLast());
        System.out.println(" вспомогательные методы:");
        duration.outAndFix("  isEmpty = " + personDeque.isEmpty());
        duration.outAndFix("  size = " + personDeque.size());
    }

    private static void testQueue(Duration duration) {
        System.out.println("- - - - - Задание 4.2 - - - - -");
        System.out.println(" базовые методы Queue (на LinkedList):");
        Queue<Person> personQueue = new LinkedList<>();
        personQueue.add(new Person("Николай", 45));
        Person temp = new Person("Сергей", 55);
        duration.fix();
        personQueue.add(temp);
        duration.outAndFix("  add " + temp);
        duration.outAndFix("  peek = " + personQueue.peek());
        duration.outAndFix("  element = " + personQueue.element());
        duration.outAndFix("  poll = " + personQueue.poll());
        temp = new Person("Иван", 33);
        duration.fix();
        personQueue.offer(temp);
        duration.outAndFix("  offer " + temp);
        duration.outAndFix("  remove = " + personQueue.remove());
        System.out.println(" вспомогательные методы:");
        duration.outAndFix("  isEmpty = " + personQueue.isEmpty());
        duration.outAndFix("  size = " + personQueue.size());
    }

    private static void testStack(Duration duration) {
        System.out.println("- - - - - Задание 4.1 - - - - -");
        System.out.println(" базовые методы Stack:");
        Stack<Person> personStack = new Stack<>();
        personStack.push(new Person("Иван", 33));
        personStack.push(new Person("Николай", 45));
        Person temp = new Person("Сергей", 55);
        duration.fix();
        personStack.push(temp);
        duration.outAndFix("  push " + temp);
        duration.outAndFix("  peek = " + personStack.peek());
        duration.outAndFix("  pop = " + personStack.pop());
        System.out.println(" вспомогательные методы:");
        duration.outAndFix("  isEmpty = " + personStack.isEmpty());
        duration.outAndFix("  size = " + personStack.size());
    }
}
