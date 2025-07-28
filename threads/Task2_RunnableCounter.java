package threads;

public class Task2_RunnableCounter implements Runnable {
	
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); 
            } 
            catch (InterruptedException ex) {
                System.out.println("Thread interrupted: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
    	Task2_RunnableCounter c_obj = new Task2_RunnableCounter(); 
        Thread thread1 = new Thread(c_obj);             
        thread1.start();  
    }
}
