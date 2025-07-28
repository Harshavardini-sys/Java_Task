package threads;

public class Task6 extends Thread {
	static int count = 0 ;
	public void run() {
		for(int i =0 ; i < 1000 ; i++ ) {
			count ++ ;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task6 t1 = new Task6();
		Task6 t2 = new Task6();
		
		t1.start();
		t2.start();
	try {
		t1.join();
		t2.join();
	}
	catch(InterruptedException ex) {
		System.out.println(ex);
	}
		
		System.out.println("Final counter valuse : " + count);
	}

}
