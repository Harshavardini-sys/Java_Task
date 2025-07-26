package taskOpps;

public class Task3i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task3 obj = new Task3();
		obj.set_acc_num(12345678);
		obj.set_balance(50000);
		obj.deposit(20000);
		obj.withdraw(25000);
		System.out.println(obj.get_balance());
	}

}
