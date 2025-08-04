package collections;

import java.util.*;
import java.util.stream.*;

public class Task6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "JavaScript", "C++", "Julia", "Ruby");

        List<String> result = list.stream()
                                  .filter(s -> s.startsWith("J"))
                                  .collect(Collectors.toList());

        System.out.println(result);
    }
}

