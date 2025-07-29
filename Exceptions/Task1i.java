package exceptions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

abstract class Shape{
	abstract double area();
}

class Circle extends Shape{
	 double r;

	    Circle(double r) {
	        this.r = r;
	    }

	    @Override
	    double area() {
	        return 3.14 * r * r;
	    }
}

class Rectangle extends Shape{
	double l, b ;
	Rectangle(double l , double b) {
		this.l = l;
		this.b = b;
	}
	@Override
	double area() {
		return l*b;
	}
}

public class Task1i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Task1i();
	}
	Task1i() {
		Circle obj = new Circle(20.0);
		System.out.println(obj.area());
		Rectangle obj1 = new Rectangle(10 , 20);
		System.out.println(obj1.area());
	}

}
