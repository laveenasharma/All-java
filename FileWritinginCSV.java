import java.io.FileOutputStream;
import java.util.Scanner;

public class FileWritinginCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Emp ID:");
        int empID = sc.nextInt();

        sc.nextLine();
        
        String EMPData = "\n"+ Integer.toString(empID);
        // inputEMPData = "1,ABC"

        try {
            FileOutputStream writeObj = new FileOutputStream("empData.csv", true);
            byte[] inputData = EMPData.getBytes();

            writeObj.write(inputData);

            writeObj.close();
        } catch (Exception e) {
            System.out.println("Error while writing into File");
        }

        sc.close();

    }
}
