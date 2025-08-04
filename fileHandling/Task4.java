package fileHandling;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
            File in = new File("info.txt");
            File out = new File("copy.txt");

            Scanner sc = new Scanner(in);
            PrintWriter pw = new PrintWriter(out);

            while (sc.hasNextLine()) {
                pw.println(sc.nextLine());
            }

            sc.close();
            pw.close();

            System.out.println("Content copied successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
