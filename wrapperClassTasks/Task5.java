package wrapperClassTasks;
import java.util.*;

class Box<T>{
	T obj;
	void set(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }
}

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> b = new Box<Integer>();
		Box<Double> b1 = new Box<Double>();
		
		b.set(10);
		b1.set(20.0);
		
		int B = b.get();
		double B1 = b1.get();
		
		System.out.println(B );
		System.out.println(B1);
	}

}
