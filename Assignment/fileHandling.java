import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileHandling {

    public static void main(String[] args) {
        
        String fileName = "D:/HeroVired/Java/Assignment/file.txt"; // change the file name and path as per your requirement
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine(); // read the first line
            System.out.println(line); // display the first line in the console
            br.close(); // close the reader
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
    }

}
