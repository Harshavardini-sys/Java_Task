package wrapperClassTasks;

import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> l = new ArrayList<Double>();
		l.add(5.0);
		l.add(4.0);
		l.add(5.0);
		l.add(7.0);
		l.add(9.0);
		
		double sum =0;
		double avg;
		
		Double Avg;
		
		for(int i =0 ; i< 5 ; i++) {
			sum  = sum + l.get(i);
		}
		
		avg = sum/l.size();
		
		Avg = avg;
		
		System.out.println("Average of list is : " + Avg);
		
	}

}
