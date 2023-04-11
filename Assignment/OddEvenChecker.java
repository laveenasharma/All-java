import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu based app - Even/Odd Checker\n");
            System.out.print("Please enter the number: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("The given number - " + num + " is an EVEN Number");
            } else {
                System.out.println("The given number - " + num + " is a ODD Number");
            }

            System.out.print("\nDo you want to Continue (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                System.out.println("Exiting the program...");
                break;
            }
        }
    }
}
