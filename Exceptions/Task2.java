package exceptions;

interface RemoteControl{
	void turnOn();
	
	default void batteryStatus() {
		System.out.println("batter status 100% ");
	}
}

class Tv implements RemoteControl{
	public void turnOn() {
		System.out.println("Tv turn on");
	}
}

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv obj = new Tv();
		obj.batteryStatus();
		obj.turnOn();
	}

}
