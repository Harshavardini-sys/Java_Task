package fileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task7 {
    public static void main(String[] args) {
        String file = "app.log";
        String msg = "Application started";
        String ts = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(ts + " " + msg);
            bw.newLine();
            System.out.println("Log written to app.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
