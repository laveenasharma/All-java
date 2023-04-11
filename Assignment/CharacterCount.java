import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CharacterCount {
    public static void main(String[] args) {
        String student;
        int cCount = 0;

        try {
            File f1 = new File("HeroVired.txt");
            FileReader file = new FileReader(f1);
            BufferedReader buffer = new BufferedReader(file);

            while ((student = buffer.readLine()) != null) {
                cCount += student.length();
            }
            System.out.println(cCount);
            
            buffer.close();
        } catch (Exception e) {
            System.out.println("An exception has occured." + e.getMessage());
            // TODO: handle exception
        }

    }
}
