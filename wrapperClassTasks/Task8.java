package wrapperClassTasks;

public class Task8 {
	private String acc_num ;
	private Double balance ;
	
	public Task8(String acc_num , Double balance) {
		this.acc_num = acc_num;
		this.balance = (balance == null) ? 0.0 : balance;
	}
	public void deposit(double d) {
		if (balance == null) balance = 0.0;
		balance = balance + d ;
		System.out.println(d);
	}
	public void withdraw(double wd) {
		if (balance == null) balance = 0.0;
		if(wd <= balance) {
			balance -= wd ; 
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	public void showBalance() {
        if (balance == null) balance = 0.0;
        System.out.println("Account Number: " + acc_num);
        System.out.println("Current Balance: ₹" + balance);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task8 acc = new Task8("A123", null);
		acc.showBalance();
		acc.deposit(300);
		acc.withdraw(100);
		acc.showBalance();
	}

}
