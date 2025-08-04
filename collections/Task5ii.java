package collections;

import java.util.*;

class Student1 {
    String name;
    int marks;

    Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }
}

class NameComparator implements Comparator<Student1> {
    public int compare(Student1 s1, Student1 s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Task5ii {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1("Charan", 85));
        list.add(new Student1("Amit", 75));
        list.add(new Student1("Bina", 60));

        Collections.sort(list, new NameComparator());

        for (Student1 s : list) {
            System.out.println(s);
        }
    }
}

