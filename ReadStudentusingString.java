import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadStudentusingString {
    public static void main(String[] args) {
        String d=",";
        String student;
        int total=0;
        try{
            FileReader file= new FileReader("classData.csv");
            BufferedReader buffer=new BufferedReader(file);
            while((student=buffer.readLine())!=null){
                String[] newStudent=student.split(d);
                for(int i=2;i<=6;i++){
                    if(Integer.parseInt(newStudent[i])){
                    total=total+parseint(newStudent[i]);
                    System.out.println(Integer.parseInt(newStudent[i]));
                    }
                    else{
                        continue;
                    }
                }
                // System.out.println(newStudent[1]+" has secured "+newStudent[2]+" in first subject."+ "And the total is " +total);
            }
            buffer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    private static int parseint(String string) {
        return 0;
    }
}
