package taskOpps;

class Vehicle{
	static int count = 0;
	void brand(String brand) {
		count++;
		System.out.print(count +". " + brand + " ");
	}
	void speed(int speed) {
		System.out.print(speed + " ");
	}
}

class Car extends Vehicle{
	void showDetails(int w){
		System.out.println("It has " + w + " Wheels");
	}
}

class Bike extends Vehicle{
	void showDetails(int w) {
		System.out.println("It has " + w + " Wheels");
	}
}

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car();
		Bike obj1 = new Bike();
		obj.brand("TOYOTA");
		obj.speed(120);
		obj.showDetails(4);
		obj1.brand("ENFIELD");
		obj1.speed(150);
		obj1.showDetails(2);
	}

}
