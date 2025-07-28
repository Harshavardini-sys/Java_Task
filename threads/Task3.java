package threads;

public class Task3 extends Thread {
	public void run() {
		for (int i =1; i <=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // which is 1 second
			}
			catch(InterruptedException ex) {
				System.out.println("Thread is Interrupted");
			}
		}
	}
	// part two where we join the thread
	public static void main(String[] args) {
		Task3 thread1 = new Task3();
		thread1.start();
		try {
			thread1.join(); // now the thread will join after completion of first thread
		}
		catch(InterruptedException ex) {
			System.out.println("Thread Interrupted");
		}
		System.out.println("Main thread done.");
	}

}
