package exceptions;

interface Printable{
	void print();
}

interface Scannnable{
	default void scan() {
		System.out.println("Scaning doc");
	}
}

class MultifunctionalPrinter implements Printable , Scannnable{
	public void print() {
		System.out.println("printing doc");
	}
}

public class Task2iii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultifunctionalPrinter obj = new MultifunctionalPrinter();
		obj.scan();
		obj.print();
	}

}
