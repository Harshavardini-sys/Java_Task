package taskFunda2;
import java.util.Scanner;

public class Task8i {
	boolean bo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter num 2 : ");
		int n2 = sc.nextInt();
		//add(n1,n2);
		System.out.println("1.addition 2.substarction 3.multiplication 4.division");
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.println(n1 + n2);
		}
		else if(n == 2) {
			System.out.println(n1 - n2);
		}
		else if(n == 3) {
			System.out.println(n1 * n2);
		}
		else if(n == 4) {
			System.out.println(n1 / n2);
		}
		else {
			System.out.println("Enter or select between between 1 to 4");
		}
		
	}

}
