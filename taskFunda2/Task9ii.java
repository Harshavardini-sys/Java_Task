package taskFunda2;
import java.util.Scanner;

public class Task9ii {
	boolean bo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter num 2 : ");
		int n2 = sc.nextInt();
		System.out.println("1.addition 2.substarction 3.multiplication 4.division");
		int n = sc.nextInt();
		cal(n,n1,n2);
		
		
	}
	static int add(int x , int y ) {
		int res = x+y;
		return res;
		
	}
	static int sub(int x, int y) {
		int res = x-y;
		return res;
		
	}
	static int mul(int x, int y) {
		int res = x*y;
		return res;
		
	}
	static int div(int x , int y) {
		int res = x/y;
		return res;
		
	}
	static int cal(int n , int n1, int n2) {
		
		
		switch(n){
		
		case 1 :
			System.out.println(add(n1,n2));
			break;
		case 2 :
			System.out.println(sub(n1,n2));
			break;
		case 3 :
			System.out.println(mul(n1,n2));
			break;
		case 4 :
			System.out.println(div(n1,n2));
			break;
		
		}
		
		return 0;
		
	}

}