import java.io.BufferedReader;
// import java.io.File;
import java.io.FileReader;
// import java.io.Reader;
// import java.util.Scanner;

public class readStudentUsingString {
    public static void main(String[] args) {
        String d = ",";
        String student;
        try {

            FileReader file = new FileReader("StdReportCard.csv");

            BufferedReader buffer = new BufferedReader(file);

            // Apply Loop
            while ((student = buffer.readLine()) != null) {
                // System.out.println(student);
                // The previous one would have printed in a wrong manner
                String[] newStudent = student.split(d);
                System.out.println("Roll No: " + newStudent[0] + ", " + "Student Name: " + newStudent[1]);
            }
            buffer.close();

        } catch (Exception e) {
            System.out.println("An error has occured" + e.getMessage());
            // TODO: handle exception
        }

    }
}
