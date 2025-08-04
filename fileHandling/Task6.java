package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        try {
            FileWriter fw = new FileWriter("userdata.txt");
            fw.write(name + "\n");
            fw.write(email + "\n");
            fw.write(address + "\n");
            fw.close();
            System.out.println("User data saved to userdata.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        sc.close();
	}

}
