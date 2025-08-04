package fileHandling;

import java.io.*;

public class Task11 {
    public static void main(String[] args) {
        File file = new File("nonexistent.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file name.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}

