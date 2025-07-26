package taskOpps;

class Calculator{
	int add(int x , int y) {
		int res = x + y ; 
		return res;
	}
	
	double add(double x, double y) {
		double res = x + y ; 
		return res;
	}
	
	String add(String x, String y) {
		String res = x + y ;
		return res ;
	}
}

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		System.out.println(obj.add(10.00, 10));
		System.out.println(obj.add(20, 10));
		System.out.println(obj.add(30, 10));
	}

}
