package fileHandling;

import java.io.File;

public class Task15 {
    public static void main(String[] args) {
        File dir = new File("your_directory_path_here"); // e.g., "C:/Users/YourName/Documents"

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory. Please check the path.");
            return;
        }

        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                String type = f.isDirectory() ? "Directory" : "File";
                long size = f.length();
                System.out.println(f.getName() + " - " + type + " - " + size + " bytes");
            }
        } else {
            System.out.println("Unable to list files.");
        }
    }
}

