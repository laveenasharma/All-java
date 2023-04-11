import java.io.FileOutputStream;
import java.util.Scanner;

public class writingINCSVFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Emp ID:");
        int empID = sc.nextInt();

        sc.nextLine();
        
        System.out.print("Enter the Emp Name:");
        String empName = sc.next();

        System.out.println("Enter employee Phone number:");
        int phone=sc.nextInt();

        sc.nextLine();

        String inputEMPData = "\n"+ Integer.toString(empID) + "," + empName+","+ Integer.toString(phone);
        // inputEMPData = "1,ABC"

        try {
            FileOutputStream objectSaveDataINFile = new FileOutputStream("empData.csv", true);
            byte[] inputData = inputEMPData.getBytes();

            objectSaveDataINFile.write(inputData);

            objectSaveDataINFile.close();
        } catch (Exception e) {
            System.out.println("Error while writing into File");
        }

        sc.close();
    }
}