package taskFunda2;

import java.util.Arrays;
import java.util.Scanner;

public class Task10i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int avg;
		int sum=0;
		int len = arr.length;
		System.out.println("Enter 10 array element");
		
		for(int i = 0 ; i < len; i ++ ) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		
		avg = sum/len ;
		
		Arrays.sort(arr);
		System.out.println(arr[len -1] + " is the maximum of array");
		System.out.println(arr[0] + " is the minimum of an array");
		System.out.println(avg + " is the average of an array");
	
	}
	
}

