package taskFunda2;

import java.util.Scanner;

public class Task9iii {
	public static void main(String[] args) {
		int count =0 ; 
		int n = 1000;
		for(int i = 1; i < n ; i++ ) {
			int c =0; 
			for(int j = 1 ; j<= i ; j ++) {
				if(i % j == 0 ) {
					c++;
				}
			}
			if(c == 2) {
				System.out.println(i);
				count++;
			}
			if(count == 20) {
				break;
			}
		
		
		}
}
}
