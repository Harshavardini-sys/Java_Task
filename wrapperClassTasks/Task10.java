package wrapperClassTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] i = new Integer[] {20,25,40,45};
		
		Arrays.sort(i);
		
		System.out.println("Orted array: " + Arrays.toString(i));
		
		Integer I = i[i.length - 2];
		
		System.out.println("Second highest element is " +I);
	}

}
