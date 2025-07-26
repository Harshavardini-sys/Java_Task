package taskOpps;

abstract class Shape{
	abstract double area(double l , double b , double r );
}

class Circle extends Shape{
	double area(double l ,double b, double r) {
		double area = 2 * 3.14 * r ;
		return area;
	}
}

class Rectangle extends Shape{
	double area(double l , double b, double r) {
		double area = l * b ;
		return area;
	}
}
//***
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		Rectangle obj1 = new Rectangle();
		System.out.println(obj.area(2, 4, 5 ));
		System.out.println(obj1.area(2, 4, 5 ));
	}

}
