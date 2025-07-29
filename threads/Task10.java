package threads;

class chat{
	boolean flag = false;
	public synchronized void question(String msg){
		if(flag) {
			try {
				wait();
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println(msg);
		flag = true;
		notify();
	}
	
	public synchronized void answer(String msg){
		if(!flag) {
			try {
				wait();
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println(msg);
		flag = false;
		notify();
	}
}

class Q implements Runnable{
	chat m;
	String [] s1 = {"Hi","How are you ?" ,"Iam also doing fine"};
	@Override
	public void run() {
		for (int i =0 ; i < s1.length; i ++) {
			m.question(s1[i]);
		}
	}
	
	public Q(chat m) {
		this.m = m ;
		new Thread(this,"Question").start();
	}
}
class A implements Runnable{
	chat m;
	String [] s2 = {"Hello","Iam doing fine, What about you" ,"Great !!"};
	@Override
	public void run() {
		for (int i =0 ; i < s2.length; i ++) {
			m.answer(s2[i]);
		}
	}
	
	public A(chat m) {
		this.m = m ;
		new Thread(this,"Answer").start();
	}
}

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chat obj = new chat();
		new Q(obj);
		new A(obj);
		
	}

}