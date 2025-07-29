package threads;

class BankAccount {
	 private int balance = 1000;
	 synchronized void wd(int amount, String str) {
		 if (balance >= amount) {
		 System.out.println(str + " is withdrawing $" + amount);
		 balance -= amount;
		 System.out.println("Remaining Balance: $" + balance);
		 } 
		 else {
		 System.out.println(str + " tried to withdraw but insufficient funds");
		 }
	 }
	 
	}
	public class Task8 {
	 public static void main(String[] args) {
	 BankAccount obj = new BankAccount();
	 Runnable t1 = () -> obj.wd(200, "User1");
	 Runnable t2 = () -> obj.wd(500, "User2");
	 new Thread(t1).start();
	 new Thread(t2).start();
	 }
	}


