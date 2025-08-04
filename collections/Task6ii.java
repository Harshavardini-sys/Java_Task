package collections;

import java.util.*;
import java.util.stream.*;

public class Task6ii {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4, 5);

        List<Integer> squares = nums.stream()
                                    .map(n -> n * n)
                                    .collect(Collectors.toList());

        System.out.println(squares);
    }
}
