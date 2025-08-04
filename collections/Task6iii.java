package collections;

import java.util.*;
import java.util.stream.*;

class Employee1 {
    String name;
    String department;

    Employee1(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class Task6iii {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
            new Employee1("Alice", "HR"),
            new Employee1("Bob", "IT"),
            new Employee1("Carol", "HR"),
            new Employee1("David", "IT"),
            new Employee1("Eve", "Sales")
        );

        Map<String, List<Employee1>> groupedByDepartment = employees.stream()
            .collect(Collectors.groupingBy(e -> e.department));

        System.out.println(groupedByDepartment);
    }
}

