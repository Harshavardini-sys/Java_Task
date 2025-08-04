package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int wc = 0;
        try {
            File f = new File("info.txt");
            Scanner sc = new Scanner(f);

            while (sc.hasNext()) {
                sc.next();
                wc++;
            }

            sc.close();
            System.out.println("Total words: " + wc);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
	}

}
