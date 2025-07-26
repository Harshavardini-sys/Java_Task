package taskOpps;

class Employee{
	static int count = 0;
	void EmpDetails(String EmpName) {
		count++;
		System.out.print(count+" ");
		System.out.println(EmpName);
		
	}
	void TotalEmp() {
		System.out.println(count + " are the total no. of employees");
	}
	
	
}

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
		obj.EmpDetails("A");
		obj.EmpDetails("B");
		obj.EmpDetails("C");
		obj.EmpDetails("D");
		obj.TotalEmp();
		
	}

}
