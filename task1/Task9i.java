package task1;
import java.util.Scanner;

public class Task9i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int n2 = sc.nextInt();
		System.out.println("Enter num3 : ");
		int n3 = sc.nextInt();
		int l =cf(n1, n2, n3);
		System.out.println("Largest num among 3 is :"+l);
	}
	static int cf(int x , int y , int z ) {
		if(x>y) {
			if(x>z) {
				return x;
			}
			else {
				return z;
			}
		}
		if(x<y) {
			if(y<z) {
				return z;
			}
			else {
				return y;
			}
		}
		return 0;
		
	}

}
