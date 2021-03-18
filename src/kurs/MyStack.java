package kurs;

import java.util.LinkedList;

public class MyStack {
    private final LinkedList<Person> list = new LinkedList<>();

    public void push(Person p) {
        list.addFirst(p);
    }

    public Person peek() {
        return list.getFirst();
    }

    public Person pop() {
        Person p = peek();
        list.removeFirst();
        return p;
    }

    public boolean isEmpty() {
        return (list.isEmpty());
    }

    public int size() {
        return list.size();
    }

}
