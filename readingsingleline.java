
import java.io.*;

public class readingsingleline {
    public static void main(String[] args) {
        String text = "";
        int lineNumber;
        try {
            FileReader readfile = new FileReader("demo.txt");
            BufferedReader readbuffer = new BufferedReader(readfile);
            for (lineNumber = 1; lineNumber < 10; lineNumber++) {
                if (lineNumber == 7) {
                    text = readbuffer.readLine();
                } else
                    readbuffer.readLine();
            }
            readbuffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(" The specific Line is: " + text);
    }
}
