package EMS;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class Menu {
    public void MenuList() {
        System.out.println("Press 1: Write Employee Detail.");
        System.out.println("Press 2: Read Employee Detail.");
        System.out.println("Press 3: Update Employee Detail.");
        System.out.println("Press 4: Delete Employee Detail.");
        System.out.println("Press 5: Exit.");

    }
}

class ReadDetails {
    String EmpName;
    String EmpID;
    String EmpEmail;
    String EmpSal;
    String EmpContact;

    public void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee's name --------: ");
        EmpName = sc.nextLine();
        System.out.print("Enter Employee's ID ----------: ");
        EmpID = sc.nextLine();
        System.out.print("Enter Employee's Email ID ----: ");
        EmpEmail = sc.nextLine();
        System.out.print("Enter Employee contact Info --: ");
        EmpContact = sc.nextLine();
        System.out.print("Enter Employee's Salary ------: ");
        EmpSal = sc.nextLine();
    }
}

class Add {
    void EnterData() {
        // Scanner sc= new Scanner(System.in);
        ReadDetails readObj = new ReadDetails();
        readObj.getInfo();

        try {
            File f1 = new File("Emp" + readObj.EmpID + ".txt");
            if (f1.createNewFile()) {
                FileWriter fw = new FileWriter("Emp" + readObj.EmpID + ".txt");
                fw.write("Name: " + readObj.EmpName + "\n" + "Employee ID: " + readObj.EmpID + "\n" + "Employee Email: "
                        + readObj.EmpEmail + "\n" + "Employee Contact: " + readObj.EmpContact + "\n"
                        + "Employee Salary: " + readObj.EmpSal);
                fw.close();
                System.out.println("File created");
            } else {
                System.out.println("File Already Exists");
            }
        } catch (Exception e) {
            System.out.println("Error found:" + e);
        }
    }
}

class ShowDetails {
    public void details(String eID) {
        try{
        File fnew = new File("Emp" + eID + ".txt");
        Scanner sc = new Scanner(fnew);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error found:" + e);
        }
    }
}

class RemoveEmp {
    public void remove(String eID) {
        try {
            PrintWriter printObj = new PrintWriter("Emp" + eID + ".txt");
            printObj.close();// file is cleared in the senario by making it empty.
            System.out.println(eID + " Employee details removed");
            // .delete method of file function and deleteonexit
        } catch (Exception e) {
            System.out.println("Error found:" + e);
        }
    }
}

class UpadateDetails {
    public void Update(String oldData, String newData, String eID) {
        File fw1 = new File("Emp" + eID + ".txt");
        try (Scanner sc1 = new Scanner(fw1)) {
            String data = " ";
            while (sc1.hasNextLine()) {
                data += sc1.nextLine();
            }
            FileWriter fwObj = new FileWriter((fw1));
            data = data.replaceAll(oldData, newData);
            fw1.write(data);
            fw1.close();
        } catch (Exception e) {
            System.out.println("Error "+e);
        }
    }
}

public class EMS {
    public static void main(String[] args) {
        Menu menuObj = new Menu();
        EMS EmsObj=new EMS();
        ShowDetails showObj= new ShowDetails();
        while(true){
        menuObj.MenuList();
        System.out.println("Please Enter your Choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Add addObj = new Add();
                addObj.EnterData();
                System.out.println("Do you want to continue? press enter");
                sc.nextLine();
                menuObj.MenuList();
                break;
            case 2:
                // ShowDetails ShowObj = new ShowDetails();
                System.out.println("Enter the Employee ID: ");
                // Scanner newScan = new Scanner(System.in);
                String EMPid = sc.nextLine();
                System.out.println(EMPid);
                showObj.details(EMPid);
                System.out.print("\033[H\033[2J");
                System.out.println("Do you want to continue? press enter");
                sc.nextLine();
                menuObj.MenuList();
                break;

            case 3:
                UpadateDetails updateObj = new UpadateDetails();
                System.out.println("Enter the Employee ID: ");
                String Eid = sc.nextLine();
                System.out.println("Enter the old Employee Detail: ");
                String oldDetails = sc.nextLine();
                System.out.println("Enter the new Employee Detail: ");
                String newDetails = sc.nextLine();
                updateObj.Update(oldDetails, newDetails, Eid);
                System.out.println("Do you want to continue? press enter");
                sc.nextLine();
                menuObj.MenuList();
                break;

            case 4:
            RemoveEmp removeObj = new RemoveEmp();
            System.out.println("Enter the Employee ID: ");
            String eId = sc.nextLine();
            removeObj.remove(eId);
            System.out.println("Do you want to continue? press enter");
                sc.nextLine();
                menuObj.MenuList();
            break;

            case 5:
            System.exit(0);

            default:
            System.out.println("Enter valid choice!!");
            break;
        }
        }
    }
}
