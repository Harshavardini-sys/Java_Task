package wrapperClassTasks;

import java.util.ArrayList;
import java.util.Collections;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(70);
		al.add(30);
		al.add(50);
		al.add(80);
		al.add(60);
		
		Collections.sort(al);
		
		for(int i =0 ; i< al.size(); i++) {
			if(al.get(i) < 35)
				al.remove(i);
		}
		
		int max = al.get(0);
		
		int min = al.get(al.size()-1);
		
		System.out.println(max);
		System.out.println(min);
		
		int avg = max + min / al.size(); 
				
		System.out.println(avg);
		
	}

}
