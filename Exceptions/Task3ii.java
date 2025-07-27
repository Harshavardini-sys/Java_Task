package Exceptions;

public class Task3ii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bus b=new Bus();
b.engineType();
	}

}
class Vehicle {
	final void engineType() {
		System.out.println("Petrol");
	}
}
	class Bus extends Vehicle {
		//void engineType() {
		//	System.out.println("Diesel");
	}

