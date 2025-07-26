package taskOpps;

interface MathOperation{
	int operate(int x , int y);
}

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation add = (int x, int y) -> x + y ;
		MathOperation sub = (int x, int y) -> x - y ;
		MathOperation mul = (int x, int y) -> x * y ;
		System.out.println(add.operate(3, 1));
		System.out.println(sub.operate(3, 1));
		System.out.println(mul.operate(3, 1));
	}

}
