package taskOpps;

class Animal{
	void sound(String str) {
		System.out.println(str);
	}
}

class Dog extends Animal{
	void sound(String str) {
		System.out.println(str);
	}
}

class Cat extends Animal{
	void sound(String str) {
		System.out.println(str);
	}
}

class Cow extends Animal{
	void sound(String str) {
		System.out.println(str);
	}
	
}
public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal D_obj = new Dog();
		Animal C_obj = new Cat();
		Animal CW_obj = new Cow();
		D_obj.sound("bow bow");
		C_obj.sound("Meow Meow");
		CW_obj.sound("Mooooooo");
	}

}
