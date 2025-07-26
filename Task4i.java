import java.util.Scanner;

public class Task4i {
	static int addition(int x , int y) {
		int add;
		add = x + y ;
		return add;
	}
	static int Sub(int x , int y) {
		int sub;
		sub = x - y ;
		return sub;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		int add , sub;
		System.out.println("insert 1 for add");
		System.out.println("insert 2 for sub");
		final int opt1 = sc.nextInt();
		if(opt1 == 1) {
		add = addition(num1 , num2);
		System.out.println("Addition of two numbers : " + add );
		}
		else if(opt1 == 2) {
		sub = Sub(num1 , num2);
		System.out.println("Subtraction of two numbers : " + sub);
		}
		else {
			System.out.println("invalid");	
		}
	}

}