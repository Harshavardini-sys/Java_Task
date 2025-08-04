package fileHandling;

import java.io.*;

public class Task13 {
    public static void main(String[] args) {
        File inputFile = new File("data.txt");
        File outputFile = new File("output.txt");

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replaceAll("Java", "Python");
                writer.write(modifiedLine);
                writer.newLine();
            }
            System.out.println("Replacement completed. Check output.txt");
        } catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }
}

