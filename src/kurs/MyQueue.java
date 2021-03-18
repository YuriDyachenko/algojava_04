package kurs;

import java.util.LinkedList;

public class MyQueue {
    private final LinkedList<Person> list = new LinkedList<>();

    public void add(Person p) {
        list.addLast(p);
    }

    public void offer(Person p) {
        add(p);
    }

    public Person peek() {
        return list.getFirst();
    }

    public Person element() {
        return peek();
    }

    public Person poll() {
        Person p = peek();
        list.removeFirst();
        return p;
    }

    public Person remove() {
        return poll();
    }

    public boolean isEmpty() {
        return (list.isEmpty());
    }

    public int size() {
        return list.size();
    }

}
