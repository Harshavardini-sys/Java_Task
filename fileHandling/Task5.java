package fileHandling;
import java.io.*;

//Step 1: Student class must implement Serializable
class Student implements Serializable {
 String name;
 int rollNo;
 int marks;

 Student(String name, int rollNo, int marks) {
     this.name = name;
     this.rollNo = rollNo;
     this.marks = marks;
 }
}

public class Task5 {
 public static void main(String[] args) {
     Student s = new Student("Rahul", 101, 85);

     // Step 2: Serialize the object
     try {
         FileOutputStream fos = new FileOutputStream("student.ser");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(s);
         oos.close();
         fos.close();
         System.out.println("Object serialized and written to student.ser");
     } catch (IOException e) {
         e.printStackTrace();
     }

     // Step 3: Deserialize the object
     try {
         FileInputStream fis = new FileInputStream("student.ser");
         ObjectInputStream ois = new ObjectInputStream(fis);
         Student deserialized = (Student) ois.readObject();
         ois.close();
         fis.close();

         System.out.println("Deserialized Student:");
         System.out.println("Name: " + deserialized.name);
         System.out.println("Roll No: " + deserialized.rollNo);
         System.out.println("Marks: " + deserialized.marks);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}
