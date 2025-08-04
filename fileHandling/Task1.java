package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
	public static void main(String[] args) {
		File obj1 = new File("info.txt");
		try(FileWriter obj=new FileWriter(obj1)) {
			obj.write("Learning file handling in java!!\n");
			obj.append("Learn Java step-by-step\n");
		}
		catch(IOException ex) {
			System.out.println("An error has occured");
			ex.printStackTrace();
		}
	}
}
