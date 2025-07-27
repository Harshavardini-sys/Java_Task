package Exceptions;

import java.util.Scanner;

public class Task5iv {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]	= {1,2,3,4,5};
		int d;
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		int index=sc.nextInt();
		try {
			d=a/b;
			System.out.println(d);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
			
			
		}
		try {
			System.out.println(A[index]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Program ended ");
				}

}
