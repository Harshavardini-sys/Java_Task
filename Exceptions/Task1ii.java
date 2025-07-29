package exceptions;

abstract class Shape1{
	abstract void displayShapeType();
	
	void display() {
		System.out.println("Dispaly non- abstarct method");
	}
}
 class D extends Shape1{
	 public void displayShapeType() {
		 System.out.println("abstract method");
	 }
 }

public class Task1ii {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new D();
		obj.displayShapeType();
		obj.display();
	}

}
