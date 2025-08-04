package collections;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return this.marks - s.marks;
    }

    public String toString() {
        return name + " - " + marks;
    }
}

public class Task5i {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Amit", 75));
        list.add(new Student("Bina", 60));
        list.add(new Student("Charan", 85));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s);
        }
    }
}


