package collections;

import java.util.*;

class Student3 {
    String name;
    int score;

    Student3(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name + " - " + score;
    }
}

public class Task5v {
    public static void main(String[] args) {
        List<Student3> list = new ArrayList<>();
        list.add(new Student3("Amit", 88));
        list.add(new Student3("Bina", 95));
        list.add(new Student3("Charan", 72));
        list.add(new Student3("Divya", 91));
        list.add(new Student3("Esha", 85));

        PriorityQueue<Student3> pq = new PriorityQueue<>(
            (a, b) -> b.score - a.score
        );

        pq.addAll(list);

        for (int i = 0; i < 3 && !pq.isEmpty(); i++) {
            System.out.println(pq.poll());
        }
    }
}
