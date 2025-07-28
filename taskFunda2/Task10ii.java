package taskFunda2;

import java.util.Scanner;

public class Task10ii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[3][3];
		int len = a.length;
		System.out.println("Enter array elements");
		for(int i =0 ; i < len ; i++) {
			for(int j = 0 ; j< len ; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix of entered elements");
		for(int i =0 ; i < len ; i++) {
			for(int j = 0 ; j< len ; j++) {
				System.out.print(a[i][j] + " " );
			}
			System.out.println(" ");
		}
		System.out.println("transpose of matrix");
		for(int i =0 ; i < len ; i++) {
			for(int j = 0 ; j< len ; j++) {
				System.out.print(a[j][i] + " " );
			}
			System.out.println(" ");
		}
		
		
		
	}

}
