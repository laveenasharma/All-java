import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

public class countFile {
    public static void main(String[] args) {
        String student;
        int cCount = 0;
        int wCount = 0;
        int wSpaceCount = 0;
        int pCount = 0;
        long modifications;

        try {
            File f1 = new File("HeroVired.txt");
            FileReader file = new FileReader("HeroVired.txt");
            BufferedReader buffer = new BufferedReader(file);

            while ((student = buffer.readLine()) != null) {
                cCount += student.length();
                String[] newWords = student.split("\\s+");
                // System.out.println(newWords);
                wCount += newWords.length;

                wSpaceCount += newWords.length - 1;
                // Count the No of Paragraphs when there is a Blank Line
                if (student.equals("")) {
                    pCount++;
                }

            }

            modifications = f1.lastModified();
            System.out.println(cCount);
            System.out.println(wCount);
            System.out.println(wSpaceCount);
            System.out.println(pCount);
            System.out.println(new Date(modifications));
            System.out.println(f1.getAbsolutePath());
            // System.out.println(modifications);
            buffer.close();
        } catch (Exception e) {
            System.out.println("An exception has occured." + e.getMessage());
            // TODO: handle exception
        }

    }
}
