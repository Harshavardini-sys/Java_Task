package wrapperClassTasks;

import java.util.Optional;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double num = null;
		
		try {
			double num1 = num;
			System.out.println(num1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		double num2 = (num == null) ? 0.0 : num;
		
		System.out.println("default value startegy " + num2);
		
		double num3 = Optional.ofNullable(num).orElse(0.0);
		
		System.out.println("Optional valuse startegy"+num3);
	}

}
