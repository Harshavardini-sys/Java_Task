package taskOpps;

abstract class Appliance{
	 void turnOn() {
		 System.out.println("turned On");
	 }
}

interface Connectable{
	void connect();
}


class SmartTv extends Appliance  implements Connectable{
	public void connect(){
		System.out.println("connected");
	}
}

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv obj = new SmartTv();
		obj.turnOn();
		obj.connect();
				
	}

}
