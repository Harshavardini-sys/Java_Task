package Exceptions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

abstract class Shape{
	abstract double area();
}

class Circle extends Shape{
	double area() {
		double r=2;
		double area = 2 * 3.14 * r ;
		return area;
	}
}

class Rectangle extends Shape{
	double area() {
		double l =1, b=3 ;
		double area = l * b ;
		return area;
	}
}

public class Task1i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Task1i();
	}
	Task1i() {
		Circle obj = new Circle();
		System.out.println(obj.area());
		Rectangle obj1 = new Rectangle();
		System.out.println(obj1.area());
	}

}
