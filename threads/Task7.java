package threads;

public class Task7 extends Thread {
	static int count = 0 ;
	
	synchronized static void inc() {
		for(int i =0 ; i< 1000 ; i++) {
			count++;
		}
	}
	
	public void run() {
		inc();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task7 t1 = new Task7();
		Task7 t2 = new Task7();
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException ex) {
			System.out.println(ex);
		}
			
			System.out.println("Final counter value : " + count);
		}

}
