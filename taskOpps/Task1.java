package taskOpps;

class Book{
	
	void displayDetails(String title , String Author , int price) {
		System.out.print(title + " ");
		System.out.print(Author + " ");
		System.out.println(price);
		System.out.println("-------------");
	}
	
}
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj = new Book();
		obj.displayDetails("My Friends","Fredrik Backman", 1000);
		obj.displayDetails("Great Big Beautiful Life","Emily Henry", 1200);
	}
	
}
