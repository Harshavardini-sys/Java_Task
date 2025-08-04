package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Task1ii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(90);
		al.add(60);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		Collections.sort(al, Collections.reverseOrder());
		
		System.out.println(al);
	}

}
