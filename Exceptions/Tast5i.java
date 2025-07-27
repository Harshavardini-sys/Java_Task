package Exceptions;

import java.util.Scanner;

public class Tast5i {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		try {
		int c=100/n;
		System.out.println(c);
		}
		catch (Exception e){
			System.out.println("Dividing with Zero Gives "+e);
			
		}
		System.out.println("Program Ended Successfully");
		
		

	}

}
