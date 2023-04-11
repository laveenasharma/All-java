import java.io.File;
import java.util.Scanner;

public class ReadStudentScanner {
    public static void main(String[] args) {
        try{
        File file= new File("classData.csv");
        Scanner sc=new Scanner(file);
        sc.useDelimiter(",");
        while(sc.hasNext()){
            System.out.println(sc.next());
            }
        sc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        // finally{}
    }
}
