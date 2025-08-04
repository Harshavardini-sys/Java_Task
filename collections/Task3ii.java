package collections;

import java.util.HashMap;

public class Task3ii {
	public static void main(String[] args) {
        String str = "hello";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }
}
