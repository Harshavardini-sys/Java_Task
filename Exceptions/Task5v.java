package exceptions;

public class Task5v {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int blc=-100;
try {
	if(blc<0) {
		throw new InvalidAccountException(" Negative Balance ");
	}
	
}

catch(InvalidAccountException e) {
	System.out.println(e);
	
}
System.out.println("Balance: " + blc);
	}

}
class InvalidAccountException extends Exception {

	public InvalidAccountException(String string) {
		System.out.println(string);
	}
	
}
