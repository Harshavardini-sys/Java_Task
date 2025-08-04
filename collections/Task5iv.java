package collections;

import java.util.*;

class Student2 {
    String id;
    String name;

    Student2(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class Task5iv {
    public static void main(String[] args) {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2("S101", "Amit"));
        list.add(new Student2("S102", "Bina"));
        list.add(new Student2("S103", "Charan"));

        Map<String, Student2> map = new HashMap<>();
        for (Student2 s : list) {
            map.put(s.id, s);
        }

        for (Map.Entry<String, Student2> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

