package collections;

import java.util.HashMap;
import java.util.TreeMap;

public class Task3iii {
	 public static void main(String[] args) {
	        HashMap<Integer, String> unsortedMap = new HashMap<>();
	        unsortedMap.put(3, "Banana");
	        unsortedMap.put(1, "Apple");
	        unsortedMap.put(4, "Mango");
	        unsortedMap.put(2, "Grapes");

	        TreeMap<Integer, String> sortedMap = new TreeMap<>(unsortedMap);

	        System.out.println(sortedMap);
	    }
}
