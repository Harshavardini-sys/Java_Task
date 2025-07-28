package taskFunda2;
import java.util.Scanner;

public class Task10iii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Sorted array");
		int n=0;
		for(int j=0;j<a.length;j++) {
		for(int i=0; i<a.length;i++) {//maximum in an array
			if(a[j]>a[i]) {
				n=a[j];
				a[j]=a[i];
				a[i]=n;
			}
		}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
			
		
	}

}