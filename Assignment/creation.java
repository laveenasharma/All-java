import java.io.File;
import java.io.IOException;

public class creation {
    public static void main(String[] args) {
        try{
            String filename="sample.txt";
            File obj1=new File(filename);
            if(obj1.exists()){
                System.out.println("file already exits");
              }
            else{
              obj1.createNewFile();
              System.out.println("file created");
            }
        } catch(IOException e) {
            // TODO: handle exception
        }
    }
}
