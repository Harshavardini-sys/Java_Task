package threads;

class Task5 extends Thread {
    public void run() {
        System.out.println(getName() + " Priority " + getPriority());
        
    }

    public static void main(String[] args) throws InterruptedException {
        Task5 t1 = new Task5();
        Task5 t2 = new Task5();
        Task5 t3 = new Task5();

         t1.setPriority(Thread.MIN_PRIORITY);   
         t2.setPriority(Thread.NORM_PRIORITY);  
         t3.setPriority(Thread.MAX_PRIORITY);  

        System.out.println(t1.getName() + " = " + t1.getPriority());
        System.out.println(t2.getName() + " = " + t2.getPriority());
        System.out.println(t3.getName() + " = " + t3.getPriority());

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}

