package threads;

class Task11 extends Thread {
	 public Task11(String name) {
		 super(name);
	 }
	 public void run() {
		 for(int i = 1; i <= 5; i++) {
		 System.out.println(getName() + " running " + i);
			 try {
			 Thread.sleep((int)(Math.random() * 1000));
			 }
			 catch(Exception e) {
				 System.out.println(e);
			 }
		 }
	 }
	 public static void main(String[] args) {
	 new Task11("A").start();
	 new Task11("B").start();
	 new Task11("C").start();
	 }
	}
