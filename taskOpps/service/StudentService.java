package taskOpps.service;
import taskOpps.model.*;
class Academics{
	
	void Calender() {
		System.out.println("Academic  : June to April");
	}
	void Holidays() {
		System.out.println("Holidays : Summer holidays");
	}
	
}

public class StudentService extends Student{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj= new Student();
		obj.Id("10");
		obj.Name("R");
		obj.Age("12");
		Academics obj1 = new Academics();
		obj1.Calender();
		obj1.Holidays();
	}

}
