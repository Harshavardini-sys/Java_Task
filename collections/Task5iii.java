package collections;

import java.util.*;

class Employee {
    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String toString() {
        return name;
    }
}

public class Task5iii {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice", "HR"));
        list.add(new Employee("Bob", "IT"));
        list.add(new Employee("Carol", "HR"));
        list.add(new Employee("David", "IT"));
        list.add(new Employee("Eve", "Sales"));

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : list) {
            map.computeIfAbsent(e.dept, k -> new ArrayList<>()).add(e);
        }

        for (Map.Entry<String, List<Employee>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

