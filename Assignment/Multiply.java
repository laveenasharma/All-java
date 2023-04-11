
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter number");
        int number= input.nextInt();
        int result;
        for(int x=1;x<=10;x++){
            result=number*x;
            System.out.println(number+" X "+x+" = "+result);
        }
    }
}
