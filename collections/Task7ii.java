package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task7ii {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "Java", "C++", "Java");

        int count = Collections.frequency(list, "Java");

        System.out.println("Java appears: " + count + " times");
    }
}
