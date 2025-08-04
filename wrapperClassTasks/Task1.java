package wrapperClassTasks;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		double d = 20.0;
		char ch = 'a' ;
		
		Integer i_obj = Integer.valueOf(i);
		Double d_obj = Double.valueOf(d);
		Character ch_obj = Character.valueOf(ch);
		
		System.out.println("Printing wrapper objects");
		System.out.println(i_obj);
		System.out.println(d_obj);
		System.out.println(ch_obj);
		
		int iv = i_obj.intValue();
		double dv = d_obj.doubleValue();
		char chv = ch_obj.charValue();
		
		System.out.println("Printing primitive type");
		System.out.println(iv);
		System.out.println(dv);
		System.out.println(chv);
		
	}

}
