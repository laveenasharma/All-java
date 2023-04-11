import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int numA = sc.nextInt();

        System.out.print("Enter second number: ");
        int numB = sc.nextInt();

        int temp;

        //Swapping numbers using temp variable
        temp = numA;
        numA = numB;
        numB = temp;

        System.out.println("\n After swapping:\n First number is " + numA + "\n Second number is " + numB);
    }
}
