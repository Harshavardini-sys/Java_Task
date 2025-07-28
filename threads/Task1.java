package threads;

public class Task1 extends Thread {
	
	public void run() {
		for(int i = 0 ; i <= 5; i ++ ) {
			System.out.println("Hello from Thread!");
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Execution done !");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 obj1 = new Task1();
		Task1 obj2 = new Task1();

		obj1.start();
		obj2.start();

		System.out.println(obj1.isAlive());
		System.out.println(obj2.isAlive());
	}

}
