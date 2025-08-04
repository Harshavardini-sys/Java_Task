package collections;

import java.util.HashMap;
import java.util.Map;

public class Task3i {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Amit");
        students.put(102, "Bina");
        students.put(103, "Charan");
        students.put(104, "Divya");
        students.put(105, "Esha");
        students.remove(103);
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
