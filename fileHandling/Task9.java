package fileHandling;

import java.io.*;

public class Task9 {
    public static void main(String[] args) {
        String file = "sample.txt";
        int lineCount = 0, wordCount = 0, charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                String[] words = line.trim().split("\\s+");
                wordCount += words.length;

                for (String w : words) {
                    charCount += w.length(); // excludes spaces
                }
            }

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding spaces): " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

