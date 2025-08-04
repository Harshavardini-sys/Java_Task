package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4i {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Avocado");
        list.add("Mango");
        list.add("Apricot");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.startsWith("A")) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}
