import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamData {
  public static void main(String[] args) {
    try {
      FileInputStream file = new FileInputStream("studentData.csv");
      byte[] data = new byte[file.available()];
      file.read(data);
      file.close();
      String text = new String(data);
      String[] lines = text.split("\n");
      for (int i = 1; i < lines.length; i++) {
        String[] values = lines[i].split(",");
        int rollNo = Integer.parseInt(values[0].trim());
        String name = values[1].trim();
        int science = Integer.parseInt(values[2].trim());
        int math = Integer.parseInt(values[3].trim());
        int socialScience = Integer.parseInt(values[4].trim());
        int lang1 = Integer.parseInt(values[5].trim());
        int lang2 = Integer.parseInt(values[6].trim());
        int total = science + math + socialScience + lang1 + lang2;
        System.out.println(name + " - Total marks: " + total);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
