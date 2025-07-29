package exceptions;

import java.util.Scanner;

public class Tast5iii {
	void validateAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception (" Age must be 18 or above .");
		}
		else {
			System.out.println("Age is valid : "+age);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	 int age =sc.nextInt();
	 Tast5iii obj1 = new Tast5iii();
		try {
			obj1.validateAge(age);
		}
		catch(Exception e) {
			System.out.println(e);
		}
System.out.println("Program Ended Successfully");
	}

}
