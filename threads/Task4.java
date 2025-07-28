package threads;

public class Task4 extends Thread{
	
	public void run() {
		try {
			Thread.sleep(300);
		}
		catch(InterruptedException ex) {
			System.out.println("Thread Interrupted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task4 t = new Task4();
		System.out.println("Before start : " + t.isAlive());
		t.start();
		System.out.println("Before start : " + t.isAlive());
		try {
			t.join();
		}
		catch(InterruptedException ex) {
			System.out.println("Thread Interrupted");
		}
		System.out.println("After join : " + t.isAlive());
	}

}
