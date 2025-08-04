package wrapperClassTasks;

import java.util.ArrayList;

class F{
	int f(int x){
		x = x * 9/5;
		x = x + 32 ;
		return x;
	}
}

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"30" , "38" , "40"};
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		
		F obj = new F();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(obj.f(a));
		al.add(obj.f(b));
		al.add(obj.f(c));
		
		System.out.println("Celsius : " + a + " Fahrenheit " + al.get(0));
		System.out.println("Celsius : " + b + " Fahrenheit " + al.get(1));
		System.out.println("Celsius : " + c + " Fahrenheit " + al.get(2));
	}

}
