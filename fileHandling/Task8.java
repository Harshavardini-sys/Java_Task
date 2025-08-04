package fileHandling;

import java.io.*;
import java.util.*;

public class Task8 {
    static final String FILE = "contacts.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n1. Add Contact\n2. Display Contacts\n3. Search by Name\n4. Exit");
            System.out.print("Choose option: ");
            ch = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    addContact(sc);
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    searchContact(sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (ch != 4);

        sc.close();
    }

    static void addContact(Scanner sc) {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE, true))) {
            bw.write(name + "," + phone);
            bw.newLine();
            System.out.println("Contact saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void displayContacts() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            System.out.println("\n--- Contact List ---");
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    System.out.println("Name: " + parts[0] + ", Phone: " + parts[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("No contacts found.");
        }
    }

    static void searchContact(Scanner sc) {
        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine().toLowerCase();
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].toLowerCase().contains(searchName)) {
                    System.out.println("Found - Name: " + parts[0] + ", Phone: " + parts[1]);
                    found = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!found) {
            System.out.println("No contact found with name: " + searchName);
        }
    }
}

