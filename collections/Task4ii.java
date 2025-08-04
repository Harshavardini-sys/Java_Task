package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task4ii {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            System.out.println("Forward: " + it.next());
        }

        while (it.hasPrevious()) {
            System.out.println("Backward: " + it.previous());
        }
    }
}
