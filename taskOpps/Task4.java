package taskOpps;

abstract class Shape{
	abstract double area();
}

class Circle extends Shape{
	double r;
	Circle(double r){
		this.r = r;
	}
	@Override
	double area() {
		return  2 * 3.14 * r ;
		
	}
}

class Rectangle extends Shape{
	double l , b;
	Rectangle(double l , double b){
		this.l = l ;
		this.b = b;
	}
	double area() {
		double area = l * b ;
		return area;
	}
}
//***
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle(5);
		Rectangle obj1 = new Rectangle(10,5);
		System.out.println(obj.area( ));
		System.out.println(obj1.area( ));
	}

}
