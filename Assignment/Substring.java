import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the starting index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the ending index: ");
        int endIndex = scanner.nextInt()+1;

        String substring = inputString.substring(startIndex, endIndex);
        System.out.println("The substring is: " + substring);
    }
}
