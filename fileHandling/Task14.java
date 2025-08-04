package fileHandling;

import java.io.*;

public class Task14 {
    public static void main(String[] args) {
        File f1 = new File("file1.txt");
        File f2 = new File("file2.txt");
        File fout = new File("merged.txt");

        try (
            BufferedReader r1 = new BufferedReader(new FileReader(f1));
            BufferedReader r2 = new BufferedReader(new FileReader(f2));
            BufferedWriter w = new BufferedWriter(new FileWriter(fout))
        ) {
            String line;

            while ((line = r1.readLine()) != null) {
                w.write(line);
                w.newLine();
            }

            while ((line = r2.readLine()) != null) {
                w.write(line);
                w.newLine();
            }

            System.out.println("Files merged successfully into merged.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

