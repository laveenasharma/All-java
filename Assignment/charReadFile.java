import java.io.BufferedReader;
import java.io.FileReader;
// import java.io.IOException;

public class charReadFile {
    public static void main(String[] args) {
        String student;
        int count=0;
        FileReader file=new FileReader("../file.txt");
        BufferedReader buffer = new BufferedReader(file);
        try (buffer) {
            // int count = 0;
            int c;
            while ((student = buffer.readLine()) != null) {
                count=count+student.length();
            }

            System.out.println("Number of characters: " + count);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

