package taskOpps;

public class Task3 {

	private int acc_num;
	private double balance;
	
	//account number
	void set_acc_num(int acc_num) {
		this.acc_num =acc_num ;
	}
	int get_acc_num() {
		this.acc_num =acc_num ;
		return acc_num;
	}
	
	//balance
	void set_balance(int balance) {
		this.balance = balance ;
	}
	double get_balance() {
		this.balance = balance ;
		return balance;
	}
	
	//deposit
	double deposit(double d) {
		this.balance = balance ;
		balance = balance + d ;
		return balance; 
	}
	
	//withdraw
	double withdraw(double w) {
		this.balance = balance ;
		balance = balance - w ;
		return balance; 
	}
	
	

}
